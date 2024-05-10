package parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;
    
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
}

public class ParallelStreamsDemo {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(
                new Student("Sunkara", 86),
                new Student("Lithin", 89),
                new Student("Naga", 87),
                new Student("Datta", 88),
                new Student("Sravan", 95),
                new Student("Datthu", 90)
        );
        
        //Sequential Stream
        
        studentList.stream()
                .filter(x -> x.getScore()>=85)
                .limit(3)
                .forEach(x -> System.out.println(x.getName()+" "+x.getScore()));
        
        studentList.parallelStream()
                .filter(x -> x.getScore()>=85)
                .limit(3)
                .forEach(x -> System.out.println(x.getName()+" "+x.getScore()));
        
        studentList.stream()
                .parallel()
                .filter(x -> x.getScore()>=85)
                .limit(3)
                .forEach(x -> System.out.println(x.getName()+" "+x.getScore()));
    }
}

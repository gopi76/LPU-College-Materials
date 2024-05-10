package datetimepractice;

import java.time.LocalTime;

public class LocalTimePractice {
    public static void main(String[] args){
        LocalTime present = LocalTime.now();
        System.out.println("Present time: "+present);
        
        LocalTime past = present.minusHours(2);
        System.out.println("Past time: "+past);
        
        LocalTime customTime = LocalTime.of(20,10,10);
        System.out.println("Custom time: "+customTime);
        
        LocalTime parsedTime = LocalTime.parse("15:40:45");
        System.out.println("Parsed time: "+parsedTime);
        
        if(present.isAfter(past)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

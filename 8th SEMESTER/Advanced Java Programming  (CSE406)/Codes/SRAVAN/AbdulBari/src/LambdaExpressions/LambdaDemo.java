package LambdaExpressions;

@FunctionalInterface
interface MyLambda{
    public void display();
}

public class LambdaDemo {
    public static void main(String[] args){
        MyLambda m = ()->{
            System.out.println("Hello World!");
        };
        m.display();
    }
}

package LambdaExpressions;
@FunctionalInterface
interface MyLambda{
    //Single parameter
//    public void display(String str);
    
    //Double parameter
    public int add(int a, int b);
}
public class LambdaDemo2 {
    public static void main(String[] args){
//        Single parameter
//        MyLambda m = (s)->{
//            System.out.println(s);
//        };
//        m.display("Java");

//        Double parameter
//        MyLambda m = (a, b)->{
//            return a+b;
//        };
//        System.out.println(m.add(10,5));

//      We can write the method in the form of expression
//      that's why it is called lambda expression.
        MyLambda m = (a, b)->a+b; //we can write return like this too!
        System.out.println(m.add(10, 5)); //giving same output!


    }
}

package LambdaExpressions;

interface MyLambda{
    public void display();
}

class UseLambda{
    public void callLambda(MyLambda ml){
        ml.display();
    }
}

class Demo{
    //instance variable of a class, Lambda expression can access it!
//    int instanceVar = 0;
    public void method1(){
        //lambda expression can access the variables declared outside it, in a method but it should NOT be changed!
//        int methodvar  = 0;
//        MyLambda ml = ()->{
//            //we can declare the variables in lambda expressions
//            int count = 0;
//            //we can change them by incrementing them
//            count++;
//            System.out.println("Hi" + count);
//            System.out.println("Hi" + methodvar);
//            methodvar++; <- should not be changed!
//            System.out.println("Hi" +instanceVar);
//            //we can change the variable too
//            instanceVar++;
//        };
//        ml.display();

        UseLambda ul = new UseLambda();
        //we can pass lambda expression as a parameter, or object
        ul.callLambda(()->{System.out.println("Hello");});
    }
}

public class LambdaDemo3 {
    public static void main(String[] args){
        Demo d = new Demo();
        d.method1();
    }
}

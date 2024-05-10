package LambdaExpressions;

interface MyLambda{
//    public void display(String str);
    public int display(String str1, String str2);
}

public class LambdaDemo4 {
    
//    public LambdaDemo4(String s){
//        System.out.println(s.toUpperCase());
//    }
    
//    public static void reverse(String str){
//            StringBuffer sb = new StringBuffer(str);
//            sb.reverse();
//            System.out.println(sb);
//    }
//    
    //If it is not static we have to create a reference of LambdaDemo4 class and then use it
//    public void reverse2(String str){
//            StringBuffer sb = new StringBuffer(str);
//            sb.reverse();
//            System.out.println(sb);
//    }
    
    public static void main(String[] args){
//        LambdaDemo4 lb = new LambdaDemo4();
        
// below both are called method references, it means one method
// behaves as another whenever called
//        MyLambda ml = LambdaDemo4::reverse;
//        
//        MyLambda ml1 = lb::reverse2;
        
//        ml.display("Hello");
//        ml1.display("Hello");


//Now we are passing a constructor
//        MyLambda ml = LambdaDemo4::new;
//        ml.display("Hello");

// Now passing two parameters
        MyLambda ml = String::compareTo;
        System.out.println(ml.display("Hello", "Hello"));
    }
}

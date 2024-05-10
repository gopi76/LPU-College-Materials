import java.util.Scanner;
//import java.lang.Math;
public class Practice {
    public static void main(String[] args){
//        System.out.println(12.5%6.5);
//        int a = 10;
//        int b = 5;
//        float c = (float)a/b;
//        System.out.println(c);
//          byte a = 10;
//          short b = 20;
//          int c = a+b;
//          System.out.println(c);
//          float a = 12.5f;
//          double b = 5.66;
//          double c = a+b;
//          System.out.println(c);
//            char a = 40;
//            int b = 30;
//            int c = a-b;
//            System.out.println(c);
//          Scanner sc = new Scanner(System.in);
//          float base = sc.nextFloat();
//          float height = sc.nextFloat();
//          float area = 0.5f * base * height;
//          System.out.println(area);
//          float a,b,c,s;
//          double area;
//          a = sc.nextFloat();
//          b = sc.nextFloat();
//          c = sc.nextFloat();
//          s = (a*b*c)/2f;
//          area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//          System.out.println(area);
//          int a, b, c;
//          double r1, r2;
//          
//          a = sc.nextInt();
//          b = sc.nextInt();
//          c = sc.nextInt();
//          
//          r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
//          r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
//          
//          System.out.println(r1+" "+r2);

//            int l, b, h, tsa, v;
//            
//            l = sc.nextInt();
//            b = sc.nextInt();
//            h = sc.nextInt();
//            
//            v = l*b*h;
//            
//            tsa = 2*((l*b)+(b*h)+(h*l));
//            
//            System.out.println("tsa: "+tsa);
//            System.out.println("Volume: "+ v);
//            int x = 5;
//            int y = x++;
//            //first assign cheyyi tharvatha penchu
//            System.out.println(y + " " + x);
//            
//            int z = ++x;
//            System.out.println(x + " " + z);
//              int x = 1;
//              int y = 2;
//              
//              System.out.println(2*x++ + ++x*3);
              //result = 11 because, 2*(1)=2 then x becomes 2. So, (3)*3=9 2+9=11
//              char a = 65;
//              a++;
//              System.out.println(a);
             
            
//        int x = 113;
//        int x = -0b1010;
//        int y = 22;
//        int z;
//        
////        z = x&y;
////        z = x|y;
////        z = x^y;
////        z = x>>1;
//        z = x>>>1;
////        z = x<<1;
//        System.out.println(String.format("%s", Integer.toBinaryString(x)));
//        System.out.println(String.format("%32s", Integer.toBinaryString(z)));
//          int a = 2;
//          int b = 3;
//          
//          System.out.println(a + " " + b);
//          
//          a = a^b;
//          b = a^b;
//          a = a^b;
//          
//          System.out.println(a + " " + b);

//          byte a=9, b=12;
//          byte c;
//          System.out.print("9 in binary: ");
//          System.out.println(Integer.toBinaryString(9));
//          
//          System.out.print("12 in binary: ");
//          System.out.println(Integer.toBinaryString(12));
//          
//          //Performed left shift on a and stored in c
//          c = (byte) (a<<4);
//          System.out.print("After left shift: ");
//          System.out.println(Integer.toBinaryString(c));
//          
//          //Performed OR operation on c,b and stored in c
//          c = (byte) (c|b);
//          System.out.print("After OR operation: ");
//          System.out.println(Integer.toBinaryString(c));
//          
//          System.out.println((c&0b11110000)>>4);
//          System.out.println((c&0b00001111)); 
//            char c = 73;
//            byte b = (byte)c;
//            System.out.println(b);
//            System.out.println(c);
          
//           System.out.println("Sum: "+10+20);          
//           System.out.println("Sum: "+(10+20));
//             char[] c = {'a','b','c','d'};
//             String str1 = new String(c);
//             System.out.println(str1);
//              String str1 = "Java Program";
//              
//              String str2 = new String("JAVA");
//              
//              char[] c = {'H', 'e', 'l', 'l', 'o'};
//              
//              String str3 = new String(c,1,3);
//              
//              byte[] b = {66,65,66};
//              
//              String str4 = new String(b,1,2);
//              
//              System.out.println(str3);
//                String name = "Sravan";
//                System.out.println(name.substring(0,4));
//                String name = "Mr. Sravan Sunkara";
//                System.out.println(name.startsWith("Mr."));
//                System.out.println(name.endsWith("Sunkara"));
//                String name = "sravan";
//                String name1 = new String("sravan");
//                String name2 = "sravan";
//                
//                System.out.println(name==name1);
//                System.out.println(name==name2);
//                
//                System.out.println(name.equals(name1));
//                System.out.println(name.equals(name2));
//                  Scanner sc = new Scanner(System.in);
//                  String input = sc.next();
//                  
//                  if(input.matches("[abc]{4}")){
//                      System.out.println("Allowed");
//                  } else{
//                      System.out.println("Not Allowed");
//                  }
//                  String str = "programmer@gmail.com";
//                  String userName = "";
//                  String domainName = "";
//                  int i = str.indexOf("@");
//                  userName = str.substring(0,i);
//                  System.out.println(userName);
//                  domainName = str.substring(i+1,str.length());
//                  System.out.println(domainName);
//                  System.out.println(domainName.matches("gmail.*"));
//                  System.out.println(str.matches(".*gmail.*"));
//                    String num = "01/12/2000";
//                    System.out.println(num.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}"));
//                  String str = "   abc   de    fgh   ijk";
                  
//                  String newStr = str.replaceAll("[^a-zA-Z0-9]","");
//                  System.out.println(newStr);
//                  System.out.println(str.replaceAll("\\s+", " ").trim());
//                    str = str.replaceAll("\\s+", " ").trim();
//                    System.out.println(str);
//                    String[] words = str.split("\\s");
//                    
//                    System.out.println(words.length);
//                   int n = 5;
//                   if(n%2 == 0){
//                       System.out.println("Even");
//                   } else {
//                       System.out.println("Odd");
//                   }
//                int age = 65;
//                if(age>=14 && age<=55){
//                    System.out.println("Young");
//                } else {
//                    System.out.println("Old");
//                }

//                int avg = 100;
//                if(avg >= 70){
//                    System.out.println("A");
//                } else if(avg >=60 && avg <70){
//                    System.out.println("B");
//                } else if(avg >=50 && avg <60){
//                    System.out.println("C");
//                } else if(avg >=40 && avg <50){
//                    System.out.println("D");
//                } else {
//                    System.out.println("F");
//                }
//            String name = "170";
//            if(name.matches("[01]+")){
//                System.out.println("Binary Radix=2");
//            } else if(name.matches("[0-7]+")){
//                System.out.println("Octal Radix=8");
//            } else if(name.matches("[0-9]+")){
//                System.out.println("Decimal Radix=10");
//            } else if(name.matches("[0-9A-F]+")){
//                System.out.println("Hexa Radix=16");
//            } else{
//                System.out.println("Not a number");
//            }
//              int year = 1900;
//              if(year%4 == 0){
//                  if(year%100 == 0){
//                      if(year%400 == 0){
//                          System.out.println("Leap Year");
//                      } else {
//                          System.out.println("Not Leap Year");
//                      }
//                  } else {
//                      System.out.println("Leap Year");
//                  }
//              } else {
//                  System.out.println("Not Leap Year");
//              }
//        
//          int day = 1;
//          if(day==1){
//              System.out.println("Monday");
//          } else if(day==2){
//              System.out.println("Tuesday");
//          } else if(day==3){
//              System.out.println("Wednesday");
//          } else if(day==4){
//              System.out.println("Thursday");
//          } else if(day==5){
//              System.out.println("Friday");
//          } else if(day==6){
//              System.out.println("Saturday");
//          } else if(day==7){
//              System.out.println("Sunday");
//          } else {
//              System.out.println("Invalid Day");
//          }
        
//        String url = "http://www.google.com";
//        String protocol = url.substring(0, url.indexOf(':'));
//        String domain = url.substring(url.lastIndexOf('.')+1, url.length());
////        System.out.println(domain);
//        
//        if("http".equals(protocol)){
//            System.out.println("Hyper text transfer protocol");
//        } else if("ftp".equals(protocol)){
//            System.out.println("File transfer protocol");
//        }

//        
//        if("com".equals(domain)){
//            System.out.println("commercial");
//        } else if("org".equals(domain)){
//            System.out.println("organization");
//        } else if("net".equals(domain)){
//            System.out.println("network");
//        }
        
//        int day = 6;
//        switch(day){
//            case 1:
//                System.out.println("Mon");
//                break;
//            case 2:
//                System.out.println("Tue");
//                break;
//            case 3:
//                System.out.println("Wed");
//                break;
//            case 4:
//                System.out.println("Thu");
//                break;
//            case 5:
//                System.out.println("Fri");
//                break;
//            case 6:
//                System.out.println("Sat");
//                break;
//            case 7:
//                System.out.println("Sun");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        String option = sc.next();
//        int i = 10;
//        while(i!=10){
//            System.out.println(i);
//        }
//        
//        do{
//            System.out.println(i);
//        }while(i!=10);
//        int n = 5;
//        for(int i=1; i<=10; i++){
//            System.out.println(n+"x"+i+"="+n*i);
//        }
        
//        int num = 10;
//        int sum = 0;
//        for(int i=1; i<=num; i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);
//        
//        int n = 5;
//        int pro = 1;
//        for(int i=1; i<=n; i++){
//            pro = pro*i;
//        }
//        System.out.println(pro);

//        int n = 2557;
//        int count = 0;
//        while(n>0){
////            int r = n%10;
//            n = n/10;
//            count++;
//        }
//        System.out.println(count);

//        int n = 153;
//        int m = n;
//        int sum = 0;
//        while(n>0){
//            int r = n%10;
//            sum = sum + r*r*r;
//            n = n/10;
//        }
//        System.out.println(sum == m ? "Armstrong number" : "Not an Armstrong Number");
        
        
//        int n = 9754;
//        int rev = 0;
//        while(n>0){
//            int r = n%10;
//            n = n/10;
//            rev = rev*10+r;
//        }
//        System.out.println(rev);
        
//        int n = 1700;
//        String rev = "";
//        while(n>0){
//            int r = n%10;
//            n = n/10;
//            rev += r;
//        }
//        
//        System.out.println(rev);
//        
//        for(int i=rev.length()-1; i>=0; i--){
//            switch(rev.charAt(i)){
//                case '0' -> System.out.print("Zero ");
//                case '1' -> System.out.print("One ");
//                case '2' -> System.out.print("Two ");
//                case '3' -> System.out.print("Three ");
//                case '4' -> System.out.print("Four ");
//                case '5' -> System.out.print("Five ");
//                case '6' -> System.out.print("Six ");
//                case '7' -> System.out.print("Seven ");
//                case '8' -> System.out.print("Eight ");
//                case '9' -> System.out.print("Nine ");
//                default -> System.out.print("Invalid ");
//            }
//        }
//        System.out.println();
//        
        
//        while(rev>0){
//            int rem = rev%10;
//            rev = rev/10;  
//        }

//AP
//        int term = 3;
//        int d = 5;
//        int n = 10;
//        for(int i=0; i<n; i++){
//            System.out.print(term+",");
//            term = term + d; 
//        }
//        System.out.println(".......");

//GP
//        int term = 5;
//        int r = 2;
//        int n = 10;
//        for(int i=0; i<n; i++){
//            System.out.print(term + ",");
//            term = term * r;
//        }
//        System.out.println("........");

//FIBONACCI
//        int n = 10;
//        int a = 0;
//        int b = 1;
//        int c;
//        System.out.print(a+", "+b+", ");
//        for(int i=0; i<n-2; i++){
//            c = a+b;
//            a = b;
//            b = c;
//            System.out.print(c + ", ");
//        }

//        int count = 0;
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if(j>=i){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if(j>=i){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if(j<6-i){
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=9; j++){
//                if(i+j <= 5 || j-i>=5){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
        
//        for(int i=6; i<=9; i++){
//            for(int j=1; j<=9; j++){
//                if(i-j >= 5 || i-j<=3){
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

//        int[] arr = new int[5];
//        arr[0] = 3;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr[3] = 6;
//        arr[4] = 5;
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        
        
       
//        int[] arr = {3,9,7,8,12,6,15,5,4,10};
//        int sum = 0;
//        int key = 16;
//        int max1 = arr[0];
//        int max2 = arr[0];
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//            if(arr[i] == key){
//                System.out.println(i);
//            }
//            if(arr[i]>max1){
//                max2 = max1;
//                max1 = arr[i];
//            }else if(arr[i]>max2){
//                max2 = arr[i];
//            }
//        }
//        System.out.println(max1 + " " + max2);
//        System.out.println("Element not found");
//        System.out.println(sum);

        
//        int[] arr = {3,9,7,8,12,6,15,5,4,10};
//        
//        for(int x : arr){
//            System.out.print(x +", ");
//        }
//        System.out.println();
//        
//        int temp = arr[arr.length-1];
//        for(int i=arr.length-2; i>=0;i--){
//            arr[i+1] = arr[i];
//        }
//        arr[0] = temp;
//        for(int x : arr){
//            System.out.print(x +", ");
//        }

//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 5;
//        arr[4] = 6;
//        arr[5] = 7;
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        
//        int index = 3;
//        int element = 4;
//        for(int i=0; i<arr.length; i++){
//            if(i == index){
//                for(int j=arr.length-2; j>=i; j--){
//                    arr[j+1] = arr[j];
//                }
//                arr[i] = element;
//            }
//            
//        }
//        
//        for(int x: arr){
//            System.out.print(x + " ");
//        }

//        int[] arr = new int[10];
//        arr[0] = 5;
//        arr[1] = 9;
//        arr[2] = 6;
//        arr[3] = 10;
//        arr[4] = 12;
//        arr[5] = 7;
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        
//        int index = 2;
//        for(int i=0; i<arr.length; i++){
//            if(i == index){
//                int temp = arr[index];
//                for(int j=index+1; j<arr.length; j++){
//                    arr[j-1] = arr[j];
//                }
//            }
//        }
//        
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
//        System.out.println();

//        int[] a = {1,2,3,4};
//        int[] b = new int[a.length];
//        for(int i=0; i<a.length; i++){
//            b[i] = a[i];
//        }
//        for(int x: b){
//            System.out.print(x + " ");
//        }
//        System.out.println();

//        int[] a = {1,2,3,4};
//        int[] b = new int[a.length];
//        for(int i=a.length-1; i>=0; i--){
//            b[a.length-1-i] = a[i];
//        }
//        for(int x: b){
//            System.out.print(x + " ");
//        }
//        System.out.println();
        
        int[] a = {1,2,3,4};
        int[] b = new int[2  * a.length];
        
        for(int x: a){
            System.out.print(x + " ");
        }
        System.out.println();
        
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
        }
        a=b;
        b=null;
        
        for(int x: a){
            System.out.print(x + " ");
        }
        System.out.println();
        
        
    }
}

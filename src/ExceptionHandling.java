import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num1=6;
//        int num2=8;
//        int num3=(num1+num2)/2;
//        System.out.println(num3);

//        try{
//            int a=15;
//            int b=0;
//            System.out.println(a/b);
//        } catch (Exception e) {
//            System.out.println("b can not 0 ever");
//        }
//        try{
//            int arr1[]=new int [5];
//            arr1[0]=78;
//            System.out.println(arr1[10]);
//        } catch (Exception e) {
//            throw  new IndexOutOfBoundsException("Index not Found");
////            System.out.println(e);
////            System.out.println("Index not Found");
//        } finally {
//            System.out.println("This is my Job");
//        }

//        try{
//            int a=15;
//            int b=0;
//            System.out.println(a/b);
//        } catch (Exception e) {
//            throw new ArithmeticException("This is the arithmetic error");
//        }

        try{
            int a=sc.nextInt();
            int b=5;
            try{
                int c=sc.nextInt();
                if(a>18) {
                    System.out.println("you can drive the car");
                }
            } catch (Exception e) {
                throw new RuntimeException("Input Error");
            }
        } catch (Exception e) {
            throw new RuntimeException("My Error is"+e);
        }
    }
}

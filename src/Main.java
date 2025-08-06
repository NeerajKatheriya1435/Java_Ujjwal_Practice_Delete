import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter you name: ");
//        String name=sc.nextLine();

//        System.out.print("Enter you age: ");
//        int age=sc.nextInt();
//        System.out.println("Hello ! "+name+" I am "+age+" years old");

//        int a=8;
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println((a));
        int age=34;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.78));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.pow(3,5));
        System.out.println(Math.PI);
    }
}

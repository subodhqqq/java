import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        
        System.out.println("Enter the first number");
        int a= new Scanner(System.in).nextInt();
        System.out.println("Enter the Second number");
        int b= new Scanner(System.in).nextInt();
        
        
        //Another method for input
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        System.out.println(a+b);

    }
}
import java.util.Scanner;

class Condition{
    /**
     * @param args
     */
    public static void main(String[] args)// public is the access modifire static is non change able void is bllank return type and main is the main function which is compiler first the code
    {
        System.out.print("enter the first number:");
        int a= new Scanner(System.in).nextInt();
        System.out.print("enter the second number:");
        int b= new Scanner(System.in).nextInt();
        if(a>b)
        {
            System.out.println("first number is greater");
           
        }
        else if(b>a){
            System.out.println("second number is greater ");
        }
        else if(a==b)
        {
            System.out.println("boh are equal");
        }
        else{
            System.out.println("not define");
        }

      

    }
    
}
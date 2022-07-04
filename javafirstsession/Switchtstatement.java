import java.util.Scanner;
public class Switchtstatement {
    public static void main(String[] args) {
        System.out.println("enter the buttom");
        int buttom= new Scanner(System.in).nextInt();
        switch(buttom)
        {
         case 1:System.out.println("Namste");
         break;
         case 2:System.out.println("hello");
         break;
         case 3:System.out.println("jojo loppa");
         break;
         default:
         System.out.println("re try");

        }

    }
}

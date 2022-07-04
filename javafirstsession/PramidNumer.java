import java.util.Scanner;
public class PramidNumer {
    public static void numerPramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        numerPramid(n);
    }
}

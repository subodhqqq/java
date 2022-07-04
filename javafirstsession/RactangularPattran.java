import java.util.Scanner;

public class RactangularPattran {
    public static void Pattrn(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        Pattrn(n);
    }
}

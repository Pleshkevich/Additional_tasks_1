import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter XX: ");
        float XX = sc.nextFloat();
        System.out.println("XX =" + XX);
        double YY = 10.5;
        System.out.println("Price = " + (((XX * 10) * 0.85) + (YY * 2)));
        System.out.println("Price = " + (((XX * 7) * 0.50) + (YY * 1)));
        System.out.println("Price = " + (((XX * 2) * 0.90) + (YY * 3)));
    }

}
import java.util.Scanner;

public class Squaresum
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("enter first numbers: ");
        int a = sc.nextInt();
        System.out.print("enter second numbers: ");
        int b = sc.nextInt();

        int sum = (a * a) + ( b * b);
        System.out.println("Sum of squares = " + sum );

        sc.close();
    }
}
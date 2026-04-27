//import java.util.Scanner;
//
//public class SimpleInterest {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter principal : ");
//        double p = sc.nextDouble();
//
//        System.out.print(" enter Rate : ");
//        double r = sc.nextDouble();
//
//        System.out.print("enter time : " );
//        double t = sc.nextDouble();
//
//        double si = (p * r * t ) / 100;
//        System.out.println("simple intrest = " + si);
//    }
//}

import java.util.Scanner;

public class SimpleInterest {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle : ");
        double p = sc.nextDouble();

        System.out.print("Enter the Rate : ");
        double r = sc.nextDouble();

        System.out.print("Enter the Time of loan :");
        double t = sc.nextDouble();

        System.out.print("SIMPLE INTEREST : ");
        double si = ( p * r * t ) / 100 ;

        System.out.print(si);

        sc.close();
    }

}
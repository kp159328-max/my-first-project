import java.util.Scanner;

public class TempratureConverter {

    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Select Temprature Converter -- ");
            System.out.println("    1. Celsius to Fahrenheit");
            System.out.println("    2. Fahrenheit to Celsius");
            System.out.println("    3. Exit");
            System.out.print( "Give input : ");
           int choice = sc.nextInt();
        // celsius to fahrenheit
     switch (choice){
        case 1 :
     
        System.out.print("enter temprature in eclsius :");
        double c = sc.nextDouble()  ;

        double f = (c * 9/5) + 32 ;
        System.out.print("temprature in fahrenheit : " + f);
        break;
        // fahrenheit to celsius
        case 2 :
          System.out.print("enter temprature in fahrenheit :");
        double fr = sc.nextDouble()  ;

        double ce = (fr - 32) * 5/9;
        System.out.print("temprature in celsius : " + ce);
        break;

        case 3 :
        System.out.println("Exiting the program...");
        sc.close();
        return;

        default:
        System.out.println("Invalid choice. Please try again.");

            }
     
        }

    }
    
}

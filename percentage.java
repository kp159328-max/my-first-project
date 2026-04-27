import java.util.Scanner;

public class percentage {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        
       System.out.println("Select Percentage Calculator -- ");
       System.out.println("    1. Calculate Percentage");
       System.out.println("    2. Exit");
       System.out.print( "Give input : ");

        int choice = sc.nextInt();
        switch(choice){
        case 1:
        

        System.out.print("Enter price           :  ");
        double number = sc.nextDouble();


        System.out.print("Discount Percentage   : " );
        double per = sc.nextDouble();

        double result = (number * per) / 100;
        System.out.println(per + " % of " + number + " is : " + result);
        
        double discount = number - result;
        System.out.println("Discount in Rupees    : " + result);
        System.out.println("Price after discount  : " + discount);

        break;

        case 2 :
              System.out.println(" exit the program ");
              sc.close();
              return;
        default:
              System.out.println("Invalid choice. Please try again.");
     
         }
       }
   }
}

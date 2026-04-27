import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   while(true)   {
  
        System.out.println("Choose the shape to calculate the perimeter :");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Exit");
        System.out.print( "Give input : ");
          int choice = sc.nextInt();
   
       switch(choice){
  // squre
    case 1:   
        System.out.print("Enter the side of srqare : ");
        double side = sc.nextDouble();
        System.out.println("perimerter of square = " + (4 * side)  );
        break;
 // rectangle
    case 2:
        System.out.print("Enter the length of rectangle ");
        double length = sc.nextDouble();
         System.out.print("Enter the length of breath of rectangle ");
        double breadth = sc.nextDouble();
        System.out.println("perimeter of rectangle = " + (2 * (length + breadth )));
        break;
// circle
    case 3:
        System.out.print("Enter the radius of circle : ");
        double radius = sc.nextDouble();
        System.out.println("perimeter of circle = " + (2 * 3.14 * radius));
        break;

    case 4:
        System.out.println("Exiting the program...");
        sc.close();
        return;
    default:
        System.out.println("Invalid input. Please try again.");


          }
       
        }
         
    }
}
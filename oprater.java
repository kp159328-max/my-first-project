import java.util.Scanner;

public class oprater{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
         System.out.print("Have you id card (yes/no) : "); 
         String card = sc.next();
         if(card.equalsIgnoreCase("yes")){
            System.out.print(" you can enter in  the college ");

         }
         else{
            if(card.equalsIgnoreCase("no")){
                System.out.print("you can not enter in the college ");
            }
            else{
                System.out.print("invalid input ");
            }
         }

         sc.close();
    
    }
}
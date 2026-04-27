
// simple java program to print all the numbers from 1 to 1000 that are divisible by 7

// public class ControlFlow {
//     public static void main (String[] args){
//         for(int i =1 ; i <=1000 ; i ++){
//             if(i % 7 == 0)
//                 System.out.print("  " +i);
//         }
//     }
    
// }

import java.util.Scanner;

public class ControlFlow {



    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
 while (true){
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Enter the upper limit : ");
        int upperlimit = sc.nextInt();

        for(int i =1 ; i <= upperlimit; i ++){
            if(i % number == 0)
                System.out.print("  " +i);

           sc.close();

          } 
        }
    }
    
}


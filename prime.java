// import java.util.Scanner;

// public class prime {
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);

//      System.out.print("enter number :" );
//         int number = sc.nextInt();

//         int count = 0;

//         for (int i =1; i <=number ; i++){
//             if (number % i == 0 ){
//                 count ++;
//             }
//         }
//      if (count == 2){
//         System.out.print("number is prime ");
//      }
//      else{
//         System.out.print("number is not prime ");
//      }

//         sc.close();
//     }
// }

// updated version of prime.java

import java.util.Scanner;

public class prime {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

            boolean isPrime = true;

            if(number <= 1){
                isPrime = false; 
            }
            else{
          //  for (int i = 2; i <= number / 2; i++)
             for (int i = 2; i <= Math.sqrt(number) ; i++)
            {
               if (number % i == 0)
               {
                isPrime = false;
                break;
               }
            }
        }
        if (isPrime){
            System.out.print("number is prime ");
        }
        else{
            System.out.print("number is not prime ");
        }


        sc.close();
    }
}
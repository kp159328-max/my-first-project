// import java.util.Scanner;

// public class Armstrong2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int number = sc.nextInt();

//         int temp = number;
//         int sum = 0;

//         int digits = String.valueOf(number).length(); // count digits

//         while (number != 0) {
//             int digit = number % 10;
//             sum += Math.pow(digit, digits);
//             number = number / 10;
//         }

//         if (temp == sum)
//             System.out.println(temp + " is an Armstrong number");
//         else
//             System.out.println(temp + " is not an Armstrong number");

//         sc.close();
//     }
// }


import java.util.Scanner;

public class Armstrong2{

    public static void main (String[] args){
           Scanner sc = new Scanner(System.in);
          
           System.out.print("enter the number : ");
           int number = sc.nextInt();

           int temp = number;
           int sum = 0;

           int digits = String.valueOf(number).length();

           while(number !=0){
            int digit = number % 10;
            sum = sum + (int) Math.pow( digit , digits);
            number = number / 10;

           }
           if (temp == sum)
           System.out.println(temp + " is an armstrong number");
           else 
              System.out.println(temp + " is not an armstrong number");
                sc.close();
    }

}


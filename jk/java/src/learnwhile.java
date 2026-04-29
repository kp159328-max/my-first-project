// import java.util.Scanner;

// public class learnwhile {
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         int number;
//         int digit ;
//         int reverse =0 ;

//         System.out.print("Enter the number : ");
//         number = sc.nextInt();

//         while(number != 0 )
//         {
//             digit = number % 10;
//             number = number /10;
//             System.out.println(digit);
//             reverse = reverse * 10 + digit;
//         }
//         System.out.println("Reversed number : " + reverse);
//         sc.close();
//     }
// }


import java.util.Scanner;
public class learnwhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number , digit , reverse = 0 ;
    System.out.print("Enter the number : ");
    number = sc.nextInt();
     
    while(number != 0 ){
        digit = number % 10;
        number = number / 10;
        reverse = reverse *10 + digit;

    System.out.println("reverse : " + reverse );

        sc.close();
    }
    }
}
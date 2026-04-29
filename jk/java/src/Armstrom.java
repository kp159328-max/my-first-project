import java.util.Scanner;

public class Armstrom {

    public static void main(String[] args)
    {
        int number;
        int digit; 
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        int temp = number;

        while(number != 0){
            digit = number % 10;
            sum = sum + digit * digit * digit ;
            number = number / 10;

        }
        if(temp == sum){
            System.out.println(temp + " is an armstrong number");
        }
        else{
            System.out.println(temp + " is not an armstrong number");

            sc.close();
        }
    }
}

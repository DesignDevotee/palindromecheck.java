
import java.util.Scanner;



public class Palindrome {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check palindrome : ");
        int number = sc.nextInt();
        sc.nextLine();
        int reversed = 0;
        int last;
        int originalnumber = number;
        while (number != 0) {
            last = number % 10;
            reversed = reversed * 10 + last ;
            number = number / 10;
        }
        if(originalnumber == reversed){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not a palindrome");
        }
        sc.close();

    }

}
import java.util.Scanner;
public class Day9_LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year :" );
        Scanner Sc = new Scanner(System.in);
        int year = Sc.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0)
        System.out.println("It is a leap year");
        else
        System.out.println("It is not a leap year");



        
    }
}

import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
    System.out.println("enter a number :" );
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int lastDigit = number%10;
    System.out.println("Last digit of a entered number is :" +lastDigit);

    }
}

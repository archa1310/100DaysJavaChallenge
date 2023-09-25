import java.util.Scanner;
public class LastTwoDigit {
    public static void main(String[] args) {
        System.out.print("Enter a number :" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n/10;
        int r = n%10;
        int x = d%10;
        System.out.println("Last 2 digit of the entered number are :"+x +r);

    }
    
}

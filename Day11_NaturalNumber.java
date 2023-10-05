import java.util.Scanner;
public class Day11_NaturalNumber {
    public static void main(String[] args) {
        System.out.print("Enter count of natural numbers:" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int sum=0;
        int count = 0;
        while(count!=n)
        {
           System.out.println(i);
           sum = sum+i;
           i++;
           count++;
           
        }
        System.out.println("sum of "+ n +" " +"natural numbers is :" +sum);

        
    }
}

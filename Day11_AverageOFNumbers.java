import java.util.Scanner;
public class Day11_AverageOFNumbers {
    public static void main(String[] args) {
        System.out.print("Enter count of n numbers:" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int sum=0;
        float avg=0;
        int count = 0;
        while(count!=n)
        {
           System.out.println(i);
           sum = sum+i;
           i++;
           count++;
           
        }
        System.out.println(sum);
        avg = sum%n;
        System.out.println("avg of "+ n +" " +"numbers is :" +avg);

        
    }
    
}

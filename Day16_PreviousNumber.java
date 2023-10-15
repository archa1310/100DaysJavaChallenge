import java.util.Scanner;
public class Day16_PreviousNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previous = 0;
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
    
           int current =i;
           sum = previous + current;
           previous = sum;
           System.out.println(sum);
        }

            
        
        
    }
}

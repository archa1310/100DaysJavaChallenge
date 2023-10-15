import java.util.Scanner;

public class Day16_SumofSquares {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int sum = 0;
        int count =0;
            while (count!=n) {
            int square = i*i;
            sum = sum+square;
            i++;
            count++;
            }

           System.out.println(sum);
         
        
        }
        
        
}

import java.util.Scanner;
public class Day17_SquareOfConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =2;
        int count =0;
            while (count!=n) {

                if(i%2==0)
            {
                System.out.println(Math.pow(i,2));
                
                count++;
            
            }
            i+=2;
         
        
        }

    }
}

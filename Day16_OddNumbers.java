import java.util.Scanner;
public class Day16_OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        int count =0;
            while (count!=n) {

                if(i%2!=0)
            {
                System.out.print(i+" ");
                   
                sum = sum+i; 
                count++;
            
            }
            i++;
         
        
        }
        System.out.println("sum is :"+sum);
        
    }
    
}

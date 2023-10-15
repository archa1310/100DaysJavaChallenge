import java.util.Scanner;
public class Day17_SeriesPrint {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =2;
        int count =0;
        int sum = 1;
            while (count<=n) {

            System.out.println(sum);
            sum = sum + i;  
            count++;
            i++;
         
        
        }
    }
}

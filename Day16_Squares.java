import java.util.Scanner;
public class Day16_Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int count =0;
            while (count!=n) {
             System.out.println(i +"-"+i*i);
            i++;
            count++;
            
            }
        
        }
    
}



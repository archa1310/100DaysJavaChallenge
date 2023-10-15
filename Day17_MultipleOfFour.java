import java.util.Scanner;
public class Day17_MultipleOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
         int i =1;
       while(count<=4)
       {
         count++;
         System.out.println(i);
         i+=4;
       }
    }
    
}

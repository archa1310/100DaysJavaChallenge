import java.util.Scanner;
public class Day17_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          int a =2;
          System.out.println(Math.pow(a, i));
        }

        
    }
}

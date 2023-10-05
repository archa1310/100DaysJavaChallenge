import java.util.Scanner;
public class Day9_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        Scanner sc3 = new Scanner(System.in);
        char ch = sc3.next().charAt(0);
        if (ch== '+')
        System.out.println(a+b);
        if (ch== '-')
        System.out.println(a-b);
         if (ch== '*')
        System.out.println(a*b);
         if (ch== '/')
        System.out.println(a/b);

        

        
    }
}

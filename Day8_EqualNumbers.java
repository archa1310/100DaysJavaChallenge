import java.util.Scanner;
public class Day8_EqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        if(a==b && b==c && c==a)
        System.out.println("Numbers are equal");
        else
        System.out.println("Number are not equal");
        
    }
}

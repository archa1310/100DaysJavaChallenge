import java.util.Scanner;
public class Day8_LargestNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    int b = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    int c = sc2.nextInt();
    Scanner sc3= new Scanner(System.in);
    int d = sc3.nextInt();
    if(a>=b && a>=c && a>=d)
    System.out.println("Largest Number is :"+ a);
    else if(b>=a&& b>=c && b>=d)
    System.out.println("Largest Number is :"+ b);
    else if(c>=a&& c>=b && c>=d)
    System.out.println("Largest Number is :"+ c);
    else
    System.out.println("Largest Number is :"+ d);
    }
}

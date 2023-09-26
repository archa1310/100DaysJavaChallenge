import java.util.Scanner;
public class Day6_AngleOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter value of top angle:" );
        Scanner sc = new Scanner(System.in);
        int topangle = sc.nextInt();
        System.out.println("Enter value of top angle:" );
        Scanner sc1 = new Scanner(System.in);
        int rightangle = sc1.nextInt();
         System.out.println("Enter value of top angle:" );
        Scanner sc2 = new Scanner(System.in);
        int leftangle = sc2.nextInt();
        int sum = topangle+leftangle+rightangle;
        if(sum==180)
        System.out.println("it is a valid triangle");
        else
        System.out.println("it is not a valid triangle");

    }
    
}

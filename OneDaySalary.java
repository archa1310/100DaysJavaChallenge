import java.util.Scanner;
public class OneDaySalary {
    public static void main(String[] args) {
    System.out.println("enter monthly salary:" );
    Scanner sc = new Scanner(System.in);
    int salary = sc.nextInt();
    double salryof1day = salary/30;
    System.out.println("salary of 1 day is :"+ salryof1day);

        
    }
}

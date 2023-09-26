import java.util.Scanner;
public class Day6_NetBonus {
    public static void main(String[] args) {
        System.out.print("Enter year of service : " );
        Scanner sc = new Scanner(System.in);
        int service = sc.nextInt();
        System.out.print("Enter salary amount : " );
        Scanner sc1 = new Scanner(System.in);
        int salary = sc1.nextInt();
        if(service>5)
        System.out.println("net bonus:" +(salary+salary*5/100));

        

            
        
    }
}

import java.util.Scanner;
public class PrintDay {
    
    public static void main(String[] args) {
        System.out.print("Enter an week number :" );
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();

        if(a==0)
        System.out.println("sunday");
        else if(a==1)
        System.out.println("Monday");
        else if(a==2)
        System.out.println("Tuesday");
        else if(a==3)
        System.out.println("Wednesday");
        else if(a==4)
        System.out.println("Thursday");
        else if(a==5)
        System.out.println("Friday");
        else if(a==6)
        System.out.println("Sunday");


    }
    
}
    


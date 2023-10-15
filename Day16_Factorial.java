import java.util.Scanner;
public class Day16_Factorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

 	System.out.print("Factors of "+n+" is: ");
    int fact =1;

for(int i=1; i<=n; i++)
{
	fact = n*(n-1);
    n--;
    
}
System.out.println(fact);
    }
}

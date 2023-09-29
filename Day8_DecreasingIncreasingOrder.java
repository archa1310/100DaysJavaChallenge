import java.util.Scanner;
public class Day8_DecreasingIncreasingOrder {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    int b = sc.nextInt();
    Scanner sc3 = new Scanner(System.in);
    int c = sc3.nextInt();
    if(a>= b && b>=c && c<=b)
    System.out.println("It is an  Decreasing order");
    else if(a<=b && b<= c && c>=b)   
    System.out.println("it is an Increasing order");
    else
    System.out.println("there is no order");




    
        
    }
}

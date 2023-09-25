import java.util.Scanner;
public class UpperLowerCase {
    public static void main(String[] args) {
        System.out.print("Enter an alphabet :" );
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch <= 'Z')
        System.out.println(ch +" is Uppercase");
        else if(ch>= 'a' && ch<= 'z')
        System.out.println(ch +" is Lowercase");


    }
    
}
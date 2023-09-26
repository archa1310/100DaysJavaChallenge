import java.util.Scanner;
public class Day6_CharOrAlphabet {
    public static void main(String[] args) {
        System.out.println("Enter a character" );
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        System.out.println(ch + ": is an alphabet");
        if (ch>= 0 && ch <= 9)
        System.out.println(ch +"is digit");
        else
        System.out.println(ch +"it is an special character");

    }
    
}

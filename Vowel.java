import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        System.out.print("Enter an alphabet :" );
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='A'|| ch== 'E' || ch=='I'||ch=='O'|| ch=='U'|| ch=='a'|| ch== 'e' || ch=='i'||ch=='o'|| ch=='u')
        System.out.println(ch +" is a vowel");
        else
        System.out.println(ch +" is a consonent");


    }
    
}

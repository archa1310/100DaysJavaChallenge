import java.util.Scanner;
public class Distinct {
    public static void main(String[] args) {
        System.out.println("enter the marks in physic :" );
        System.out.println("enter the marks in Maths :" );
        System.out.println("enter the marks in Chemistry :" );
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        if(physics>=75)
        System.out.println("Phycisc");
        Scanner sc1 = new Scanner(System.in);
        int Maths = sc1.nextInt();
        if(Maths>=75)
        System.out.println("Maths");
        Scanner sc2 = new Scanner(System.in);
        int Chemistry = sc2.nextInt();
        if(Chemistry>=75)
        System.out.println("Chemistry");


        
    }
}

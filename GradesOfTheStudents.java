import java.util.Scanner;

public class GradesOfTheStudents {
    public static void main(String[] args) {
        System.out.print("enter marks of 1st student :" );
        Scanner sc = new Scanner (System.in);
        int Student1 = sc.nextInt();
        if(Student1>=40 && Student1<=40)
        System.out.println("garde c");
        if(Student1>=41 && Student1<=75)
        System.out.println("grade b");
        if(Student1>=76 && Student1<=100)
        System.out.println("grade a");
        System.out.print("enter marks of 2nd student :" );
        Scanner sc2 = new Scanner (System.in);
        int Student2 = sc2.nextInt();
        if(Student2>=0 && Student2<=40)
        System.out.println("garde c");
        if(Student2>=41 && Student2<=75)
        System.out.println("grade b");
        if(Student2>=76 && Student2<=100)
        System.out.println("grade a");
        System.out.print("enter marks of 3rd student :" );
        Scanner sc3 = new Scanner (System.in);
        int Student3 = sc3.nextInt();
        if(Student3>=0 && Student3<=40)
        System.out.println("garde c");
        if(Student3>=41 && Student3<=75)
        System.out.println("grade b");
        if(Student3>=76 && Student3<=100)
        System.out.println("grade a");

    }
    
}

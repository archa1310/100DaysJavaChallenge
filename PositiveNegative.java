import java.io.*;
import java.util.*;

public class PositiveNegative {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();
        if(no >=0)        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
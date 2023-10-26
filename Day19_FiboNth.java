import java.util.Scanner;
public class Day19_FiboNth {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a =0;
    int i = 2;
    System.out.println("First"+ " "+n+" "+"Fibonacci numbers are:");
     System.out.println(a);
    for(int b=1;i<=n;i++)
    {
        System.out.println(b);
        int sum = a+b;
        a=b;
        b=sum;
        if(i==n)
   {
    System.out.println(n+"th fibonaci number is:"+b);
   }
    }

   
}

}

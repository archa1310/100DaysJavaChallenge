import java.util.Scanner;
public class Day11_SumOfLastThreeDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r1= n%10;
    int d = n/10;
    int r2= d%10;
    int d2 = d/10;
    int r3= d2%10;
    int d3 = d2/10;
    System.out.println(r1+r2+r3);

    
  }
}

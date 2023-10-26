public class Day19_FibonaciOrNot {
    public static void main(String[] args) {
        int n =142;
        int i = 5*n*n+4;
        int j = 5*n*n-4;
        int s = (int)Math.sqrt(i);
        //System.out.println(s);
        int k = (int)Math.sqrt(j);
        //System.out.println(k);
        if(s*s==i || k*k==j)
        {
            System.out.println(n+" " +"is a fibonacci number");
        }
        else
        {
            System.out.println(n+" "+"is not a fibonacci number ");
        }



    }
}

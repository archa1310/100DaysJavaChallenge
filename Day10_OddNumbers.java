public class Day10_OddNumbers {
    public static void main(String[] args) {
        int i =1;
        int count = 0;
        while (count!=10) {
            if(i%2!=0)
            {
              System.out.println(i);
               count++;
            }
            
            i++;
        }
         
    }
}

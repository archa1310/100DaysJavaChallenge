public class Day10_EvenNumbers {
    public static void main(String[] args) {
        int i =1;
        int count = 0;

       while (count!=50) {
        if(i%2==0)
        {
            System.out.println(i);
            count++;
        }
        i++;
       }
}
}

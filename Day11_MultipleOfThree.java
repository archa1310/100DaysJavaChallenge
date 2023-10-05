public class Day11_MultipleOfThree {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=40;i++)
        {
          if(i%3==0 && i<=40)
            {
            System.out.println(i);
              sum = sum+i;

            }
        
        }
        
            System.out.println(sum);
        }
        
        
    }
    


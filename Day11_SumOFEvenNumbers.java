public class Day11_SumOFEvenNumbers {

        public static void main(String[] args) {
            int sum = 0;
            int i =1;
            int count =0;
                while (count!=13) {
    
                    if(i%2==0)
                {
                    System.out.println(i);
                       
                       sum = sum+i; //2,4,6,8,10
                          count++;
                
                }
                i++;
             
            
            }
            System.out.println("sum is :"+sum);
        }
    }
    


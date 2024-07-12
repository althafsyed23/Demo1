import java.util.*;
class Simpleinterest
{
         public static void main(String args[])
         {
              Scanner sc=new Scanner(System.in);
                 
              int principal_amount,time_period;
              float rate_of_interest,SI;

              System.out.println("enter the pricipal amount");
              principal_amount=sc.nextInt();

              System.out.println("enter the time period");
              time_period=sc.nextInt();
        
              System.out.println("enter the rate of interest");
              rate_of_interest=sc.nextFloat();

              SI=(principal_amount*time_period*rate_of_interest)/100;
          }
}
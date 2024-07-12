import java.util.*;
class Sumofnatural
{
        public static void main(String args[])
        {
         Scanner sc=new Scanner(System.in);
         int n,i=1,sum=0;
         System.out.println("enter the value of n");
         n=sc.nextInt();

           while(i<=n)
           {
              sum +=i;
               i++; 
             
           }

            System.out.println("sum of first "+n+" natural numbers is "+sum);
         }
}
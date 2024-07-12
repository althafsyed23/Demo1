import java.util.*;
class Simplecalculater
{

        public static void main(String args[])
        {
 
         Scanner sc=new Scanner(System.in);

          int a,b,add,sub,mul,div,mod;
          System.out.println("enter the values of a and b");
          a=sc.nextInt();
          b=sc.nextInt();
          System.out.println("enter the choice");

           char choice=sc.next().charAt(0);   
             
           switch(choice)
          {
           case '+': add=a+b;
           System.out.println("adiition of two numbers="+add);
                   break;
           case '-': sub=a-b;
           System.out.println("substraction of two numbers="+sub);
                   break;
           case '*': mul=a*b;
           System.out.println("multiplication of two numbers="+mul);
                    break;
           case '/': div=a/b;
           System.out.println("dividion of two numbers="+div);
                     break;
           case '%':mod=a%b;
           System.out.println("remainder of two numbers="+mod);
                         
           }
        }
}
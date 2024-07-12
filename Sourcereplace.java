import java.util.*;
class Sourcereplace
{
          public static void main(String args[])
          {
                Scanner sc=new Scanner(System.in);
              int a[][]=new int[5][5];
             
            int i,j,row,col,source,replace;

          System.out.println("enter the size of 2d array a");
          row=sc.nextInt();
          col=sc.nextInt();
        
            
          System.out.println("enter the elements of 2D array a");
          for(i=0;i<row;i++)
          {
                   for(j=0;j<col;j++)
                   {
                       a[i][j]=sc.nextInt();

                   }
           }
            System.out.println("enter the source element");
            source=sc.nextInt();
            System.out.println("enter the replace element");
            replace=sc.nextInt();
       
            for(i=0;i<row;i++)
              {
                 for(j=0;j<col;j++)
                   {
                         if(a[i][j]==source)
                              a[i][j]=replace;
                   }
              
             }
              for(i=0;i<row;i++)
                {
                    for(j=0;j<col;j++)
                      {
                           System.out.print(a[i][j]+" ");
                      }
                      System.out.println("");
                }
        }
}

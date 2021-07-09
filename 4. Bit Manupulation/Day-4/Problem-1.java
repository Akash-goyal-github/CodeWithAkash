/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Calculate square of a number without using *, / and pow()

    Problem Link :- https://www.codingninjas.com/codestudio/problems/calculate-square-of-a-number_1112623

    Reference Link:- https://www.geeksforgeeks.org/calculate-square-of-a-number-without-using-and-pow/
    
  */

  
  import java.util.ArrayList;

  public class Solution 
  {
      public static int calculateSquare(int num) 
      {
         return recursive_square(num);
      }
      
      static int recursive_square(int num)
      {
          if(num==0)
          {
              return 0;
          }
          num=Math.abs(num);
          
          int x=num>>1;//dividing by 2 -->floor(n/2)
  //   //if number is even
  //         n--> 2*x;
  //         n^2=(2*x)^2--> 4*x^2;
              
          if(num%2==0)
          {
              return (recursive_square(x)<<2);
          }
  //     //if number is odd
  //           n--> 2*x+1
  //           n^2--> (2*x+1)^2 --> 4x^2+4x+1
           
          else
          {
              return ((recursive_square(x)<<2)+ (x<<2) +1);
          }
      }
  }
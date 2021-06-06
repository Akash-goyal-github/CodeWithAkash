/**
 * @author AkashGoyal
 * @date 30/05/2021
 */

/**


--------------------- Problem----------->> Find factorial of a large number

    Problem Link :- https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1

    Reference:- https://www.youtube.com/watch?v=VCfZOe1oJHU

  */


  //https://www.youtube.com/watch?v=VCfZOe1oJHU

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        
        ArrayList<Integer> product=new ArrayList<>();
        product.add(1);
        return fact(product,N);
        
    }
    
    static ArrayList<Integer> fact(ArrayList<Integer> product, int n)
    {
        if(n==1)
        {
            return product;
        }
        
        StringBuilder local_product=new StringBuilder();
        int carry=0;
        //step by step multiplying each element by n and storing in array list
        for(int i=product.size()-1;i>=0;i--)
        {
            int one_by_one_multiple=product.get(i)*n+carry;
            local_product.append(one_by_one_multiple%10);
            carry=one_by_one_multiple/10;
        }
        
        while(carry!=0)
        {
            local_product.append(carry%10);
            carry/=10;
        }
        //clearing array list and again putiing the number
        product.clear();
        
        for(int i=local_product.length()-1;i>=0;i--)
        {
            product.add(Integer.parseInt(local_product.charAt(i)+""));
        }
        
       return fact(product,n-1);
        
    }
}
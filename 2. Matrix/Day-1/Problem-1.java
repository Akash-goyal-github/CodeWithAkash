/**
 * @author AkashGoyal
 * @date 05/06/2021
 */

/**


--------------------- Problem----------->>  Spirally traversing a matrix

    Problem Link :- https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

    Reference:- https://www.youtube.com/watch?v=1ZGJzvkcLsA

  */

  //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        
  /*  
 top(0) ->  * * * *
            * * * *
            * * * *
down(r-1)-> * * * * ] r*c
            ^     ^
            |     |
         left(0)  right(c-1)
          
    */
    
    //we will take 4 boundary variables which will help to restrict to spiral
    
    int top=0;
    int down=r-1;
    int left=0;
    int right=c-1;
    
    
    //we will define a variable to keep track of direction
    
        /*  0--> means --> (left->right)
            1--> means --> (top->down)
            2--> means --> (right->left)
            3--> means --> (down->top)
        */
            
    
    int direction=0;
    
    ArrayList<Integer> arlist=new ArrayList<>();
    
    while(left<=right && top<=down)
    {
        if(direction==0)
        {
            for(int i=left;i<=right;i++)
            {
                arlist.add(matrix[top][i]);
            }
            top++;
            direction=1;
        }
        else if(direction==1)
        {
            for(int i=top;i<=down;i++)
            {
                arlist.add(matrix[i][right]);
            }
            right--;
            direction=2;
        }
        else if(direction==2)
        {
            for(int i=right;i>=left;i--)
            {
                arlist.add(matrix[down][i]);
            }
            down--;
            direction=3;
        }
        else if(direction==3)
        {
            for(int i=down;i>=top;i--)
            {
                arlist.add(matrix[i][left]);
            }
            left++;
            direction=0;
        }
        
    }
    
    return arlist;
    
          
    }
/**
 * @author AkashGoyal
 * @date 05/06/2021
 */

/**


--------------------- Problem----------->>  Search a 2D Matrix

    Problem Link :- https://leetcode.com/problems/search-a-2d-matrix/


  */


//Method-1 Time complexity- (c+r)


  public boolean searchMatrix(int[][] matrix, int target) {
        
        int exist_at=-1;
        for(int i=0;i<matrix.length;i++)
        {
            int last=matrix[i].length-1;
            if(matrix[i][0]<=target && matrix[i][last]>=target)
            {
                for(int j=0;j<matrix[i].length;j++)
                    {
                        if(matrix[i][j]==target)
                        {
                            return true;
                        }
                    }
            }
        }
        
        return false;
    }

    //----------------------------------------------------------------------------------------------------------------------------


//Method-2 Time complexity- (log c+log r) --> Binary search



      public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++)
        {
           //no of rows and columns in matrix
            
            int row=matrix.length-1;
            int columns=matrix[0].length-1;
            
 //first doing binary search to get the row which has equal or greater then the target values in it.
            int target_in_first_of_all_row=BinSearchColumn(matrix,0,row,target);
            
            if(matrix[target_in_first_of_all_row][0]>target)
            {
                // decrease one because we have found the row which contains value larger then target.
                target_in_first_of_all_row--;
            }
            
            //if the target_in_first_of_all_row is negative that next all rows will have bigger elemets then target and also no previous row exist.
            
            if(target_in_first_of_all_row==-1)
            {
                return false;
            }
            
            //searching target in the perticular row
            
            int  target_in_row=BinSearchRow(matrix,target_in_first_of_all_row,0,columns,target);
            
            if(target_in_row==-1)
            {
                return false;
            }
            else
            {
                return true;
            }
            
        }
        
        return false;
    }
    
    int BinSearchColumn(int[][] matrix,int top,int bottom,int target)
    {
        int mid=0;
        while(top<=bottom)
        {
            mid=top+(bottom-top)/2;
            
            if(matrix[mid][0]>target)
            {
                bottom=mid-1;
            }
            else if(matrix[mid][0]<target)
            {
                top=mid+1;
            }
            else
            {
                return mid;
            }
        }
        
        return mid;
    }
    
    
    int BinSearchRow(int[][] matrix,int row,int left,int right,int target)
    {
        int mid=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            
            if(matrix[row][mid]>target)
            {
                right=mid-1;
            }
            else if(matrix[row][mid]<target)
            {
                left=mid+1;
            }
            else
            {
                return mid;
            }
        }
        
        //returning -1 because the element does't exist.
        
        return -1;
    }




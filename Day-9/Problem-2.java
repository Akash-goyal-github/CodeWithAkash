/**
 * @author AkashGoyal
 * @date 01/06/2021
 */

/**


--------------------- Problem----------->>  Array Subset of another array

    Problem Link :- https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

  */

  public String isSubset( long a1[], long a2[], long n, long m) {
        
    HashSet<String>hs=new HashSet<>();
    for(int i=0;i<(int)n;i++)
    {
        hs.add(String.valueOf(a1[i]));
    }
    
    for(int i=0;i<(int)m;i++)
    {
        if(!hs.contains(a2[i]+""))
        {
            return "No";
        }
    }
    
    return "Yes";
    
}
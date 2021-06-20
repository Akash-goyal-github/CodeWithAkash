/**
 * @author AkashGoyal
 * @date 08/06/2021
 */

/**


--------------------- Problem----------->>   Common elements in all rows of a given matrix

    Problem Link :- https://www.codingninjas.com/codestudio/problems/common-elements-present-in-all-rows-of-a-matrix_1118111

    Concept:- Use hashmap to solve this problem

  */


  
import java.util.*;
public class Solution
{
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> mat)
    {
    // Write your code here.
    HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<mat.size();i++)
        {
            for(int j=0;j<mat.get(0).size();j++)
            {
                if(i==0)
                {
                    if(!hmap.containsKey(mat.get(i).get(j)))
                    {
                        hmap.put(mat.get(i).get(j),1);
                    }
                }
                else
                {
                    if(hmap.containsKey(mat.get(i).get(j)) && hmap.get(mat.get(i).get(j))==i)
                        {
                            hmap.put(mat.get(i).get(j),i+1);
                        }
                }
            }

        }

    ArrayList<Integer>alist=new ArrayList<>();

    for(Map.Entry map:hmap.entrySet())
        {
            if((int)map.getValue()==mat.size())
            {
                    alist.add((int)map.getKey());
            }
        }

    return alist;

    }
}
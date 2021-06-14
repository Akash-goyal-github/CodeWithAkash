/**
 * @author AkashGoyal
 * @date 31/05/2021
 */

/**


--------------------- Problem----------->> Longest consecutive subsequence

    Problem Link :- https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

    Reference:- O(N)+O(N)+O(N)--> https://www.youtube.com/watch?v=qgizvmgeyUM

  */

  static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	  
	  int max_subs=0;
	  HashSet<Integer>hs=new HashSet<>();
	  
	  for(int i=0;i<N;i++)
	  {
	      hs.add(arr[i]);
	  }
	  
	  for(int i=0;i<N;i++)
	  {
	      int local_count=0;
	      if(hs.contains(arr[i]-1))
	      {
	          continue;
	      }
	      int point=arr[i];
	      while(hs.contains(point)){
	          local_count++;
	          point++;
	      }
	      if(max_subs<local_count)
	      {
	          max_subs=local_count;
	      }
	  }
	   return max_subs;
	}
	
	
//Power of Four
/* Given an integer n, return true if it is a power of four. Otherwise, return false.
Example 1:

Input: n = 16
Output: true

Example 2:

Input: n = 5
Output: false

Example 3:

Input: n = 1
Output: true*/


class Solution {
    public boolean isPowerOfFour(int n) 
    {
        for (int i=0; i<=15;i++)
        {
            if(Math.pow(4,i)==n )
                return true;
           
        }     
              return false;
    }
}

/*Given a non-negative integer x, return the square root of
 x rounded down to the nearest integer. The returned integer should be 
 non-negative as well. 
 
Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2 */

class Solution {
    public int mySqrt(int x) {
        return (int)(Math.sqrt(x));
    }
}

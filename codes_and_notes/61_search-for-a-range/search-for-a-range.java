/*
@Copyright:LintCode
@Author:   PReddy7
@Problem:  http://www.lintcode.com/problem/search-for-a-range
@Language: Java
@Datetime: 17-01-27 03:47
*/

public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        
        int[] res = {-1,-1};
        
        if (A.length == 0){
            
            return res;
        }
        
        int i = -1;
        int j = -1;
        
        int l = 0;
        int r = A.length - 1;
        
        while(l <= r){
            int mid = (l + r)/2 ;
            
            if (A[mid] == target){
                i = mid;
                r = mid -1;
                
            } else if (A[mid] > target){
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        
          l = 0;
          r = A.length - 1;
        
        while(l <= r){
            int mid = (l + r)/2 ;
            
            if (A[mid] == target){
                j = mid;
                l = mid + 1;
                
            } else if (A[mid] > target){
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        
        res[0] = i;
        res[1] = j;
        return res;
        // write your code here
    }
}

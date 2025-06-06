//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] a) {
        int n=a.length;
        int i=0,j=n-1;

        while(i<j)
        {
            int mid=i+(j-i)/2;
            
            if(a[mid]>a[j])
            {
                i=mid+1;
            }
            else
            {
                j=mid;
            }
        }
        return a[i];
    }
}

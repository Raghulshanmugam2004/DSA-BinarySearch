//https://leetcode.com/problems/find-peak-element/submissions/1655317160/

class Solution {
    public int findPeakElement(int[] a) {
        int n=a.length;
        int i=0,j=n-1;
        while(i<j)
        {
            int mid=i+(j-i)/2;
            if(a[mid]>a[mid+1])
            {
                j=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;
    }
}

//https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
class Solution {
    int findOnce(int[] a) {
        // Complete this function
        int i=0,j=a.length-2;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(mid%2==0)
            {
                if(a[mid]==a[mid+1])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
            }
            else
            {
                if(a[mid]==a[mid-1])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
            }
        }
        return a[i];
    }
}

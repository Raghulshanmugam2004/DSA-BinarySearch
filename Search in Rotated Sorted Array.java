//https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1

// User function Template for Java

class Solution {
    int search(int[] a, int key) {
        // Complete this function
        int i=0,j=a.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==key)
            {
                return mid;
            }
            if(a[i]<=a[mid])
            {
                if(key>=a[i]&&key<a[mid])
                {
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else
            {
                if(key<=a[j] && key>a[mid])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}

//https://www.geeksforgeeks.org/problems/ceil-the-floor2802/0
class Solution {
    public int getFloor(int x,int[] a ,int n)
    {
        if(a[0]>x)
        {
            return -1;
        }
        int i = 0 ;
        int j = a.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==x)
            {
                return a[mid];
            }
            else if(a[mid]>x)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return a[j];
    }
    public int getCeil(int x,int[] a ,int n)
    {
        if(a[a.length-1]<x)
        {
            return -1;
        }
        int i = 0 ;
        int j = a.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==x)
            {
                return a[mid];
            }
            else if(a[mid]>x)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return a[i];
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int n= arr.length;
        int[] res = new int[2];
        res[0]=getFloor(x,arr,n);
        res[1]=getCeil(x,arr,n);
        return res;
        
    }
}

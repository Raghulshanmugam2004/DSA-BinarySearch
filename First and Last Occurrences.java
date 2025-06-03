//https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
class GFG {
    
    public int occurence(int a[],int x,boolean first)
    { 
        int i=0,j=a.length-1;
        int ans=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==x)
            {
                ans=mid;
                if(first)
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
            else if(a[mid]<x)
            {
               i=mid+1; 
            }
            else
            {
                j=mid-1;
            }
        }
        return ans;
    }
    
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>occ=new ArrayList<>();
        int occ1=occurence(arr,x,true);
        int occ2=occurence(arr,x,false);
        occ.add(occ1);
        occ.add(occ2);
        return occ;
    }
}

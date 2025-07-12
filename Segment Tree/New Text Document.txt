/* The functions which
builds the segment tree */
class GfG {
    static int st[];
    static int Query(int start,int end,int l,int r,int i)
    {
        if(r<start || l>end) return Integer.MAX_VALUE;
        if(l>=start && r<=end)
        {
            return st[i];
        }
        int m=l+(r-l)/2;
        return Math.min(Query(start,end,l,m,2*i+1),Query(start,end,m+1,r,2*i+2));
    }
 static void  buildSegmentTree(int st[],int arr[],int i,int l,int r)
 {
     if(l==r)
     {
         st[i]=arr[l];
         return;
     }
     int mid=l+(r-l)/2;
     buildSegmentTree(st,arr,2*i+1,l,mid);
     buildSegmentTree(st,arr,2*i+2,mid+1,r);
    st[i]=Math.min(st[2*i+1],st[2*i+2]);
 }
    public static int[] constructST(int arr[], int n) {
        // Add your code here
        st=new int[4*n];
         buildSegmentTree(st,arr,0,0,n-1);
         return st;
    }

    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r) {
      return Query(l,r,0,n-1,0);
    }
}
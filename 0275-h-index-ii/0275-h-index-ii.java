class Solution {
    public int hIndex(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int n=arr.length;
        //if(arr.length==1 && arr[0]==0)return 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=n-mid)end = mid-1;
            else start=mid+1;
        }
        return n-start;
    }
}
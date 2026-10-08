class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start =1;
        int end =0;
        for(int i=0;i<weights.length;i++){
            end+=weights[i];
        }
        while(start<=end){
            int mid = start +(end-start)/2;
            if(checker(mid,weights,days)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static boolean checker(int mid,int[] arr,int days){
        //int si=0;
        int ei=0;
        int sum =0;
        int d=0;
        while(ei<arr.length){
            sum += arr[ei];
            if(arr[ei]>mid){
                d=-1;
                break;
            }
            if(sum>mid){
                sum=0;
                d++;
            }
            else{
                ei++;
            }
        }
        d=d+1;
        if(d<=days&&d!=0){
            return true;
        }
        else{
            return false;
        }
    }
}
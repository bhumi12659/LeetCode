class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length ==1){
            if(piles[0]<=h)return 1;
            else{
                if(piles[0]%h==0){
                    return piles[0]/h;
                }
                else{
                    return piles[0]/h+1;
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for(int i:piles){
            max = Math.max(i,max);
        }
        int start = 1;
        int end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            long hrs = checker(piles,mid);
            if(hrs<=h){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
       }
       return end+1;
    }
    public long checker(int[] arr,int mid){
        long count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count ++;
            }
            else{
                if(arr[i]%mid!=0){
                    count += arr[i]/mid +1;
                }
                else{
                    count+=arr[i]/mid;
                }
            }
        }
        return count ; 
    }
}
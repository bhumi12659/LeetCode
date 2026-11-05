class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end && !isPrime(nums[start])){
            start++;
        }
        while(end>=start && !isPrime(nums[end])){
            end--;
        }
        return end-start;
    }
    public static boolean isPrime(int num){
        int flag=0;
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return false;
        }
        else{
            return true;
        }
    }
}
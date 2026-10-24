class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int indexpos=0;
        int indexneg=nums.length-1;
        int pos =0;
        int neg =nums.length-1;
        while(pos<nums.length && neg>=0){
            if(nums[pos]>=0){
                arr[indexpos]=nums[pos];
                indexpos+=2;
            }
            if(nums[neg]<0){
                arr[indexneg]=nums[neg];
                indexneg-=2;
            }
            pos++;
            neg--;
        }
        return arr;
    }
}
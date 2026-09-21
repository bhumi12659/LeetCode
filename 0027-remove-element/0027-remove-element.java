class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return index;
    }
}
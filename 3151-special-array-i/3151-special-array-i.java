class Solution {
    public boolean isArraySpecial(int[] nums) {
        //even index wale even
        if(nums[0]%2==0){
            for(int i=1;i<nums.length;i++){
                if(i%2!=0&&nums[i]%2==0){
                    return false;
                }
                else if(i%2==0 && nums[i]%2!=0){
                    return false;
                }
            }
        }
        //even index wale odd
        else{
            for(int i=1;i<nums.length;i++){
                if(i%2!=0 && nums[i]%2!=0){
                    return false;
                }
                else if(i%2==0 && nums[i]%2==0){
                    return false;
                }
            }
        }
        return true;
    }
}
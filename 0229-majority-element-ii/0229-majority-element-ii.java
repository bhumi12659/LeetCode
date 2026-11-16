class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ll = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                ll.add(key);
            }
        }
        return ll;
    }
}
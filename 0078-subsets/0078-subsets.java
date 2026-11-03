class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll= new ArrayList<>();
        List<Integer> l =new ArrayList<>();
        ll.add(l);
        Subset(nums,0,ll,l);
        return ll;
    }
    public static void Subset(int[] nums,int idx,List<List<Integer>> ll,List<Integer> l){
        if(idx==nums.length){
            return;
        }
        for(int i=idx;i<nums.length;i++){
            l.add(nums[i]);
            ll.add(new ArrayList<>(l));
            Subset(nums,i+1,ll,l);
            l.remove(l.size()-1);
        }
    }
}
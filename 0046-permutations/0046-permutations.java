class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<Integer> l =new ArrayList<>();
         List<List<Integer>> ll = new ArrayList<>();
         int index=0;
        Permutation(nums,l,ll);
        return ll;
    }
    public static void Permutation(int[] nums,List<Integer> l,List<List<Integer>> ll){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])){
                l.add(nums[i]);
                Permutation(nums,l,ll);
                l.remove(l.size()-1);
            }
        }
    }
}
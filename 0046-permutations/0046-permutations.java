class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<Integer> l =new ArrayList<>();
         List<List<Integer>> ll = new ArrayList<>();
         boolean[] arr = new boolean[nums.length];
        Permutation(nums,l,ll,arr);
        return ll;
    }
    public static void Permutation(int[] nums,List<Integer> l,List<List<Integer>> ll,boolean[] arr){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                l.add(nums[i]);
                Permutation(nums,l,ll,arr);
                l.remove(l.size()-1);
                arr[i]=false;
            }
        }
    }
}
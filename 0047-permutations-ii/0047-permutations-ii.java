class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ll=new ArrayList<>();
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
                    if(!ll.contains(l)){
                        Permutation(nums,l,ll,arr);
                    }
                    l.remove(l.size()-1);
                    arr[i]=false;
                }
        }
    }
    public static boolean isPresent(int[] nums,int index){
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]==nums[index]){
                return true;
            }
        }
        return false;
    }
}
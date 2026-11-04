class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-2;i++){
             if(i>0 && arr[i]==arr[i-1]){
                 continue;
             }
            int j=i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ll.add(arr[i]);
                    ll.add(arr[j]);
                    ll.add(arr[k]);
                    ans.add(new ArrayList<>(ll));
                    while(j<k && arr[j]==arr[j+1]) j++;
                    while(j<k && arr[k]==arr[k-1]) k--;
                    ll.clear();
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }

        }
        return ans;
    }
}
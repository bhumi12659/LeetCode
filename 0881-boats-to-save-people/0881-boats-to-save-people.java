class Solution {
    public int numRescueBoats(int[] people, int limit) {
        return maxBoat(people,limit);
    }
    public static int maxBoat(int[] arr, int limit){
        Arrays.sort(arr);
        int ans =0;
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left]+arr[right]<=limit){
                left++;
            }
            right--;
            ans++;
        }
        return ans;
    }
}
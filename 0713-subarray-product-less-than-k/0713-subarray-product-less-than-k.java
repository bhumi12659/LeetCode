class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int si =0,ei=0,prod=1,ans=0;
        while(ei<arr.length){
            //window grow

            prod = prod * arr[ei];

            //window shrink
            while(prod>=k && si<=ei){
                prod = prod/arr[si];
                si++;
                

            }

            //ans update
            ans = ans + ei-si+1;
            ei++;
        }
        return ans;
    }
}
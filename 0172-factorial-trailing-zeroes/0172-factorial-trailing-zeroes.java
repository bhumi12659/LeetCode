class Solution {
    public int trailingZeroes(int n) {
        int i=5;
        int ii=5;
        int count=0;
        while(i<=n){
            count+=n/i;
            i=i*ii;
        }
        return count;
    }
}
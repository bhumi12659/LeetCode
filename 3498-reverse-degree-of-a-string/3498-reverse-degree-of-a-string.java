class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            int index = Math.abs(s.charAt(i) - 71 - 52);
            sum+=index*(i+1);
        }
        return sum;
    }
}
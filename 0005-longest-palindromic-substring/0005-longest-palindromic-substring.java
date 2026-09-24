class Solution {
    public String longestPalindrome(String s) {
        int si=0;
        int maxlen=0;
        String ans="";
        while(si<s.length()){
            int ei=si+1;
            while(ei<=s.length()){
                String str = s.substring(si,ei);
                if(isPalindrome(str)){
                    int len = str.length();
                    if(len>maxlen){
                        maxlen=len;
                        ans = str;
                    }
                }
                ei++;
            }
            si++;
        }
        return ans;
    }
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
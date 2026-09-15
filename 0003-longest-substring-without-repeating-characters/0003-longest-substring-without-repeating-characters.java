class Solution {
    public int lengthOfLongestSubstring(String s) {
        //int[] freq = new int[256];
        int si=0;
        int ei=1;
        int ans =0;
        //while(ei<s.length()){
          //  freq[s.charAt(ei)-'a']++;
           // while(freq[s.charAt(ei)-'a']>1){
             //   si++;
              //  freq[s.charAt(ei)-'a']--;
           // }
           // ans = Math.max(ans,ei-si+1);
           // ei++;
        //}
        //return ans;





        int len =0;
        while(ei<=s.length()){
            String str = s.substring(si,ei);
            if(isUnique(str)){
                len = ei-si;
                ei++;
            }
            else{
                si++;
            }
            ans = Math.max(len,ans);
        }
        return ans;
    }
    public boolean isUnique(String str){
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]>1){
                return false;
            }
            
        }
        return true;
    }
}

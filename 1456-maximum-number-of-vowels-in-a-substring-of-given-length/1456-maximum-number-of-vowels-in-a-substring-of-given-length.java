class Solution {
    public int maxVowels(String s, int k) {
        char[] ch = s.toCharArray();
        int count =0;
        for(int i=0;i<k;i++){
            if(isVowel(ch[i])){
                count++;
            }
        }
        int si=0;
        int ei=k;
        int maxcount=count;
        while(ei<ch.length){
            if(isVowel(ch[ei])){
                count++;
            }
            if(isVowel(ch[si])){
                count--;
            }
            maxcount=Math.max(count,maxcount);
            ei++;
            si++;
        }
        return maxcount;
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
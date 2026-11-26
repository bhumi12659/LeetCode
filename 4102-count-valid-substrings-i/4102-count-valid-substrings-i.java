class Solution {
    public long countValidSubstrings(String s) {
        long count=0;
        int last=-1;//will check starting index of abc
        for(int i=0;i<s.length();i++){
            if(i>=2 && s.charAt(i-2)=='a' && s.charAt(i-1)=='b' && s.charAt(i)=='c'){
                last=i-2;
            }
            count+=i-last;
        }
        return count;
    }
}
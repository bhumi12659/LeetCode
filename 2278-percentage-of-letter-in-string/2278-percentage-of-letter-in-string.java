class Solution {
    public int percentageLetter(String s, char letter) {
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-97]++;
        }
        int req=freq[letter-97];
        int percent=(req)*100/s.length();
        return percent;
    }
}
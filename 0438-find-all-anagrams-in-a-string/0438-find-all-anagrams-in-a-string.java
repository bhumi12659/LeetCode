class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> l = new ArrayList<>();
        int si=0;
        int ei=p.length();
        while(ei<=s.length()){
            String str = s.substring(si,ei);
            if(isAnagram(str,p)){
                l.add(si);
            }
            si++;
            ei++;
        }
        return l;
    }
    public boolean isAnagram(String str,String p){
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
            freq[p.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)return false;
        }
        return true;
    }
}
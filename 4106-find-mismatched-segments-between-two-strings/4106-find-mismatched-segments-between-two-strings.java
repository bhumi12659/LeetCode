class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        List<String> l= new ArrayList<>();
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
                continue;
            }
            String str1="";
            String str2="";
            while(i<s1.length() && s1.charAt(i)!=s2.charAt(i)){
                str1+=s1.charAt(i);
                str2+=s2.charAt(i);
                i++;
            }
            l.add(str1);
            l.add(str2);
            ans.add(new ArrayList<>(l));
            l.clear();
        }
        return ans;
    }
}
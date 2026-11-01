class Solution {
    static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        Key_Pad(digits,"",ll);
        return ll;
    }

    public static void Key_Pad(String s,String ans,List<String> ll){
        if(s.length()==0){
            ll.add(ans);
            return;
        }
        char ch = s.charAt(0);
        String str = key[ch-'0'];
        for(int i=0;i<str.length();i++){
            Key_Pad(s.substring(1),ans+str.charAt(i),ll);
        }
    }
}
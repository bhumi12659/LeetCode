class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> llans = new ArrayList<>();
        Part(s,ll,llans);
        return llans;
    }
    public static void Part(String str, List<String> ll,List<List<String>> llans){
        if(str.length()==0){
            llans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=str.length();i++){
            String s = str.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                Part(str.substring(i),ll,llans);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
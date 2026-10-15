class Solution {
    public List<String> generateParenthesis(int n) {
    List <String> ll = new ArrayList<>();
    int open=0;
    int close=0;
    String ans="";
    GenParen(n,ans,0,0,ll);
    return ll;
    }
    public void GenParen(int n,String ans,int open,int close,List ll){
        if(open==n && close==n){
            ll.add(ans);
            return;
        }
        if(open>n||close>open){
            return;
        }
        GenParen(n,ans+"(",open+1,close,ll);
        GenParen(n,ans+")",open,close+1,ll);
    }
}
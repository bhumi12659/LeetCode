class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++){
            arr[i]=ConvertToLatin(arr[i],i+1);
            ans+=arr[i]+" ";
        }
        return ans.trim();
        
    }
    public String ConvertToLatin(String s,int freq){
        String ss = "";
        char ch = s.charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            ss=s+"ma";
        }
        else{
            ss=s.substring(1)+ch+"ma";
        }
        for(int i=1;i<=freq;i++){
            ss=ss+"a";
        }
        return ss;
    }
}
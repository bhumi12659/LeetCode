class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String ans =arr[0]+" ";
        int firstWordCount=CountVowel(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(CountVowel(arr[i])==firstWordCount){
                ans+=Reverse(arr[i])+" ";
            }
            else{
                ans+=arr[i]+" ";
            }
        }
        return ans.trim();
    }
    public int CountVowel(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public String Reverse(String str){
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
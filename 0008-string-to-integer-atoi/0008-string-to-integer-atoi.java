class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.equals("")){
            return 0;
        }
        long num=0;
        int sign=1;//for positive numbers
        int i=0;
        if(s.charAt(0)=='-'){
            sign=-1;//negative number
            i=1;
        }
        if(s.charAt(0)=='+'){
            i=1;
        }
        for(;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch>='0'&&ch<='9'){
                 num=num*10+(ch-'0');
            }
            else{
                break;
            }
            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            

        }
        return (int)num*sign;
    }
}
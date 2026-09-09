class Solution {
    public String reverseVowels(String s) {
       char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left<=right){
            if(Checker(ch[left])==false){
                left++;
            }
            else if(Checker(ch[right])==false){
                right--;
            }
            else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            
        }
        String str = String.valueOf(ch);
        return str;
    }
    public static boolean Checker(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }

}
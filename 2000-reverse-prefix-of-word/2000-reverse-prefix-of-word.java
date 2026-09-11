class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int index =-1;
        for(int i=0;i<c.length;i++){
            if(c[i] == ch){
                index=i;
                break;
            }
        }
        if(index ==-1 || index ==0){
            return String.valueOf(c);
        }
        else{
            for(int i=0;i<=index;){
                char temp = c[i];
                c[i] = c[index];
                c[index] = temp;
                i++;
                index--;
            }
        }
        return String.valueOf(c);
    }
}
class Solution {
   public static int compress(char[] chars) {
        StringBuilder sb= new StringBuilder();
        int si=0;
        int ei=0;
        while(ei<chars.length){
            sb.append(chars[si]);
            int count =0;
            while(chars[si]==chars[ei]){
                count++;
                if(ei==chars.length-1){
                    ei++;
                    break;
                }
                ei++;
                
            }
            if(count>1){
                sb.append(count);
            }
            
            si = ei;
            
        }
        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
}
}
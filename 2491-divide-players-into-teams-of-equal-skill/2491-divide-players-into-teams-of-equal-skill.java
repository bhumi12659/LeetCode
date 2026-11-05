class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum =skill[0]+skill[skill.length-1];
        int start=0;
        int end=skill.length-1;
        if(checker(skill,start,end,sum)){
            start=0;
            end=skill.length-1;
            long ans = 0;
            while(start<end){
                ans+=skill[start]*skill[end];
                start++;
                end--;
            }
            return ans;
        }
        else{
            return -1;
        }
        
    }
    public static boolean checker(int[] skill,int start,int end,int sum){
        while(start<end){
            if(skill[start]+skill[end]!=sum){
            return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
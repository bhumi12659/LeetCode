class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
        }
        long kk=k%sum;
        int index=-1;
        int i=0;
        for(;i<chalk.length;i++){
            kk=kk-chalk[i];
            if(kk<=0){
                index=i;
                break;
            }
        }
        if(kk==0){
            if(i<chalk.length-1){
                return i+1;
            }
            else{
                return 0;
            }
        }
        else{
            return index;
        }
    }
    
}
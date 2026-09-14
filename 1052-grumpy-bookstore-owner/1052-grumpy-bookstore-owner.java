class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int cust=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                cust+=customers[i];
            }
        }
        int index=0;
        int maxcust=0;
        while(index<=customers.length-minutes){
            int ans = cust;
            for(int i=index;i<index+minutes;i++){
                if(grumpy[i]==1){
                    ans +=customers[i];
                }
            }
            maxcust=Math.max(ans,maxcust);
            index++;

        }
        return maxcust;
    }
}
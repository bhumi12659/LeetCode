class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        while(n!=1){
            if(map.containsKey(n)){
                return false;
            }
            map.put(n,true);
            int sum=0;
            int num =n;
            while(num>0){
                int digit=num%10;
                sum+=digit*digit;
                num=num/10;
            }
            n=sum;

        }
        return true;
    }
}
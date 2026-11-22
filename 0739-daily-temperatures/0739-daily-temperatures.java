class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st= new Stack<>();
        int[] ans = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
    }
}
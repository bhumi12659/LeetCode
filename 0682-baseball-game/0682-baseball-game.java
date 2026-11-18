class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("C")){
                st.pop();
            }
            else if(op[i].equals("D")){
                st.push(st.peek() * 2);
            }
            else if(op[i].equals("+")){
                int temp = st.pop();
                int add=st.peek()+temp;
                st.push(temp);
                st.push(add);
            }
            else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        int sum=0;
        int n=st.size();
        for(int i=0;i<n;i++){
            sum+=st.pop();
        }
        return sum;
    }
}
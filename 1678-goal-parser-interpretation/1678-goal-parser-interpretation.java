class Solution {
    public String interpret(String command) {
        String str = "";
        int i=0;
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                str=str+"G";
                i++;
            }
            else if(command.substring(i,i+2).equals("()")){
                str=str+"o";
                i+=2;
            }
            else{
                str=str+"al";
                i+=4;
            }
        }
        return str;
    }
}
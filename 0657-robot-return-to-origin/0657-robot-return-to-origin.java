class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        int i=0;
        while(i<moves.length()){
            char ch = moves.charAt(i);
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='R'){
                x++;
            }
            else{
                x--;
            }
            i++;
        }
        if(x==0 && y==0){
            return true;
        }
        else{
            return false;
        }
    }
}
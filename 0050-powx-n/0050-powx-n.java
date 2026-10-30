class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            return pow(x,n);
        }
        else{
            return 1/pow(x,-n);
        }
    }
    public double pow(double x,int n){
        if(n==0){
            return 1;
        }
        double val = pow(x,n/2);
        if(n % 2 !=0){
            return x*val*val;
        }
        else{
            return val*val;
        }
        
    }
}
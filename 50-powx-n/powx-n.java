class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        double power=1;
        if(exp<0){
               x=1/x;
               exp=-exp;
        }
        
     while(exp>0){
        if((exp&1)!=0){
          power=power*x;
        }
       x=x*x;
       exp>>=1;
     }
     return power;
    }
}
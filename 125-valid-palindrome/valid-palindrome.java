class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            //convert to int to String
            char a=s.charAt(left);
            char b=s.charAt(right);
            //convert to upper to lower
            if(a>='A'&&a<='Z')a=(char)(a+32);
            if(b>='A'&&b<='Z')b=(char)(b+32);
            //remove spaces and symoble
            if(!((a>='a'&&a<='z')||(a>='0'&&a<='9'))){
                 left++;
                 continue;
            }
            if(!((b>='a'&&b<='z')||(b>='0'&&b<='9'))){
                 right--;
                 continue;
            }
            //compare
            if(a!=b)return false;
                
                left++;
                right--;
            
        }
        return true;
    }
}
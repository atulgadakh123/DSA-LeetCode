class Solution {
    public boolean isPalindrome(int x) {
        
        String ch = Integer.toString(x);
        String ans =""; 
        for(int i = ch.length()-1;i >= 0;i--){
             ans = ans+ch.charAt(i);
        }
          if (ch.equals(ans)){
            return true;
        }
        else{
            return false;
        }
    }
}
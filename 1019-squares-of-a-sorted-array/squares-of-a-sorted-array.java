class Solution {
    public int[] sortedSquares(int[] nums) {
      // first uses all number is square
      int n=nums.length;
      int[] squar=new int[n];
      for(int i=0;i<n;i++){
        squar[i]=nums[i]*nums[i];
        
      }
      //bubble sort uses
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(squar[j]>squar[j+1]){
                int temp=squar[j];  
                squar[j]=squar[j+1];
                squar[j+1]=temp;
            }
        }
       
      }
      return squar;
    }
}
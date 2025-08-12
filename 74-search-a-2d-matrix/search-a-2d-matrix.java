class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int left=0; 
       int row=matrix.length;
       int cols=matrix[0].length;
       int right=row*cols-1;
       while(left<=right){
        int mid=left+(right-left)/2;
        int midValue=matrix[mid/cols][mid%cols];
        if(midValue==target){
            return true;
        }
        else if(midValue<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
       } 
       return false;
    }
}
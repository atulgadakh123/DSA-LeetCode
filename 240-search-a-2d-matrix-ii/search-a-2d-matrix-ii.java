class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int row=0;
        int col=cols-1;
        while(row<rows &&col>=0){
           // int mid=left+(right-left)/2;
           // int midvalue=matrix[mid/cols][mid%cols];
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                //left=mid+1;
                col--;
            }
            else{
                //right=mid-1;
                row++;
            }
        }
        return false;
    }
}
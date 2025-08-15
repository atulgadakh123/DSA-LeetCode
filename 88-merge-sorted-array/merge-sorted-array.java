class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //set pointer
        int left=m-1;    //nums1
        int right=n-1;  //nums2
          int k=m+n-1;  //compare value store
          //zerro are ingnored
          while(left>=0&&right>=0){
            
            //comapre the num1 and num2
            if(nums1[left]>nums2[right]){
                nums1[k--]=nums1[left--];
            }
            else{
                nums1[k--]=nums2[right--];
            }
          }
          //pending of elemet of sorted in use for loop
          while(right>=0){
            nums1[k--]=nums2[right--];
          }
          //merge sort not uses return type because uses of void 
    }
}
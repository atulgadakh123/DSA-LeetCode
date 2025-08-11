class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int first=-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                 first=mid;
                 last=mid   ;
                int i=mid-1;
                while(i>=0&&nums[i]==target){
                i--;
                first=i;
                }
                first=i+1;
            
            int j=mid+1;
                while(j<nums.length&&nums[j]==target){
                j++;
                last=j;
                
            }
            last=j-1;
             break;
    } 
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                 right=mid-1;;
            }
        }
        return new int[]{first,last};
    }
}
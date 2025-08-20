class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(nums,0,ans); 
        return ans;
    }
        public void backtrack(int[] nums,int start,List<List<Integer>>ans){
            if(start==nums.length){
                List<Integer>path=new ArrayList<>();
                for(int n:nums) path.add(n);
                ans.add(path);
                 return;
             }
               for(int i=start;i<nums.length;i++){
                       swap(nums,start,i);
                         backtrack(nums,start+1,ans);
                         //orignal from
                         
                         swap(nums,start,i);
               }
        }
            public void swap(int[]nums,int i,int j){
                int temp=nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
            }       
    }

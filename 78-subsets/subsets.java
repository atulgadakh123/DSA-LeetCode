class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>subset=new ArrayList<>();
    backtrack(nums,0,ans,subset);
     return ans;

    }
    public void backtrack(int[]nums,int start,List<List<Integer>>ans,List<Integer>subset){
        if(start==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
         subset.add(nums[start]);
         backtrack(nums,start+1,ans,subset);

         subset.remove(subset.size()-1);
         backtrack(nums,start+1,ans,subset);
    }
}
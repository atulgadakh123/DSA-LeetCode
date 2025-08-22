    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
             Arrays.sort(nums);
            backtrack(ans,nums,0,new ArrayList<>());
            return ans;
        }
            public void backtrack(List<List<Integer>>ans, int[] nums,int start, List<Integer>path){

                  ans.add(new ArrayList<>(path));
                    for(int i=start;i<=nums.length-1;i++){
                        if(i>start &&nums[i]==nums[i-1]){
                        continue;
                               }
                         path.add(nums[i]);
                         backtrack(ans,nums,i+1,path);
                         path.remove(path.size()-1);
                    }
                   
            }
        }
    
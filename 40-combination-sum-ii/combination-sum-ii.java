class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
       List<List<Integer>>ans=new ArrayList<>();
       backtrack(candidates,0,target,new ArrayList<>(),ans);
       return ans;
  }
       public void backtrack(int[] arr, int start,int target,List<Integer>path,List<List<Integer>>ans){
         if(target==0){
            ans.add(new ArrayList<>(path));
            return;
         }
         if(target<=0 || start==arr.length)
         return ;

         path.add(arr[start]);
         backtrack(arr,start+1, target-arr[start],path,ans);
         path.remove(path.size()-1);
       //  backtrack(arr,start-path,ans);
       //skip arr[start] and skip all duplicate
       int next=start+1;
       while(next<arr.length && arr[next]==arr[start]){
        next++;
        }
        backtrack(arr,next,target,path,ans);
       }
       }
  

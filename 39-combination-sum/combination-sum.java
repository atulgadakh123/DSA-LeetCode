class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        backtracking(candidates,target,0,new ArrayList<>(),ans);
            return ans;
        
    }

    // new 
    public  void backtracking(int[] arr,int target,int index,List<Integer>path, List<List<Integer>>ans){
        //target==remain
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;

        }
        //negetive stop;
        if(index==arr.length|| target<0) return;
    
    //option start;

    path.add(arr[index]);
    
    backtracking(arr,target-arr[index],index,path,ans);

    //remove

    path.remove(path.size()-1);

    backtracking(arr, target,index+1,path,ans);

            
        

     }
}
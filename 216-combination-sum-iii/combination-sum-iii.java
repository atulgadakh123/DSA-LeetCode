class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        int[] arr={1,2,3,4,5,6,7,8,9};
        backtrack(arr,0,n,k,new ArrayList<>(),ans);
        return ans;
        
    }
    public void backtrack(int[] arr,int start,int target ,int k,List<Integer>path,List<List<Integer>>ans){
        if(target==0&& path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(start==arr.length||target<0){
            return;
        }
        for(int i=start;i<arr.length;i++){
              path.add(arr[i]);
              backtrack(arr,i+1,target-arr[i],k,path,ans);
              path.remove(path.size()-1);
        }
    }
}
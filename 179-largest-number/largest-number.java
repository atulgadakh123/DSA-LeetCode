class Solution {
    public String largestNumber(int[] nums) {
         //convert  int to string   
         String[]arr=new String[nums.length];
         for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
         }
         //compare
         Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
         //ignore 0
         if(arr[0].equals("0")) {
            return "0";
         };
         
         //add this number string
         //create  new string
         StringBuilder sb=new StringBuilder();
         for(String s:arr){
            sb.append(s);
         }
         return sb.toString();
    }
}
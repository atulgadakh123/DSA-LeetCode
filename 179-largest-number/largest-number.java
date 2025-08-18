class Solution {
    public String largestNumber(int[] nums) {
            
            //convert to int to string
            String[] arr=new String[nums.length];
            for(int i=0;i<nums.length;i++){
                arr[i]=String.valueOf(nums[i]);
            }
            //compare  string
            Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
            
            //higest number
            if(arr[0].equals("0")){
               return "0";
            }
            StringBuilder sb=new StringBuilder();
            for(String s:arr){
                sb.append(s);
            }
            return sb.toString();
    }
}
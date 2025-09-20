class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n  = temperatures.length;
        Stack<Integer>stack = new Stack<>();
        int[] anser  = new int[n];

        for(int i = 0;i<n;i++){
            while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]){
               int ind = stack.pop();
               anser[ind] = i-ind;
            }
            stack.push(i);
        }
        return anser;
    }
}
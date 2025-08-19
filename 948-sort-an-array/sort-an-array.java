class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergesort(int[]arr,int left,int right){
        if(left<right){
        int mid=left+(right-left)/2;
        mergesort(arr,left,mid);
        //right
        mergesort(arr,mid+1,right);
        //merge
        merge(arr,left,mid,right);
    }
    }
 public static void merge(int[] arr,int left,int mid,int right){
    //divided two part
     int n1=mid-left+1;
     int n2=right-mid;

     //create two array
     int[]l1=new int[n1];
     int[]l2=new int[n2];

        //temp madhe array copy

        for(int i=0;i<n1;i++){
            l1[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            l2[j]=arr[mid+1+j];
        }
        int i=0, j=0,k=left;
        while(i<n1 && j<n2){
            if(l1[i]<l2[j]){
                arr[k]=l1[i];
                i++;
            }
            else{
                arr[k]=l2[j];
                    j++;
                }
                k++;
            }   
            while(i<n1){
                arr[k]=l1[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=l2[j];
                j++;
                k++;
            }
        }
 }   


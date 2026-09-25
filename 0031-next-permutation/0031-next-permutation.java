class Solution {
    public int[] nextPermutation(int[] arr) {
        int index=-1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int start=0;
            int end = n-1;

            while(start<=end){
                int tep=arr[start];
                arr[start]=arr[end];
                arr[end]=tep;
                start++;
                end--;
            }
            return arr;
        }
        int pos=0;
        for(int i=n-1;i>=index;i--){
            if(arr[i]>arr[index]){
                pos=i;
                break;
            }
        }
        
        //swapping
        int temp = arr[index];
        arr[index]=arr[pos];
        arr[pos]=temp;

        //reversing array after index
        int left=index+1;
        int right = arr.length-1;
        while(left<=right){
            int tem = arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
            left++;
            right--;
        }
        return arr;
    }
}
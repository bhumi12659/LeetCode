class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] arr = str.split(" +");
        int left =0;
        int right =arr.length-1;
        while(left<=right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        str = String.join(" ",arr);
        return str;

    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            max= Math.max(max,countWords(sentences[i]));
        }
        return max;
    }
    public static int countWords(String str){
        String[] arr = str.split(" ");
        return arr.length;
    }
}
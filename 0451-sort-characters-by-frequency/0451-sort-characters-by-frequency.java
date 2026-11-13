class Solution {
    public String frequencySort(String s) {
        //frequency count kari
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<256;i++){
            int max=0;
            int index=-1;
            //max freq wala character find kia
            for(int j=0;j<256;j++){
                if(freq[j]>max){
                    max=freq[j];
                    index=j;
                }
            }
            //agr koi maximum nhi baccha ho to
            if(index==-1){
                break;
            }
            //freq ki count ke according char appnend karenge
            for(int j=0;j<max;j++){
                sb.append((char)index);
            }
            //wapis se max freq wale char ko 0 kr denge
            freq[index]=0;
        }
    return sb.toString();
    }
}
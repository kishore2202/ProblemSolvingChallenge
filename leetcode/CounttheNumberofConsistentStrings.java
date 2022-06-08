class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         int c=0;     
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(allowed.indexOf(words[i].charAt(j))==-1){
                    c++;
                    break;
                }
            }
        }
        return words.length-c;
    }
}

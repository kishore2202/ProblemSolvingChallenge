class Solution {
    public int singleNumber(int[] in) {
        int b=0;
		boolean visited[] = new boolean[in.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < in.length; i++) {

           if(visited[i] == true)
            continue;
           int count = 1;
           for (int j = i + 1; j < in.length; j++) {
               if (in[i] == in[j]) {
                  visited[j] = true;
                  count++;
               }
           }
           if(count==1)   
             b=in[i];
        }
        return b;
    }
}

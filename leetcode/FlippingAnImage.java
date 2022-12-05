class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int M=image.length;
        int N=image[0].length;
        int[][] mat=new int[image.length][image[0].length];
        for (int i = 0; i < M; i++) 
        {
            int start = 0;
            int end = N - 1;
            while (start < end) 
            {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else
                {
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}

class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" "); 
        ArrayList<String> res=new ArrayList<String>();
        for (String a : arr) 
        {
        	res.add(a+" ");
            
        }
        StringBuilder sb=new StringBuilder();
        int i = 0;
        while (i < k)
        {
            sb.append(res.get(i));
            i++;
            
        }
 
        String res1 = sb.toString();
        return res1.trim();
    }
     
}

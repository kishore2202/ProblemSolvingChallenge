class Solution {
    public String addBinary(String a, String b) {
        int aPointer=a.length()-1;
        int bPointer=b.length()-1;
        int carry=0;
        StringBuffer sb=new StringBuffer();
        while(aPointer>=0 || bPointer>=0)
        {
            int aValue=0;
            int bValue=0;
            if(aPointer>=0)
                aValue=a.charAt(aPointer)-'0';
            if(bPointer>=0)
                bValue=b.charAt(bPointer)-'0';
            int ans=0;
            int val=aValue+bValue+carry;
            if(val==3)
            {
                carry=1;
                ans=1;
            }
            else if(val==2)
            {
                carry=1;
            }
            else if(val==1)
            {
                ans=1;
                carry=0;
            }
            sb.append(ans+"");
            aPointer--;
            bPointer--;
        }
        if(carry==1)
        {
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}

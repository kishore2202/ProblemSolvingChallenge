class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
         if(c=='(' || c=='{'||c=='['){
             stack.push(c);
             continue;
         }
         if(stack.isEmpty())
             return false;
        char p=stack.pop();
            
         if(p=='('  && c==')') {
             continue;
         }
         else if(p=='{'  && c=='}') {
             continue;
         }
        else if(p=='['  && c==']') {
             continue;
         }
        else 
            return false;
            
        }
        return stack.isEmpty();
    }
}

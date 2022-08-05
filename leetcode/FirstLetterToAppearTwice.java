class Solution {
    public char repeatedCharacter(String s) {
    char ch = 0;
    int h=s.length();
    for(int i = 0; i < s.length(); i++)
      {
          for(int j = i+1; j < s.length(); j++)
        {
            if(s.charAt(i) == s.charAt(j) && j < h)
              {
                ch = s.charAt(j);
                  h=j;
            }
        }
    }
    return ch;
  }
}

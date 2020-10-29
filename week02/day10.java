class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for(char c:S.toCharArray()){
            if(c == ')')
                left--;
            if(left >0)
                sb.append(c);
            if(c == '(')
                left++;
        }
        return sb.toString();
    }
}
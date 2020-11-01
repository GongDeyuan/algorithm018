class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        String s = String.valueOf(num);
        while(s.length()>1){
            int a = 0;
            for(char c:s.toCharArray()){
                a += c-'0';
            }
            s = String.valueOf(a);
        }
        return Integer.parseInt(s);
    }
}
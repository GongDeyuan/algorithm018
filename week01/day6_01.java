class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int x=0,y=0;
        int[] size = new int[10];
        for(int i = 0; i<len;i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s==g){
                x++;
            }else {
                if (size[s - '0']++ < 0) y++;
                if (size[g - '0']-- > 0) y++;
            }
        }
        return x+"A"+y+"B";
    }
}
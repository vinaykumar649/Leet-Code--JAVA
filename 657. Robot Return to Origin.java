class Solution {
    public boolean judgeCircle(String moves) {
        int[] chars = new int[128];
        for(char c : moves.toCharArray()) {
            chars[c]++;
        }
        return chars['R'] == chars['L'] && chars['D'] == chars['U'];
    }
}

//unoptimised code 
class Solution2 {
    public boolean judgeCircle(String moves) {
        int ud = 0;
        int lr = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                lr+=1;
            }
            else if(moves.charAt(i)=='L'){
                lr-=1;
            }
            else if(moves.charAt(i)=='U'){
                ud +=1;
            }
            else if(moves.charAt(i)=='D'){
                ud-=1;
            }
        }
        if(ud==0 && lr==0){
            return true;
        }
        else{
            return false;
        }
    }
}
class Solution {
   boolean[] arr = new boolean[128];
    public int lengthOfLongestSubstring(String s) {
        char c;
        int len = s.length(), curr = 0, max = 0, from = 0;
        for( int x = 0; x < len; x++ ){
            c = s.charAt(x);
            if( arr[ c ] ){
                max = Math.max( max, curr);
                char c2 = s.charAt( from ++ );
                while( c2 != c ){
                    arr[ c2 ] = false;
                    curr --;
                    c2 = s.charAt( from ++ );
                }
            } else {
                arr[ c ] = true;
                curr ++;
            }
        }
        return Math.max( max, curr);
    }
}
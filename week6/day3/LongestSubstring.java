

public class LongestSubstring{
    public static String findLongest(String s){
    int[] freq = new int[128];
    int l = 0, maxLen = 0;
    int start = 0, end =0;
    for(int r=0;r<s.length();r++){
        freq[s.charAt(r)]++;
        
        while(freq[s.charAt(r)]>1){
            freq[s.charAt(l)]--;
            l++;
        }
        if(r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                start = l;
                end = r;
            }
    }
    return s.substring(start, end+1);
}

    public static void main(String[] args) {
       String s = "abcabcbb";
       String n = findLongest(s);
       System.out.println(n);
    }
}
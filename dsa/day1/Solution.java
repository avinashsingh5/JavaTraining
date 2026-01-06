import java.util.*;
class Solution {

    public static int helper(int remaining,ArrayList<Integer> list){
        if(remaining ==0) return 0;
        if(remaining < 0 ) return Integer.MAX_VALUE;

        int min  = Integer.MAX_VALUE;
        for(int sq: list){
            int result = helper(remaining-sq,list);

            if(result != Integer.MAX_VALUE){
                min = Math.min(min,result+1);
            }
        }
        return min;
    }
    public static void buildList(ArrayList<Integer> list,int n){
        for(int i=1;i<=n;i++){
            if((i*i)<=n) list.add(i*i);
        }
    }
    public static int numSquares(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        buildList(list,n);
        int count = 0;
        return helper(n,list);
        
        
    }
    public static void main(String[] args){
        int ans = numSquares(602);
        System.out.println(ans);
    }
}
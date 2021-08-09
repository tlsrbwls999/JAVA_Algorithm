class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String a=Integer.toString(x);
        String[]strArray=a.split("");
        int result=0;
        for(String s:strArray){
            result+=Integer.parseInt(s);
        }
        
        if (x%result==0){
            return true;
        }else{
            return false;
        }
    }
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1;i<count+1;i++){
            answer+=price*i;
        }
        if (answer>money){
            return answer-money;
        }else{
            return 0;
        }
    }
}

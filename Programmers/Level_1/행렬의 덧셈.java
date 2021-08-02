class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int result=0;
        int[][] answer =new int[arr1.length][arr2[0].length];
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2[0].length;j++){
                result=arr1[i][j]+arr2[i][j];
                answer[i][j]=result;
            }
        }
        return answer;
    }
}

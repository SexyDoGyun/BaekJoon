class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2 == 0){
            for(int i = 2; i<n+1; i+=2){
                answer += i*i;
            }
        } else{
            for(int j = 1; j<n+1; j+=2){
                answer += j;
            }
        }
        return answer;
    }
}
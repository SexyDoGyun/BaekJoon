class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = String.valueOf(x);
        char[] ch = num.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length; i ++){
            sum += ch[i] -'0';
        }
        if (x % sum == 0){
            answer = true;
        } else{
            answer = false;
        }
        return answer;
    }
}
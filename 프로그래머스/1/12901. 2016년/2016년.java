class Solution {
    public String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumDays = 0;
        for(int i = 0; i < a - 1; i++){
            sumDays += month[i];
        }
        
        sumDays += b - 1;

        return week[sumDays % 7];
    }
}
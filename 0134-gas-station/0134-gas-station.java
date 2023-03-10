class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(arraySum(gas) < arraySum(cost)) return -1;
        int n = gas.length;
        int answer = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += (gas[i] - cost[i]);
            if(sum < 0){
                sum = 0;
                answer = i+1;
            }
        }
        return answer;
    }
    private int arraySum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
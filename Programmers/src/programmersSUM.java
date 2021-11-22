import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sum = new ArrayList<>();
        int result;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                    result = numbers[i] + numbers[j];
                    if(!sum.contains(result)){
                        sum.add(result);
                    }
                }
            }
        }
        int[] answer = new int[sum.size()];
        for(int k=0;k<sum.size();k++){
            answer[k] = sum.get(k);
        }
        Arrays.sort(answer);
        return answer;
    }
}
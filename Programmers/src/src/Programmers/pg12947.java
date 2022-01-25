package Programmers;
public class pg12947 {
	public boolean solution(int x) {
        int a=x;
        boolean answer = true;
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;
        }
        if(x%sum==0){
            return answer;
        }
        else{
            return false;
        }
    }
}

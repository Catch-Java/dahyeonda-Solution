package Programmers;
class pg67256 {    //키패드 누르기
	public String solution(int[] numbers, String hand) {
		StringBuilder string = new StringBuilder();
		int left=10, right=12;
		int disL, disR, minusL, minusR;
		for(int n : numbers) {
			disL = 0; disR = 0;
			if(n == 1 || n == 4 || n == 7) {
				string.append("L");
				left = n;
			}
            else if(n == 3 || n == 6 || n == 9) {
				string.append("R");
				right = n;
			}
            else {
                if(n==0) n=11;
				minusL = (n > left) ? n-left : left-n;
                minusR = (n > right) ? n-right : right-n;
                disL = (minusL % 3) + (minusL / 3);
                disR = (minusR %3) + (minusR / 3);
                if(disL == disR){
                    if(hand.equals("right")){
                        string.append("R");
                        right = n;
                    }
                    else{
                        string.append("L");
                        left = n;
                    }
                }
                else if(disL > disR){
                    string.append("R");
                    right = n;
                }
                else{
                    string.append("L");
                    left = n;
                }
			}
		}	
		return string.toString();
    }
}

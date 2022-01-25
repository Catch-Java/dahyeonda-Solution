package Programmers;
public class pg12930 {
	public String solution(String s) {
        String answer = "";
        String [] array=s.split("");
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(" ")){
                array[i]=" ";
                index=0;
            }
            else if(index%2==0){
                array[i]=array[i].toUpperCase();
                index++;
            }
            else if(index%2==1){
                array[i]=array[i].toLowerCase();
                index++;
            }
            answer+=array[i];
        }
        return answer;
    }
}

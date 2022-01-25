import java.util.Arrays;
import java.util.Comparator;
public class pg12915 {
	public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String str1, String str2){
                if(str1.charAt(n)==str2.charAt(n)){
                    return str1.compareTo(str2);
                }
                else if(str1.charAt(n)>str2.charAt(n)){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        return strings;
    }
}

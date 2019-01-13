import java.util.HashMap;
import java.util.Map;

public class NumOfJewels {
	
	public static int numJewelsInStones(String J, String S) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char key : J.toCharArray()) {
			map.put(key, 0);
		}
		
		for(char key : S.toCharArray()) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
		}
		
		int count = 0;
		
		System.out.println(map);
		
		for (char key : map.keySet()) {
			if(map.get(key)>0) {
				count=count+map.get(key);
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numJewelsInStones( "aA", "aAAbbbb"));
	}
	
}

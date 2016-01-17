import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(hashmap1.keySet());
		
		int counter = 0;
		
		for(int i = 0; i < list.size(); i++){
			if(hashmap1.get(list.get(i)) == (hashmap2.get(list.get(i)))){
				counter++;
			}
		}
		return counter;
		
	}
}

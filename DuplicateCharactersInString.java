import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
	
	static void FindDuplicateString(String inputstring) {
		HashMap <Character, Integer>charcountmap = new HashMap<Character,Integer>();
		
		char [] strarray = inputstring.toCharArray();
		
		for(char c : strarray) {
			if (charcountmap.containsKey(c)) {
				charcountmap.put(c,  charcountmap.get(c)+1);
				}else{
					charcountmap.put(c,1);
					
				}
			
		}
		Set<Character> charsInString = charcountmap.keySet();
		System.out.println("Duplicate values in " + inputstring);
		
		for(Character ch : charsInString) {
			System.out.println(ch +" : "+ charcountmap.get(ch));
		}
		}
		
	public static void main(String[] args){
		
		FindDuplicateString("JavaJ2EE");
		 
		FindDuplicateString("Fresh Fish");
	 
		FindDuplicateString("Better Butter");	
	}

}

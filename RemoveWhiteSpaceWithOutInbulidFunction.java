
public class RemoveWhiteSpaceWithOutInbulidFunction {
	public static void main(String[] args) {
	
	String str = "Raj is Very Good Boy and Good Programmer ";
	
	char[] strchar = str.toCharArray();
	for(int i =0; i < strchar.length;i++) {
		
		if ( (strchar[i] != ' ') && (strchar[i] != '\t') )
        {
		
		System.out.print(strchar[i]);
	}
		
	}
	


}
}

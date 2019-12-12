import java.util.HashMap;

public class removewhitespace2 {

	public static void main(String[] args) {
		String occ = “Java J2E Java JSP J2EE Java”;
		HashMap hm = new HashMap();
		String rspace=””;
		String [] ss =occ.split(” “);
		for( String s: ss){
		rspace=rspace.concat(s);
		}
		System.out.println(rspace);


}
	
}

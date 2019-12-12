
public class RemoveWhiteSpace {
	public static void main(String []args) {
		String str = "Raj is Very Good Boy and Good Programmer ";
		String WithOutWhiteSpace = str.replaceAll("\\s+", "");
		System.out.println(WithOutWhiteSpace);
	}

}

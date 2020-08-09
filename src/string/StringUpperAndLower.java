package string;

public class StringUpperAndLower {

	public static void main(String[] args) {
		String name = "karthiKEYAN";
		String str = "";
		int len = name.length();
		for (int i = 0; i < len; i++) {
			if(Character.isLowerCase(name.charAt(i))) {
				str = str + Character.toUpperCase(name.charAt(i));
			} else {
				str = str + Character.toLowerCase(name.charAt(i));
			}
		}
		System.out.println(str);
	}

}
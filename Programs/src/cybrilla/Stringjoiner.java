package cybrilla;

//import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {

//		String bank_ifsc_code="ICIC0000001";
//		int bank_account_number= 123456789;

//		StringJoiner joiner = new StringJoiner("|");
//		joiner.add("bank_ifsc_code"+bank_ifsc_code).add("bank_account_number"+bank_account_number);
//		String joinedString = joiner.toString();
//		System.out.println(joinedString);
		
		String joinedString = String.join(" - ", "04", "05", "06");
		System.out.println(joinedString);
	}

}
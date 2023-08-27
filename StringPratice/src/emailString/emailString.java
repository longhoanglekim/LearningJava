package emailString;

import java.util.Scanner;

public class emailString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String userName = str.substring(0,str.indexOf("@"));
		String domainName = str.substring(str.indexOf("@"));
		System.out.println(userName);
		System.out.println(domainName);
		
	}

}

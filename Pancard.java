package my_pack;
import java.util.*;
public class Pancard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = sc.next();
		String c = String.valueOf(name.charAt(0)).toUpperCase();
		Random rand1 = new Random();
		int res = rand1.nextInt(10000);
		String alpha = randomString(4);
		String last = randomString(1);
		StringBuilder sb1 = new StringBuilder();
		sb1.append(alpha);
		sb1.append(c);
		sb1.append(res);
		sb1.append(last);
		String pan = sb1.toString();
		Set<String> st = new HashSet<>();
		st.add(pan);
		System.out.println("Generated Pan Card Number :"+st);
	}
	static String randomString(int len) {
		int TOT = 26;
		char [] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z' };
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<len;i++) {
			sb.append(alpha[rand.nextInt(TOT)]);
		}
		return sb.toString().toUpperCase();
	}

}

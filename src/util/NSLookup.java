package util;

import java.net.InetAddress;
import java.util.Scanner;

public class NSLookup {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input;
		InetAddress[] hosts;
		
		
		try {
			while(true){
				System.out.print(">");
				input=s.nextLine();
				if("exit".equals(input)){
					break;
				}else if(countDot(input)!=2){
					System.out.println("잘못된 URL 다시 입력");
					continue;
				}
				else{
					hosts = InetAddress.getAllByName(input);
				}
				for (int i = 0; i < hosts.length; i++) {
					System.out.println(hosts[i].getHostAddress());
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	public static int countDot(String s){
		int cnt=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='.'){
				cnt++;
			}
		}
		
		return cnt;
		
	}
}

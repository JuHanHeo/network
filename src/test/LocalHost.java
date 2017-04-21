package test;

import java.net.InetAddress;

public class LocalHost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			String hostAddress = inetAddress.getHostAddress();
			System.out.println(hostAddress);
			
			String hostName = inetAddress.getHostName();
			System.out.println(hostName);
			
			byte[] addresses = inetAddress.getAddress();
			for (int i = 0; i < addresses.length; i++) {
				int b = addresses[i] & 0x000000ff;  //마스킹
				System.out.print(b +".");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

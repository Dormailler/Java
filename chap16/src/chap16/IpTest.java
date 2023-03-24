package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) {
		try {
			InetAddress[] ip = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : ip) System.out.println(i.getHostAddress());
			InetAddress me = InetAddress.getLocalHost();
			System.out.println(me.getHostAddress());
			System.out.println(me.getHostName());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}

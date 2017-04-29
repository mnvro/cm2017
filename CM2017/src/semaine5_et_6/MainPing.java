package semaine5_et_6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainPing {
	public static void main(String[] args)  {
		InetAddress ia;
		try {
			ia = InetAddress.getByName("192.168.1.26");
			System.out.println(ia.isReachable(10000));
			ia = InetAddress.getByName("192.168.1.43");
			System.out.println(ia.isReachable(10000));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

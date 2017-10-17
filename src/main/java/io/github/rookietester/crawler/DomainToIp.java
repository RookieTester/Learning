package io.github.rookietester.crawler;

import java.net.InetAddress;

public class DomainToIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (args.length == 0) {
				System.out.println("请输入域名");
			} else {
				InetAddress inetAddress = InetAddress.getByName(args[0]);
				System.out.println(args[0] + "对应IP是：" + inetAddress);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("解析失败！");
		}
	}

}

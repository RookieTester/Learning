package crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {

	protected void start() {
		ServerSocket s;
		System.out.println("web服务启动于80端口");
		try {
			s = new ServerSocket(80);
		} catch (Exception e) {
			System.out.println("错误：" + e);
			return;
		}
		System.out.println("等待连接中......");
		for (;;) {
			try {
				Socket remote = s.accept();
				System.out.println("连接成功，正在传送数据...");
				BufferedReader in = new BufferedReader(new InputStreamReader(remote.getInputStream()));
				PrintWriter out = new PrintWriter(remote.getOutputStream());

				String string = ".";
				while (!string.equals("")) {
					string = in.readLine();
					out.println("HTTP/1.0 200 OK");
					out.println("Content-Type: text/html");
					out.println("Server: Bot");
					out.println("");

					out.println("<h1>welcome to the simple web server demo!</h1>");
					out.flush();
					remote.close();
				}
			} catch (IOException e) {
				System.out.println("错误：" + e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleWebServer server = new SimpleWebServer();
		server.start();
	}

}

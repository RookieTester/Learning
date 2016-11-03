package crawler;

public class UseProxy {

	public UseProxy(){
		System.setProperty("http.proxySet", "true");
		System.setProperty("http.proxyHost", "www.rookietester.cn");
		System.setProperty("http.proxyPort", "1080");
	}
}

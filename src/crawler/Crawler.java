package crawler;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

public class Crawler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "http://www.baidu.com";
		Crawler crawler = new Crawler();
		crawler.get(url);
		crawler.post(url);
	}

	public void get(String url) throws HttpException, IOException {
		HttpClient client = new HttpClient();
		GetMethod getMethod = new GetMethod(url);
		if (client.executeMethod(getMethod) == 200) {
			System.out.println(getMethod.getResponseBodyAsString());
		}
		getMethod.releaseConnection();
	}

	public void post(String url) throws HttpException, IOException {
		HttpClient client = new HttpClient();
		PostMethod postMethod = new PostMethod(url);
		NameValuePair[] postData = new NameValuePair[3];
		postData[0] = new NameValuePair("a", "2");
		postData[1] = new NameValuePair("pm", "1");
		postData[2] = new NameValuePair("v", "1");
		postMethod.addParameters(postData);
		if (client.executeMethod(postMethod) == 200) {
			System.out.println(postMethod.getResponseBodyAsString());
		}
		postMethod.releaseConnection();
	}
}

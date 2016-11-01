package multiThread;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import util.AbnormalParamTest;

public class SingleThread {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		AbnormalParamTest abnormalParamTest = new AbnormalParamTest();
		String url = "http://news.app.autohome.com.cn/shouye_v7.2.0/news/shouye";
		String[] paramList = { "pm", "c", "l", "sd", "v" };
		int[] paramType = { 1, 1, 1, 1, 1 };
		int[][] value = { { 1, 200 }, {2,20}, {3,40}, {1,10}, {2,9} };
		String[] cUrl = abnormalParamTest.getAbnormalParamUrl(url, paramList, paramType, value, "json", 10);
		for(String str:cUrl){
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet get = new HttpGet(str);
			HttpResponse response = httpClient.execute(get);
			System.out.println(response.getAllHeaders());
		}
	}

}

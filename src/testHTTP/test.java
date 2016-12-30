package testHTTP;

import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class test {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		 DefaultHttpClient httpClient = new DefaultHttpClient();
         //指定服务器端URL
         HttpGet get = new HttpGet("https://www.baidu.com/");
         HttpResponse rsp = httpClient.execute(get);
         if (rsp.getStatusLine().getStatusCode()== 200) {
        	 System.out.println("连接成功");
             return;
         }
         System.out.println("连接失败");
		
		String md5Hex = DigestUtils.md5Hex("20:a6:80:53:18:ac");
		System.out.println(md5Hex);
	}
}

package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ≤‚ ‘url {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*≤‚ ‘ UID:546195   ¿œ∑¨«—*/
		URL url = new URL("https://api.bilibili.com/x/relation/stat?vmid=546195");
	//	URL url = new URL("http://www.yxdown.com/gl/356957.html");
		String content=(String) url.openConnection().getContent();
		System.out.println(content);
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		System.out.println(data);
		
		
		
		
	}

}

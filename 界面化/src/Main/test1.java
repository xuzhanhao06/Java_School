package Main;

import java.net.URL;

//public class test1 {
//	public static void main(String[] args) throws Exception {
//		URL aURL = new URL("http://java.sun.com:8080/docs/books/" + "tutorial/index.html");
//		System.out.println("protocol = " + aURL.getProtocol());
//		System.out.println("host = " + aURL.getHost());
//		System.out.println("filename = " + aURL.getFile());
//		System.out.println("default port = " + aURL.getDefaultPort());
//		System.out.println("port = " + aURL.getPort());;
//}
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class test1 {
    public static void main(String[] args) {
        try {
            //创建一个URL实例
            URL url  = new URL("https://s1.hdslb.com/bfs/static/player/main/video.js?v=2020521");
            //通过URL的openStream方法获取URL对象所表示的资源的字节输入流
            InputStream is = url.openStream();
            //将字节输入流转化为字符输入流
            InputStreamReader isr = new InputStreamReader(is);
            //为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);
            //读取数据
            String data = br.readLine();
            while (data!=null){//循环读取数据
                System.out.println(data);
                data=br.readLine();
            }
            br.close();
            isr.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

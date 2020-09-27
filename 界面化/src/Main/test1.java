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
            //����һ��URLʵ��
            URL url  = new URL("https://s1.hdslb.com/bfs/static/player/main/video.js?v=2020521");
            //ͨ��URL��openStream������ȡURL��������ʾ����Դ���ֽ�������
            InputStream is = url.openStream();
            //���ֽ�������ת��Ϊ�ַ�������
            InputStreamReader isr = new InputStreamReader(is);
            //Ϊ�ַ���������ӻ���
            BufferedReader br = new BufferedReader(isr);
            //��ȡ����
            String data = br.readLine();
            while (data!=null){//ѭ����ȡ����
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

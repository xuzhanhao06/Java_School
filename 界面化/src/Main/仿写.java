package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;


public class ��д {
	static int X = 0;
	static int Y = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame pre=new JFrame();
		pre.setSize(350,350);//�ߴ�
		pre.setVisible(true);//�Ƿ����
		//getContentPane()���ش˴���� contentPane ���� 
		pre.getContentPane().setBackground(new Color(200,200,255));//���ñ���ɫ
		System.out.println("����һ�����ã�"+pre.getContentPane());
/*���ô��������ָ�������λ�á� 
**��������ǰδ��ʾ��Ϊ null��
**��˴��ڽ�������Ļ�����롣�е����ʹ�� */
		pre.setLocationRelativeTo(null);
		pre.setTitle("���Ǹ�����");
/*JLabel���ڶ��ı��ַ�����ͼ�����ߵ���ʾ������ǩ���������¼�������Ӧ*/
		JLabel show1=new JLabel("������UID");
		JLabel show2=new JLabel("ˢ��ʱ�䣺");
		ImageIcon bgimg=new ImageIcon(��д.class.getResource("/res/main.png"));
		JLabel bg=new JLabel(bgimg);
		bg.setBounds(0,-10,350,235);
		JPanel imagePanel=(JPanel) pre.getContentPane();
		imagePanel.setOpaque(false);//��������Ӧ���ǲ�͸���ģ���Ϊ true
		pre.getLayeredPane().add(bg,new Integer(Integer.MIN_VALUE));//���ش˴���� layeredPane ����
		//JTextField ��һ�������������������༭�����ı���
		JTextField input=new JTextField();
		JTextField time=new JTextField();
		JButton ok=new JButton("ȷ��");
		show1.setForeground(new Color(0, 0, 0));
		show1.setFont(new Font("����", 0, 20));
		show1.setBounds(20, 5, 380, 30);
		show2.setForeground(new Color(0, 0, 0));
		show2.setFont(new Font("����", 0, 20));
		show2.setBounds(20, 70, 380, 30);
		input.setFont(new Font("����", 0, 20));
		input.setBounds(20, 40, 180, 30);
		time.setFont(new Font("����", 0, 20));
		time.setBounds(20, 100, 180, 30);
		ok.setFont(new Font("����", 0, 30));
		ok.setBounds(40, 140, 130, 45);
		pre.add(show1);
		pre.add(show2);
		pre.add(time);
		pre.add(ok);
		pre.repaint();//�� time �������ػ�������ָ����������
		//���ڽ��ղ����¼����������ӿڡ�
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					real(input.getText(),time.getText(),pre);
					pre.dispose();//�ͷ��ɴ� Window�������������ӵ�е������������ʹ�õ����б�����Ļ��Դ��
				}
				catch(InterruptedException e1){
					e1.printStackTrace();
				}
			}
		});
		pre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�����û��ڴ˴����Ϸ��� "close" ʱĬ��ִ�еĲ�����
		//EXIT_ON_CLOSE���� JFrame �ж��壩��ʹ�� System exit �����˳�Ӧ�ó��򡣽���Ӧ�ó�����ʹ�á� 
	}
	
	public static void real(String UID,String Time,JFrame pre) throws InterruptedException{
		//UIManager.put�ڿ�����ԱĬ��ֵ�д洢һ������
		/*UIManager ����ǰ��ۡ�������ۼ��ϡ���۸���ʱ��֪ͨ�� PropertyChangeListeners�����Ĭ��ֵ�Լ���ȡ����Ĭ��ֵ�ı�ݷ�����*/
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("����",0,20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("����",0,20)));
		JFrame body=new JFrame();
		body.setUndecorated(true);//���û����ô˴����װ�Ρ�ֻ���ڴ��岻����ʾʱ�ŵ��ô˷����� 
		//���û�����ô���װ�Σ���Ϊ true����������˴���װ�Σ���Ϊ false��
		body.setSize(350, 350);
		body.setBackground(new Color(0,0,0,0));
		body.setVisible(true);
		body.setAlwaysOnTop(true);//���ô˴����Ƿ�Ӧ��ʼ��λ�����������Ϸ���
		body.setLocationRelativeTo(null);//���λ��
		body.setLocation(1200, 300);//������Ƶ���λ�á�
		body.setLayout(null);//���� LayoutManager����д�˷������Ӷ��������ؽ�����ת���� contentPane��
		ImageIcon bgimg=new ImageIcon(��д.class.getResource("/res/bg.png"));
		JLabel bg=new JLabel(bgimg);
		bg.setBounds(0, 0, body.getHeight(), body.getWidth());//�ƶ�������������С���� x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С�� 
		JPanel imagePanel=(JPanel) body.getContentPane();
		imagePanel.setOpaque(false);//���Ϊ true��������������߽��ڵ��������ء������������ܲ����Ʋ��ֻ��������أ��Ӷ�������ײ�����͸�ӳ����� 
		body.getLayeredPane().add(bg,new Integer(Integer.MIN_VALUE));//���ش˴���� layeredPane ����
		/* *******************************�������ˣ�!!*/
		JLabel A=new JLabel("��ǰ�۲�"+name(UID));
		A.setForeground(new Color(20,20,20));//���������ǰ��ɫ�� 
		A.setFont(new Font("����",0,17));
		A.setBounds(38, 246, 350, 30);//�ƶ�������������С��
		JLabel B=new JLabel("������...");
		B.setForeground(new Color(50,50,255));//���ô������ǰ��ɫ��
		B.setFont(new Font("˼Դ���� CN Bold", 0, 55));
		B.setBounds(0, 265, 300, 80);
		//���ñ�ǩ������ X ��Ķ��뷽ʽ��
		//SwingConstants �ж�������³���֮һ��LEFT��CENTER��ֻ��ʾͼ��ı�ǩ��Ĭ��ֵ����RIGHT��LEADING��ֻ��ʾ�ı��ı�ǩ��Ĭ��ֵ���� TRAILING��
		B.setHorizontalAlignment(SwingConstants.RIGHT);
		JButton Close=new JButton("[x]");
		Close.setFont(new Font("΢���ź�",1,18));
		Close.setBounds(260,245,60,30);//�ƶ�������������С���� x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
		Close.setContentAreaFilled(false);//���� contentAreaFilled ���ԡ����������Ϊ true����ť�����������������ϣ����һ��͸���İ�ť������ֻ��һ��ͼ��İ�ť����ôӦ�ý�����������Ϊ false��
		Close.setBorder(null);//���ô�����ı߿�
		Close.addActionListener((new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				body.dispose();
				pre.setVisible(true);
			}
		}));
		body.add(A);
		body.add(B);
		body.add(Close);
//����¼�ʹ�û��ܹ���������ʱ�����¡��ͷš��������ƶ����϶�����ʱ����һ���������ʱ�˳�����ʱ���������֡� 
		body.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				X=e.getPoint().x;
				Y=e.getPoint().y;
			}
		});
//	�ƶ����϶����ʱ�ᷢ������ƶ��¼���
		body.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				body.setLocation((e.getXOnScreen() - X), (e.getYOnScreen() - Y));
			}
		});
		//ʹ�� System exit �����˳�Ӧ�ó��򡣽���Ӧ�ó�����ʹ�á� 
		body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int a=Integer.parseInt(Time);
		System.out.println(a);
		Timer t=new Timer();//�ṩ�Լ�ʱ�� MBean ��ʵ�֡�
		t.schedule(new TimerTask() {//TimerTask����һ���µļ�ʱ������
			public void run() {
				B.setText(fans(UID));
			}
		},1000,a*1000);
	}
	private static String fans(String UID) {
		// TODO Auto-generated method stub
		String data1;
		String[] Final=new String[5];
		try {
			URL url=new URL("https://api.bilibili.com/x/relation/stat?vmid="+UID);
			try {
				/*InputStream �������� CDR �������ж�ȡ IDL ���͵� Java API��*/
				InputStream is= url.openStream();
				InputStreamReader isr=new InputStreamReader(is,"utf-8");
				
			}catch(IOException e) {
			//IOException ������ĳ�� I/O �쳣ʱ���׳����쳣��������ʧ�ܻ��жϵ� I/O �������ɵ��쳣��ͨ���ࡣ 

			}
			
			
			
			
		}catch(MalformedURLException e) {
//MalformedURLException�׳���һ�쳣ָʾ�����˴���� URL�������ڹ淶�ַ������Ҳ����κκϷ�Э�飬�����޷������ַ����� 
			return "��������";
		}
		
		return null;
	}
	private static String name(String UID) {
		// TODO Auto-generated method stub
		return null;
	}
}



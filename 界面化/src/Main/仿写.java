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


public class 仿写 {
	static int X = 0;
	static int Y = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame pre=new JFrame();
		pre.setSize(350,350);//尺寸
		pre.setVisible(true);//是否可视
		//getContentPane()返回此窗体的 contentPane 对象 
		pre.getContentPane().setBackground(new Color(200,200,255));//设置背景色
		System.out.println("返回一堆设置："+pre.getContentPane());
/*设置窗口相对于指定组件的位置。 
**如果组件当前未显示，为 null，
**则此窗口将置于屏幕的中央。中点可以使用 */
		pre.setLocationRelativeTo(null);
		pre.setTitle("我是个标题");
/*JLabel用于短文本字符串或图像或二者的显示区。标签不对输入事件作出反应*/
		JLabel show1=new JLabel("请输入UID");
		JLabel show2=new JLabel("刷新时间：");
		ImageIcon bgimg=new ImageIcon(仿写.class.getResource("/res/main.png"));
		JLabel bg=new JLabel(bgimg);
		bg.setBounds(0,-10,350,235);
		JPanel imagePanel=(JPanel) pre.getContentPane();
		imagePanel.setOpaque(false);//如果此组件应该是不透明的，则为 true
		pre.getLayeredPane().add(bg,new Integer(Integer.MIN_VALUE));//返回此窗体的 layeredPane 对象
		//JTextField 是一个轻量级组件，它允许编辑单行文本。
		JTextField input=new JTextField();
		JTextField time=new JTextField();
		JButton ok=new JButton("确定");
		show1.setForeground(new Color(0, 0, 0));
		show1.setFont(new Font("黑体", 0, 20));
		show1.setBounds(20, 5, 380, 30);
		show2.setForeground(new Color(0, 0, 0));
		show2.setFont(new Font("黑体", 0, 20));
		show2.setBounds(20, 70, 380, 30);
		input.setFont(new Font("黑体", 0, 20));
		input.setBounds(20, 40, 180, 30);
		time.setFont(new Font("黑体", 0, 20));
		time.setBounds(20, 100, 180, 30);
		ok.setFont(new Font("黑体", 0, 30));
		ok.setBounds(40, 140, 130, 45);
		pre.add(show1);
		pre.add(show2);
		pre.add(time);
		pre.add(ok);
		pre.repaint();//在 time 毫秒内重绘此组件的指定矩形区域。
		//用于接收操作事件的侦听器接口。
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					real(input.getText(),time.getText(),pre);
					pre.dispose();//释放由此 Window、其子组件及其拥有的所有子组件所使用的所有本机屏幕资源。
				}
				catch(InterruptedException e1){
					e1.printStackTrace();
				}
			}
		});
		pre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置用户在此窗体上发起 "close" 时默认执行的操作。
		//EXIT_ON_CLOSE（在 JFrame 中定义）：使用 System exit 方法退出应用程序。仅在应用程序中使用。 
	}
	
	public static void real(String UID,String Time,JFrame pre) throws InterruptedException{
		//UIManager.put在开发人员默认值中存储一个对象。
		/*UIManager 管理当前外观、可用外观集合、外观更改时被通知的 PropertyChangeListeners、外观默认值以及获取各种默认值的便捷方法。*/
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("黑体",0,20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("黑体",0,20)));
		JFrame body=new JFrame();
		body.setUndecorated(true);//禁用或启用此窗体的装饰。只有在窗体不可显示时才调用此方法。 
		//如果没有启用窗体装饰，则为 true；如果启用了窗体装饰，则为 false。
		body.setSize(350, 350);
		body.setBackground(new Color(0,0,0,0));
		body.setVisible(true);
		body.setAlwaysOnTop(true);//设置此窗口是否应该始终位于其他窗口上方。
		body.setLocationRelativeTo(null);//相对位置
		body.setLocation(1200, 300);//将组件移到新位置。
		body.setLayout(null);//设置 LayoutManager。重写此方法，从而有条件地将调用转发到 contentPane。
		ImageIcon bgimg=new ImageIcon(仿写.class.getResource("/res/bg.png"));
		JLabel bg=new JLabel(bgimg);
		bg.setBounds(0, 0, body.getHeight(), body.getWidth());//移动组件并调整其大小。由 x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。 
		JPanel imagePanel=(JPanel) body.getContentPane();
		imagePanel.setOpaque(false);//如果为 true，则该组件绘制其边界内的所有像素。否则该组件可能不绘制部分或所有像素，从而允许其底层像素透视出来。 
		body.getLayeredPane().add(bg,new Integer(Integer.MIN_VALUE));//返回此窗体的 layeredPane 对象。
		/* *******************************出界面了！!!*/
		JLabel A=new JLabel("当前观测"+name(UID));
		A.setForeground(new Color(20,20,20));//设置组件的前景色。 
		A.setFont(new Font("黑体",0,17));
		A.setBounds(38, 246, 350, 30);//移动组件并调整其大小。
		JLabel B=new JLabel("加载中...");
		B.setForeground(new Color(50,50,255));//设置此组件的前景色。
		B.setFont(new Font("思源黑体 CN Bold", 0, 55));
		B.setBounds(0, 265, 300, 80);
		//设置标签内容沿 X 轴的对齐方式。
		//SwingConstants 中定义的以下常量之一：LEFT、CENTER（只显示图像的标签的默认值）、RIGHT、LEADING（只显示文本的标签的默认值）或 TRAILING。
		B.setHorizontalAlignment(SwingConstants.RIGHT);
		JButton Close=new JButton("[x]");
		Close.setFont(new Font("微软雅黑",1,18));
		Close.setBounds(260,245,60,30);//移动组件并调整其大小。由 x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
		Close.setContentAreaFilled(false);//设置 contentAreaFilled 属性。如果该属性为 true，则按钮将绘制内容区域。如果希望有一个透明的按钮，比如只是一个图标的按钮，那么应该将此属性设置为 false。
		Close.setBorder(null);//设置此组件的边框
		Close.addActionListener((new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				body.dispose();
				pre.setVisible(true);
			}
		}));
		body.add(A);
		body.add(B);
		body.add(Close);
//鼠标事件使用户能够跟踪鼠标何时被按下、释放、单击、移动、拖动、何时进入一个组件、何时退出、何时滚动鼠标滚轮。 
		body.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				X=e.getPoint().x;
				Y=e.getPoint().y;
			}
		});
//	移动或拖动鼠标时会发生鼠标移动事件。
		body.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				body.setLocation((e.getXOnScreen() - X), (e.getYOnScreen() - Y));
			}
		});
		//使用 System exit 方法退出应用程序。仅在应用程序中使用。 
		body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int a=Integer.parseInt(Time);
		System.out.println(a);
		Timer t=new Timer();//提供对计时器 MBean 的实现。
		t.schedule(new TimerTask() {//TimerTask创建一个新的计时器任务。
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
				/*InputStream 是用来从 CDR 编组流中读取 IDL 类型的 Java API。*/
				InputStream is= url.openStream();
				InputStreamReader isr=new InputStreamReader(is,"utf-8");
				
			}catch(IOException e) {
			//IOException 当发生某种 I/O 异常时，抛出此异常。此类是失败或中断的 I/O 操作生成的异常的通用类。 

			}
			
			
			
			
		}catch(MalformedURLException e) {
//MalformedURLException抛出这一异常指示出现了错误的 URL。或者在规范字符串中找不到任何合法协议，或者无法解析字符串。 
			return "访问受限";
		}
		
		return null;
	}
	private static String name(String UID) {
		// TODO Auto-generated method stub
		return null;
	}
}



package 窗口可视化;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public class test3 extends JFrame {
	public void lanchFrame() {
		this.setTitle("标题");
		this.setVisible(true);//窗口可见
		this.setResizable(true);//是否可拖动边框
		this.setSize(500,500);//窗口大小
		this.setLocation(300, 300);//设置窗口的位置
		//创建一个匿名内部类
//		this.addWindowListener(new WindowAdapter(){
//			public void windowClosing(java.awt.event.WindowEvent e) {
//				System.exit(0);
//			};
//		});
		this.setLayout(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 f=new test3();
		f.lanchFrame();

	}

}

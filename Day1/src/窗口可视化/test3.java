package ���ڿ��ӻ�;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public class test3 extends JFrame {
	public void lanchFrame() {
		this.setTitle("����");
		this.setVisible(true);//���ڿɼ�
		this.setResizable(true);//�Ƿ���϶��߿�
		this.setSize(500,500);//���ڴ�С
		this.setLocation(300, 300);//���ô��ڵ�λ��
		//����һ�������ڲ���
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

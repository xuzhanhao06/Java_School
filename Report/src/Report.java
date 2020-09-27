
interface IReport{
	public void Time();
	public void Draw();
	public void Read();
}

class Boss implements IReport{
	private String BossName;
	public Boss(String BossNmae){
		this.BossName=BossNmae;
	}
	public String getBossName(){
		return this.BossName;
	}
	public void Draw() {
		// TODO Auto-generated method stub	
		System.out.println(this.BossName +"����");
	}
	@Override
	public void Time() {
		// TODO Auto-generated method stub
		System.out.println(this.BossName +"��Ʊ���ʱ��");
	}
	@Override
	public void Read() {
		System.out.println(this.BossName +"������");
	}
}


 class Sec implements IReport{
	 private Boss boss=null;
	 public Sec(Boss boss){
		 this.boss=boss;
	 }
	  
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println(this.boss.getBossName()+"�������������");
		//this.boss.Draw();	
	}

	@Override
	public void Time() {
		// TODO Auto-generated method stub
		System.out.println(this.boss.getBossName()+"���������ʱ��");
	//	this.boss.Time();
	}	
	public void Read() {
		System.out.println(this.boss.getBossName() +"������");
	}
}


public class Report {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������ʱ��");
		Boss boss=new Boss("BOSS");
		IReport sec=new Sec(boss);
		sec.Draw();sec.Time();sec.Read();
		System.out.println(" ");
		System.out.println("�����鲻��ʱ��");
		boss.Draw();
		boss.Time();
		boss.Read();

		
		
	}

}

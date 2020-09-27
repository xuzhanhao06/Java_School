
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
		System.out.println(this.BossName +"报告");
	}
	@Override
	public void Time() {
		// TODO Auto-generated method stub
		System.out.println(this.BossName +"设计报告时间");
	}
	@Override
	public void Read() {
		System.out.println(this.BossName +"读报告");
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
		System.out.println(this.boss.getBossName()+"的秘书代做报告");
		//this.boss.Draw();	
	}

	@Override
	public void Time() {
		// TODO Auto-generated method stub
		System.out.println(this.boss.getBossName()+"的秘书设计时间");
	//	this.boss.Time();
	}	
	public void Read() {
		System.out.println(this.boss.getBossName() +"读报告");
	}
}


public class Report {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("当秘书在时：");
		Boss boss=new Boss("BOSS");
		IReport sec=new Sec(boss);
		sec.Draw();sec.Time();sec.Read();
		System.out.println(" ");
		System.out.println("当秘书不在时：");
		boss.Draw();
		boss.Time();
		boss.Read();

		
		
	}

}

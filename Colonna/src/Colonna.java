interface IArea{
	public  double Area();
}

class Circ implements IArea{
	private double r,Area;
	Circ(double r){
		this.r=r;
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub		
		return Area=r*r*Math.PI;//Բ�����
	}	
}

class Colonna  implements IArea{
	private double high,Area;
	IArea circ=null;
	Colonna (double high,IArea circ){     //IArea circ ������Circ circ ����Test ��Ĳ�������Ҳ����һ��~
		this.high=high;
		this.circ=circ;
	}
	public double Area() {
		return Area=high*circ.Area(); //Բ�������~
	}  
}


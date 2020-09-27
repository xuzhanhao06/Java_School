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
		return Area=r*r*Math.PI;//圆的面积
	}	
}

class Colonna  implements IArea{
	private double high,Area;
	IArea circ=null;
	Colonna (double high,IArea circ){     //IArea circ 可以用Circ circ 但是Test 类的参数定义也必须一致~
		this.high=high;
		this.circ=circ;
	}
	public double Area() {
		return Area=high*circ.Area(); //圆柱的体积~
	}  
}


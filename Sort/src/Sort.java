
import java.lang.reflect.Array;
import java.util.*;
/*
class Students<X,Y>{
	private X Name; //学生姓名
	private Y Score;//学生成绩
	public void setName(X Name){
		this.Name=Name;
	}
	public X getName(){
		return this.Name;	
	}
	
	public void setScore(Y Score){
		this.Score=Score; 
	}
	public Y getScore(){
		return this.Score ;
	}
}*/
class ArrayClass<T>{
	private T[][] array;
	public void setT(T[][] array){
		this.array =array;
	}
	public T[][] getT(){
		return array;
	}	
}


 class Sort {
	public static void main(String[] args) {
		ArrayClass<String>a=new ArrayClass<String>(); //创建个实例
		String[][] array={{"张三","60"},{"张四","55"},{"张五","80"},{"老六","99"},{"天高","70"}};//初始化二维数组
		String[] s1=new String[5]; //创建一个临时存放成绩的一维数组
		a.setT(array);  //将二维数组放入ArrayClass类里，T为String类型
		System.out.println(" 排序前：");
		for(int i=0;i<5;i++){   //遍历二维数组
			for(int j=0;j<2;j++)
			System.out.print(a.getT()[i][j]+" ");
		}
		System.out.println();
		System.out.println(" 排序后：");
		
		
		for(int i=0;i<5;i++){
			 s1[i]=array[i][1];
		}
		Arrays.sort(s1);//将放成绩的数组进行排序
	/*	for(int i=0;i<5;i++){
			System.out.print(s1[i]+" ");
		}*/
		
		
		for(int i=0;i<5;i++){//遍历数组
			for(int j=0;j<5;j++)
			{
				if(s1[i]==array[j][1])//若是s1[i]==array[j][1]相匹配
					System.out.println("姓名："+a.getT()[j][0]+"  成绩： "+a.getT()[j][1]);	//输出二维数组的名字和成绩		
			}
			
		}				
	//	Arrays.sort(array);
	/*	for(int i=0;i<5;i++){
			for(int j=0;j<2;j++)
				System.out.print(a.getT()[i][j]+" ");
		}*/	
	}

}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
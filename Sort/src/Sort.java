
import java.lang.reflect.Array;
import java.util.*;
/*
class Students<X,Y>{
	private X Name; //ѧ������
	private Y Score;//ѧ���ɼ�
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
		ArrayClass<String>a=new ArrayClass<String>(); //������ʵ��
		String[][] array={{"����","60"},{"����","55"},{"����","80"},{"����","99"},{"���","70"}};//��ʼ����ά����
		String[] s1=new String[5]; //����һ����ʱ��ųɼ���һά����
		a.setT(array);  //����ά�������ArrayClass���TΪString����
		System.out.println(" ����ǰ��");
		for(int i=0;i<5;i++){   //������ά����
			for(int j=0;j<2;j++)
			System.out.print(a.getT()[i][j]+" ");
		}
		System.out.println();
		System.out.println(" �����");
		
		
		for(int i=0;i<5;i++){
			 s1[i]=array[i][1];
		}
		Arrays.sort(s1);//���ųɼ��������������
	/*	for(int i=0;i<5;i++){
			System.out.print(s1[i]+" ");
		}*/
		
		
		for(int i=0;i<5;i++){//��������
			for(int j=0;j<5;j++)
			{
				if(s1[i]==array[j][1])//����s1[i]==array[j][1]��ƥ��
					System.out.println("������"+a.getT()[j][0]+"  �ɼ��� "+a.getT()[j][1]);	//�����ά��������ֺͳɼ�		
			}
			
		}				
	//	Arrays.sort(array);
	/*	for(int i=0;i<5;i++){
			for(int j=0;j<2;j++)
				System.out.print(a.getT()[i][j]+" ");
		}*/	
	}

}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
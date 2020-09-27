	interface IComputeAverage
	{
		double getAverage(double score[]);
	}

 class Gymnastics implements IComputeAverage {

	public double getAverage(double score[]) {
		double temp;
		double temp1=0;
	//	double len=score.length;
		for(int i=0;i<score.length-1;i++)
		{
			for(int j=0;j<score.length-i-1;j++)
			{
				if(score[j]>=score[j+1])
				{
					temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}		
			}		
		}
/*		for(int i=0;i<8;i++)//测试 用    ------------------遍历数组中的8个值
		{
			System.out.print(score[i]+" ");
		}	
*/		
		for(int i=1;i<score.length-1;i++)
		{
			temp1+=score[i];
		}	
		// TODO Auto-generated method stub
		return temp1/(score.length-2);
	}
}
class Student implements IComputeAverage {
	double count=0;
	@Override
	public double getAverage(double[] score) {
		// TODO Auto-generated method stub
		for(int i=0;i<score.length;i++)
			count+=score[i];			
		return (count/score.length);
	}

}

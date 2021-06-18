package Sum;

public class Java {
	
	public void Sumof2_to_30()
	{
		int i=0;
		int sum=0;
		for(i=2;i<=30;i+=2)
		{
			sum=sum+i;
			//System.out.println(i);
		}
		
		System.out.printf("Sum of 2 to 30 Even Numbers's cumulative value:  %d",sum);
	}
	

}

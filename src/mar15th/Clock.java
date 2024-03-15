package mar15th;

public class Clock {

	private int hr,min,sec;
	
	//setters 
	
	public void setClock(int x,int y,int z)
	{
		hr=x;
		min=y;
		sec=z;
	}
	
	//getter 
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		System.out.format("%02d:%02d:%02d",hr,min,sec);
	}
}

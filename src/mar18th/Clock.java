package mar18th;

public class Clock {
	
	int hr,min,sec;
	
	public void setClock(int hr)
	{
		this.hr=hr;
	}
	
	public void setClock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	//getter 
	
		public void getClock()
		{
			//System.out.println(hr+":"+min+":"+sec);
			System.out.format("%02d:%02d:%02d",hr,min,sec);
		}

}

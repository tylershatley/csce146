/*
 * Tyler Shatley
 */
public class Event extends Sub{
	
	private int time; //time of the event 
	private int date; //date of the event
	private String notes; //notes of the event
	
	public Event()//generic event
	{
		this.time = 0;
		this.date = 0;
		this.notes = "no notes";
	}
	
	public Event(String xname, String xcat, String xdes, int xtime, int xdate, String xnotes)//parametrized event
	{
		super(xname,xcat,xdes);
		this.settime(xtime);
		this.setdate(xdate);
		this.setnotes(xnotes);
	}
	
	public int gettime()
	{
		return this.time;
	}
	
	public int getdate()
	{
		return this.date;
	}
	
	public String getnotes()
	{
		return this.notes;
	}
	
	public void settime(int xtime)
	{
		this.time = xtime;
	}
	
	public void setdate(int xdate)
	{
		this.date = xdate;
	}
	
	public void setnotes(String xnotes)
	{
		this.notes = xnotes;
	}
	
	public String toString()
	{
		return "Time: " + this.time + 
				"\nDate: " + this.date + 
				"\nNotes: " + this.notes;
	}
	
}

/*
 * Tyler Shatley
 * csce146
 */
public class Song {
	
	private String name;
	private String artist;
	private int totalLength;
	private int currentTime;
	
	
	//default constructor
	public Song()
	{
		this.name = "no name";
		this.artist = "no name";
		this.totalLength = 1;
		this.currentTime = 1;
	}
	
	//parametrized constructor
	public Song(String xname, String xartist, int xtotalLength, int xcurrentTime)
	{
		this.setname(xname);
		this.setartist(xartist);
		this.settotalLength(xtotalLength);
		this.setcurrentTime(xcurrentTime);
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getartist()
	{
		return this.artist;
	}
	
	public int gettotalLength()
	{
		return this.totalLength;
	}
	
	public int getcurrentTime()
	{
		return this.currentTime;
	}
	
	public void setname(String xname)
	{
		this.name = xname;
	}
	
	public void setartist(String xartist)
	{
		this.artist = xartist;
	}
	
	public void settotalLength(int xtotalLength)
	{
		if(xtotalLength > 0)
		{
			this.totalLength = xtotalLength;
		}
	}
	
	public void setcurrentTime(int xcurrentTime)
	{
		if(xcurrentTime >= 0)
		{
			this.currentTime = xcurrentTime;
		}

	}
	
	public String toString()
	{
		return "Name: " + this.name + " Artist: " + this.artist + " Length: " + this.totalLength + " Elapsed Time: " + this.currentTime;		
	}
	
	public int getTimeRemaining()
	{
		return (this.totalLength - this.currentTime);		
	}
	
	
	
	

}

/*
 * Tyler Shatley
 * csce146
 * homework00
 */
public class Prize {
	
	private String name; //name of the prize
	private int prize; //price of the prize
	
	public Prize() //defualt constructor
	{
		this.name = "nothing";
		this.prize = 0;
	}
	
	public Prize(String xname, int xprize)//parametirzed constructor
	{
		this.setname(xname);
		this.setprize(xprize);
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public int getprize()
	{
		return this.prize;
	}
	
	public void setname(String xname)
	{
		this.name = xname;
	}
	
	public void setprize(int xprize)
	{
		if(xprize >= 0)
		{
			this.prize = xprize;
		}
		else
		{
			this.prize = 0; //this should never happen
		}
	}
	

}

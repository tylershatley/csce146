//Tyler Shatley
public class Sub extends Folder{
	
	private String cat;//String for the sub category
	private String des; //description for the sub-category
	
	public Sub()//generic
	{
		this.cat = "nothing";
		this.des = "none";
	}
	
	public Sub(String xname,String xcat, String xdes)//parametrized
	{
		super(xname);
		this.setcat(xcat);
		this.setdes(xdes);
	}
	
	public String getcat()
	{
		return this.cat;
	}
	
	public String getdes()
	{
		return this.des;
	}
	
	public void setcat(String xcat)
	{
		this.cat = xcat;
	}
	
	public void setdes(String xdes)
	{
		this.des = xdes;
	}
	
	public String toString()
	{
		return this.cat +"\n" + this.des;
	}
}

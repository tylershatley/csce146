
public class Folder {
	
	
	private String name; //name of the folder
	
	public Folder() //default folder
	{
		this.name = "generic";
	}
	
	public Folder(String xname)//parametrized folder
	{
		this.setname(xname);
	}
	
	public String getname() //getter for name
	{
		return this.name;
	}
	
	public void setname(String xname)//setter for the name of the file
	{
		this.name = xname;
	}
	
	public String toString()
	{
		return name;
	}
}

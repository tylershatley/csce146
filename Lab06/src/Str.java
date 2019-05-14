/*
 * Tyler Shatley
 * csce146
 * lab06
 */
public class Str {
	
	private String input;
	
	public Str()//defualt constructor
	{
		this.input = "blank";
	}
	
	public Str(String xInput)//parametrized constructor
	{
		this.setInput(xInput);
	}
	
	public String getInput()
	{
		return this.input;
	}
	
	
	public void setInput(String xInput)
	{
		this.input = xInput;
	}
	
	public String toString()
	{
		return this.getInput();
	}
}

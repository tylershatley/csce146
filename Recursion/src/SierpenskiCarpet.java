import java.util.*;
import java.applet.*;
import java.awt.*;
public class SierpenskiCarpet extends Applet {
	private Image display;
	private Graphics drawingArea;
	public void init()
	{
		this.setSize(600,600);
		int height = getSize().height;
		int width = getSize().width;
		display = createImage(width,height);
		drawingArea = display.getGraphics();
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(display,  0 ,  0, null);
		
	}
	private class Rect()
	{
		int x,y,w,h;
		public Rect(int ax, int ay, int aw, int ah)
		{
			x = ax; y = ay; w = aw; h = ah;
		}
	}

}

/*
 * Tyler Shatley
 */
public class EventMethods {
	
	private GenLL<Event>event;
	
	public EventMethods()
	{
		event = new GenLL<Event>();
	}
	
	public void addEvent(Event xEvent)//method that adds a new event.
	{
		event.insert(xEvent);
	}
	
	public void removeEvent()//method that removes event.
	{
		event.deleteCurrent();
	}
	
	public boolean findEventTime(Event xEvent)//boolean method for searching for time.
	{
		event.resetCurrent(); 
		
		while(event.hasMore())
		{
			if(event.getCurrent().gettime() == xEvent.gettime())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		//should never get here
		return false;
	}
	
	public boolean findEventDate(Event xEvent)//boolean method for searching by date.
	{
		event.resetCurrent();
		
		while(event.hasMore())
		{
			if(event.getCurrent().getdate() == xEvent.getdate())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		//should never get here.
		return false;
	}
	
	public void editEvent(Event xEvent)//editing an event date and time.
	{
		event.getCurrent().settime(xEvent.gettime());
		event.getCurrent().setdate(xEvent.getdate());
	}
	
	public void editEventTime(Event xEvent)//editing an event time.
	{
		event.getCurrent().settime(xEvent.gettime());
	}
	
	public void editEventNote(Event xEvent)//editing an event notes.
	{
		event.getCurrent().setnotes(xEvent.getnotes());
	}
	
	public int convertDate(Event xEvent)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

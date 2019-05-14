/*
 * Tyler Shatley
 * csce146
 */
public class SongPlaylist {
	
	LLQueue<Song>songs;
	Song currentSong;
	Song song = new Song();
	
	public SongPlaylist()
	{
		songs = new LLQueue<Song>();
		currentSong = null;
	}
	
	//method that returns the current song
	public Song getCurrentSong()
	{
		return currentSong; //returning the current song
	}
	
	//method that 
	public void addSong(Song s)
	{
		if(currentSong != null)
		{
			songs.enqueue(s);
		}
		else if(currentSong == null)
		{
			setcurrentSong(s);
		}
	}
	
	public void setcurrentSong(Song currentSong)
	{
		this.currentSong = currentSong;
	}
	
	public void runNextSong()
	{
		if(songs != null)
		{
			currentSong = songs.dequeue();
		}
		else
		{
			//do nothing
		}
	}
	
	
	public void advanceOneSecond()
	{
		int i = 0;
		while(currentSong.getTimeRemaining() != 0)
		{
			currentSong.setcurrentTime(i);
			System.out.println(currentSong.toString());
			i++;
		}
	}
	
	public boolean checkMore()
	{
		if(currentSong != null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
}

/*
 * Tyler Shatley
 * csce146
 */
import java.util.*;
public class SongPlayListFrontEnd {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Song song = new Song();
		SongPlaylist spl = new SongPlaylist();
		
		System.out.println("Welcome to the song Playlist!");
		String yes = "true";
		
		while(yes == "true")
		{
			System.out.println("Enter 1: to Add a Song" +
					"\nEnter 2: to Start the Playlist" +
					"\nEnter 9: to Quit");
			int ans = key.nextInt();
			
			switch(ans)
			{
			case 1:
				song = new Song();
				System.out.println("Enter the name of the song");
				song.setname(key.next());
				System.out.println("Enter the artist");
				song.setartist(key.next());
				System.out.println("Enter the length of the song (in seconds)");
				song.settotalLength(key.nextInt());
				song.setcurrentTime(0);
				spl.addSong(song);
				break;
			case 2:
				while(spl.checkMore() == false)
				{
					spl.advanceOneSecond();
					System.out.println();
					spl.runNextSong();
				}
				break;
			case 9:
				yes = "false";
			}
		}
		System.out.println("Thank you for playing your music with us." +
		"\nGoodbye world.");
		key.close();
	}
}

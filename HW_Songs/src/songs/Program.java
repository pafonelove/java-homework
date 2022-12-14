/*
	?????????? ??????????? ???????? ??????????? ????, ??????? ??????????? ?????????, ??????? ? ????????, ? ???????? ?????? ???? ?????????, 
		?????? ?????? ??????????? ????????? ? ???????. ????? ???????, ??? ????? ??????? - ??? ????? ???? ?????, ?????? ? ???? ????? ???? ????????,
		??????? ??????????? ??????????????? ? ??????. ????? ???? ????? ???? ???????? ? ?????? ????: ?????????, ??????: ?????1, ????? 2?, 
		????  ?????????, ?????: ?????1?. 
	?????????? ?????????????, ??? ???? ?????? ?? ????, ????? ???????? ?????? ?? ???? ?????? ???? ?? ???????, ? ???????? ????????? ??????? ????. 
	??? ?? ???????????? ??? ?????? ???? ????? ??????????? ?????? ? ????? ??????? ? ?? ?????? ???? ??????? ???????? ???.
	????????? ????????? ??????:
?		??????? ??????? ??????????, ????? ?????????? ? ?????? ? ??ϔ, ????? ??????
?		??????? ?????: ?????????? ?????????, ????? ?????, ?????? ? ??ϔ ??? ??????, ???????????? ????????????, ????? ????????. 
?		???????? ?????? ??? ????? ? ?????? ?????? ? ??ϔ, ? ????????? ? ?????? ??????????.
?		??????? ?? ????? ??? ??? ????? ? ????????? ??????? ???? ??????? ? ??????.
?		???????? ??? ????? ??????? ?????? ? ??ϔ ???? ?????? ?? ???? ?????????? ?????????.

 */


// ?????????? ?????? ? ????????????? ? ????????? ????????!!!

package songs;
import java.util.ArrayList;

// ????? ??? ???????? ????????? Track.
final class Track {
	String Name;		// ???????? ?????
	String Author;		// ??? ??????
	String CoAuthor;	// ??? ????????
	Album A;			// ??????
	
	// ??????????? ?????? ??? ???????? ???????? ? ????????? ???????? ????? ? ???????.
	Track(String n, Album a) {
		Name = n;
		Author = a.Author;
		A = a;
	}
	
	// ??????????? ?????? ??? ???????? ???????? ? ????????? ???????? ?????, ??? ?????? ? ???????.
	Track(String name, String coAuthor, Album a) {
		Name = name;
		Author = a.Author;
		CoAuthor = coAuthor;
		A = a;
	}
	
	// ????? ?????????? ? ??????.
	public String toString() { 
		if (A != null) {
			return Name + ", " + "??????: " + Author + ", "+ CoAuthor + ", " + A.Name + " " + A.Author;
		}
		
		return Name + ", " + "?????: " + Author;
	}
	
	public void showTracks() {
		System.out.println(A.Name);
	}
}

// ????? ??? ???????? ????????? Album.
class Album {
	String Name;	// ???????? ???????
	String Author;	// ????? ???????
	
	Album (String n, String a) {
		Name = n;
		Author = a;
	}
}

public class Program {

	public static void main(String[] args) {
		Album a1 = new Album ("????????", "????????");
		Album a2 = new Album ("????? ? ???", "????");
		
		ArrayList <Track> tracks = new ArrayList <Track>();
//		
		Track t1 = new Track ("????????? ????????", "???", a2);
		Track t2 = new Track ("????? ? ???", a2);
		Track t3 = new Track ("??????????? ???????????", "??????", a1);
		tracks.add(t1);
		tracks.add(t2);
		tracks.add(t3);
		System.out.println(tracks);
		
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
		
		t1.showTracks();
		
//		System.out.println(t1.A);
	}
}

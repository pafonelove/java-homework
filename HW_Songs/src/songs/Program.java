/*
	Ќеобходимо разработать сущность ћузыкальный “рек, котора€ описываетс€ названием, автором и альбомом, к которому данный трек относитс€, 
		причем альбом описываетс€ названием и автором. Ѕудем считать, что автор альбома - это автор всех песен, однако у него могут быть соавторы,
		которые указываютс€ непосредственно в треках. Ћюбой трек может быть приведен к строке вида: УЌазвание, авторы: јвтор1, јвтор 2Ф, 
		либо  УЌазвание, автор: јвтор1Ф. 
	Ќеобходимо гарантировать, что име€ ссылку на трек, можно получить доступ ко всем трекам того же альбома, к которому относитс€ текущий трек. 
	“ак же гарантируйте что каждый трек может встречатьс€ только в одном альбоме и не должно быть способа изменить это.
	¬ыполнить следующие задачи:
Х		—оздать альбомы У укловодФ, автор УћеталловФ и УЎоссе к ќќѕФ, автор УјсидФ
Х		—оздать песни: У—осто€ние объектовФ, автор УянгФ, УЎоссе к ќќѕФ без автора, Уќдноразовый программистФ, автор УЅертонФ. 
Х		¬ключить первые две песни в альбом УЎоссе к ќќѕФ, а последнюю в альбом У укловодФ.
Х		¬ывести на экран все три песни и проверить наличие всех авторов в песн€х.
Х		¬ыведите все треки альбома УЎоссе к ќќѕФ име€ ссылку на трек У—осто€ние объектовФ.

 */


// ƒќ–јЅќ“ј“№ ѕ”Ќ “џ — »Ќ јѕ—”Ћя÷»≈… » ѕќ—Ћ≈ƒЌ»ћ «јƒјЌ»≈ћ!!!

package songs;

final class Track {
	String Name;
	String Author;
	String CoAuthor;
	Album A;
	
	Track() {
		
	}
	
	Track(String name, Album a) {
		Name = name;
		Author = a.Author;
		A = a;
	}
	
	Track(String name, String coAuthor, Album a) {
		Name = name;
		Author = a.Author;
		CoAuthor = coAuthor;
		A = a;
	}
	
	public String toString() { 
		if (CoAuthor != null) {
			return Name + ", " + "авторы: " + Author + ", "+ CoAuthor;
		}
		
		return Name + ", " + "автор: " + Author;
	}
}

class Album {
	String Name;
	String Author;
	Track T;
	
	Album() {
		
	}
	
	Album (String name, String author) {
		Name = name;
		Author = author;
	}
	
//	public String toString() {
//		return 
//	}

//	public String toString() { 
//		return Name + Author;
//	}
}

public class Program {

	public static void main(String[] args) {
		Album a1 = new Album (" укловод", "ћеталлов");
		Album a2 = new Album ("Ўоссе к ќќѕ", "јсид");
		
		Track t1 = new Track ("—осто€ние объектов", "янг", a2);
		Track t2 = new Track ("Ўоссе к ќќѕ", a2);
		Track t3 = new Track ("ќдноразовый программист", "Ѕертон", a1);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println(t1);
	}

}

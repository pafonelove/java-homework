/*
	���������� ����������� �������� ����������� ����, ������� ����������� ���������, ������� � ��������, � �������� ������ ���� ���������, 
		������ ������ ����������� ��������� � �������. ����� �������, ��� ����� ������� - ��� ����� ���� �����, ������ � ���� ����� ���� ��������,
		������� ����������� ��������������� � ������. ����� ���� ����� ���� �������� � ������ ����: ���������, ������: �����1, ����� 2�, 
		����  ���������, �����: �����1�. 
	���������� �������������, ��� ���� ������ �� ����, ����� �������� ������ �� ���� ������ ���� �� �������, � �������� ��������� ������� ����. 
	��� �� ������������ ��� ������ ���� ����� ����������� ������ � ����� ������� � �� ������ ���� ������� �������� ���.
	��������� ��������� ������:
�		������� ������� ���������, ����� ��������� � ������ � ��ϔ, ����� �����
�		������� �����: ���������� ��������, ����� ����, ������ � ��ϔ ��� ������, ������������ �����������, ����� �������. 
�		�������� ������ ��� ����� � ������ ������ � ��ϔ, � ��������� � ������ ���������.
�		������� �� ����� ��� ��� ����� � ��������� ������� ���� ������� � ������.
�		�������� ��� ����� ������� ������ � ��ϔ ���� ������ �� ���� ���������� ��������.

 */


// ���������� ������ � ������������� � ��������� ��������!!!

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
			return Name + ", " + "������: " + Author + ", "+ CoAuthor;
		}
		
		return Name + ", " + "�����: " + Author;
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
		Album a1 = new Album ("��������", "��������");
		Album a2 = new Album ("����� � ���", "����");
		
		Track t1 = new Track ("��������� ��������", "���", a2);
		Track t2 = new Track ("����� � ���", a2);
		Track t3 = new Track ("����������� �����������", "������", a1);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println(t1);
	}

}

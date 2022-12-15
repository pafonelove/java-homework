/*
 *  ���������� ����������� �������� �������, ������� �����������:
�		���: ������
�		�������: ������
�		����: ����� �����
�		����: �������
	�������� �������� ����� ��������� ���������� ���������:
�		�������� ����� ������� � ��������� ����� � ���� ������ � ����� � ���� ������ �����. 
			��� ����� ������� ������� ����� ������ ���������, ��� �������� ������ ������ ������ ���.
�		�������� ����� ������� � ��������� ����� � ������� � ���� ����� � ����� � ���� ������ �����.
�		�������� ����� ������� � ��������� ����� � ���� ������, ����� � ���� ������ ����� � ���� � ���� ��������. 
			� ���� ������ ���������� ���������� �������� � ������������ � ������ ���� � ��������� �������� �������� ������� ����.
	����� ���������� ��������� ����������:
�		���� �������� ������ ������������� � �� ����� 500, ��� ����� �������� � �������� � ����� ������.
�		���� �������� ������ ������ ��� �������� � � ���������� �� �� ����������, �� ��� ����� ��������
�		����� ���������� ��������� ������������� ���� ���� ������� ������� �������, ���� ���� ������� ������� �������, 
			���� ���� ������� ��������� �������, ����� ����� ������ �������� �� ����� �������� (��������, ����� ������������ ��������� �������: 
			���� ����� 160 � ������, ���� 185 � �������, ��������� �������).

	�������� � �������� �� ����� ��������� �������:
�		�������� � ������ ��� (� ���� ������) � ������ 170
�		�������� � ������ ������ ������, ������ 168 � ����� ����� (���������� �������)
�		�������� � ������ ��������� (� ���� ������), ������ 167 � ����� ������� (���������� �������)
	����������������� ����������������� ������� �� ��������.
 */

package human;

// ����� ��� �������� ��������� Human.
class Human {
	String firstName;			// ������ ���
	String patronymic;			// ��������
	String lastName;			// �������
    private Human father;		// �������� ����
    int height; 				// ����
    
    // ����������� ������ ��� �������� �������� � ��������� ������� ����� � �����.
    Human(String firstName, int height) {
    	if ((height <= 0) || (height >= 500)) 
    		throw new IllegalArgumentException("Height must be > 0 and < 500!");
    	this.firstName = firstName;
    	this.height = height;
    }
    
    // ����������� ������ ��� �������� �������� � ��������� ������� �����, ������� � �����.
    Human(String firstName, String lastName, int height) {
    	if ((height <= 0) || (height >= 500)) 
    		throw new IllegalArgumentException("Height must be > 0 and < 500!");
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.height = height;
    }
    
 // ����������� ������ ��� �������� �������� � ��������� ������� �����, ����� � ����.
    Human(String firstName, int height, Human father) {
    	if ((height <= 0) || (height >= 500))  
    		throw new IllegalArgumentException("Height must be > 0 and < 500!");
    	this.firstName = firstName;
    	this.height = height;
    	this.father = father;
    	patronymic = father.firstName + "����";
    	this.lastName = father.lastName;
    }
    
    // ����� ��������� ������ �� ����.
    Object getFather() {
    	return father;
    }
    
    // ����� ���������� ����� ��������.
    public String CheckHeight() {
    	if (height > 185)
    		return "������� �������";
    	
    	if (height < 160)
    		return "������ �������";
    	
    	return "������� �������";
    }
    
    // ����� ���������� ���������� � ������.
    public String toString() {
        if ((lastName == null) && (patronymic == null)) {
            return firstName + " " + CheckHeight(); 
        } else if (patronymic == null) {
            return firstName + " " + lastName + " " + CheckHeight();
        } else if (lastName == null) {
            return firstName + " " + patronymic + " "  + CheckHeight();
        } else {
            return firstName + " " + patronymic + " " + lastName + " " + CheckHeight();
        }
    }
}

public class Program {

	public static void main(String[] args) {
		Human h1 = new Human("���", 170);
		Human h2 = new Human("������", 168, h1);
		h2.lastName = "������";
		Human h3 = new Human("���������", 167, h2);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}

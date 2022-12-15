/*
 *  ���������� ����������� �������� ���, ������� ����������� ����� �����������: �������, ������ ���, ��������. 
 *  	��� ����� ���� ��������� � ���������� ����, ����������� ������������ ������������� ���� ���� ����������, �������� ������� ���� ���������. 
 *  	���������� ������������� ����������� ����, ��� �����-���� �� ���������� ����� ���� �� �����, � � ���� ������ �� �� ����������� ��� ���������� � 
 *  		���������� ����. 
	�������� ����� ����� ��������� ���������� ���������:
�		��� ����� ������� ������ ������ ������ ���
�		��� ����� ������� ������ ������ ��� � �������.
�		��� ����� ������� ������ ��� ��� ���������: ������ ���, �������, ��������.
	������������, ���:
�		������ ��� ������� �� ����� ���� ������. ������ ��������� ���������� ������, ��� ������ ������.
		��� ������� ������ ������ �������� ������������� ������ � ��������������� �������.
�	������� � �������� ����� ���� ������� ������ �� ������� ����������, ����� ����� ��� ������ ������ ����� �������� ��������.
		������ ��������� ���������� ������, ��� ������ ������. ��� ������� ������ ������ �������� ������������� ������ � ��������������� �������.
�	��� ��� ��������� ����� ���� �������� � �������� � ����� ������.
	���������� ������� ��������� �����:
�		���������
�		��������� ��������� ������
�		�������� ����������
�		��������� ������������ (����� ������������ ��� ��������, � ��������� - ���)
	����������������� ����������������� ���������� �� ��������.
 */

package names;

// ����� ��� �������� ��������� Name.
class Name {
	String firstName;	// ������ ���
	String patronymic;	// ��������
	String lastName;	// �������
    
    // ����������� ������ ��� �������� �������� � ��������� ������� �����.
    Name(String firstName) {
    	if ((firstName == null) || (firstName.length() <= 0))
    		throw new NullPointerException("FirstName must not be empty!");
    	this.firstName = firstName;
    };
    
    // ����������� ������ ��� �������� �������� � ��������� ������� ����� � �������.
    Name(String firstName, String lastName) {
    	if ((firstName == null) || (firstName.length() <= 0))
    		throw new NullPointerException("FirstName must not be empty!");
    	this.firstName = firstName;
    	this.lastName = lastName;
    };
    
    // ����������� ������ ��� �������� �������� � ��������� ������� �����, ������� � ��������.
    Name(String firstName, String patronymic, String lastName) {
    	if ((firstName == null) || (firstName.length() <= 0))
    		throw new NullPointerException("FirstName must not be empty!");
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.patronymic = patronymic;
    }
    
    // ����� ��������� ������ �������� ���� �������.
    void setLastName(String lastName) {
    	if ((lastName == null) || (lastName.length() <= 0))
    		throw new NullPointerException("New LastName must not be empty!");
    	this.lastName = lastName;
    }
    
    // ����� ��������� ������ �������� ���� ��������.
    void setPatronymic(String patronymic) {
    	if ((patronymic == null) || (patronymic.length() <= 0))
    		throw new NullPointerException("New Patronymic must not be empty!");
    	this.patronymic = patronymic;
    }
    
    // ����� ���������� ���������� � ������.
    public String toString() {
        if ((lastName == null) && (patronymic == null)) {
            return firstName; 
        } else if (lastName == null) {
            return firstName + " " + patronymic;
        } else if (patronymic == null) {
            return firstName + " " + lastName;
        } else {
        	return firstName + " " + patronymic + " " + lastName;
        }
    }
}

public class Program {

	public static void main(String[] args) {		
		Name n1 = new Name("���������");
		Name n2 = new Name("���������", "���������", "������");
		Name n3 = new Name("��������", "����������");
		Name n4 = new Name("���������");
		n4.setPatronymic("������������");
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}

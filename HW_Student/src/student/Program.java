/*
 *  ���������� ����������� �������� �������, ������� �����������:
�		���: ������
�		������: ������ ����� �����.
�	����� ���������� ��������� ������������� ���� ����: [������1, ������2,�,������N]�
	�� �������� �������� �������� ��������� �����������:
�		�������� ����� ������� ������ ������ ���
�		�������� ����� ������� ������ ��� � ����� ������ 
�	��� ������� �������� �������� ������ ���� ����������� ����� �������������.
	������� ����� ���������:
�		������� ����� ���������� �������� ����� ������� ������ (������������ �����). ���� ������ ���, �� ������� � 0.
�		������� ����� ���������� ���������� � ���, �������� �� �� ���������� ��� ���. ������� �������� ���������� ���� � ���� ���� ���� �� ���� ������ � 
			��� ������ ������ ��������.
	���������� �������������, ��� ��������� �������� ����� ������ ������ � ��������� �� 2 �� 5, ��� ���� � �������� ������ ����� ������ ������ ������. 

	���������� ��������� ��������� ������:
�		�������� �������� ���� � �������� 3,4,5,4
�		�������� �������� ���� � �������� 5,5,5,5
�		�������� ��� ����� ��������� ���������� � ������� ����� � �������� �� ��� �����������
	����������������� �� ��������, ��� ��� ������� ������ �������� ������������ ������. 
 */


package student;

// ����� ��� �������� ��������� Human.
class Student {
	String name;	// ���
	int[] marks;	// ������
	
	// ����������� ������ ��� �������� �������� � ��������� ����� (�����������) � ������ (����������� - varargs).
	Student (String name, int ... marks) {
		for (int i = 0; i < marks.length; i++) {
			if ((marks[i] < 2) || (marks[i] > 5))
				throw new IllegalArgumentException("Marks must be from 2 to 5!");
		}
		
		this.name = name;
		this.marks = marks;
	}
	
	// ����� ���������� �������� ��������������� ������ ��������.
	float Average() {
		if (marks.length == 0)
			return 0;
		
		int sum = 0;
		
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		
		return sum / marks.length;
	}
	
	// ����� �������� ������������ ��������.
	void IsExcellent() {
		boolean flag = CheckMarks();
		if ((marks.length >= 1) && flag) {
			System.out.println("������� " + name + " �������� ����������.");
		} else {
			System.out.println("������� " + name + " �� �������� ����������.");
		}
	}
	
	// ����� �������� ������ (����� �� ��� ��������).
	boolean CheckMarks() {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] != 5)
				return false;
		}
		
		return true;
	}
	
	// ����� ������ �� ����� ������� � ��������.
	void PrintMarks() {
		System.out.print("[");
		for (int i = 0; i < marks.length; i++) {
			if (i == marks.length - 1) {
				System.out.print(marks[i]);
			} else {
				System.out.print(marks[i] + ", ");
			}
		}
		System.out.println("]");
	}
	
	// ����� ����������� ��������� �����.
	void PrintStudent() {
		System.out.print(name + ": ");
		PrintMarks();
	}
}

public class Program {

	public static void main(String[] args) {
		Student s1 = new Student("Vasily", 3, 4, 5, 4);
		Student s2 = new Student("Peter", 5,5,5,5);
		
		System.out.println("������� ���� � " + s1.name + " ����� " + s1.Average());
		System.out.println("������� ���� � " + s2.name + " ����� " + s2.Average());
		
		s1.IsExcellent();
		s2.IsExcellent();
		
//		Student s3 = new Student("Andrew", 0, 2, -5, 4);	// �������� �� ���� ������������ ������
	}
}

/*
 * 	���������� ����������� �������� ����� �� ���������� �������������:
�		����� ���������: ����� �����
�		����� �����������: ����� �����
�		����� ����� ���� ������� � ��������� ��������� � ����������� 
�		����� ������� ��������� ������������� ���� ����������/������������
�		����� ��������� �������� ��������, ���������, ��������� � ������� � ������ ������ ��� ����� ������.
			����������� �������� ������ ���� ����� ����� (����� �������, ��� �������� ����� �� ����������)
�		����� �� ����� ���� �������� ����� ��������
�	���������� ��������� ������������ ������������� ��������, ������, ��� ����������� �� ����� ���� �������������. 
	����� ���������� ��������� ��������� ������:
�		������� ��������� ����������� ������.
�		�������� �� ������ ������� ������������� ������� ������.
�		������� �� ����� ������� � ���������� �� ���������� � ������� �1/3 * 2/3 = 2/9�

 */

package fraction;

//����� ��� �������� ��������� Fraction.
class Fraction {
	int numerator;		// ���������
	int denominator;	// �����������
	
	// ����������� ������ ��� �������� �������� ����� ���� ��������� � �����������.
	Fraction (int numerator, int denominator) {
		if (numerator <= 0) 
			throw new IllegalArgumentException("Denominator must be positive and > 0!");
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// ����� ���������� � ������.
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	// ����� ���������� ����� ������.
	public void Sum(Fraction f) {
		System.out.print(numerator + "/" + denominator + " + " + f.numerator + "/" + f.denominator + " = ");				// ��������
		System.out.println((numerator * f.denominator) + (f.numerator * denominator) + "/" + denominator * f.denominator);	// ���������
	}
	
	// ����� ���������� ����� ����� � �����.
	public void Sum(int n) {
		System.out.print(numerator + "/" + denominator + " + " + n + " = ");				// ��������
		System.out.println(((n * denominator) + numerator) + "/" + denominator);			// ���������
	}
	
	// ����� ���������� �������� ������.
	public void Minus(Fraction f) {
		System.out.print(numerator + "/" + denominator + " - " + f.numerator + "/" + f.denominator + " = ");				// ��������
		System.out.println((numerator * f.denominator) - (f.numerator * denominator) + "/" + denominator * f.denominator);	// ���������
	}
	
	// ����� ���������� �������� ����� � �����.
	public void Minus(int n) {
		System.out.print(numerator + "/" + denominator + " - " + n + " = ");				// ��������
		System.out.println((numerator - (n * denominator)) + "/" + denominator);			// ���������
	}
	
	// ����� ���������� ������������ ������.
	public void Prod(Fraction f) {
		System.out.print(numerator + "/" + denominator + " * " + f.numerator + "/" + f.denominator + " = ");				// ��������
		System.out.println(numerator * f.numerator + "/" + denominator * f.denominator);									// ���������
	}
	
	// ����� ���������� ������������ ����� � �����.
	public void Prod(int n) {
		System.out.print(numerator + "/" + denominator + " * " + n + " = ");				// ��������
		System.out.println(numerator * n + "/" + denominator);								// ���������
	}

	// ����� ������� ������.
	public void Div(Fraction f) {
		System.out.print(numerator + "/" + denominator + " : " + f.numerator + "/" + f.denominator + " = ");				// �������� � 1
		System.out.print(numerator + "/" + denominator + " * " + f.denominator + "/" + f.numerator + " = ");				// �������� � 2
		System.out.println(numerator * f.denominator + "/" + denominator * f.numerator);									// ���������
	}
	
	// ����� ������� ����� �� �����.
	public void Div(int n) {
		System.out.print(numerator + "/" + denominator + " : " + n + " = ");				// �������� � 1
		System.out.print(numerator + "/" + denominator + " * " + 1 + "/" + n + " = ");		// �������� � 2
		System.out.println(numerator + "/" + denominator * n);								// ���������
	}
}

public class Program {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 3);
		Fraction f2 = new Fraction(2, 3);
		
		// ������������ �������.
		System.out.println("��������:");
		f1.Sum(f2);
		f1.Sum(5);
		System.out.println();
		
		System.out.println("���������:");
		f1.Minus(f2);
		f1.Minus(5);
		System.out.println();
		
		System.out.println("���������:");
		f2.Prod(f1);
		f2.Prod(5);
		System.out.println();
		
		System.out.println("�������:");
		f2.Div(f1);
		f2.Div(5);
		System.out.println();
	}
}

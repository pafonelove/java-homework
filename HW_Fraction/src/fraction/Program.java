/*
 * 	Необходимо разработать сущность Дробь со следующими особенностями:
•		Имеет числитель: целое число
•		Имеет знаменатель: целое число
•		Дробь может быть создана с указанием числителя и знаменателя 
•		Может вернуть строковое представление вида “числитель/знаменатель”
•		Может выполнять операции сложения, вычитания, умножения и деления с другой Дробью или целым числом.
			Результатом операции должна быть новая Дробь (таким образом, обе исходные дроби не изменяются)
•		Дробь не может быть изменена после создания
•	Необходимо корректно обрабатывать отрицательные значения, учтите, что знаменатель не может быть отрицательным. 
	Затем необходимо выполнить следующие задачи:
•		Создать несколько экземпляров дробей.
•		Написать по одному примеру использования каждого метода.
•		Вывести на экран примеры и результаты их выполнения в формате «1/3 * 2/3 = 2/9»

 */

package fraction;

//Класс для создания сущностей Fraction.
class Fraction {
	int numerator;		// числитель
	int denominator;	// знаменатель
	
	// Конструктор класса для создания сущности через ввод числителя и знаменателя.
	Fraction (int numerator, int denominator) {
		if (numerator <= 0) 
			throw new IllegalArgumentException("Denominator must be positive and > 0!");
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// Метод приведения к строке.
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	// Метод вычисления суммы дробей.
	public void Sum(Fraction f) {
		System.out.print(numerator + "/" + denominator + " + " + f.numerator + "/" + f.denominator + " = ");				// операция
		System.out.println((numerator * f.denominator) + (f.numerator * denominator) + "/" + denominator * f.denominator);	// результат
	}
	
	// Метод вычисления суммы дроби и числа.
	public void Sum(int n) {
		System.out.print(numerator + "/" + denominator + " + " + n + " = ");				// операция
		System.out.println(((n * denominator) + numerator) + "/" + denominator);			// результат
	}
	
	// Метод вычисления разности дробей.
	public void Minus(Fraction f) {
		System.out.print(numerator + "/" + denominator + " - " + f.numerator + "/" + f.denominator + " = ");				// операция
		System.out.println((numerator * f.denominator) - (f.numerator * denominator) + "/" + denominator * f.denominator);	// результат
	}
	
	// Метод вычисления разности дроби и числа.
	public void Minus(int n) {
		System.out.print(numerator + "/" + denominator + " - " + n + " = ");				// операция
		System.out.println((numerator - (n * denominator)) + "/" + denominator);			// результат
	}
	
	// Метод вычисления произведения дробей.
	public void Prod(Fraction f) {
		System.out.print(numerator + "/" + denominator + " * " + f.numerator + "/" + f.denominator + " = ");				// операция
		System.out.println(numerator * f.numerator + "/" + denominator * f.denominator);									// результат
	}
	
	// Метод вычисления произведения дроби и числа.
	public void Prod(int n) {
		System.out.print(numerator + "/" + denominator + " * " + n + " = ");				// операция
		System.out.println(numerator * n + "/" + denominator);								// результат
	}

	// Метод деления дробей.
	public void Div(Fraction f) {
		System.out.print(numerator + "/" + denominator + " : " + f.numerator + "/" + f.denominator + " = ");				// операция № 1
		System.out.print(numerator + "/" + denominator + " * " + f.denominator + "/" + f.numerator + " = ");				// операция № 2
		System.out.println(numerator * f.denominator + "/" + denominator * f.numerator);									// результат
	}
	
	// Метод деления дроби на число.
	public void Div(int n) {
		System.out.print(numerator + "/" + denominator + " : " + n + " = ");				// операция № 1
		System.out.print(numerator + "/" + denominator + " * " + 1 + "/" + n + " = ");		// операция № 2
		System.out.println(numerator + "/" + denominator * n);								// результат
	}
}

public class Program {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 3);
		Fraction f2 = new Fraction(2, 3);
		
		// Тестирование методов.
		System.out.println("Сложение:");
		f1.Sum(f2);
		f1.Sum(5);
		System.out.println();
		
		System.out.println("Вычитание:");
		f1.Minus(f2);
		f1.Minus(5);
		System.out.println();
		
		System.out.println("Умножение:");
		f2.Prod(f1);
		f2.Prod(5);
		System.out.println();
		
		System.out.println("Деление:");
		f2.Div(f1);
		f2.Div(5);
		System.out.println();
	}
}

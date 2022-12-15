/*
 *  Необходимо разработать сущность Студент, которая описывается:
•		Имя: строка
•		Оценки: массив целых чисел.
•	Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
	На создание Студента наложены следующие ограничения:
•		Студента можно создать указав только имя
•		Студента можно создать указав имя и набор оценок 
•	Оба способа создания студента должны быть реализованы одним конструктором.
	Студент умеет следующее:
•		Студент может возвращать значение своей средней оценки (вещественное число). Если оценок нет, то среднее – 0.
•		Студент может возвращать информацию о том, является ли он отличником или нет. Студент является отличником если у него есть хотя бы одна оценка и 
			все оценки только отличные.
	Необходимо гарантировать, что добавлять Студенту можно только оценки в диапазоне от 2 до 5, при этом у Студента всегда можно узнать список оценок. 

	Необходимо выполнить следующие задачи:
•		Создайте студента Васю с оценками 3,4,5,4
•		Создайте студента Петю с оценками 5,5,5,5
•		Выведите для обоих студентов информацию о среднем балле и являются ли они отличниками
	Продемонстрируйте на примерах, что нет способа задать Студенту некорректную оценку. 
 */


package student;

// Класс для создания сущностей Human.
class Student {
	String name;	// имя
	int[] marks;	// оценки
	
	// Конструктор класса для создания сущности с указанием имени (обязательно) и оценок (опционально - varargs).
	Student (String name, int ... marks) {
		for (int i = 0; i < marks.length; i++) {
			if ((marks[i] < 2) || (marks[i] > 5))
				throw new IllegalArgumentException("Marks must be from 2 to 5!");
		}
		
		this.name = name;
		this.marks = marks;
	}
	
	// Метод вычисления среднего арифметического оценок студента.
	float Average() {
		if (marks.length == 0)
			return 0;
		
		int sum = 0;
		
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		
		return sum / marks.length;
	}
	
	// Метод проверки успеваемости студента.
	void IsExcellent() {
		boolean flag = CheckMarks();
		if ((marks.length >= 1) && flag) {
			System.out.println("Студент " + name + " является отличником.");
		} else {
			System.out.println("Студент " + name + " не является отличником.");
		}
	}
	
	// Метод проверки оценок (равны ли они пятеркам).
	boolean CheckMarks() {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] != 5)
				return false;
		}
		
		return true;
	}
	
	// Метод вывода на экран массива с оценками.
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
	
	// Метод отображения текстовой формы.
	void PrintStudent() {
		System.out.print(name + ": ");
		PrintMarks();
	}
}

public class Program {

	public static void main(String[] args) {
		Student s1 = new Student("Vasily", 3, 4, 5, 4);
		Student s2 = new Student("Peter", 5,5,5,5);
		
		System.out.println("Средний балл у " + s1.name + " равен " + s1.Average());
		System.out.println("Средний балл у " + s2.name + " равен " + s2.Average());
		
		s1.IsExcellent();
		s2.IsExcellent();
		
//		Student s3 = new Student("Andrew", 0, 2, -5, 4);	// проверка на ввод некорректных оценок
	}
}

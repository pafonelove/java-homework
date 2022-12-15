/*
 *  Необходимо разработать сущность Человек, которая описывается:
•		Имя: строка
•		Фамилия: строка
•		Рост: целое число
•		Отец: Человек
	Создание человека можно выполнить следующими способами:
•		Человека можно создать с указанием имени в виде строки и роста в виде целого числа. 
			При таком способе задания имени должно считаться, что Человеку задано только личное имя.
•		Человека можно создать с указанием имени и фамилии в виде строк и роста в виде целого числа.
•		Человека можно создать с указанием имени в виде строки, роста в виде целого числа и отца в виде Человека. 
			В этом случае необходимо проставить отчество в соответствии с именем отца и присвоить текущему человеку фамилию отца.
	Также реализуйте следующие требования:
•		Рост человека всегда положительный и не более 500, его можно изменить и получить в любой момент.
•		Отца возможно задать только при создании и в дальнейшем он не изменяется, но его можно получить
•		Может возвращать текстовое представление вида “Имя Фамилия большой человек”, либо “Имя Фамилия средний человек”, 
			либо “Имя Фамилия маленький человек”, выбор фразы должен зависеть от роста человека (Например, можно использовать следующие правила: 
			рост менее 160 – низкий, выше 185 – высокий, остальные обычные).

	Создайте и выведите на экран следующие объекты:
•		Человека с именем Лев (в виде строки) и ростом 170
•		Человека с именем Сергей Пушкин, ростом 168 и отцом Львом (предыдущий Человек)
•		Человека с именем Александр (в виде строки), ростом 167 и отцом Сергеем (предыдущий Человек)
	Продемонстрируйте работоспособность решения на примерах.
 */

package human;

// Класс для создания сущностей Human.
class Human {
	String firstName;			// личное имя
	String patronymic;			// отчество
	String lastName;			// фамилия
    private Human father;		// сущность Отец
    int height; 				// рост
    
    // Конструктор класса для создания сущности с указанием личного имени и роста.
    Human(String firstName, int height) {
    	if ((height <= 0) || (height >= 500)) 
    		throw new IllegalArgumentException("Height must be > 0 and < 500!");
    	this.firstName = firstName;
    	this.height = height;
    }
    
    // Конструктор класса для создания сущности с указанием личного имени, фамилии и роста.
    Human(String firstName, String lastName, int height) {
    	if ((height <= 0) || (height >= 500)) 
    		throw new IllegalArgumentException("Height must be > 0 and < 500!");
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.height = height;
    }
    
 // Конструктор класса для создания сущности с указанием личного имени, роста и отца.
    Human(String firstName, int height, Human father) {
    	if ((height <= 0) || (height >= 500))  
    		throw new IllegalArgumentException("Height must be > 0 and < 500!");
    	this.firstName = firstName;
    	this.height = height;
    	this.father = father;
    	patronymic = father.firstName + "ович";
    	this.lastName = father.lastName;
    }
    
    // Метод получения данных об Отце.
    Object getFather() {
    	return father;
    }
    
    // Метод вычисления роста человека.
    public String CheckHeight() {
    	if (height > 185)
    		return "высокий человек";
    	
    	if (height < 160)
    		return "низкий человек";
    	
    	return "обычный человек";
    }
    
    // Метод приведения экземпляра к строке.
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
		Human h1 = new Human("Лев", 170);
		Human h2 = new Human("Сергей", 168, h1);
		h2.lastName = "Пушкин";
		Human h3 = new Human("Александр", 167, h2);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}

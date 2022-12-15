/*
 *  Необходимо разработать сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя, Отчество. 
 *  	Имя может быть приведено к строковому виду, включающему традиционное представление всех трех параметров, например “Иванов Иван Иванович”. 
 *  	Необходимо предусмотреть возможность того, что какой-либо из параметров может быть не задан, и в этом случае он не учитывается при приведении к 
 *  		текстовому виду. 
	Создание имени можно выполнить следующими способами:
•		Имя можно создать указав только Личное имя
•		Имя можно создать указав Личное имя и Фамилию.
•		Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество.
	Гарантируйте, что:
•		Личное имя никогда не может быть пустым. Пустым считается отсутствие строки, или пустая строка.
		При попытке задать пустое значение выбрасывается ошибка с соответствующим текстом.
•	Фамилия и Отчество могут быть пустыми только до первого присвоения, после этого они всегда должны иметь непустое значение.
		Пустым считается отсутствие строки, или пустая строка. При попытке задать пустое значение выбрасывается ошибка с соответствующим текстом.
•	Все три параметра могут быть получены и изменены в любой момент.
	Необходимо создать следующие имена:
•		Клеопатра
•		Александр Сергеевич Пушкин
•		Владимир Маяковский
•		Христофор Бонифатьевич (здесь Бонифатьевич это отчество, а Христофор - имя)
	Продемонстрируйте работоспособность требований на примерах.
 */

package names;

// Класс для создания сущностей Name.
class Name {
	String firstName;	// личное имя
	String patronymic;	// отчество
	String lastName;	// фамилия
    
    // Конструктор класса для создания сущности с указанием личного имени.
    Name(String firstName) {
    	if ((firstName == null) || (firstName.length() <= 0))
    		throw new NullPointerException("FirstName must not be empty!");
    	this.firstName = firstName;
    };
    
    // Конструктор класса для создания сущности с указанием личного имени и фамилии.
    Name(String firstName, String lastName) {
    	if ((firstName == null) || (firstName.length() <= 0))
    		throw new NullPointerException("FirstName must not be empty!");
    	this.firstName = firstName;
    	this.lastName = lastName;
    };
    
    // Конструктор класса для создания сущности с указанием личного имени, фамилии и отчества.
    Name(String firstName, String patronymic, String lastName) {
    	if ((firstName == null) || (firstName.length() <= 0))
    		throw new NullPointerException("FirstName must not be empty!");
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.patronymic = patronymic;
    }
    
    // Метод установки нового значения полю Фамилия.
    void setLastName(String lastName) {
    	if ((lastName == null) || (lastName.length() <= 0))
    		throw new NullPointerException("New LastName must not be empty!");
    	this.lastName = lastName;
    }
    
    // Метод установки нового значения полю Отчество.
    void setPatronymic(String patronymic) {
    	if ((patronymic == null) || (patronymic.length() <= 0))
    		throw new NullPointerException("New Patronymic must not be empty!");
    	this.patronymic = patronymic;
    }
    
    // Метод приведения экземпляра к строке.
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
		Name n1 = new Name("Клеопатра");
		Name n2 = new Name("Александр", "Сергеевич", "Пушкин");
		Name n3 = new Name("Владимир", "Маяковский");
		Name n4 = new Name("Христофор");
		n4.setPatronymic("Бонифатьевич");
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}

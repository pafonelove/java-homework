/*
    Создайте сущность Дом, которая описывается количеством этажей в виде числа. У Дома можно запросить текстовую форму, которое имеет представление вида “дом с N этажами”,
        где N это число.
    Гарантировать правильное окончание фразы, в зависимости от количества этажей. Создать и вывести на экран дома с 1, 5, 23 этажами.

*/

package com.mycompany.hw_house;

/**
 *
 * @author pavie
 */

// Класс для взаимодействия с сущностями Дом.
class House {
    final int Floors;
    
    // Конструктор класса House.
    public House (int f) {
        if (f <= 0) {                   // если при создании экземпляра вводят отрицательное число этажей, то программа выводит сообщение об ошибке
            PrintError();
        }
        
        Floors = f;
    }
    
    // Метод для отображения текстовой формы на экране.
    public void GetForm() {
        if (Floors <= 0) {              // если создана сущность Дом с отрицательным количеством этажей, то форма не отображается
            return;
        }
        
        String str = ((Floors % 10) == 1) ? "Дом с " + Floors + " этажом." : "Дом с " + Floors + " этажами."; 
        System.out.println(str);
    }
    
    // Метод отображения формы.
    public void PrintError() {
        System.out.println("Нужно создать сущность Дом хотя бы с 1 этажом!");
    }
}

public class HW_House {

    public static void main(String[] args) {
        House h1 = new House(1);
        House h2 = new House(5);
        House h3 = new House(23);
        House h4 = new House(-3);
        
        h1.GetForm();
        h2.GetForm();
        h3.GetForm();
        h4.GetForm();
    }
}

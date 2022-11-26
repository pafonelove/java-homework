/*
    �������� �������� ���, ������� ����������� ����������� ������ � ���� �����. � ���� ����� ��������� ��������� �����, ������� ����� ������������� ���� ���� � N �������,
        ��� N ��� �����.
    ������������� ���������� ��������� �����, � ����������� �� ���������� ������. ������� � ������� �� ����� ���� � 1, 5, 23 �������.

*/

package com.mycompany.hw_house;

/**
 *
 * @author pavie
 */

// ����� ��� �������������� � ���������� ���.
class House {
    final int Floors;
    
    // ����������� ������ House.
    public House (int f) {
        if (f <= 0) {                   // ���� ��� �������� ���������� ������ ������������� ����� ������, �� ��������� ������� ��������� �� ������
            PrintError();
        }
        
        Floors = f;
    }
    
    // ����� ��� ����������� ��������� ����� �� ������.
    public void GetForm() {
        if (Floors <= 0) {              // ���� ������� �������� ��� � ������������� ����������� ������, �� ����� �� ������������
            return;
        }
        
        String str = ((Floors % 10) == 1) ? "��� � " + Floors + " ������." : "��� � " + Floors + " �������."; 
        System.out.println(str);
    }
    
    // ����� ����������� �����.
    public void PrintError() {
        System.out.println("����� ������� �������� ��� ���� �� � 1 ������!");
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

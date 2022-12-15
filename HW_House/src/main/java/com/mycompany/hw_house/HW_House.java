/*
    ���������� ����������� �������� ���, ������� ����������� ����������� ������ � ���� �����.
    � ���� ����� ��������� ��������� �����, ������� ����� ������������� ���� ���� � N �������, ��� N ��� �����.
    	������������ ���������� ��������� �����, � ����������� �� ���������� ������.
    �������� ���� ����� �������������� ������ ����� �������� ���������� ������.
    	����� �������� ���� ������ �������� ���������� ������.
    ������������, ��� � ���� ������ ����� ������������� ���������� ������.
    	� ������ ������� ������� ������������� ���������� ������ ������ ������������� ��������������� ������. 
    �������� � �������� �� ����� ���� � 1, 5, 23, -3 �������.
*/

package com.mycompany.hw_house;

// ����� ��� �������� ��������� ���.
class House {
    final int floors;	// ���������� ������
    
    // ����������� ������ House.
    House (int floors) {
        if (floors <= 0) {
            throw new IllegalArgumentException("Floors must be positive!");
        }
        
        this.floors = floors;
    }
    
    // ����� ��� ����������� ��������� ����� �� ������.
    void GetForm() {
        System.out.println(((floors % 10) == 1) ? "��� � " + floors + " ������." : "��� � " + floors + " �������."); 
    }
}

public class HW_House {

    public static void main(String[] args) {
        House h1 = new House(1);
        House h2 = new House(5);
        House h3 = new House(23);
//        House h4 = new House(-3);
        
        h1.GetForm();
        h2.GetForm();
        h3.GetForm();
    }
}

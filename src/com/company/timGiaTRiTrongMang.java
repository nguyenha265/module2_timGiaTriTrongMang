package com.company;

import java.util.Scanner;

public class timGiaTRiTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String name = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i< students.length;i++){
            if(students[i].equals(name)){
                System.out.println("phan tu co trong mang co vi tri " + (i + 1) );
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("khong tim thay " + name + " trong danh sach ");
    }

}

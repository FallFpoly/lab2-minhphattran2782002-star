/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    static Scanner scanner = new Scanner(System.in);
    
    // Phương thức giải phương trình bậc nhất (Bài 1)
    public static void giaiPTB1() {
        System.out.println("\n=== GIAI PHUONG TRINH BAC NHAT ===");
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
    
    // Phương thức giải phương trình bậc hai (Bài 2)
    public static void giaiPTB2() {
        System.out.println("\n=== GIAI PHUONG TRINH BAC HAI ===");
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co nghiem x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
    
    // Phương thức tính tiền điện (Bài 3)
    public static void tinhTienDien() {
        System.out.println("\n=== TINH TIEN DIEN ===");
        System.out.print("Nhap so dien su dung: ");
        int soDien = scanner.nextInt();
        int tien;

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tien dien phai tra: " + tien + " dong");
    }
    
    // Phương thức hiển thị menu
    public static void menu() {
        while (true) {
            System.out.println("\n+-----------------------+");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac hai");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+-----------------------+");
            System.out.print("Chon chuc nang: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
}

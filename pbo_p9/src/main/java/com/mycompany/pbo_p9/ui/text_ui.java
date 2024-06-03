/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo_p9.ui;

import java.util.Scanner;

/**
 *
 * @author A-7
 */
public class text_ui {
    private static Scanner scanner = new Scanner(System.in); 
    
    public void run(){
    
        while (true) {
            main_menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    perkuliahan_menu();
                    break;
                case 2:
                    dosen_menu();
                    break;
                case 3:
                    staff_menu();
                    break;
                case 4:
                    mahasiswa_menu();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Method to display the main menu
    private static void main_menu() {
        System.out.println("===================================");
        System.out.println(" SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
        System.out.println("Pilih menu:");
        System.out.println("1. Data Perkuliahan");
        System.out.println("2. Data Dosen");
        System.out.println("3. Data Staf");
        System.out.println("4. Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.println("Masukkan pilihan: ");
    }

    // Methods for handling sub-menus
    private static void perkuliahan_menu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Perkuliahan");
            System.out.println("2. Tambah Perkuliahan");
            System.out.println("3. Edit Perkuliahan");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.println("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    //dataManager.displayPerkuliahan();
                    break;
                case 2:
                    // Implement logic for adding Perkuliahan
                    break;
                case 3:
                    // Implement logic for editing Perkuliahan
                    break;
                case 4:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void dosen_menu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Dosen");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.println("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // dataManager.displayDosen();
                    break;
                case 2:
                    // Implement logic for adding Dosen
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void staff_menu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Staf");
            System.out.println("2. Tambah Staf");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.println("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // dataManager.displayStaf();
                    break;
                case 2:
                    // Implement logic for adding Staf
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
   
    private static void mahasiswa_menu() {
      
        String nama;
        
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.println("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
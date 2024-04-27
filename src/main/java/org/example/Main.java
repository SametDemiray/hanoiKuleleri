package org.example;
/*
Hanoi Kuleleri oyununu çözen
Yinelemeli fonksiyonlu program

Bu program, kullanıcıdan disk sayısını alır ve Hanoi Kuleleri problemi için çözümü hesaplar. Çözümü bulmak için solveHanoi adlı bir
fonksiyon kullanılır, bu fonksiyon rekürsif olarak çalışır ve her adımda bir disk taşır. Başlangıçta tüm disklerin "A" direğinde
olduğunu varsayıyoruz ve diskleri "C" direğine taşımaya çalışıyoruz.Programı çalıştırdıktan sonra, program disklerin taşınma
adımlarını ekrana yazdıracaktır.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan disk sayısını al
        System.out.print("Disk sayısını girin: ");
        int disks = scanner.nextInt();

        // Hanoi Kuleleri problemi için çözümü çağır.
        solveHanoi(disks, 'A', 'B', 'C');

        scanner.close();
    }

    // Hanoi Kuleleri problemi için çözümü bulan fonksiyon
    public static void solveHanoi(int disks, char source, char auxiliary, char destination) {
        if (disks == 1) {
            System.out.println("Disk 1'i " + source + " direğinden " + destination + " direğine taşı.");
        } else {
            // Bir disk daha az olan alt kuleyi yardımcı direğe taşı
            solveHanoi(disks - 1, source, destination, auxiliary);

            // En büyük diski hedef direğe taşı
            System.out.println("Disk " + disks + "'i " + source + " direğinden " + destination + " direğine taşı.");

            // Yardımcı direkteki kuleyi hedef direğe taşı
            solveHanoi(disks - 1, auxiliary, source, destination);
        }
    }

}
package pekan3;

import java.util.Scanner;

public class UpahKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();

        int upahPerJam = 0;

        // Menentukan upah per jam berdasarkan golongan
        if (golongan == 'A') {
            upahPerJam = 1000;
        } else if (golongan == 'B') {
            upahPerJam = 2000;
        } else if (golongan == 'C') {
            upahPerJam = 3000;
        } else if (golongan == 'D') {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan tidak valid.");
            input.close();
            return;
        }

        int upahLembur = 0;
        if (jamKerja > 60) {
            int jamLembur = jamKerja - 60;
            upahLembur = jamLembur * 5000;
        }

        int upahTotal = (jamKerja * upahPerJam) + upahLembur;

        // Output hasil
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Total Upah Mingguan: Rp " + upahTotal);

        input.close();
    }
}
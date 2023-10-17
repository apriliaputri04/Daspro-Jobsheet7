import java.util.Scanner;

public class ProyekJobsheet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tgl, bln, thn, tm, gd, jumlahgedung = 1, jatahgedung = 4;
        String name;
        String konfirmasi;

        do {
            System.out.println("GEDUNG YANG TERSEDIA!");
            System.out.println("1. Gedung Pernikahan (Kapasitas Maks 900 orang)");
            System.out.println("2. Gedung Olahraga (Kapasitas Maks 250 orang)");
            System.out.println("3. Gedung Seni (Kapasitas Maks 100 orang)");
            System.out.println("4. Gedung Auditorium (Kapasitas Maks 500 orang)");
            System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
        } while (!input.hasNextInt());
        {
            System.out.println("Maaf, Input Salah!");
            System.out.println("GEDUNG YANG TERSEDIA!");
            System.out.println("1. Gedung Pernikahan (Kapasitas Maks 900 orang)");
            System.out.println("2. Gedung Olahraga (Kapasitas Maks 250 orang)");
            System.out.println("3. Gedung Seni (Kapasitas Maks 100 orang)");
            System.out.println("4. Gedung Auditorium (Kapasitas Maks 500 orang)");
            System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
            input.next();
        }
        gd = input.nextInt();

        for (int i = 0; i < gd; i++) {
            System.out.print("\nApakah Anda ingin memesan gedung lagi(y/t)? ");
            konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("GEDUNG YANG TERSEDIA!");
                System.out.println("1. Gedung Pernikahan (Kapasitas Maks 900 orang)");
                System.out.println("2. Gedung Olahraga (Kapasitas Maks 250 orang)");
                System.out.println("3. Gedung Seni (Kapasitas Maks 100 orang)");
                System.out.println("4. Gedung Auditorium (Kapasitas Maks 500 orang)");
            }
            System.out.print("Masukkan Angka : ");
            gd = input.nextInt();
            if (gd == 1) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 900) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Pernikahan");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd == 2) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 250) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Olahraga");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd == 3) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 100) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Seni");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd == 4) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 500) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Auditorium");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            }
            if (gd > 4) {
                System.out.println("Angka Tidak Sesuai");
            }
        }
        while (gd > 4)
            ;
        int i = 0;
        while (i < gd) {
            System.out.print("\nApakah Anda ingin memesan gedung lagi(y/t)? ");
            konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("GEDUNG YANG TERSEDIA!");
                System.out.println("1. Gedung Pernikahan (Kapasitas Maks 900 orang)");
                System.out.println("2. Gedung Olahraga (Kapasitas Maks 250 orang)");
                System.out.println("3. Gedung Seni (Kapasitas Maks 100 orang)");
                System.out.println("4. Gedung Auditorium (Kapasitas Maks 500 orang)");
            }
            System.out.print("Masukkan Angka : ");
            gd = input.nextInt();
            if (gd == 1) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 900) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Pernikahan");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd == 2) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 250) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Olahraga");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd == 3) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 100) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Seni");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd == 4) {
                System.out.print("Masukkan Nama Anda : ");
                name = input.next();
                System.out.print("Masukkan Tanggal Sewa : ");
                tgl = input.nextInt();
                System.out.print("Masukkan Bulan sewa : ");
                bln = input.nextInt();
                System.out.print("Masukkan Tahun Sewa : ");
                thn = input.nextInt();
                System.out.print("Masukkan Jumlah Tamu : ");
                tm = input.nextInt();

                if (tm <= 500) {
                    System.out.println("\nNama Anda       : " + name);
                    System.out.println("Nama Gedung     : Gedung Auditorium");
                    System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                    System.out.println("Jumlah Tamu     : " + tm);
                    jumlahgedung++;
                } else {
                    System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                }
            } else if (gd > 4) {
                System.out.println("nomor yang anda masukkan salah");
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        }
        i++;
    }
}

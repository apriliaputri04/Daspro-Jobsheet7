import java.util.Scanner;

public class DoWhileCuti04 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    int jatahCuti, jumlahHari;
    String konfirmasi;
    System.out.print("Jatah cuti: ");
    jatahCuti = sc.nextInt();

    do {
        System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Jumlah hari: ");
            jumlahHari = sc.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencakupi");
                continue;
            }
        } else {
            break;
        }
    } while (jatahCuti > 0);
}
    }
      

    

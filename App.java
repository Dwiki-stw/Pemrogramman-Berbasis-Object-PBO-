import java.util.Scanner;

class Peminjam{

    Scanner input = new Scanner (System.in);
    
    String nama;
    String jenisKelamin;
    String pekerjaan;
    String noIndentitas;
    String alamat;
    String tanggal;

    //construct


    //method

    void inputPeminjam(){
        System.out.println("Silahkan Masukan Data Peminjam Buku");
        System.out.print("Nama                : ");
        nama = input.nextLine();
        System.out.println();
        System.out.print("Jenis Kelamin       : ");
        jenisKelamin = input.nextLine();
        System.out.println();
        System.out.print("Pekerjanaan         : ");
        pekerjaan = input.nextLine();
        System.out.println();
        System.out.print("No. Identitas       : ");
        noIndentitas = input.nextLine();
        System.out.println();
        System.out.print("Alamat              : ");
        alamat = input.nextLine();
        System.out.println();
        System.out.print("Tanggal/Bulan/Tahun : ");
        tanggal = input.nextLine();
        System.out.println();
    }


    void cetakData(){
        System.out.println("Nama           : " + this.nama);
        System.out.println("Jenis Kelamin  : " + this.jenisKelamin);
        System.out.println("Pekerjaan      : " + this.pekerjaan);
        System.out.println("No. Identitas  : " + this.noIndentitas);
        System.out.println("Alamat         : " + this.alamat);
    }
}

class Buku{
    String judulBuku;
    String jenisBuku;

    Scanner input = new Scanner(System.in);

    //method
    void inputBuku(){
        System.out.println("Masukan informasi Buku");
        System.out.print("Judul      : ");
        judulBuku = input.nextLine();
        System.out.println();
        System.out.print("Jenis Buku : ");
        jenisBuku = input.nextLine();
        System.out.println();
    }

    void cetakBuku(){
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("jenis Buku : " + this.jenisBuku);
    }

}


public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        char meminjam = 'y';

        //membuat object peminjam1 dari class peminjam
       Peminjam peminjam1 = new Peminjam();

       //membuat object buku1 dari class buku
       Buku buku1 = new Buku();

       //perulangan while untuk mengulang program
       while (meminjam == 'Y' || meminjam == 'y'){
            //object peminjam1 memanggil method inputpeminjam
            peminjam1.inputPeminjam();

            //object buku1 memanggil method input buku
            buku1.inputBuku();

            System.out.println("Informasi Detail Peminjaman Buku");
            //object peminjam1 dan buku1 menampilkan hasil input
            // method cetak data
            peminjam1.cetakData();
            //mehtod cetak buku
            buku1.cetakBuku();

            //menanyakan kondisi perulangan
            System.out.print("Input data Peminjaman Buku kembali (Y/T)? ");
            meminjam = input.next().charAt(0);
       }
       

       

    }
}

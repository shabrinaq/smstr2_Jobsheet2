/**
 * BukuMain21
 */
public class BukuMain21 {

    public static void main(String[] args) {
        Buku21 bk1 = new Buku21(); //instansiasi nuku
        bk1.judul = "Today Ends Tomorrow Comes"; //untuk menampilkan nilai pada atribut buku
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilanInformasi(); //untuk menmapilkan informasi sebelum terjual dan ganti harga
        bk1.terjual(5); //buku yang terjual(stok)
        bk1.gantiHarga(60000); //mengubah harga buku
        bk1.tampilanInformasi(); //menampilkan informasi buku setelah terjual dan ganti harga    
    }
}
//coba
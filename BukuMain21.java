/**
 * BukuMain21
 */
public class BukuMain21 {

    public static void main(String[] args) {
        Buku21 bk1 = new Buku21(); 
        bk1.judul = "Today Ends Tomorrow Comes"; 
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilanInformasi(); 
        bk1.terjual(5); 
        bk1.gantiHarga(60000); 
        bk1.tampilanInformasi(); 
    }
}

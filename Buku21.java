/**
 * Buku21
 */
public class Buku21 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku21() {

    }

    public Buku21(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            if (stok > 0) {
                stok = 0;      
            }
        } else {
            System.out.println("Mohon Maaf stok buku tidak ada!");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jmlBeliBarang) {
        return harga * jmlBeliBarang;
    }

    int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 200000) {
            return 20;
        } else {
            return 0;  
        }
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - (hargaTotal * diskon / 100);
    }
}
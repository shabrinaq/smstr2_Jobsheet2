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
                stok = 0; //unutk membiarkan stok ke 0 tetap menetap jika stok negatif(tdk baik) 
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
}
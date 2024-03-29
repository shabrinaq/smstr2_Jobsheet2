/**
 * Buku21
 */
public class Buku21 {
    String judul, pengarang;
    int halaman, stok, harga;

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
}

package latihan;

public class superclass {

    public static void main(String[] args) {
        subclass objek = new subclass();     
        objek.transaksi();
        if (objek.parkir>5) {
            objek.diskon();
        } else {
            objek.nondiskon();
        }
    }
}

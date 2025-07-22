public class Komentar {
    public static void main(String[] args) {

        System.out.println(sum(1,2));

    }
    //komentar adalah kode program yang tidak akan masuk ke dalam kompilasi
    
    //ini adalah komentar single line atau hanya membuat komentar dalam 1 line atau baris

    /*
    ini adalah komentar
    multi Line
    yang memungkinkan untuk membuat komentar dengan banyak baris
     */

    /**
     * ini adalah komentar java documentation
     * fungsinya untuk membuat dokumentasi
     * @parameter ini untuk menjelaskan parameter
     * @return untuk menjelaskan return
     */

    //contoh

    /**
     * Method untuk menjumlahkan angka1 dan angka2
     * @param angka1 adalah angka pertama
     * @param angka2 adalah angka kedua
     * @return adalah hasil dari penjumlahan angka1 dan angka2
     */

    //@param dan @return otomatis dibuat ketika kita menggunakan java documentation setelah membuat method
    //dan gunakan @ kemudian ctrl + spasi untuk membuat keyword yang ingin didokumentasikan di dalam java documentation


    static int sum(int angka1, int angka2){
        //membuat hasil angka1 ditambah angka2
        return angka1 + angka2;
    }
}

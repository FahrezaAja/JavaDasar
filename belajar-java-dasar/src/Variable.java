public class Variable {
    public static void main(String[] args) {


        String nama;
        nama = "Fahreza Mandala Putra";

        int umur = 20;
        String alamat = "Yogyakarta";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);

        nama = "eja";
        System.out.println(nama);

        //dengan var kita dapat dengan mudah membuat variabel tanpa harus melihat apa yang dibutuhkan seperti perbedaan int dengan string
        //bisa menggunakan var namun harus langsung diinisialisasi, karena dia akan error ketika tidak langsung diinisialisasi
        var kuliah = "UAD";
        System.out.println(kuliah);

        //gunakan kata kunci final jika tidak ingin nilai dari variabel berubah
        //setelah final baru menggunakan kata kunci dari tipe data yang lain
        //jika kita menggunakan variabel yang sama, maka akan terjadi error jika menggunakan setelah maupun sebelum tipe data final
        final String game = "Mobile legeng";



    }
}

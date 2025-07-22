public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //tipe data bukan primitif selalu menghasilkan nilai null jika tidak diberi nilai
        //namun tipe data primitif juga memiliki sifat tidak primitifnya
        //contoh:
        //int menjadi Integer, long menjadi Long, boolean menjadi Boolean, semua sama kecuali char menjadi Character

        Integer iniINT = 10;
        Double iniDOUBLE = 20.0;

        Byte iniBYTE; //null
        //jika kita menambahkan nilai null maka dia akan bisa diinisialisasi
        Short iniSHORT = null;

        System.out.println("iniINT = " + iniINT);
        System.out.println("iniDOUBLE = " + iniDOUBLE);
//        System.out.println("iniBYTE = " + iniBYTE); ini akan error karena variabel iniBYTE bernilai null dan tidak diinisialisasi
        System.out.println("iniSHORT = " + iniSHORT);
        iniSHORT = 10;
        System.out.println("iniSHORT = " + iniSHORT); //maka penetapan nilai dari null menjadi 10

        //konversi dari primitif ke bukan primitif atau sebaliknya
        int umur = 20;
        Integer umurOBJEK = umur;
        System.out.println("umurOBJEK = " + umurOBJEK);
        int kembaliUMUR = umurOBJEK;
        System.out.println("kembaliUMUR = " + kembaliUMUR);

        //jika value dari tipe datanya berbeda maka gunakan ini
        short umurkecil = umurOBJEK.shortValue();//dan seterusnya dapat menggunakan byteValue();, dll
        //khusus primitif dapat menggunakan short value



    }
}

public class KonversiNumber {
    public static void main(String[] args) {

        byte IniByte = 100;

        // konversi secara otomatis dan wajib dengan bytes yang lebih tinggi
        short IniShort = IniByte;

        int IniInt = IniShort;
        long IniLong = IniInt;
        float IniFloat = IniLong;
        double IniDouble = IniLong;
        //jika ingin konversi sebaliknya wajib secara manual/paksa seperti dibawah, namun harus berhati hati karena akan terjadi number overflow. atau akan ditambahkan dari minimum angka sampai maksimal angka hingga mencapai total angka yang bytesnya berada di atasnya

        float IniFloat2 = (float) IniDouble;
        long IniLong2 = (long) IniFloat2;
        int IniInt2 = (int) IniLong2;
        short IniShort2 = (short) IniInt2;
        byte IniByte2 = (byte) IniShort2;



    }
}

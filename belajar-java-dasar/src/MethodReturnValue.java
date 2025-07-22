public class MethodReturnValue {
    public static void main(String[] args) {
        var angkaPertama = 100;
        var angkaKedua = 200;
        var hasil = sum(angkaPertama, angkaKedua);

        System.out.println(hasil);

        var hasil2 = sum(200, 200);
        System.out.println(hasil2);

        System.out.println(sum(250, 250));

        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(300, "-", 250));
        System.out.println(hitung(300, "pilih", 250));


    }

    //jika ingin membuat method dengan return value maka harus mengganti void dengan tipe data
    static int sum(int a, int b){
        var total = a + b;
        return total; //di java, kita hanya bisa mengembalikan 1 data di sebuah method
    }


    static int hitung(int value1, String pilih, int value2){
        switch (pilih){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}

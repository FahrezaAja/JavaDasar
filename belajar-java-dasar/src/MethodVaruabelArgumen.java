public class MethodVaruabelArgumen {
    public static void main(String[] args) {
        int[] values ={
          80, 80 ,80 ,80 ,80
        };

        int[] values2 ={
                80, 50 ,50 ,50 ,80
        };

        sayCongrats("Fahreza", values);
        sayCongrats("Ujang", values2);

        System.out.println("DENGAN ARGUMEN");
        ucapSelamat("Sekar", 90, 90, 90, 90, 90);

    }

    static void sayCongrats(String name, int[] values){
        var total = 0;

        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length; //ini membuat rata rata

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }


    }
    //ketika gunakan argumen gunakan ... di akhir tipe data, dan argumen hanya bisa ditaruh di parameter paling akhir
    //argumen sama seperti array namun kita dapat langsung eksekusi tanpa harus membuat variabel lagi
    static void ucapSelamat(String name, int... values){
        var total = 0;

        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length; //ini membuat rata rata

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }

    }
}

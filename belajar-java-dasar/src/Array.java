public class Array {
    public static void main(String[] args) {


        String[] array = new String[3];
        array[0] = "Fahreza";
        array[1] = "Mandala";
        array[2] = "Putra";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        array[0] = "Kingking";
        System.out.println(array[0]);

        //atau bisa seperti ini

        String[] nama = {
                "Fahreza", "Mandala", "Putra"
        };
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        //atau
        int[] arrayINT = new int[]{
                1,2,3,4,5,6,7,8,9,
        };
        System.out.println(arrayINT[0]);
        System.out.println(arrayINT[1]);
        System.out.println(arrayINT[2]);

        //operasi array

        //1. mengambil data array dan mengubah nilai
        arrayINT[1] = 100;
        System.out.println(arrayINT[1]);
        //2. melihat panjang array
        System.out.println(arrayINT.length);

        //array di dalam array
        String[][] papipum = {
                {"Fahreza", "Mandala", "Putra"}, {"Sekar", "Mungil"}
        };

        System.out.println(papipum[0][0]);
        System.out.println(papipum[1][0]);



    }
}

public class ForEach {
    public static void main(String[] args) {

        //foreach adalah perulangan yang digunakan untuk mengakses seluruh data array secara otomatis

        String[] names = {
                "Fahreza", "Mandala", "Putra"
        };

        //mengambil seluruh data tanpa ForEach
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");
        //mengambil seluruh data secara otomatis atau menggunakan ForEach
        for (var name : names){
            System.out.print(name + " ");
        }
        //menggunakan foreach akan lebih cepat dan lebih sederhana jika kita ingin mengambil seluruh data array

    }
}

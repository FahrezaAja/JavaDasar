public class Break {
    public static void main(String[] args) {

        //kata kunci break digunakan ketika ingin menghentikan seluruh perulangan
        var counter = 1;
        while(true){
            System.out.println("Perulangan ke " + counter);
            counter++;
            //perulangan ini akan terus berjalan ketika dilakukan running karena selalu bernilai true
            //gunakan break untuk menghentikan seluruh perulangan
            if (counter > 10){
                break;
            }



        }
        System.out.println("Perulangan berhenti");
    }
}

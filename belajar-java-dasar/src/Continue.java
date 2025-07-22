public class Continue {
    public static void main(String[] args) {
        //continue digunakan ketika ingin menghentikan perulangan saat ini dan pindah ke perulangan selanjutnya
        for (int counter = 1; counter <= 100; counter++){
            if (counter % 2 == 0){
                //ketika hasil bernilai true maka akan dilompatkan ke perulangan selanjutnya dalam blok for pada saat ini
                //ketika contiue digunakan maka akan menghentikan perulangan dan lompat ke selanjutk=nya
                continue;
            }
            System.out.println("Perulangan ke " + counter);
        }
    }
}

public class RecursiveMethod {
    public static void main(String[] args) {

        //tanpa rekursif
        System.out.println(factorial(5));

        //dengan rekursif
        System.out.println(recursiveFactorial(5));


        //contoh error stackOverFlow
        //loop(10000000); //maka akan terjadi error stackOverFlow
    }

    //recursive method yaitu memanggil dirinya sendiri di dalam dirinya

    //contoh faktorial tanpa rekursif method

    static int factorial(int value){
        int result = 1;

        for( int counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }
    //contoh dengan rekursif

    static int recursiveFactorial(int value){
        if(value ==1){
            return 1;
        } else {
            return value * recursiveFactorial(value-1);
        }
    }

    //perlu kita ingat bahwa jika kita memanggil method di dalam dirinya maka java akan menyimpannya di dalam stack
    //jika terlalu dalam atau terlalu sering dipanggil maka akan terjadi error stack over flow karena stack yang menumpuk terlalu banyak
    //yang dimana error ini berdasarkan kekuatan memori laptop kita sendiri

    //contoh
    static void loop(int values){
        if(values == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke- " + values);
            loop(values - 1);
        }
    }


}

public class DoWhileLoop {
    public static void main(String[] args) {

        //Do While loop sama seperti while tetapi akan selalu dieksekusi minimal sekali
        //walaupun tidak bernilai true

        var counter = 100;

        do{
            System.out.println("Perulangan " + counter);
            counter++;
        } while(counter <= 10);


        var counter2 = 1;

        do{
            System.out.println("Perulangan ke- " + counter2);
            counter2++;
        } while(counter2 <= 10);
    }
}

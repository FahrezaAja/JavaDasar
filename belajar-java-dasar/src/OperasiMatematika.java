public class OperasiMatematika {

    public static void main(String[] args) {

        int angka1 = 100;
        int angka2 = 10;

        System.out.println(angka1 + angka2);
        System.out.println(angka1 - angka2);
        System.out.println(angka1 * angka2);
        System.out.println(angka1 / angka2);
        System.out.println(angka1 % angka2);


        //augmented assgnment
        int c = 100;
        c += 10; //ini seperti c = c + 10
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        //unary operator
        int d = +100; //tanda + tidak wajib karena default angka adalah positif
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);
        System.out.println(!true);
    }
}

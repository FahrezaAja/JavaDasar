public class IfStatement {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 75;

        if (nilai >=80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >=70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >=65 && absen >= 65) {
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Nilai Anda F");
        }
    }
}

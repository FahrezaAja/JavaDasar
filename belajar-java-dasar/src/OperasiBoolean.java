public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 14;
        var nilai = 90;

        var lulusAbsen = absen >=14;
        var lulusNilai = nilai >=85;

        var lulus = lulusAbsen && lulusNilai;;

        System.out.println(lulus);;
    }
}

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch(nilai){
            case "A":
                System.out.println("Selamat Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        //switch lambda
        switch(nilai){
            case "A" -> System.out.println("Selamat Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default ->{
                System.out.println("Mungkin anda salah jurusan");
            }

        }

        //kata kunci yield
        String ucapan; //ini yield
        switch(nilai){
            case "A" -> ucapan = "Selamat Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);

        //switch dengan yield
        String mantap = switch (nilai){
            case "A" :
                yield "Selamat Anda lulus dengan baik";
            case "B", "C" :
                yield "Anda lulus";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(mantap);

    }
}

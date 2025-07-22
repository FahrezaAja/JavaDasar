public class TernaryOperator {
    public static void main(String[] args) {

        int nilai = 75;
        String ucapan;

        if(nilai >= 75){
            ucapan = "Anda lulus";
        } else {
            ucapan = "Coba lagi";
        }
        System.out.println(ucapan);

        //ternary operator
        //ternary operator sama seperti if statement namun jika hanya ada true dan false maka lebih
        //sederhana menggunakan ternary operator. Bagian kiri untuk true, dan kanan untuk false
        String ucapucap = nilai >= 75 ? "Anda lulus" : "Coba lagi";
        System.out.println(ucapucap);
        //ternary lebih cepat dan lebih sederhana dibanding dengan if statement

    }
}

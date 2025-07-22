public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Fahreza", "Aja");
        sayHello("Sekar", "Gemoy");

    }
    //parameter tidak memiliki batas, jadi bisa masukkan seberapa banyak yang kita inginkan
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}

public class Scope {
    public static void main(String[] args) {
        sayHello("Fahreza");
        sayHello("");

    }

    //scope adalah variabel yang bisa di akses dalam suatu area
    //jika variabel dibuat di dalam 1 blok, maka hanya bisa di akses di blok yang sama

    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello); //ini tidak error karena variabel hello berada di satu scope atau di blok yang sama
        //System.out.println(hi); //ini error karena hi berbeda scope atau tidak di dalam 1 blok yang sama
    }
}

public class MethodAtauFunction {
    public static void main(String[] args) {
        //jika ingin memanggil method, kita hanya perlu menyebutkan nama dari methodnya atau function ke dalam
        //psvm atau main function
        sayHelloWorld();
        sayHelloWorld();
        sayHelloWorld();
    }
    //ini adalah method atau function, dan function static hanya dapat memanggil function static
    //untuk membuat method gunakan kata kunci static void
    static void sayHelloWorld(){
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }
}

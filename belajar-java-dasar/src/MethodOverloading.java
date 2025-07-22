public class MethodOverloading {
    public static void main(String[] args) {
        //normalnya jika kita membuat method atau fungsi yang sama, program akan error
        //namun jika memiliki parameter yang berbeda, maka program tidak akan error

        //hello1
        sayHello();
        //hello2
        sayHello("Fahreza");
        //hello3
        sayHello("Sekar", "Ayu");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}

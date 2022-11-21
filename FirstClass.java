public class FirstClass {
    public static void main(String[] args) {
        sayHelloWorld();
        String name = "Soso";
        String str1 = sayHelloName(name);
        System.out.println(str1);
    }

        static void sayHelloWorld (){
            System.out.println("Hello World");
        }
        static String sayHelloName (String name){
            String str = "Hello " + name + "!";
            return str;
        }
    }


public class Hello {
    
    

    public static void main(String[] args) {

        greet(getName());

    }
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!" );
    }
    public static String getName() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        return name;
    }
}
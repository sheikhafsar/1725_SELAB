public class Main {

    public static void main(String[] args) {
        Logger ob1 = Logger.getInstance();
        Logger ob2 = Logger.getInstance();

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
    }
}

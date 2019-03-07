public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new DataConnectionOnState());
        context.info();

        context.setState(new DataConnectionOffState());
        context.info();
    }
}

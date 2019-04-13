public class Main {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Afsar");
        access.grantInternetAccess();
    }
}

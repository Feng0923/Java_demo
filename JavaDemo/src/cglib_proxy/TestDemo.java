package cglib_proxy;

public class TestDemo {
    public static void main(String[] args) {
        BookFacadeCglib bookFacadeCglib = new BookFacadeCglib();
        BookDAO instace = (BookDAO) bookFacadeCglib.getInstace(new BookDAOImpl());
        instace.addBook();

    }
}

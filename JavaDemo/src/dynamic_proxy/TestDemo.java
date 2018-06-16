package dynamic_proxy;

public class TestDemo {
    public static void main(String[] args) {
        BookFacadeProxy bookFacadeProxy = new BookFacadeProxy();
        BookFacade bookFacade = (BookFacade) bookFacadeProxy.bind(new BookFacadeImpl());
        bookFacade.addBook();
    }
}

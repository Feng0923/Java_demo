package cglib_proxy;

public class BookDAOImpl implements BookDAO{

    @Override
    public void addBook() {
        System.out.println("增加图书的方法");
    }
}

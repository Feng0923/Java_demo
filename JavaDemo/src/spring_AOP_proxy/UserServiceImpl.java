package spring_AOP_proxy;

public class UserServiceImpl implements UserService {
    @Override
    public String getUser(String userId) {
        System.out.println("this is getUser() method");
        return "user";
    }

    @Override
    public void addUser() {
        System.out.println("this is addUser() method");
    }
}

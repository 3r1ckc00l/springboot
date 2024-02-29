package localhost.test.local;

public class ConsoleHelloService implements HelloService {
    public ConsoleHelloService() {
    }

    @Override
    public void KatakanHai(String s) {
        System.out.println(s);
    }
}

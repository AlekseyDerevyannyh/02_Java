public class ManTest {

    public static void main (String[] args) {
        Man man1 = new Man();
        man1.setName("Aleksey");
        System.out.println("Man1 = " + man1.getName());

        doSomething(man1);
        System.out.println("Man1 = " + man1.getName());

    }

    public static void doSomething(Man man) {
        man.setName("Kulibin");
    }
}

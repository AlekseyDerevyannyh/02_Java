public class Man {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public static void main (String[] args) {
        Man man1 = new Man();
        man1.setName("Aleksey");
        System.out.println("Man1 = " + man1.getName());
        
        Man man2 = new Man();
        man2.setName("Ivan");
        System.out.println("Man2 = " + man2.getName());

        Man man3 = man1;
        System.out.println("Man3 = " + man3.getName());

        man3.setName("Kulibin");
        System.out.println("Man3 = " + man3.getName());
        System.out.println("Man1 = " + man1.getName());


    }

}
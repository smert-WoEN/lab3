public class Main {
    public static void main(String[] args) {
        Human child = new Child();
        Human mother = new Mother();
        Human father = new Father();

        Cake sweetCake = new SweetCake();
        Ringable phone = new Phone();

        child.doSomething(null);
        sweetCake.setReadiness(true);
        mother.doSomething(sweetCake);
        phone.Ring();
        father.doSomething(phone);
    }
}

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class Main {
    public static void main(String[] args) {
        Human child = new Child();
        Human mother = new Mother();
        Human father = new Father();

        Cake sweetCake = new SweetCake();
        Ringable phone = new Phone();

        Room mainRoom = new MainRoom();
        Room kitchen = new Kitchen();
        Room smallRoom = new SmallRoom();

        mainRoom.setHumanRoom(true);
        child.doSomething(mainRoom, null, null);
        sweetCake.setReadiness(true);
        mainRoom.setHumanRoom(false);
        kitchen.setHumanRoom(true);
        mother.doSomething(sweetCake, mainRoom, kitchen);
        phone.Ring();
        smallRoom.setHumanRoom(true);
        father.doSomething(phone, mainRoom, smallRoom);
    }
}

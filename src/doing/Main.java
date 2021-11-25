package doing;

import superclasses.*;

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

        ChangeRoom changeRooms = new ChangeRooms();
        mainRoom.addHumanInRoom(child);
        mainRoom.addHumanInRoom(father);
        mainRoom.addHumanInRoom(mother);
        mainRoom.showHumanInRoom();
        child.doSomething(null);
        sweetCake.setReadiness(true);
        mother.doSomething(sweetCake);
        changeRooms.changeRoom(mother, mainRoom, kitchen);
        phone.ring();
        father.doSomething(phone);
        changeRooms.changeRoom(father, mainRoom, smallRoom);
    }
}

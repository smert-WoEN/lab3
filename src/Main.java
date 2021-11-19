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

        mainRoom.addHumanInRoom(child);
        mainRoom.addHumanInRoom(father);
        mainRoom.addHumanInRoom(mother);
        mainRoom.showHumanInRoom();
        child.doSomething(null);
        sweetCake.setReadiness(true);
        mother.doSomething(sweetCake);
        mainRoom.deleteHumanFromRoom(mother);
        kitchen.addHumanInRoom(mother);
        phone.Ring();
        father.doSomething(phone);
        mainRoom.deleteHumanFromRoom(father);
        smallRoom.addHumanInRoom(father);
    }
}

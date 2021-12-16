package lab4.doing;

import doing.ChangeRooms;
import doing.MainRoom;
import doing.Mother;
import lab4.superclasses.Car;
import lab4.superclasses.DayTime;
import lab4.superclasses.HumanMoreDoing;
import lab4.superclasses.Ladder;
import superclasses.ChangeRoom;
import superclasses.Human;
import superclasses.Room;

public class Main {
    public static void main(String[] args) {

        Car fireCar = new FireCar();
        Ladder fireCarLadder = new FireCarLadder();

        HumanMoreDoing karloson = new Karloson();
        HumanMoreDoing child = new Child();
        Human fille = new Fille();
        Human rulle = new Rulle();
        Human mother = new Mother();

        Room mainRoom = new MainRoom();
        Room smallHouse = new SmallHouse();

        mainRoom.addHumanInRoom(child);
        mainRoom.addHumanInRoom(rulle);
        mainRoom.addHumanInRoom(fille);
        mainRoom.addHumanInRoom(karloson);

        ChangeRoom changeRooms = new ChangeRooms();

        child.doSomething(null);
        rulle.doSomething(null);
        fille.doSomething(null);
        karloson.doSomething(null);
        child.doSomethingFirst(null);
        child.doSomethingSecond(null);
        changeRooms.changeRoom(child, mainRoom, smallHouse);
        changeRooms.changeRoom(karloson, mainRoom, smallHouse);
        child.doSomethingWithHuman(karloson);

        karloson.doSomethingSecond(null);
        child.doSomethingSecond(null);
        fireCar.moving();
        try {
            fireCarLadder.upLadder(fireCar);
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        fireCar.stop();
        try {
            fireCarLadder.extendLadder();
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        try {
            fireCarLadder.upLadder(fireCar);
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        try {
            fireCarLadder.extendLadder();
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        child.doSomethingThird(mother);
    }
}

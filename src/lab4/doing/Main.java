package lab4.doing;

import doing.ChangeRooms;
import doing.MainRoom;
import doing.Mother;
import lab4.superclasses.Car;
import lab4.superclasses.Comparator;
import lab4.superclasses.HumanMoreDoing;
import lab4.superclasses.Ladder;
import superclasses.ChangeRoom;
import superclasses.Human;
import superclasses.Room;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car fireCar = new FireCar();
        Ladder fireCarLadder = new FireCarLadder();

        HumanMoreDoing karloson = new Karloson();
        HumanMoreDoing child = new Child();
        Human fille = new People("Филле");
        Human rulle = new People("Рулле");
        Human mother = new Mother();

        Human[] humans = new Human[] {
                fille, rulle
        };


        Room mainRoom = new MainRoom();
        Room smallHouse = new SmallHouse();

        Arrays.stream(humans).forEach(mainRoom::addHumanInRoom);
        mainRoom.addHumanInRoom(child);
        mainRoom.addHumanInRoom(karloson);

        ChangeRoom changeRooms = new ChangeRooms();
        ComparatorHumans comparatorHumans = new ComparatorHumans();
        child.doSomething(null);
        Arrays.stream(humans).forEach(human -> human.doSomething(null));
        karloson.doSomething(null);
        child.doSomethingFirst(null);
        child.doSomethingSecond(null);
        changeRooms.changeRoom(child, mainRoom, smallHouse);
        changeRooms.changeRoom(karloson, mainRoom, smallHouse);
        try {
            comparatorHumans.comparator(child, karloson);
            System.out.println(child.doSomethingWithHuman(karloson));
        } catch (ChildCheckingException e) {
            e.printStackTrace(System.err);
        }

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
            fireCarLadder.extendLadder(fireCar);
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        try {
            fireCarLadder.upLadder(fireCar);
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        try {
            fireCarLadder.extendLadder(fireCar);
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        child.doSomethingThird(mother);
        comparatorHumans.unComparator(child, karloson);
        try {
            System.out.println(child.doSomethingWithHuman(mother));
        } catch (ChildCheckingException e) {
            e.printStackTrace(System.err);
        }
    }
}

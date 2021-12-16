package lab4.doing;

import doing.Child;
import lab4.superclasses.HumanMoreDoing;
import superclasses.Human;
import superclasses.MentalState;
//Малыш услышал, как Филле и Рулле вернулись в комнату и как Филле спросил:
// Услышав их ругань, Карлсон расхохотался так, что у него затрясся живот.
// Малыш тоже был сыт по горло сегодняшними проделками. Уже совсем стемнело,
// когда Малыш и Карлсон, взявшись за руки, побрели к маленькому домику,
// притаившемуся за трубой на крыше того дома, где жил Малыш. Когда они уже
// почти добрались до места, то услышали, как, сигналя сиреной, по улице
// мчится пожарная машина. С крыши они увидели, как пожарная машина
// остановилась у подъезда. Вокруг нее собралась толпа, но огня что-то нигде
// не было заметно. И все же от машины до самой крыши быстро выдвинулась длинная
// лестница, точь-в-точь такая, какая бывает у пожарных. Когда Малыш подумал
// об этом, он пожалел маму, и ему очень захотелось поскорее вернуться домой.

public class Karloson extends HumanMoreDoing {
    private static final String name = "Карлосон";

    @Override
    public void doSomething(Object o) {
        this.setMentalState(MentalState.LISTEN);
        System.out.println(this + " услышал");
        this.setMentalState(MentalState.LAUGHS);
        System.out.println(this + " расхохотался, что затрясся живот");
    }

    public Karloson() {
        super(name);
    }

    @Override
    public void doSomethingFirst(Object o) {

    }

    @Override
    public void doSomethingSecond(Object o) {
        this.setMentalState(MentalState.LISTEN);
        System.out.println(this + " услышал");
    }

    @Override
    public void doSomethingThird(Object o) {

    }

    @Override
    public String doSomethingWithHuman(Human human) {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Karloson;
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }
}

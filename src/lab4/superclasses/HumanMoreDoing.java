package lab4.superclasses;

import superclasses.Human;

public abstract class HumanMoreDoing extends Human {

    public HumanMoreDoing(String name) {
        super(name);
    }

    public abstract void doSomethingFirst(Object o);
    public abstract void doSomethingSecond(Object o);
    public abstract void doSomethingThird(Object o);
    public abstract void doSomethingWithHuman(Human human);
}

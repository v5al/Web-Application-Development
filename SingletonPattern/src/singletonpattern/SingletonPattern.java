package singletonpattern;
public class SingletonPattern {
    public static void main(String[] args) {
        //SingletonClass st = new SingletonClass();
        //SingletonClass st = new SingletonClass().sc
        //=> still can access it, so we need to put that instance obj as a private instance obj
        SingletonClass obj = SingletonClass.getInstance();
        obj.printInfo();
    }
}

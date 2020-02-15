package singletonpattern;


public class SingletonClass {
    private String name;
    private int id;
    private static SingletonClass sc = new SingletonClass();
    private SingletonClass(){}
    public void printInfo(){
        System.out.println("Id:"+id+" Name:"+name);
    }
    public static SingletonClass getInstance(){
        return sc;
    } 
}

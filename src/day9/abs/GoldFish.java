package day9.abs;

public abstract class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }
    public void eat() {
        System.out.println("고양이가 사료를 먹어요~");
    }
    public abstract void takeNap();



}

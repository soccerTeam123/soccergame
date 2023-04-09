package day9;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person("김철수",
                "000111-31231234",
                "대한민국",
                new BagPack(5, "샘소나이트"));

       // kim.name="김출수";
        kim.ssn = "02111-2222";
        kim.bagPack=new BagPack(3, "보세");
    }
}

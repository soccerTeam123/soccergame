package day9.quiz;

public class Main {
    public static void main(String[] args) {

        SmartPhone[] smartPhones = {
                new Galaxy("삼성"),
                new IPhone("아이폰")
        };

        for (SmartPhone smartPhone : smartPhones) {
            String message = smartPhone.information();
            System.out.println(message);
        }
    }
}

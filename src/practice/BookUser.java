package practice;

import day05.member.Gender;

public class BookUser {

    private String name;
    private int age;
    private Gender gender;
    private int couponCount;
    private Book[] rentBookList;

    public BookUser() {
    }

    public BookUser(String name, int age, Gender gender, int couponCount, Book[] rentBookList) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
        this.rentBookList = rentBookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public String getGenderToString(){
        return getGender() == Gender.MALE ? "남성" : "여성";
    }


    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public Book[] getRentBookList() {
        return rentBookList;
    }

    public void setRentBookList(Book[] rentBookList) {
        this.rentBookList = rentBookList;
    }
}

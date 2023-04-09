package practice;


import day05.member.Gender;
import day07.util.Utility;

import java.sql.SQLOutput;
import java.util.Scanner;

import static day05.member.Gender.*;
import static day07.util.Utility.*;


public class LibraryView {

    //    public static Scanner sc;
    private static LibraryRepository repository;
    //??

    static {
//        System.out.println("정적");
//        sc = new Scanner(System.in);
        repository = new LibraryRepository();//?
    }

    //회원정보 입력처리
    private static void makeNewBookUser() {
        System.out.println("\n회원정보를 입력해주세요");
        String name = input("# 이름 : ");
        int age = Integer.parseInt(input("# 나이 : "));
        Gender gender = inputGender();

        //입력받은 데이터 객체로 포장
        BookUser userInfo = new BookUser(); //이렇게 하면 묶임?
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);
        // Gender gender 없애고 (gender)자리에 inputGender() 넣는건안되나


        //입력받은 유저 객체를 저장소로 보내기
        repository.register(userInfo);

    }

    //정확한 성별 입력
    private static Gender inputGender() {
        while (true) {
            String inputGender = input("#성별(M/F): "); //ctrl alt v되고 필드에서는 안되는이유
            Gender gender;  //?
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = MALE;
                    return MALE;
                case 'F':
                    gender = FEMALE;
                    return FEMALE;
                default:
                    System.out.println("잘못입력하였습니다");
            }
        }
    }


    //화면처리
    public static void start() {
        makeNewBookUser();
        //메뉴띄우기
        while (true) {
            showMainScreen();

            selectMenu();
        }
    }

    private static void showMainScreen() {
        System.out.println("\n========도서메뉴=====");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램종료하기");

    }

    //메뉴번호를 입력받고 분기를 나눠주는 메서드
    private static void selectMenu() {

        String menuNum = input("-메뉴 번호");

        switch (menuNum) {
            case "1":
                //마이페이지: 가입한 회원정보 출력
                BookUser user = repository.findBookUser();
                System.out.println("\n ***회원님 정보 ****");
                System.out.println("#회원명 : "+user.getName());
                System.out.println("#나이 : "+user.getAge());
                System.out.println("#성별 : "+user.getGenderToString());
                System.out.println("#쿠폰개수 : "+user.getCouponCount());
                break;
            case "2":
                String[] infoList = repository.getBookInfoList();
                System.out.println("====모든도서정보====");
                for (String info: infoList) {
                    System.out.println(info);

                }
                break;
            case "3":
                break;
            case "4":
                break;
            case "9":
                System.out.println("# 프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("\n# 메뉴번호를 똑바로 입력하세요");

        }
    }


}

package SoccerList;

import day04.array.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayerRepository {

    Player player = new Player();
    private List<Player> playerList;


    private static Player[] perchaseList;

    static {
        perchaseList = new Player[]{
                new Player("드록바", "코트디부아르"),
                new Player("아자르", "벨기에"),
                new Player("레쉬포드", "잉글랜드"),
                new Player("손흥민", "대한민국"),
                new Player("무드리크", "우크라이나")
        };
    }

    // 1. 선수 검색
    public static void playerSearch() {


        for (int i = 0; i < perchaseList.length; i++) {


            String s = perchaseList[i].getNickname();
            String n = perchaseList[i].getNation();
            System.out.print(i + 1 + ".");
            System.out.printf("%5s : %5s\n", s, n);


        }


    }

    public static void PlayerPurchase() {
        Player[] myTeam=new Player[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 선수 이름을 입력하세요");
        String playerName = sc.nextLine();
        StringList list = new StringList();
        int i = 0;
        int j=0;

        while (true) {

            if (playerName.contains(perchaseList[i].getNickname())) {
                myTeam[j] = perchaseList[i];
                System.out.println(myTeam[j].getNickname());
                break;
            }
            i++;

        }

        //드록바


    }

}


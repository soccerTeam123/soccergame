package SoccerList;

import java.util.Scanner;

public class PlayerView {

    Scanner sc = new Scanner(System.in);

    public void view() {
        System.out.println("선택하세요.");
        System.out.println("1. 이적시장 선수검색 2. 선수 영입 3. 선수방출 4. 스카우트 추가");

        int selectNum = sc.nextInt();

        switch (selectNum) {
            case 1:
                PlayerRepository.playerSearch();
                break;
            case 2:
                PlayerRepository.PlayerPurchase();
                break;
            case 3:
            case 4:
            default:
        }



    }


}

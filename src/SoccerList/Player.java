package SoccerList;

import java.util.List;

public class Player {

    private String nickname;
    private String nation;



    public Player() {
    }

    public Player(String nickname, String nation) {
        this.nickname = nickname;
        this.nation = nation;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}

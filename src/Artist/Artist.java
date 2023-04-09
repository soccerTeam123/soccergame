package Artist;

import day04.array.StringList;

public class Artist {

    private String name;  // 가수 이름
    private StringList songList; // 노래 목록

    public Artist() {
    }

    public Artist(String name, StringList songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringList getSongList() {
        return songList;
    }

    public void setSongList(StringList songList) {
        this.songList = songList;
    }

    public void info() {
    }
}
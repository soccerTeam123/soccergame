package day10.day10.collection.List;

import Artist.Artist;
import day07.util.Utility;
import day08.poly.car.Stinger;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        //put(K,V):데이터추가
        map.put("지갑잔액",5000);
        map.put("좋아하는 가수",new Artist("동방신기",null));
        map.put("저녁메뉴","볶음밥");

        System.out.println(map.size());

        //get(key) : 데이터 참조
        String dinner = (String) map.get("저녁메뉴");
        System.out.println("dinner ="+dinner);

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info();

        System.out.println(map);

        map.put("저녁메뉴","짬뽕");
        System.out.println(map);

        //반복문 처리
        for(String key:map.keySet()){
            System.out.println("key ="+key);
            System.out.println("value ="+map.get(key));
            Utility.makeLine();
        }
    }
}

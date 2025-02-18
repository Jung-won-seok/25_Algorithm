package programmers;

import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        //["119", "97674223", "1195524421"] return = false
        //["12","123","1235","567","88"] return = false

        Map<String, Integer> map = new HashMap<>();

        //모든 phone 번호 hashMap에 담기
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
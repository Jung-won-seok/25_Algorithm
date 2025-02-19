package programmers;

import java.util.HashMap;
import java.util.Map;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] g = {"classic", "pop", "classic", "classic", "pop"};
        int[] p = {500, 600, 150, 800, 2500};
        solution(g, p);
    }
    public static int[] solution(String[] genres, int[] plays) {
        //genres = ["classic", "pop", "classic", "classic", "pop"]
        //plays = [500, 600, 150, 800, 2500]
        //return = [4, 1, 3, 0]

        //장르별 재생횟수 조사
        Map<String, Integer> genreTotalPlay = new HashMap<>();
        for(int i=0 ; i<genres.length ; i++) {
            genreTotalPlay.put(genres[i], genreTotalPlay.getOrDefault(genres[i], 0) + plays[i]);
        }

        //재생 횟수가 많은 장르를 앞으로 정렬


        //장르별 2개의 노래만 앨범 수록 가능


        //노래의 인덱스를 return


        int[] answer = {};
        return answer;
    }
}

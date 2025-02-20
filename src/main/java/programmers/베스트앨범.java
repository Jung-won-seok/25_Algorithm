package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] g = {"classic", "pop", "classic", "classic", "pop"};
        int[] p = {500, 600, 150, 800, 2500};
        for(int a : solution(g, p)) {
            System.out.println(a);
        }
//        solution(g, p);
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
        //genreTotalPlay의 key를 List로 변환
        List<String> sortedGenres = new ArrayList<>(genreTotalPlay.keySet());

        //총 재생 횟수를 기준으로 내림차순 정렬
        sortedGenres.sort((g1, g2)-> genreTotalPlay.get(g2) - genreTotalPlay.get(g1));

        //장르별 재생 횟수에 따른 정렬
        List<Integer> result = new ArrayList<>();
        for(String genre : sortedGenres) {
            List<int[]> song = new ArrayList<>();
            for(int i=0 ; i<genres.length ; i++) {
                if(genres[i].equals(genre)) {
                    song.add(new int[]{i, plays[i]});
                }
            }
            //재생 횟수에 따라 내림차순으로 정렬
            song.sort((a, b)-> {
                if (b[1] != a[1]) {
                    return b[1] - a[1];
                } else {
                    return a[0] - b[0];
                }
            });

            //장르에 속하는 곡들 2곡만 순서대로 결과에 추가
            result.add(song.get(0)[0]);
            if (song.size() > 1) {
                result.add(song.get(1)[0]);
            }
        }

        //List를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}

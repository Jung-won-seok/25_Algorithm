package programmers;

public class 최소직사각형 {
    //[[60, 50], [30, 70], [60, 30], [80, 40]] -> 4000
    //[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]] -> 120

    public int solution(int[][] sizes) {

        int length_max = Math.max(sizes[0][0], sizes[0][1]);
        int height_max = Math.min(sizes[0][0], sizes[0][1]);

        for (int i = 1; i < sizes.length; i++) {

            if (length_max < Math.max(sizes[i][0], sizes[i][1])) {
                length_max = Math.max(sizes[i][0], sizes[i][1]); //70
            }

            if (height_max < Math.min(sizes[i][0], sizes[i][1])) {
                height_max = Math.min(sizes[i][0], sizes[i][1]); //50
            }

        }
        int answer = length_max * height_max;
        return answer;
    }
}

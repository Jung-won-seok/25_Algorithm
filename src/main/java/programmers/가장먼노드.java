package programmers;

public class 가장먼노드 {
    public static void main(String[] args) {
        int[][] a ={ {3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2} };
        for(int i=0 ; i<a.length ; i++) {
            if (a[i][0] == 1) {

            }
        }
    }
    public int solution(int n, int[][] edge) {
        //n = 6, edge[][] = [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]], return = 3

        int[] distance = new int[n];
        distance[0] = 0;
        //1과 인접한 노드는 거리=1
        for (int i = 0; i < edge.length; i++) {
            if(edge[i][0] == 1) {
                distance[edge[i][1]-1] = 1;
            } else if (edge[i][1] == 1) {
                distance[edge[i][0]-1] = 1;
            }
        }

        //2, 3, 4, 5, 6과 1의 거리를 찾는다.
        //가장 먼 것들의 갯수를 return 한다.
        int answer = 0;
        return answer;
    }
}
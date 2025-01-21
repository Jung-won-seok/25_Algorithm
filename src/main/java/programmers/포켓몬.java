package programmers;

import java.util.Arrays;

public class 포켓몬 {

    public int solution(int[] nums) {
        //ex) nums[] = [3,3,3,2,2,4] -> answer=3
        //ex) nums[] = [3,3,3,2,2,2] -> answer=2

        Arrays.sort(nums);

        int a = nums[0];
        int cnt = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if (a != nums[i]) {
                cnt++;
                a = nums[i];
            }
        }

        if (nums.length / 2 >= cnt) {
            return cnt;
        } else {
            return nums.length/2;
        }
    }
}
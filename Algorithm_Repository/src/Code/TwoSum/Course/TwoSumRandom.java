package Code.TwoSum.Course;

import InputsLib.InputsForTwoNumberSum;

import java.util.Random;


public class TwoSumRandom {
    public int[] twoSumRandom(int[] nums,int target){
        int[] ret = new int[2];

        Random r = new Random();
        int len = nums.length;
        for(int count=0;count<= 10*len*len;count++) {
            int i = r.nextInt(nums.length);
            int j;
            do{
                j = r.nextInt(nums.length);
            }while (i==j);//筛选跳过两个数相等的情况
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
        }
      return ret;
      }


    public static void main(String args[]){
        InputsForTwoNumberSum inputs = new InputsForTwoNumberSum(numstr:"2,7,11,15",target:"26");
        TwoSumRandom ins = new TwoSumRandom();
        for(int i:ins.twoSumRandom(inputs.nums,inputs.target)){
            System.out.println(i);
        }
    }
}


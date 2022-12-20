package Code.TwoSum.Course;

import InputsLib.InputsForTwoNumberSum;
//暴力求解

public class TwoSumDeRandom {
    public int[] twoSumDeRandom(int[] nums,int target){
        int[] ret = new int[2];

        for(int i =0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main(String args[]) {
        InputsForTwoNumberSum inputs = new InputsForTwoNumberSum("3,9,2,7,11,15","26");
        TwoSumDeRandom ins = new TwoSumDeRandom();
        for(int i : ins.twoSumDeRandom(inputs.nums,inputs.target)){
            System.out.println(i);
        }

    }

}
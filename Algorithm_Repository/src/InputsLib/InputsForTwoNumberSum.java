package InputsLib;

import Code.TwoSum.Course.TwoSumDeRandom;

public class InputsForTwoNumberSum {
    public int[] nums;
    public int target = 9;

    public InputsForTwoNumberSum(String numstr, String target) {
        String[] numberList = numstr.split(",");
        this.nums = new int[numberList.length];

        for(int i = 0; i < numberList.length; ++i) {
            this.nums[i] = Integer.parseInt(numberList[i]);
        }

        this.target = Integer.parseInt(target);
    }
}

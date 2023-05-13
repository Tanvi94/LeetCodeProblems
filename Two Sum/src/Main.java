import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length -1;i++){
            for(int j = i+1; j < nums.length;j++){
                if(nums[i]+nums[j] == target){
                    System.out.println("Elements are whose sum is "+target+" are"+" "+nums[i]+" "+nums[j]);
                    result[index] = i;
                    index = index +1;
                    result[index] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int[] result=twoSum(nums,target);
        Arrays.stream(result).forEach(i->System.out.println(i));

    }
}
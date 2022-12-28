import java.util.HashMap;
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateHashmap = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(duplicateHashmap.containsKey(num)){
                return true;
            } else {
                duplicateHashmap.put(num, 1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] testArrayOne = new int[]{1,2,3,1};
        containsDuplicate(testArrayOne);
        int[] testArrayTwo = new int[]{1,2,3,4};
        containsDuplicate(testArrayTwo);
        int[] testArrayThree = new int[]{1,1,1,3,3,4,3,2,4,2};
        containsDuplicate(testArrayThree);
    }
}
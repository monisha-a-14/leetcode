class Solution {
    public int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers together
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }
        
        // Step 2: Get the lowest bit where the two unique numbers differ
        // Using a long prevents integer overflow bugs
        int lowestBit = xorResult & -xorResult;
        
        int num1 = 0;
        int num2 = 0;
        
        // Step 3: Separate the numbers into two groups and find the answers
        for (int num : nums) {
            if ((num & lowestBit) == 0) {
                num1 ^= num; // Group A
            } else {
                num2 ^= num; // Group B
            }
        }
        
        return new int[]{num1, num2};
    }
}
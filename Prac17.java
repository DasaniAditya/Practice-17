//Max chunks to make sorted

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int indexCount = 0;
        int rSum = 0;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            indexCount += i;
            rSum += arr[i];
            if(indexCount == rSum) {
                result++;
            }
        }
        return result;
    }
}

//Divide array in sets of k consecutive numbers

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        
        int[] buckets = new int[k];
        
        for(int i = 0 ; i < nums.length; i++) {
            if(i % k != 0 && nums[i] - nums[i-1] > 1) {
                return false;
            }
            buckets[nums[i] % k]++;
        }
        int temp = buckets[0];
        for(int i : buckets) {
            if(i != temp) {
                return false;
            }
        }
        return true;
        
    }
}

/*217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3. */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>intSet = new HashSet<>();
        for(int num:nums){
            if(intSet.contains(num)){
                return true;
            }
            intSet.add(num);
        }
        return false;
    }
}

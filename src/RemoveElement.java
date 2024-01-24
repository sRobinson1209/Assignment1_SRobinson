public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        // create the starting element
        int index =0; //O(1)
        //iterate through the loop for the length of the nums array
        for (int i=0; i <nums.length; i++){ //O(n)
            //iterate through until the i element == the taregt val
            if (nums[i] != val){ //O(1)
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

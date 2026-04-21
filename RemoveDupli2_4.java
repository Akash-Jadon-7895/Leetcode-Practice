public class RemoveDupli2_4 {
  public static int removeDuplicates(int[] nums) {
    int k = 2;

    for (int i = 2; i < nums.length; i++) {
      if (nums[i] != nums[k - 2]) {
        nums[k] = nums[i];
        k++;
      }
    }

    return k;
  }

  public static void main(String[] args) {

    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int newLength = removeDuplicates(nums);
    System.out.println("New length: " + newLength);
    System.out.print("Modified array: ");
    for (int i = 0; i < newLength; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}

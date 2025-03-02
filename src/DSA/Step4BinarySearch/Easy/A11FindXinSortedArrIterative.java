package DSA.Step4BinarySearch.Easy;

public class A11FindXinSortedArrIterative {

    public static int binarySearch(int[] nums, int target) {
        int l = nums.length; 
        int s = 0, e = l - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 9;
        int ans = binarySearch(arr, target);
        
        System.out.print(ans);
    }
}

package PracticeViaVierma.CompanyPractice.Company17;


    public class MajorityElement {
        public static int findMajorityElement(int[] nums) {
            int majorityElement = nums[0];
            int count = 1;

            for (int i = 1; i < nums.length; i++) {
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                } else if (nums[i] == majorityElement) {
                    count++;
                } else {
                    count--;
                }
            }

            // At this point, majorityElement contains a potential majority element.
            // You should verify if it is the majority element by counting its occurrences.

            int occurrences = 0;
            for (int num : nums) {
                if (num == majorityElement) {
                    occurrences++;
                }
            }

            if (occurrences > nums.length / 2) {
                return majorityElement;
            } else {
                return -1; // No majority element found
            }
        }

        public static void main(String[] args) {
            int[] nums = {2, 2, 3, 4, 2, 5, 2, 2};
            int majorityElement = findMajorityElement(nums);

            if (majorityElement != -1) {
                System.out.println("Majority Element: " + majorityElement);
            } else {
                System.out.println("No majority element found.");
            }
        }
    }



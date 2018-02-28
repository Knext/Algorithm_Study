package leetCode.easy;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//중복된 수는 존재하고, 해결 방법은 1가지만 존재한다.
//두개의 지시자를 왼쪽에서 오른쪽, 오른쪽에서 왼쪽으로 이동하면서 값을 찾는다.

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
//        return bruteForce(numbers, target);
        return binarySearch(numbers, target);
    }

    private int[] binarySearch(int[] numbers, int target) {
        int [] result = new int[2];
        int L = 0;
        int R = numbers.length -1;
        while (L < R) {
            if (numbers[L] + numbers[R] == target) {
                result[0] = L +1;
                result[1] = R +1;
                return result;
            } else if (numbers[L] + numbers[R] < target) {
                L++;
            } else {
                R--;
            }
        }

        return result;
    }

    private int[] bruteForce(int[] numbers, int target) {
        int [] result = new int[2];
        //bruteforce 방법은 O(N*(N-1))이라 time-out.. 역시나..-_-;
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (prev == numbers[i]) continue; //요렇게 꼼수로 통과는 하지만...
            for (int j = i+1; j < numbers.length; j++) {
                if ( (numbers[i] + numbers[j]) == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                }
            }

            prev = numbers[i];
        }

        return result;
    }
}

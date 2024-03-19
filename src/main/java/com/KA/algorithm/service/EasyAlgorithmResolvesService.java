package com.KA.algorithm.service;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EasyAlgorithmResolvesService {

    public Map<Integer, Integer> findSumsForTarget(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Map<Integer, Integer> solution = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int answer = target - nums[i];

            if (set.contains(answer)) {
                solution.put(nums[i], answer);
                set.remove(nums[i]);
                set.remove(answer);
            }
        }

        return solution;
    }

    public boolean isPalindrome(long number) {
        String num = String.valueOf(number);
        int length = num.length();

        for (int i = 0; i < (length / 2); i++) {
            if (num.charAt(i) != num.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean isContainsDuplicate(int[] nums) {
        Set<Integer> numbers = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        return !(nums.length == numbers.size());
    }

    public int reverseInteger(int num) {
        String nums = String.valueOf(num);
        StringBuilder builder = new StringBuilder();

        for (int i = nums.length() - 1; i >= 0; i--) {
            builder.append(nums.charAt(i));
        }

        String reversed = builder.toString();

        return Integer.parseInt(reversed);
    }

    public int searchInsertPosition(int[] array, int target) {
        int start = 0;
        int end = array.length;

        if (array[start] > target) {
            return 0;
        } else if (array[end - 1] < target) {
            return end;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] == target) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}

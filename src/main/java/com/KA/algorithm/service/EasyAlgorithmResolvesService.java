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


}

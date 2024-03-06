package com.KA.algorithm.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor

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
}

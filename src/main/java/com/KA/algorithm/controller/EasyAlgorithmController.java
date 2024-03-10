package com.KA.algorithm.controller;

import com.KA.algorithm.service.EasyAlgorithmResolvesService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/algorithms")
@RequiredArgsConstructor
@Validated
public class EasyAlgorithmController {

    private final EasyAlgorithmResolvesService ars;

    @GetMapping("/twoSum")
    public Map<Integer, Integer> findSumsForTarget(@RequestParam(name = "nums") int[] nums,
                                                   @RequestParam(name = "target") int target) {
        return ars.findSumsForTarget(nums, target);
    }

    @GetMapping("/isPalindrome")
    public boolean isPalindrome(@RequestParam(name = "number") long number) {
        return ars.isPalindrome(number);
    }

    @GetMapping("isContainsDuplicate")
    public boolean isContainsDuplicate(@RequestParam(name = "nums") int[] nums) {
        return ars.isContainsDuplicate(nums);
    }
}

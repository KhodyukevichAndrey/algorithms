package com.KA.algorithm.controller;

import com.KA.algorithm.service.MediumAlgorithmResolvesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mediumAlgorithm")
public class MediumAlgorithmController {
    private final MediumAlgorithmResolvesService service;

    @GetMapping("/substring")
    public int getLongestSizeSubstring(@RequestParam(name = "word") String word) {
        return service.lengthOfLongestSubstring(word);
    }
}

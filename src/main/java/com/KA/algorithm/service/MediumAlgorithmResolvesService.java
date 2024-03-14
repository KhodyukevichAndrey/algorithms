package com.KA.algorithm.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MediumAlgorithmResolvesService {

    public int lengthOfLongestSubstring(String word) {
        int n = word.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(word.charAt(right))) {
                charSet.add(word.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(word.charAt(right))) {
                    charSet.remove(word.charAt(left));
                    left++;
                }
                charSet.add(word.charAt(right));
            }
        }
        return maxLength;
    }
}

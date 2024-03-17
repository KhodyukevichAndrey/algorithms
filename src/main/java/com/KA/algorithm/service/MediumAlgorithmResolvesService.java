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

    public int lengthOfLongestPalindromic(String word) {
        int maxLength = 0;
        int n = word.length();

        if (isPalindrome(word)) {
            return n;
        }

        for (int j = 0; j < n; j++) {
            if (maxLength > word.substring(j, n).length()) {
                break;
            }

            for (int i = n; i >= 0; i--) {
                String sub = word.substring(j, i);
                if (isPalindrome(sub)) {
                    maxLength = Math.max(maxLength, sub.length());
                    break;
                }
            }
        }

        return maxLength;
    }

    private boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

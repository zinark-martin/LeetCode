package LeetCode;
import	java.util.HashMap;
/*
14th question from LeetCode
description of the question:
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

*/

import java.util.Collections;
import java.util.Map;

public class _14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String carry = "";
        carry = strs[0];
        //set i to travel the String array
        for (int i = 1; i < strs.length; i++) {
            while(strs [i].indexOf(carry) != 0){
                if (carry.charAt(0) != strs [i].charAt(0)) break;
                //this loop will continue while the carry string is not included
                //in the current string && overlaps from the beginning
                carry = carry.substring(0, carry.length()-1);//cut short char by char
                if (carry.isEmpty()) break;
                //this means carry is not included in the current string at all
            }
        }
        return carry;
    }
}
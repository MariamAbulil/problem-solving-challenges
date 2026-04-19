Anagram Word Checker
Description
This project checks if two strings are anagrams (same characters with same frequency, different order).

Example
Input:  "cat", "tac"
Output: true

Approach
Check if both strings have the same length
Use a frequency array to count characters
Increment for one string and decrement for the other
If all values are zero → they are anagrams

Complexity
Time: O(n)
Space: O(1)

Run
javac Main.java

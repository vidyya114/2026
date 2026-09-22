# Sliding Window Pattern

## Concept
The Sliding Window pattern involves maintaining a sub-section (window) of data and moving it across a larger dataset to avoid redundant calculations.

## When to Use
- Problems involving subarrays or substrings of a specific size.
- Finding maximum/minimum sums of contiguous elements.
- Tracking frequency of characters in a contiguous block.

## Time & Space Complexity
- **Time Complexity:** O(n) - the window slides across the array once.
- **Space Complexity:** O(1) or O(k) depending on whether a frequency map is used.

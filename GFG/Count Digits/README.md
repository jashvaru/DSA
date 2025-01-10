# Digit Divisor Counter

## Problem Description

Given a positive integer `n`, the goal is to count the number of digits in `n` that divide `n` evenly (i.e., without leaving a remainder). Return the total number of such digits.

### Definition

A digit `d` of `n` divides `n` evenly if the remainder when `n` is divided by `d` is 0 (`n % d == 0`).

- Digits of `n` should be checked individually.
- If a digit is `0`, it should be ignored because division by `0` is undefined.

## Examples

### Example 1
**Input:**
```
n = 12
```
**Output:**
```
2
```
**Explanation:**
The digits `1` and `2` both divide `12` evenly.

### Example 2
**Input:**
```
n = 2446
```
**Output:**
```
1
```
**Explanation:**
Among the digits `2`, `4`, and `6`, only `2` divides `2446` evenly. The digits `4` and `6` do not.

### Example 3
**Input:**
```
n = 23
```
**Output:**
```
0
```
**Explanation:**
Neither `2` nor `3` divides `23` evenly.

## Constraints

- `1 <= n <= 10^5`

## Implementation

This problem can be solved by iterating through each digit of `n`, checking if it divides `n` evenly, and counting such digits. Digits that are `0` should be ignored during the check.

---
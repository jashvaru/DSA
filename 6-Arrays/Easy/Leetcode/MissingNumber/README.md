<h1>Missing Number</h1>

<p> Link to problem statement - <a href="https://leetcode.com/problems/missing-number/description/">Check if number is missing in array</a></p>

<p>Given an array <code>nums</code> containing <code>n</code> distinct numbers in the range <code>[0, n]</code>, return the only number in the range that is missing from the array.</p>

<h2>Example 1:</h2>

<pre>
<strong>Input:</strong> nums = [3,0,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.
</pre>

<h2>Example 2:</h2>

<pre>
<strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
2 is the missing number in the range since it does not appear in nums.
</pre>

<h2>Example 3:</h2>

<pre>
<strong>Input:</strong> nums = [9,6,4,2,3,5,7,0,1]
<strong>Output:</strong> 8
<strong>Explanation:</strong>
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
8 is the missing number in the range since it does not appear in nums.
</pre>

<h2>Constraints:</h2>

<ul>
  <li>n == nums.length</li>
  <li>1 <= n <= 10<sup>4</sup></li>
  <li>0 <= nums[i] <= n</li>
  <li>All the numbers of nums are unique.</li>
</ul>

<h1>Rearrange Array Elements by Sign</h1>

<p> Link to problem statement - <a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/description/">Alternate Positive and Negative</a></p>

<p>You are given a 0-indexed integer array <code>nums</code> of even length consisting of an equal number of positive and negative integers.</p>

<p>You should return the array of <code>nums</code> such that the array follows the given conditions:</p>

<ul>
  <li>Every consecutive pair of integers have opposite signs.</li>
  <li>For all integers with the same sign, the order in which they were present in <code>nums</code> is preserved.</li>
  <li>The rearranged array begins with a positive integer.</li>
</ul>

<p>Return the modified array after rearranging the elements to satisfy the aforementioned conditions.</p>

<h2>Example 1:</h2>

<pre>
<strong>Input:</strong> nums = [3,1,-2,-5,2,-4]
<strong>Output:</strong> [3,-2,1,-5,2,-4]
<strong>Explanation:</strong> 
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4]. 
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4]. 
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
</pre>

<h2>Example 2:</h2>

<pre>
<strong>Input:</strong> nums = [-1,1]
<strong>Output:</strong> [1,-1]
<strong>Explanation:</strong> 
1 is the only positive integer and -1 the only negative integer in nums. 
So nums is rearranged to [1,-1].
</pre>

<h2>Constraints:</h2>

<ul>
  <li>2 <= nums.length <= 2 * 10<sup>5</sup></li>
  <li>nums.length is even</li>
  <li>1 <= |nums[i]| <= 10<sup>5</sup></li>
  <li>nums consists of equal number of positive and negative integers.</li>
</ul>

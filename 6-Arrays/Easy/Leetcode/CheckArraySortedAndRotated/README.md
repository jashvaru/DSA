<h1>Check if an Array is a Rotated Sorted Array</h1>

<p> Link to problem statement - <a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/">Check if an Array is a Rotated Sorted Array</a></p>

<p>The task is to determine whether a given array <code>nums[]</code> was originally sorted in non-decreasing order and then rotated some number of times (including zero). If so, return <code>true</code>; otherwise, return <code>false</code>.</p>

<h2>Definition</h2>
<ul>
  <li>An array <code>A</code> rotated by <code>x</code> positions results in an array <code>B</code> of the same length such that:
    <pre>A[i] == B[(i + x) % A.length]</pre>
  </li>
</ul>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>nums = [3,4,5,1,2]</pre>
<p><strong>Output:</strong></p>
<pre>true</pre>
<p><strong>Explanation:</strong> The original sorted array is <code>[1,2,3,4,5]</code>. By rotating it 3 positions, we get <code>[3,4,5,1,2]</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>nums = [2,1,3,4]</pre>
<p><strong>Output:</strong></p>
<pre>false</pre>
<p><strong>Explanation:</strong> There is no sorted array that can be rotated to match <code>nums</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>nums = [1,2,3]</pre>
<p><strong>Output:</strong></p>
<pre>true</pre>
<p><strong>Explanation:</strong> The array is already sorted and requires zero rotations.</p>

<h2>Approach</h2>
<ol>
  <li>Count the number of times the order of elements breaks (i.e., when <code>nums[i] > nums[i+1]</code>).</li>
  <li>If this count is at most 1, then the array is a rotated sorted array.</li>
  <li>If the count is more than 1, return <code>false</code>.</li>
  <li>Special case: If the array is already sorted with no rotations, return <code>true</code>.</li>
</ol>

<h2>Time and Space Complexity</h2>
<ul>
  <li><strong>Time Complexity:</strong> O(n), where <code>n</code> is the length of the array (single pass).</li>
  <li><strong>Space Complexity:</strong> O(1), since no extra space is used.</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>nums.length</code> ≤ 100</li>
  <li>1 ≤ <code>nums[i]</code> ≤ 100</li>
</ul>
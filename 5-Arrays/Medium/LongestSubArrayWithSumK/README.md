<h1>Longest Subarray with Given Sum K</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1">Longest Sub array with sum K</a></p>

<p>Given an array <code>arr[]</code> containing integers and an integer <code>k</code>, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value <code>k</code>. If there is no subarray with sum equal to <code>k</code>, return <code>0</code>.</p>

<h2>Example 1:</h2>

<pre>
<strong>Input:</strong> arr[] = [10, 5, 2, 7, 1, -10], k = 15
<strong>Output:</strong> 6
<strong>Explanation:</strong> 
Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. 
The length of the longest subarray with a sum of 15 is 6.
</pre>

<h2>Example 2:</h2>

<pre>
<strong>Input:</strong> arr[] = [-5, 8, -14, 2, 4, 12], k = -5
<strong>Output:</strong> 5
<strong>Explanation:</strong> 
Only subarray with sum = -5 is [-5, 8, -14, 2, 4] of length 5.
</pre>

<h2>Example 3:</h2>

<pre>
<strong>Input:</strong> arr[] = [10, -10, 20, 30], k = 5
<strong>Output:</strong> 0
<strong>Explanation:</strong> 
No subarray with sum = 5 is present in arr[].
</pre>

<h2>Constraints:</h2>

<ul>
  <li>1 ≤ arr.size() ≤ 10<sup>5</sup></li>
  <li>-10<sup>4</sup> ≤ arr[i] ≤ 10<sup>4</sup></li>
  <li>-10<sup>9</sup> ≤ k ≤ 10<sup>9</sup></li>
</ul>
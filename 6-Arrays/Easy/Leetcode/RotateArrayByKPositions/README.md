<h1>Rotate Array Right by K Steps</h1>

<p>Given an integer array <code>nums</code>, rotate the array to the right by <code>k</code> steps, where <code>k</code> is non-negative.</p>

<h2>Example 1:</h2>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<h2>Example 2:</h2>

<pre>
<strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong>
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<h2>Constraints:</h2>

<ul>
  <li>1 <= nums.length <= 10<sup>5</sup></li>
  <li>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</li>
  <li>0 <= k <= 10<sup>5</sup></li>
</ul>
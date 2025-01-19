<h1>Reverse an Array</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/reverse-an-array/0">Reverse an Array</a></p>

<p>You are given an array of integers <code>arr[]</code>. Your task is to reverse the given array.</p>

<p><strong>Note:</strong> Modify the array in place.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr = [1, 4, 3, 2, 6, 5]</pre>
<p><strong>Output:</strong></p>
<pre>[5, 6, 2, 3, 4, 1]</pre>
<p><strong>Explanation:</strong> 
The elements of the array are 1, 4, 3, 2, 6, 5. After reversing the array:
- The first element goes to the last position.
- The second element goes to the second last position, and so on.  
Thus, the output is <code>[5, 6, 2, 3, 4, 1]</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr = [4, 5, 2]</pre>
<p><strong>Output:</strong></p>
<pre>[2, 5, 4]</pre>
<p><strong>Explanation:</strong> 
The elements of the array are 4, 5, 2. After reversing, the array becomes <code>[2, 5, 4]</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr = [1]</pre>
<p><strong>Output:</strong></p>
<pre>[1]</pre>
<p><strong>Explanation:</strong> 
The array has only one element, so the reversed array is the same as the original.</p>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ arr.size() ≤ 10<sup>5</sup></li>
  <li>0 ≤ arr[i] ≤ 10<sup>5</sup></li>
</ul>
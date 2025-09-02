<h1>Find the Largest Element in an Array</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0">Find the Largest Element in an Array</a></p>

<p>The task is to find the largest element in a given array <code>arr[]</code> and return it.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [1, 8, 7, 56, 90]</pre>
<p><strong>Output:</strong></p>
<pre>90</pre>
<p><strong>Explanation:</strong> The largest element in the given array is <code>90</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [5, 5, 5, 5]</pre>
<p><strong>Output:</strong></p>
<pre>5</pre>
<p><strong>Explanation:</strong> The largest element in the given array is <code>5</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [10]</pre>
<p><strong>Output:</strong></p>
<pre>10</pre>
<p><strong>Explanation:</strong> There is only one element, which is the largest.</p>

<h2>Approach</h2>
<ol>
  <li>Initialize a variable to store the maximum value, setting it to the first element of the array.</li>
  <li>Iterate through the array and update the maximum value if a larger element is found.</li>
  <li>Return the maximum value.</li>
</ol>

<h2>Time and Space Complexity</h2>
<ul>
  <li>Time Complexity: O(n), where <code>n</code> is the size of the array (as we traverse the array once).</li>
  <li>Space Complexity: O(1), since no extra space is used.</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 10<sup>6</sup></li>
  <li>0 ≤ <code>arr[i]</code> ≤ 10<sup>6</sup></li>
</ul>

<h1>Selection Sort Algorithm</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/selection-sort/1">Selection Sort Algorithm</a></p>

<p>Given an array <code>arr[]</code>, use selection sort to sort the array in increasing order.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [4, 1, 3, 9, 7]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 3, 4, 7, 9]</pre>
<p><strong>Explanation:</strong> 
Maintain sorted (in bold) and unsorted subarrays:
<ol>
  <li>Select 1. Array becomes <code>1, 4, 3, 9, 7</code>.</li>
  <li>Select 3. Array becomes <code>1, 3, 4, 9, 7</code>.</li>
  <li>Select 4. Array becomes <code>1, 3, 4, 9, 7</code>.</li>
  <li>Select 7. Array becomes <code>1, 3, 4, 7, 9</code>.</li>
  <li>Select 9. Array becomes <code>1, 3, 4, 7, 9</code>.</li>
</ol>
The sorted array is <code>[1, 3, 4, 7, 9]</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</pre>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [38, 31, 20, 14, 30]</pre>
<p><strong>Output:</strong></p>
<pre>[14, 20, 30, 31, 38]</pre>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 10<sup>3</sup></li>
  <li>1 ≤ <code>arr[i]</code> ≤ 10<sup>6</sup></li>
</ul>

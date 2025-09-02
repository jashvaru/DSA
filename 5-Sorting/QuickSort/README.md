<h1>Quick Sort Algorithm</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/merge-sort/1">Quick Sort Algorithm</a></p>

<p>Quick Sort is a Divide and Conquer algorithm that sorts an array <code>arr[]</code> in ascending order. The last element is chosen as the pivot, and elements less than or equal to the pivot come before it, while elements greater than the pivot follow it.</p>

<h2>How Quick Sort Works</h2>
<ol>
  <li>Choose the last element as the pivot.</li>
  <li>Partition the array such that elements smaller than or equal to the pivot are on the left, and greater elements are on the right.</li>
  <li>Recursively apply Quick Sort to the left and right subarrays.</li>
</ol>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [4, 1, 3, 9, 7]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 3, 4, 7, 9]</pre>
<p><strong>Explanation:</strong> After sorting, all elements are arranged in ascending order.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [2, 1, 6, 10, 4, 1, 3, 9, 7]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 1, 2, 3, 4, 6, 7, 9, 10]</pre>
<p><strong>Explanation:</strong> Duplicate elements (1) are retained in sorted order.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [5, 5, 5, 5]</pre>
<p><strong>Output:</strong></p>
<pre>[5, 5, 5, 5]</pre>
<p><strong>Explanation:</strong> All elements are identical, so the array remains unchanged.</p>

<h2>Time and Space Complexity</h2>
<ul>
  <li>Worst-case Time Complexity: O(n²) (when the array is already sorted in reverse order and the last element is always chosen as pivot)</li>
  <li>Average-case Time Complexity: O(n log n)</li>
  <li>Best-case Time Complexity: O(n log n) (when the pivot divides the array into nearly equal halves)</li>
  <li>Space Complexity: O(log n) (recursive stack space)</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 10<sup>5</sup></li>
  <li>1 ≤ <code>arr[i]</code> ≤ 10<sup>5</sup></li>
</ul>

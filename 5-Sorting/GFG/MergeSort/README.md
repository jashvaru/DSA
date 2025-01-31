<h1>Merge Sort Algorithm</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/merge-sort/1">Merge Sort Algorithm</a></p>

<p>Given an array <code>arr[]</code>, its starting position <code>l</code>, and its ending position <code>r</code>, sort the array using the Merge Sort algorithm.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [4, 1, 3, 9, 7]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 3, 4, 7, 9]</pre>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</pre>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [1, 3, 2]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 2, 3]</pre>

<h2>How Merge Sort Works</h2>
<p>Merge Sort is a divide-and-conquer algorithm that splits the array into halves, sorts each half recursively, and then merges the sorted halves back together.</p>

<ul>
  <li>Time Complexity (Worst & Average Case): O(n log n)</li>
  <li>Time Complexity (Best Case - Already Sorted): O(n log n)</li>
  <li>Space Complexity: O(n) (Due to auxiliary space required for merging)</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 10<sup>5</sup></li>
  <li>1 ≤ <code>arr[i]</code> ≤ 10<sup>5</sup></li>
</ul>

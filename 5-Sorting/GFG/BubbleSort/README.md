<h1>Bubble Sort Algorithm</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0">Bubble Sort Algorithm</a></p>

<p>Given an array <code>arr[]</code>, sort the array using the Bubble Sort algorithm.</p>

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
<pre>arr[] = [1, 2, 3, 4, 5]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 2, 3, 4, 5]</pre>
<p><strong>Explanation:</strong> An already sorted array remains unchanged after applying Bubble Sort.</p>

<h2>How Bubble Sort Works</h2>
<p>Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process repeats until the list is sorted.</p>

<ul>
  <li>Time Complexity (Worst & Average Case): O(n²)</li>
  <li>Time Complexity (Best Case - Already Sorted): O(n)</li>
  <li>Space Complexity: O(1) (In-place sorting algorithm)</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 10<sup>3</sup></li>
  <li>1 ≤ <code>arr[i]</code> ≤ 10<sup>3</sup></li>
</ul>

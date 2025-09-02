<h1>Insertion Sort Algorithm</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/insertion-sort/0">Insertion Sort Algorithm</a></p>

<p>The task is to complete the <code>insertsort()</code> function, which is used to implement the Insertion Sort algorithm.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [4, 1, 3, 9, 7]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 3, 4, 7, 9]</pre>
<p><strong>Explanation:</strong> The sorted array will be <code>[1, 3, 4, 7, 9]</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</pre>
<p><strong>Explanation:</strong> The sorted array will be <code>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [4, 1, 9]</pre>
<p><strong>Output:</strong></p>
<pre>[1, 4, 9]</pre>
<p><strong>Explanation:</strong> The sorted array will be <code>[1, 4, 9]</code>.</p>

<h2>How Insertion Sort Works</h2>
<p>Insertion Sort works by building a sorted list one element at a time by taking each element and inserting it into its correct position relative to the already sorted portion.</p>

<ul>
  <li>Time Complexity (Worst & Average Case): O(n²)</li>
  <li>Time Complexity (Best Case - Already Sorted): O(n)</li>
  <li>Space Complexity: O(1) (In-place sorting algorithm)</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 1000</li>
  <li>1 ≤ <code>arr[i]</code> ≤ 1000</li>
</ul>

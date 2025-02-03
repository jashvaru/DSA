<h1>Find the Second Largest Element in an Array</h1>

<p> Link to problem statement - <a href="https://www.geeksforgeeks.org/problems/second-largest3735/1">Find the Second Largest Element in an Array</a></p>

<p>The task is to find the second largest element in a given array <code>arr[]</code>. If the second largest element does not exist, return <code>-1</code>.</p>

<h2>Note:</h2>
<ul>
  <li>The second largest element should be distinct and not equal to the largest element.</li>
</ul>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [12, 35, 1, 10, 34, 1]</pre>
<p><strong>Output:</strong></p>
<pre>34</pre>
<p><strong>Explanation:</strong> The largest element is <code>35</code> and the second largest element is <code>34</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [10, 5, 10]</pre>
<p><strong>Output:</strong></p>
<pre>5</pre>
<p><strong>Explanation:</strong> The largest element is <code>10</code> and the second largest element is <code>5</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [10, 10, 10]</pre>
<p><strong>Output:</strong></p>
<pre>-1</pre>
<p><strong>Explanation:</strong> The largest element is <code>10</code> and no second largest element exists.</p>

<h2>Approach</h2>
<ol>
  <li>Initialize two variables <code>largest</code> and <code>secondLargest</code> to store the first and second largest elements.</li>
  <li>Iterate through the array and update these variables accordingly.</li>
  <li>If a valid second largest element exists, return it; otherwise, return <code>-1</code>.</li>
</ol>

<h2>Time and Space Complexity</h2>
<ul>
  <li><strong>Time Complexity:</strong> O(n), where <code>n</code> is the size of the array (as we traverse the array once).</li>
  <li><strong>Space Complexity:</strong> O(1), since no extra space is used.</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>2 ≤ <code>arr.size()</code> ≤ 10<sup>5</sup></li>
  <li>1 ≤ <code>arr[i]</code> ≤ 10<sup>5</sup></li>
</ul>

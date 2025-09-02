<h1>Minimum Number of Jumps to Reach the End</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1">Minimum Jumps</a></p> 

<p>You are given an array <code>arr[]</code> of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.</p>

<h2>Rules:</h2>
<ul>
  <li>If <code>arr[i] = 3</code>, you can jump 1 step, 2 steps, or 3 steps forward from position <code>i</code>.</li>
  <li>If <code>arr[i] = 0</code>, you cannot jump forward from that position.</li>
</ul>

<p>Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.</p>
<p><strong>Note:</strong> Return <code>-1</code> if you cannot reach the end of the array.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]</pre>
<p><strong>Output:</strong></p>
<pre>3</pre>
<p><strong>Explanation:</strong><br>
- First jump from the 1st element to the 2nd element with value <code>3</code>.<br>
- From here, jump to the 5th element with value <code>9</code>.<br>
- Finally, jump to the last element.<br>
Thus, the minimum number of jumps required is <code>3</code>.
</p>

<hr>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [1, 4, 3, 2, 6, 7]</pre>
<p><strong>Output:</strong></p>
<pre>2</pre>
<p><strong>Explanation:</strong><br>
- First, jump from the 1st to the 2nd element.<br>
- Then, jump to the last element.<br>
Thus, the minimum number of jumps required is <code>2</code>.
</p>

<hr>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [0, 10, 20]</pre>
<p><strong>Output:</strong></p>
<pre>-1</pre>
<p><strong>Explanation:</strong><br>
You cannot go anywhere from the 1st element, so it is impossible to reach the last element.
</p>

<hr>

<h2>Constraints:</h2>
<ul>
  <li>2 ≤ <code>arr.size()</code> ≤ 10<sup>6</sup></li>
  <li>0 ≤ <code>arr[i]</code> ≤ 10<sup>5</sup></li>
</ul>

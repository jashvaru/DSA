<h1>Sum of Divisors Function</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1">SumOneToNDivisor</a></p> 

<p>Given a positive integer <code>n</code>, the task is to find the value of <code>Σi F(i)</code>, where <code>i</code> is from <code>1</code> to <code>n</code>, and the function <code>F(i)</code> is defined as the sum of all divisors of <code>i</code>.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>n = 4</pre>
<p><strong>Output:</strong></p>
<pre>15</pre>
<p><strong>Explanation:</strong><br>
F(1) = 1<br>
F(2) = 1 + 2 = 3<br>
F(3) = 1 + 3 = 4<br>
F(4) = 1 + 2 + 4 = 7<br>
So, F(1) + F(2) + F(3) + F(4) = 1 + 3 + 4 + 7 = 15.
</p>

<hr>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>n = 5</pre>
<p><strong>Output:</strong></p>
<pre>21</pre>
<p><strong>Explanation:</strong><br>
F(1) = 1<br>
F(2) = 1 + 2 = 3<br>
F(3) = 1 + 3 = 4<br>
F(4) = 1 + 2 + 4 = 7<br>
F(5) = 1 + 5 = 6<br>
So, F(1) + F(2) + F(3) + F(4) + F(5) = 1 + 3 + 4 + 7 + 6 = 21.
</p>

<hr>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>n = 1</pre>
<p><strong>Output:</strong></p>
<pre>1</pre>
<p><strong>Explanation:</strong><br>
F(1) = 1<br>
So, F(1) = 1.
</p>

<hr>

<h2>Constraints:</h2>
<ul>
  <li>1 ≤ n ≤ 10<sup>5</sup></li>
</ul>

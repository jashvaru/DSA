# Count Digits

<h1> Link to the problem statement</h2> 
<a href="https://www.geeksforgeeks.org/problems/count-digits5716/1">Count Digits</a>

<h2>Problem Description</h2>
<p>
    Given a positive integer <code>n</code>, the goal is to count the number of digits in <code>n</code> that divide <code>n</code> evenly (i.e., without leaving a remainder). Return the total number of such digits.
</p>

<h3>Definition</h3>
<ul>
    <li>A digit <code>d</code> of <code>n</code> divides <code>n</code> evenly if the remainder when <code>n</code> is divided by <code>d</code> is 0 (<code>n % d == 0</code>).</li>
    <li>Digits of <code>n</code> should be checked individually.</li>
    <li>If a digit is <code>0</code>, it should be ignored because division by <code>0</code> is undefined.</li>
</ul>

<h2>Examples</h2>

<h3>Example 1</h3>
<pre>
<strong>Input:</strong>
n = 12

<strong>Output:</strong>
2
</pre>
<p><strong>Explanation:</strong> The digits <code>1</code> and <code>2</code> both divide <code>12</code> evenly.</p>

<h3>Example 2</h3>
<pre>
<strong>Input:</strong>
n = 2446

<strong>Output:</strong>
1
</pre>
<p><strong>Explanation:</strong> Among the digits <code>2</code>, <code>4</code>, and <code>6</code>, only <code>2</code> divides <code>2446</code> evenly. The digits <code>4</code> and <code>6</code> do not.</p>

<h3>Example 3</h3>
<pre>
<strong>Input:</strong>
n = 23

<strong>Output:</strong>
0
</pre>
<p><strong>Explanation:</strong> Neither <code>2</code> nor <code>3</code> divides <code>23</code> evenly.</p>

<h2>Constraints</h2>
<ul>
    <li><code>1 <= n <= 10^5</code></li>
</ul>

<h2>Implementation</h2>
<p>
    This problem can be solved by iterating through each digit of <code>n</code>, checking if it divides <code>n</code> evenly, and counting such digits. Digits that are <code>0</code> should be ignored during the check.
</p>

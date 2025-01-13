<h1>Prime Number Check</h1>

<p> Link to the problem statement - <a href="https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM">Prime Number Check</a></p> 

<p>A <strong>prime number</strong> is a positive integer that is divisible by exactly 2 integers: 1 and the number itself.</p>

<p>You are given a number <code>n</code>.</p>

<p>Find out whether <code>n</code> is prime or not.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>n = 5</pre>
<p><strong>Output:</strong></p>
<pre>YES</pre>
<p><strong>Explanation:</strong><br>
5 is only divisible by 1 and 5. Numbers 2, 3, and 4 do not divide 5.
</p>

<hr>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>n = 6</pre>
<p><strong>Output:</strong></p>
<pre>NO</pre>
<p><strong>Explanation:</strong><br>
6 is divisible by 1, 2, 3, and 6. Therefore, it is not a prime number. Numbers with more than two factors are called composite numbers.
</p>

<hr>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>n = 1</pre>
<p><strong>Output:</strong></p>
<pre>NO</pre>
<p><strong>Explanation:</strong><br>
1 is divisible only by itself, having only one factor. Therefore, it is not a prime number. Note that 1 is neither a prime number nor a composite number.
</p>

<hr>

<h2>Expected Time Complexity:</h2>
<p>The expected time complexity is <code>O(sqrt(n))</code>.</p>

<h2>Constraints:</h2>
<ul>
  <li>1 ≤ <code>n</code> ≤ 10<sup>9</sup></li>
</ul>

<p><strong>Time Limit:</strong> 1 second</p>
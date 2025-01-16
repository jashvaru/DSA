<h1>LCM and GCD</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1">LCM and GCD</a></p>

<p>Given two integers <code>a</code> and <code>b</code>, the goal is to compute their Least Common Multiple (LCM) and Greatest Common Divisor (GCD). The function <code>lcmAndGcd()</code> takes two integers as input and returns a list containing their LCM and GCD.</p>

<h2>Problem Description</h2>
<p>
    Write a function <code>lcmAndGcd(a, b)</code> to compute the LCM and GCD of two integers. The function should return a list where the first element is the LCM and the second element is the GCD.
</p>

<h3>Definitions</h3>
<ul>
    <li>The Least Common Multiple (LCM) of two integers is the smallest positive integer that is divisible by both integers.</li>
    <li>The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both integers without leaving a remainder.</li>
</ul>

<h2>Examples</h2>

<h3>Example 1</h3>
<pre>
<strong>Input:</strong>
a = 5, b = 10

<strong>Output:</strong>
[10, 5]
</pre>
<p><strong>Explanation:</strong> LCM of 5 and 10 is 10, while their GCD is 5.</p>

<h3>Example 2</h3>
<pre>
<strong>Input:</strong>
a = 14, b = 8

<strong>Output:</strong>
[56, 2]
</pre>
<p><strong>Explanation:</strong> LCM of 14 and 8 is 56, while their GCD is 2.</p>

<h3>Example 3</h3>
<pre>
<strong>Input:</strong>
a = 1, b = 1

<strong>Output:</strong>
[1, 1]
</pre>
<p><strong>Explanation:</strong> LCM of 1 and 1 is 1, while their GCD is 1.</p>

<h2>Constraints</h2>
<ul>
    <li><code>1 <= a, b <= 10^9</code></li>
</ul>

<h2>Expected Time and Space Complexity</h2>
<ul>
    <li><strong>Time Complexity:</strong> <code>O(log(min(a, b)))</code></li>
    <li><strong>Auxiliary Space:</strong> <code>O(1)</code></li>
</ul>

<h2>Implementation</h2>
<p>
    This problem can be solved efficiently using the relationship between LCM and GCD:
</p>
<ul>
    <li><code>LCM(a, b) = (a * b) / GCD(a, b)</code></li>
</ul>
<p>
    The GCD can be computed using the Euclidean algorithm, which is efficient and has a logarithmic time complexity.
</p>

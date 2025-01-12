<h1>Palindrome Number</h1>

<p> Link to the problem statement - <a href="https://leetcode.com/problems/palindrome-number/description/">Palindrome</a></p> 

<p>Given an integer <code>x</code>, return <code>true</code> if <code>x</code> is a <strong>palindrome</strong>, and <code>false</code> otherwise.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>
x = 121
</pre>
<p><strong>Output:</strong></p>
<pre>
true
</pre>
<p><strong>Explanation:</strong><br>
121 reads as 121 from left to right and from right to left.
</p>

<hr>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>
x = -121
</pre>
<p><strong>Output:</strong></p>
<pre>
false
</pre>
<p><strong>Explanation:</strong><br>
From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
</p>

<hr>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>
x = 10
</pre>
<p><strong>Output:</strong></p>
<pre>
false
</pre>
<p><strong>Explanation:</strong><br>
Reads 01 from right to left. Therefore, it is not a palindrome.
</p>

<hr>

<h2>Constraints:</h2>
<ul>
  <li>-2<sup>31</sup> ≤ x ≤ 2<sup>31</sup> - 1</li>
</ul>

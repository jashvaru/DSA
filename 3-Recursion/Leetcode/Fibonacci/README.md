<h1>Calculate Fibonacci Numbers</h1>

<p> Link to the problem statement - <a href="https://leetcode.com/problems/fibonacci-number/description/"></a>Calculate Fibonacci Numbers</p>

<p>The Fibonacci numbers, commonly denoted <code>F(n)</code>, form a sequence called the Fibonacci sequence, where each number is the sum of the two preceding ones, starting from <code>0</code> and <code>1</code>. The sequence is defined as follows:</p>

<pre>
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1
</pre>

<p>Given an integer <code>n</code>, calculate <code>F(n)</code>.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>n = 2</pre>
<p><strong>Output:</strong></p>
<pre>1</pre>
<p><strong>Explanation:</strong> 
<code>F(2) = F(1) + F(0) = 1 + 0 = 1</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>n = 3</pre>
<p><strong>Output:</strong></p>
<pre>2</pre>
<p><strong>Explanation:</strong> 
<code>F(3) = F(2) + F(1) = 1 + 1 = 2</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>n = 4</pre>
<p><strong>Output:</strong></p>
<pre>3</pre>
<p><strong>Explanation:</strong> 
<code>F(4) = F(3) + F(2) = 2 + 1 = 3</code>.</p>

<h2>Constraints</h2>
<ul>
  <li>0 ≤ n ≤ 30</li>
</ul>

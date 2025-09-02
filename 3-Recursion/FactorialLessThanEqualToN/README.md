<h1>Find Factorial Numbers Smaller Than or Equal to n</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0">Find Factorial Numbers Smaller Than or Equal to n</a></p>

<p>A number <code>n</code> is called a <strong>factorial number</strong> if it is the factorial of a positive integer. For example, the first few factorial numbers are: <code>1, 2, 6, 24, 120</code>.</p>

<p>Given a number <code>n</code>, the task is to return a list (or vector) of all the factorial numbers smaller than or equal to <code>n</code>.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>n = 3</pre>
<p><strong>Output:</strong></p>
<pre>1 2</pre>
<p><strong>Explanation:</strong> 
- The first factorial number is 1, which is ≤ n.  
- The second number is 2, which is ≤ n.  
- The third factorial number is 6, which is greater than n.  
Thus, only 1 and 2 are included in the output.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>n = 6</pre>
<p><strong>Output:</strong></p>
<pre>1 2 6</pre>
<p><strong>Explanation:</strong> 
- The first three factorial numbers (1, 2, and 6) are ≤ n.  
- The fourth factorial number, 24, is greater than n.  
Thus, only the first three factorial numbers are included in the output.</p>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ n ≤ 10<sup>18</sup></li>
</ul>

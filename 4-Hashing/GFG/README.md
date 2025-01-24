<h1>Count the Frequency of Numbers in an Array</h1>

<p> Link to the problem statement - <a href="https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0"></a>Frequencies in a Limited Array</p>

<p>You are given an array <code>arr[]</code> containing positive integers. The elements in the array range from <code>1</code> to <code>n</code> (where <code>n</code> is the size of the array). Some numbers may be repeated or absent.</p>

<p>Your task is to count the frequency of all numbers in the range <code>1</code> to <code>n</code> and return an array of size <code>n</code> such that <code>result[i]</code> represents the frequency of the number <code>i</code> (1-based indexing).</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [2, 3, 2, 3, 5]</pre>
<p><strong>Output:</strong></p>
<pre>[0, 2, 2, 0, 1]</pre>
<p><strong>Explanation:</strong> 
- 1 occurs 0 times,  
- 2 occurs 2 times,  
- 3 occurs 2 times,  
- 4 occurs 0 times,  
- 5 occurs 1 time.  
Thus, the output is <code>[0, 2, 2, 0, 1]</code>.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [3, 3, 3, 3]</pre>
<p><strong>Output:</strong></p>
<pre>[0, 0, 4, 0]</pre>
<p><strong>Explanation:</strong> 
- 1 occurs 0 times,  
- 2 occurs 0 times,  
- 3 occurs 4 times,  
- 4 occurs 0 times.  
Thus, the output is <code>[0, 0, 4, 0]</code>.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>arr[] = [1]</pre>
<p><strong>Output:</strong></p>
<pre>[1]</pre>
<p><strong>Explanation:</strong> 
- 1 occurs 1 time.  
There are no other numbers between 1 and the size of the array.  
Thus, the output is <code>[1]</code>.</p>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>arr.size()</code> ≤ 10<sup>6</sup></li>
  <li>1 ≤ <code>arr[i]</code> ≤ <code>arr.size()</code></li>
</ul>

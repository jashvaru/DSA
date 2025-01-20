<h1>Check if a String is a Palindrome</h1>

<p> Link to the problem statement - <a href="https://leetcode.com/problems/valid-palindrome/description/">Check if a String is a Palindrome</a></p>

<p>A phrase is considered a palindrome if, after converting all uppercase letters to lowercase and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.</p>

<p>Given a string <code>s</code>, return <code>true</code> if it is a palindrome, or <code>false</code> otherwise.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>s = "A man, a plan, a canal: Panama"</pre>
<p><strong>Output:</strong></p>
<pre>true</pre>
<p><strong>Explanation:</strong> 
After removing non-alphanumeric characters and converting to lowercase, the string becomes <code>"amanaplanacanalpanama"</code>, which is a palindrome.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>s = "race a car"</pre>
<p><strong>Output:</strong></p>
<pre>false</pre>
<p><strong>Explanation:</strong> 
After removing non-alphanumeric characters and converting to lowercase, the string becomes <code>"raceacar"</code>, which is not a palindrome.</p>

<h3>Example 3:</h3>
<p><strong>Input:</strong></p>
<pre>s = " "</pre>
<p><strong>Output:</strong></p>
<pre>true</pre>
<p><strong>Explanation:</strong> 
After removing non-alphanumeric characters, the string becomes an empty string <code>""</code>, which is considered a palindrome as it reads the same forward and backward.</p>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ s.length ≤ 2 × 10<sup>5</sup></li>
  <li><code>s</code> consists only of printable ASCII characters.</li>
</ul>

<!DOCTYPE html>
<html>
<head>
    <title>LCM and GCD Calculator</title>
</head>
<body>
    <h1>LCM and GCD Calculator</h1>
    <p>This repository contains a function <code>lcmAndGcd()</code> that computes the <strong>Least Common Multiple (LCM)</strong> and <strong>Greatest Common Divisor (GCD)</strong> of two integers.</p>
    
    <h2>Problem Statement</h2>
    <p>Given two integers <code>a</code> and <code>b</code>, write a function <code>lcmAndGcd()</code> to compute their LCM and GCD. The function inputs two integers <code>a</code> and <code>b</code> and returns a list containing their LCM and GCD.</p>
    
    <h2>Examples</h2>
    
    <h3>Example 1:</h3>
    <p><strong>Input:</strong> <code>a = 5, b = 10</code></p>
    <p><strong>Output:</strong> <code>[10, 5]</code></p>
    <p><strong>Explanation:</strong> LCM of 5 and 10 is <strong>10</strong>, while GCD is <strong>5</strong>.</p>
    
    <h3>Example 2:</h3>
    <p><strong>Input:</strong> <code>a = 14, b = 8</code></p>
    <p><strong>Output:</strong> <code>[56, 2]</code></p>
    <p><strong>Explanation:</strong> LCM of 14 and 8 is <strong>56</strong>, while GCD is <strong>2</strong>.</p>
    
    <h3>Example 3:</h3>
    <p><strong>Input:</strong> <code>a = 1, b = 1</code></p>
    <p><strong>Output:</strong> <code>[1, 1]</code></p>
    <p><strong>Explanation:</strong> LCM of 1 and 1 is <strong>1</strong>, while GCD is <strong>1</strong>.</p>
    
    <h2>Expected Time Complexity</h2>
    <ul>
        <li><strong>Time Complexity:</strong> <code>O(log(min(a, b)))</code></li>
        <li><strong>Auxiliary Space:</strong> <code>O(1)</code></li>
    </ul>
    
    <h2>Constraints</h2>
    <ul>
        <li><code>1 &leq; a, b &leq; 10<sup>9</sup></code></li>
    </ul>
    
    <h2>Usage</h2>
    <p>To compute the LCM and GCD of two integers:</p>
    <ol>
        <li>Call the function <code>lcmAndGcd(a, b)</code>.</li>
        <li>Pass the integers <code>a</code> and <code>b</code> as inputs.</li>
        <li>The function returns a list <code>[LCM, GCD]</code>.</li>
    </ol>
    
    <h3>Example Usage in Python:</h3>
    <pre>
<code>
def lcmAndGcd(a, b):
    import math
    gcd = math.gcd(a, b)
    lcm = abs(a * b) // gcd
    return [lcm, gcd]

# Example
result = lcmAndGcd(14, 8)
print(result)  # Output: [56, 2]
</code>
    </pre>
    
    <h2>Contributing</h2>
    <p>Feel free to contribute to this repository or suggest optimizations to the algorithm!</p>
</body>
</html>

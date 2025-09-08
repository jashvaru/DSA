<h1>Best Time to Buy and Sell Stock</h1>

<p> Link to problem statement - <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">Stock buy and sell</a></p>

<p>You are given an array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.</p>

<p>Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return <code>0</code>.</p>

<h2>Example 1:</h2>

<pre>
<strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
</pre>

<h2>Example 2:</h2>

<pre>
<strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this case, no transactions are done and the max profit = 0.
</pre>

<h2>Constraints:</h2>

<ul>
  <li>1 <= prices.length <= 10<sup>5</sup></li>
  <li>0 <= prices[i] <= 10<sup>4</sup></li>
</ul>

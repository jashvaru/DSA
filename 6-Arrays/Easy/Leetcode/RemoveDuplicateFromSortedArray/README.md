<h1>Remove Duplicates from Sorted Array</h1>

<p>Given an integer array <code>nums</code> sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in <code>nums</code>.</p>

<p>Consider the number of unique elements of <code>nums</code> to be <code>k</code>. To get accepted, you need to do the following:</p>

<ul>
  <li>Modify <code>nums</code> so that the first <code>k</code> elements contain the unique elements in the order they were originally present.</li>
  <li>The remaining elements beyond <code>k</code> do not matter.</li>
  <li>Return <code>k</code>.</li>
</ul>

<h2>Custom Judge</h2>
<p>The judge will validate your solution using the following code:</p>

<pre>
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // Expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
</pre>

<p>If all assertions pass, then your solution will be accepted.</p>

<h2>Examples</h2>

<h3>Example 1:</h3>
<p><strong>Input:</strong></p>
<pre>nums = [1,1,2]</pre>
<p><strong>Output:</strong></p>
<pre>2, nums = [1,2,_]</pre>
<p><strong>Explanation:</strong> Your function should return <code>k = 2</code>, with the first two elements being <code>1</code> and <code>2</code>. The underscores represent elements that do not matter.</p>

<h3>Example 2:</h3>
<p><strong>Input:</strong></p>
<pre>nums = [0,0,1,1,1,2,2,3,3,4]</pre>
<p><strong>Output:</strong></p>
<pre>5, nums = [0,1,2,3,4,_,_,_,_,_]</pre>
<p><strong>Explanation:</strong> Your function should return <code>k = 5</code>, with the first five elements being <code>0, 1, 2, 3, 4</code>. The underscores represent elements that do not matter.</p>

<h2>Constraints</h2>
<ul>
  <li>1 ≤ <code>nums.length</code> ≤ 3 × 10<sup>4</sup></li>
  <li>-100 ≤ <code>nums[i]</code> ≤ 100</li>
  <li><code>nums</code> is sorted in non-decreasing order.</li>
</ul>

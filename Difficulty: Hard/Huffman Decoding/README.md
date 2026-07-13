<h2><a href="https://www.geeksforgeeks.org/problems/huffman-decoding/1">Huffman Decoding</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a <strong>Huffman </strong>MinHeap tree and an encoded binary string, complete the function <strong>huffDecode()</strong> to decode the string and return the original text. Each node of the tree contains a character and its frequency, where the special character <strong>$ </strong>represents internal nodes. Traverse the tree from the root using <strong>0 </strong>for left and <strong>1 </strong>for right, and whenever a leaf node is reached, add its character to the answer and restart traversal from the root.</span></p>
<p><strong><span style="font-size: 14pt;">Note: </span></strong><span style="font-size: 14pt;">Compiler will take string s as an input and encode it in binary string internaly.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input : </strong>binaryString = 1111111111110001010101010100010010101010101
Min Heap Tree-<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928497/Web/Other/blobid0_1778929651.png" width="422" height="223"><br></span><span style="font-size: 18px;"><strong>Output:</strong> AAAAAABCCCCCCDDEEEEE</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>The following chart can be made from the given min heap tree.
<strong>character    frequency    code</strong>
    A             6        11     (because we have to move right 2 time to reach A from the root)          
    B             1        000    
    C             6        10     (because we have to move right and then left to reach C from the root)
    D             2        001    
    E             5        01</span><br><br><span style="font-size: 18px;">In the above given binaryString we replace <strong>11</strong> by <strong>A</strong> (6 times), <strong>000</strong> by <strong>B </strong>(1 time)<strong>, </strong><strong>10&nbsp;</strong>by <strong>C</strong> (6 times), <strong>001 </strong>&nbsp;by <strong>D&nbsp;</strong></span><span style="font-size: 18px;">(2 times) </span><span style="font-size: 18px;">and</span><strong style="font-size: 18px;"> 01 </strong><span style="font-size: 18px;">by</span><strong style="font-size: 18px;"> E </strong><span style="font-size: 18px;">(5 times)</span><strong style="font-size: 18px;">.</strong><br><span style="font-size: 18px;">Hence, the answer is </span><span style="font-size: 18px;">AAAAAABCCCCCCDDEEEEE.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input : </strong>binaryString = 01110100011111000101101011101000111
Min Heap Tree-<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928497/Web/Other/blobid1_1778929767.png" width="536" height="268"></span>

<span style="font-size: 18px;"><strong>Output:</strong> geeksforgeeks</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>The following chart can be made from the given min heap tree.
<strong>character    frequency    code</strong>
    f             1        0000                 
    o             1        0001
    r             1        001
    g             2        01    
    k             2        100
    s             2        101
    e             4        11</span><br><span style="font-size: 18px;">If we replace the binary numbers with the suitable characters, then we get </span><span style="font-size: 18px;">geeksforgeeks as the output.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ length of input string ≤ 10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Greedy</code>&nbsp;<code>Algorithms</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;
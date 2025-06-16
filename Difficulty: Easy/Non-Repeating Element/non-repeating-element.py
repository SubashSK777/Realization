#User function Template for python3
from collections import Counter

class Solution:
    def firstNonRepeating(self, arr): 
        # Complete the function
        freq = Counter(arr)
        
        for i in range(len(arr)):
            if freq[arr[i]] == 1:
                return arr[i]
        else:
            return 0
# User function Template for python3

class Solution:
    # Function to check if two arrays are equal or not.
    def checkEqual(self, a, b) -> bool:
        #code here
        n, m = len(a), len(b)
        
        hm = {}
        
        for num in a:
            hm[num] = hm.get(num, 0) + 1
            
        for num in b:
            if num not in hm:
                return False
            
            if hm[num] == 0:
                return False
            
            hm[num] -= 1
            
        return True
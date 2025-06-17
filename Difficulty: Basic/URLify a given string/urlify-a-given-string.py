#User function Template for python3
class Solution:
    def URLify(self, s): 
        res = ""
        
        for i in s:
            if i == " ":
                res += "%20"
            else:
                res += i
                
        return res
            

class Solution:
    def lastVisitedIntegers(self, nums: List[int]) -> List[int]:
        seen=[]
        ans=[]
        k=0

        for x in nums:
            if x!=-1:
                seen.append(x)
                k=0
            else:
                k+=1

                if k<=len(seen):
                    ans.append(seen[-k])
                else:
                    ans.append(-1)
        return ans

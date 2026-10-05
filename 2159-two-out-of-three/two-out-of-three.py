class Solution:
    def twoOutOfThree(self, nums1: list[int], nums2: list[int], nums3: list[int]) -> list[int]:
        lst=[]
        res=[]
        lst.extend(nums1)
        lst.extend(nums2)
        lst.extend(nums3)
        lst=set(lst)

        for n in lst:
            if ((n in nums1 and n in nums2 and n in nums3) or (n in nums1 and n in nums2) or (n in nums2 and n in nums3) or (n in nums1 and n in nums3)):
                res.append(n)
        return sorted(res)
        
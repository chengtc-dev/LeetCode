/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    let ans = [];

    backtrack(0, nums, ans);

    return ans;
};

function backtrack (start, nums, ans) {
    if (start === nums.length) {
        ans.push([...nums]);
    } else {
        for (let i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(start + 1, nums, ans);
            swap(nums, start, i);
        }
    }
}

function swap (nums, a, b) {
    let temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}
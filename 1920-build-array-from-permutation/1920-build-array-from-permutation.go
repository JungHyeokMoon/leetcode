func buildArray(nums []int) []int {
	ans := make([]int, len(nums))
	index := 0

	for idx, _ := range nums {
		ans[index] = nums[nums[idx]]
		index++
	}
	return ans
}
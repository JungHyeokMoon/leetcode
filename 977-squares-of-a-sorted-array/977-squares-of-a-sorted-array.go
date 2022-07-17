func sortedSquares(nums []int) []int {
	for idx, val := range nums {
		nums[idx] = val * val
	}

	sort.Ints(nums)

	return nums

}
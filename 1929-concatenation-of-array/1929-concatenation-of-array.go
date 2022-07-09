func getConcatenation(nums []int) []int {
	numsLength := len(nums)
	ret := make([]int, numsLength*2)

	for i := 0; i < numsLength; i++ {
		ret[i] = nums[i]
		ret[i+numsLength] = nums[i]
	}
	return ret
}
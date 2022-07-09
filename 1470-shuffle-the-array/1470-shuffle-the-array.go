func shuffle(nums []int, n int) []int {
	ret := make([]int, n*2)
	index := 0
	for i := 0; i < n; i++ {
		ret[index] = nums[i]
		ret[index+1] = nums[i+n]
		index += 2
	}
	return ret
}
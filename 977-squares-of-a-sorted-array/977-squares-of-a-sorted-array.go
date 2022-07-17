func sortedSquares(nums []int) []int {
	ret := make([]int, len(nums))
	s, e := 0, len(nums)-1

	for idx := e; idx >= 0; idx-- {
		if absS, absE := abs(nums[s]), abs(nums[e]); absS > absE {
			ret[idx] = absS * absS
			s++
		} else {
			ret[idx] = absE * absE
			e--
		}
	}

	return ret

}

func abs(num int) int {
	if num < 0 {
		return num * -1
	}
	return num
}

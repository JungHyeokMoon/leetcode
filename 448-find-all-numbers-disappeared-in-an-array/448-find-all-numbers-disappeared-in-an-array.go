func findDisappearedNumbers(nums []int) (ret []int) {

	for _, val := range nums {

		val = int(math.Abs(float64(val)))

		if nums[val-1] > 0 {
			nums[val-1] = -nums[val-1]
		}
	}

	for idx, val := range nums {
		if val > 0 {
			ret = append(ret, idx+1)
		}
	}

	return
}
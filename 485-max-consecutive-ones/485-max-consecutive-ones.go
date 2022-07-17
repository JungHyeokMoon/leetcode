func findMaxConsecutiveOnes(nums []int) (ret int) {

	temp := 0
	for idx, val := range nums {
		if idx == 0 {
			if val == 0 {
				temp = 0
			} else {
				temp = 1
			}
		} else {
			if val == 0 {
				temp = 0
			} else {
				if prev := nums[idx-1]; prev == 0 {
					temp = 1
				} else {
					temp++
				}
			}
		}

		if temp > ret {
			ret = temp
		}
	}

	return
}

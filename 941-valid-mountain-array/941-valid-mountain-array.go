func validMountainArray(arr []int) bool {
	length := len(arr)
	if length < 3 {
		return false
	}

	increase, decrease := false, false

	for i := 1; i < len(arr); i++ {
		prev, cur := arr[i-1], arr[i]

		if prev == cur {
			return false
		}

		if prev < cur {
			if decrease {
				return false
			}
			increase = true
		}

		if prev > cur {
			decrease = true
		}
	}

	return increase && decrease
}
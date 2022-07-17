func duplicateZeros(arr []int) {
	zeroCount := 0

	for _, val := range arr {
		if val == 0 {
			zeroCount++
		}
	}

	for i := len(arr) - 1; i >= 0; i-- {
		if arr[i] == 0 {
			if i+zeroCount < len(arr) {
				arr[zeroCount+i] = 0
			}

			if i+zeroCount-1 < len(arr) {
				arr[zeroCount+i-1] = 0
			}

			zeroCount--
		} else if i+zeroCount < len(arr) {
			arr[zeroCount+i] = arr[i]
		}
	}
}

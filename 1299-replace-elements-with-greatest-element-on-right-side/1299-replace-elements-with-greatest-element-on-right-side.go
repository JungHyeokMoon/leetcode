func replaceElements(arr []int) []int {
	maxValue := -1

	for i := len(arr) - 1; i >= 0; i-- {
		cur := arr[i]
		arr[i] = maxValue
		if maxValue < cur {
			maxValue = cur
		}
	}

	return arr
}
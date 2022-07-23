func replaceElements(arr []int) []int {
	maxValue := arr[len(arr)-1]
	arr[len(arr)-1] = -1

	for i := len(arr) - 2; i >= 0; i-- {
		cur := arr[i]
		arr[i] = maxValue
		if maxValue < cur {
			maxValue = cur
		}
	}

	return arr
}
func findNumbers(nums []int) (ret int) {
	for _, val := range nums {

		temp := 0
		for val != 0 {
			val = val / 10
			temp++
		}

		if temp%2 == 0 {
			ret++
		}
	}
	return
}
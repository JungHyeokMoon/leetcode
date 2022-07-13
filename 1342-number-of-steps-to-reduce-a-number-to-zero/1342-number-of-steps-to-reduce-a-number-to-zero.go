func numberOfSteps(num int) int {
	for i := 0; ; i++ {
		if num == 0 {
			return i
		}

		if temp := num % 2; temp == 0 {
			num = num / 2
		} else {
			num = num - 1
		}
	}
}
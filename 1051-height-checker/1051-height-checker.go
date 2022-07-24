func heightChecker(heights []int) (ret int) {
	m := make([]int, 101)
	for _, val := range heights {
		m[val]++
	}

	pos := 1

	for _, height := range heights {

		for m[pos] == 0 {
			pos++
		}

		if pos != height {
			ret++
		}

		m[pos]--
	}
	return
}

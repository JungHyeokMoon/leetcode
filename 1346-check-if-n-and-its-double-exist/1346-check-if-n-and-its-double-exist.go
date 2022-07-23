func checkIfExist(arr []int) bool {
	set := make(map[int]bool)

	for _, value := range arr {
		if _, exist := set[value*2]; exist {
			return true
		}

		if value%2 == 0 && set[value/2] {
			return true
		}

		set[value] = true
	}

	return false
}
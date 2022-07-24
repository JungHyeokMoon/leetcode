func findDisappearedNumbers(nums []int) (ret []int) {

	s := make(map[int]bool)

	for i := 1; i <= len(nums); i++ {
		s[i] = true
	}

	for _, val := range nums {
		delete(s, val)
	}

	for val := range s {
		ret = append(ret, val)
	}

	return
}
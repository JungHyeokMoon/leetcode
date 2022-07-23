func sortArrayByParity(nums []int) (ret []int) {
	odd := []int{}
	even := []int{}

	for _, value := range nums {
		if value%2 == 0 {
			even = append(even, value)
		} else {
			odd = append(odd, value)
		}
	}

	ret = append(ret, even...)
	ret = append(ret, odd...)
	return
}

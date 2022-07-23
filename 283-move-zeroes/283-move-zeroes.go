func moveZeroes(nums []int) {

	for findIndex, zeroIndex := 0, 0; findIndex < len(nums); findIndex++ {
		if v1, v2 := nums[zeroIndex], nums[findIndex]; v1 == 0 && v2 != 0 {
			nums[findIndex], nums[zeroIndex] = nums[zeroIndex], nums[findIndex]
			zeroIndex++
		} else if v1 != 0 {
			zeroIndex++
		}
	}
}
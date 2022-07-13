func canConstruct(ransomNote string, magazine string) bool {
	array := make([]int, 26)

	for _, c := range magazine {
        array[int(c-'a')]++
	}

	for _, c := range ransomNote {
        if array[int(c-'a')] == 0 {
			return false
		} else {
            array[int(c-'a')]--
		}
	}

	return true
}
func firstPalindrome(words []string) (ret string) {
	for _, word := range words {
		if isPalindrome(word) {
			return word
		}
	}

	return
}

func isPalindrome(word string) bool {
	for lo, hi := 0, len(word)-1; lo <= hi; lo, hi = lo+1, hi-1 {
		if word[lo] != word[hi] {
			return false
		}
	}

	return true
}
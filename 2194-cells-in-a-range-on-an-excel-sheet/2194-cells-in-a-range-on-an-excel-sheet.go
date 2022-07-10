func cellsInRange(s string) (ret []string) {

	for n1 := s[0]; n1 <= s[3]; n1++ {
		for c1 := s[1]; c1 <= s[4]; c1++ {
			ret = append(ret, string(n1)+string(c1))
		}
	}

	return
}

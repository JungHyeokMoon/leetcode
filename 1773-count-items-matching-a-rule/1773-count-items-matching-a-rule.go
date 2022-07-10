func countMatches(items [][]string, ruleKey string, ruleValue string) (ret int) {
	var idx int

	if ruleKey == "type" {
		idx = 0
	} else if ruleKey == "color" {
		idx = 1
	} else {
		idx = 2
	}

	for _, item := range items {
		if item[idx] == ruleValue {
			ret++
		}
	}

	return
}
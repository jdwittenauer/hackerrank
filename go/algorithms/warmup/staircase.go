package main

import "fmt"

func main() {
	var n int
	fmt.Scanf("%v\n", &n)
	for i := 0; i < n; i++ {
		var spaces = ""
		for j := 0; j < (n - 1) - i; j++ {
			spaces += " "
		}

		var pounds = ""
		for k := 0; k < i + 1; k++ {
			pounds += "#"
		}

		fmt.Println(spaces + pounds)
	}
}

package main

import (
	"fmt"
	"os"
	"bufio"
	"strings"
	"strconv"
)

func main() {
	var n uint32
	fmt.Scanf("%v\n", &n)
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var inputs = strings.Split(s.Text(), " ")

	var sum = 0
	for _, i := range inputs {
		value, err := strconv.Atoi(i)
		if err != nil {
			panic(err)
		}
		sum += value
	}

	fmt.Println(sum)
}

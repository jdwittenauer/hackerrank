package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var n uint32
	fmt.Scanf("%v\n", &n)
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var inputs = strings.Split(s.Text(), " ")

	var sum int64
	for _, i := range inputs {
		value, err := strconv.ParseInt(i, 10, 64)
		if err != nil {
			panic(err)
		}
		sum += value
	}

	fmt.Println(sum)
}

package main

import (
	"fmt"
	"os"
	"bufio"
	"strings"
	"strconv"
)

func ConvertToInt(sa []string) ([]int) {
	si := make([]int, 0, len(sa))
	for _, a := range sa {
		i, err := strconv.Atoi(a)
		if err != nil {
			panic(err)
		}
		si = append(si, i)
	}

	return si
}

func main() {
	var n int
	fmt.Scanf("%v\n", &n)
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var a = ConvertToInt(strings.Split(s.Text(), " "))

	var max = 0
	for x := 0; x < n; x++ {
		if a[x] > max {
			max = a[x]
		}
	}

	var candles = 0
	for x := 0; x < n; x++ {
		if a[x] == max {
			candles++
		}
	}

	fmt.Println(candles)
}

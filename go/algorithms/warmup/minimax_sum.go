package main

import (
	"fmt"
	"os"
	"bufio"
	"strings"
	"strconv"
)

func ConvertToInt64(sa []string) ([]int64) {
	si := make([]int64, 0, len(sa))
	for _, a := range sa {
		i, err := strconv.ParseInt(a, 10, 64)
		if err != nil {
			panic(err)
		}
		si = append(si, i)
	}

	return si
}

func main() {
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var a = ConvertToInt64(strings.Split(s.Text(), " "))
	var min, max int64 = 9223372036854775807, 0

	for i:= 0; i < len(a); i++ {
		var sum int64 = 0
		for j:= 0; j < len(a); j++ {
			if i != j {
				sum += a[j]
			}
		}

		if sum < min {
			min = sum
		}

		if sum > max {
			max = sum
		}
	}

	fmt.Printf("%d %d", min, max)
}

package main

import (
	"bufio"
	"os"
	"time"
	"fmt"
)

func main() {
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var input = s.Text()
	var t, _ = time.Parse("03:04:05PM", input)
	fmt.Println(t.Format("15:04:05"))
}

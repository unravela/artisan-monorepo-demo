//go:generate statik -src=../frontend/dist

package main

import (
	"log"
	"net/http"

	"github.com/rakyll/statik/fs"
	"shop.com/backend/proto/shop"
	_ "shop.com/backend/statik"
)

func main() {
	statikFS, _ := fs.New()

	lpr := shop.ListProductsResponse{}
	log.Println(lpr)

	fileServer := http.FileServer(statikFS)
	http.Handle("/", fileServer)

	log.Println("Running Shop UI on http://localhost:8089")
	err := http.ListenAndServe(":8089", nil)
	if err != nil {
		log.Fatal(err)
	}
}

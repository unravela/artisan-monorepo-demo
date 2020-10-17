default: help

.PHONY: build
build: bin/mac/demoapp bin/win/demoapp bin/linux/demoapp

bin/mac/demoapp: prebuild
	@echo "--> Building $@..."
	GOOS=darwin GOARCH=amd64 \
	go build -i -o $@ .

bin/linux/demoapp: prebuild
	@echo "--> Building $@..."
	go build -i -o $@ .

bin/win/demoapp: prebuild
	@echo "--> Building $@..."
	GOOS=windows GOARCH=amd64 \
	go build -i -o $@.exe .	

.PHONY: prebuild
prebuild: statik/statik.go

statik/statik.go:
	go generate

.PHONY: clean
clean:
	rm -rf ./bin/*
	rm -rf ./statik/*

.PHONY: help
help:
	@echo "Available targets:"
	@echo "   build - build app for all platforms"
	@echo "   clean - cleanup the workspace"

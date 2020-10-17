task "go" "build" {
	script = "make build"
	deps = [ 
		"//frontend:build"
	]
}

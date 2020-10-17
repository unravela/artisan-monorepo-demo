task "go" "bundle" {
	script = "go generate"
	deps = [ 
		"//frontend:build" 
	]
}

task "go" "build" {
	script = "go build"
	deps = [ 
		":bundle"
	]
}
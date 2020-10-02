task "go" "generate" {
	script = "go generate"
	deps = [ 
		"//apps/shop-ui/frontend:build" 
	]
}

task "protobuf" "genproto" {
	script = "--proto_path=../../../api --go_out=./proto/shop service-catalog.proto money.proto empty.proto"
}

task "go" "build" {
    script = "go build"
    deps = [ 
		":generate" 
	]
}

task "@go" "generate" {
	cmd = [ "go", "generate" ]
	deps = [ "//apps/shop-ui/frontend:build" ]
}

task "@protobuf" "genproto" {
	cmd = [ "--proto_path=../../../api", 
                "--go_out=./proto", 
                "service-catalog.proto", 
                "money.proto", 
                "empty.proto" ]
}

task "@go" "build" {
    cmd = [ "go", "build" ]
    deps = [ ":generate" ]
}

task "@go" "generate" {
	cmd = [ "go", "generate" ]
	deps = [ "//apps/shop-ui/frontend:build" ]
}

task "@go" "build" {
    cmd = [ "go", "build" ]
    deps = [ ":generate" ]
}

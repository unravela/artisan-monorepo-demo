task "node:lts-alpine" "build" {
	script = "npm install && npm run build"		
	exclude = [
	    "dist",
	    "node_modules"
	]
}
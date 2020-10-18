# Vue.JS&Go monorepo demo

This is a very simple showcase of monorepository managed by [Artisan](https//github.com/unravela/artisan). The frontend is Vue.JS application embedded into backend application which is written in Go.

This showcase demonstrate how you can easily combine the frontend `npm` with build system of backend which is pure Go with simple `Makefile`.

## How to use 

Before you start, ensure you have installed [Docker](https://docs.docker.com/get-docker/) and [Artisan][https//github.com/unravela/artisan] in your environment. Then you can clone this repository.

```
git clone https://github.com/unravela/artisan-simple-demo.git
```

Go into `artisan-simple-demo` diectory and run the build:

```
artisan run //backend:build
```

When Artisan finish his job, you will have final binary of backend app with embedded frontend paart in `./backend/bin` folder.

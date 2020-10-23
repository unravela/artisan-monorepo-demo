# Vue.js & Go monorepo demo

![Artisan](https://raw.githubusercontent.com/unravela/artisan/main/doc/assets/banner.png)

This is demonstration of [Artisan](https://github.com/unravela/artisan) and how you can easily combine the front end `npm` with the backend's build system, which is pure Go with simple `Makefile`.

## How to use 

Before you start, ensure you have installed [Docker](https://docs.docker.com/get-docker/) and [Artisan](https//github.com/unravela/artisan) in your environment. Then you can clone this repository.

```
git clone https://github.com/unravela/artisan-simple-demo.git
```

Go into `artisan-simple-demo` directory and run the build:

```
artisan run //backend:build
```

When Artisan finishes his job, you will have the back-end app's final binary with embedded front-end part in `./backend/bin` folder.
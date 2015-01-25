# Hello World with the Play Framework

This is an example "Hello World" application for the Play Framework version 2.3.x. It is converted from the [old Play Framework
Hello World tutorial](https://github.com/playframework/playframework/blob/2.0.x/samples/java/helloworld/app/views/index.scala.html).

## Relevant code

The only things that had to be changed after creating the app using `activator new hello-world play-java` were in these files:

* `app/controllers/Application.java`
* `app/views/*`
* `/conf/routes`

## Adding bootstrap

See http://www.webjars.org/documentation to start out, but then look at [my commit](https://github.com/kjorg50/play-2.3-hello-world/commit/680bd8cf2e49f34abd1c558ce5df04ce59354ae1), to see exactly what I changed. I also
used a little bit of the tutorial here http://thomastoye.be/webdevelopment/making-bootstrap-3-dot-1-x-play-nicely-with-play-framework-2-dot-2-x/

[Read here for the specific instructions](https://gist.github.com/kjorg50/1f832e873a1af622cb46)
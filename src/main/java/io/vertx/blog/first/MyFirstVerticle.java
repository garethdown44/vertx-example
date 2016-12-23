package io.vertx.blog.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MyFirstVerticle extends AbstractVerticle {

  @Override
  public void start(Future<Void> fut) {
      String port = System.getenv("VCAP_APP_PORT");
      System.out.println("VCAP_APP_PORT: " + port);
    vertx
        .createHttpServer()
        .requestHandler(r -> {
            r.response().end("<h1>Hello from my first " +
                    "Vert.x 3 application</h1>");
        })
        .listen(Integer.valueOf(port), result -> {
            if (result.succeeded()) {
                fut.complete();
            } else {
                fut.fail(result.cause());
            }
        });
  }
}

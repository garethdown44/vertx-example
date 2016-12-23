package io.vertx.blog.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

public class Start extends AbstractVerticle {
	public static void main(String[] args) {
	    Vertx vertx = Vertx.vertx();
	    vertx.deployVerticle(MyFirstVerticle.class.getName());
	}
}
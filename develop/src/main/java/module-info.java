/**
 * Teruteru's Test Repository
 *
 * @author teruteru
 */
module com.github.teruteru.study {
  requires java.desktop;
  requires java.management;
  requires java.naming;
  requires java.net.http;
  requires java.rmi;
  requires java.scripting;

  //requires com.google.gson;
  requires org.apache.commons.rng.simple;
  requires org.apache.commons.statistics.distribution;
  //requires org.apache.commons.codec;
  requires org.xerial.sqlitejdbc;
  requires com.fasterxml.jackson.databind;
  requires com.fasterxml.jackson.annotation;
  requires org.openapitools.jackson.nullable;
  requires org.slf4j;

  // guava
  //requires com.google.errorprone.annotations;
  //requires com.google.common;

  //
  //requires jakarta.json;
  requires org.bouncycastle.provider;
  //requires org.twitter4j;

  requires com.github.teruteru.bitmessage;
  requires com.github.teruteru.encode;
  requires com.github.teruteru.sample;
  requires com.github.teruteru.time;
  requires javafx.graphics;
  requires javafx.controls;
  //requires org.bukkit;
  requires org.apache.logging.log4j;
  requires unboundid.ldapsdk;
  requires info.picocli;
  requires com.github.teruteru.foreign.gmp;
  requires jsr305;

  opens com.github.teruteru128.fx;
  opens com.github.teruteru128.study;
  opens com.github.teruteru128.util;
  opens com.github.teruteru128.util.function;
  uses com.github.teruteru128.sample.Sample;
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: music_rpc.proto

package com.github.tozastation.clasickcoreapi.grpc;

public interface ResponseGetAllGenresOrBuilder extends
    // @@protoc_insertion_point(interface_extends:music.ResponseGetAllGenres)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .music.Genre genres = 1;</code>
   */
  java.util.List<com.github.tozastation.clasickcoreapi.grpc.Genre> 
      getGenresList();
  /**
   * <code>repeated .music.Genre genres = 1;</code>
   */
  com.github.tozastation.clasickcoreapi.grpc.Genre getGenres(int index);
  /**
   * <code>repeated .music.Genre genres = 1;</code>
   */
  int getGenresCount();
  /**
   * <code>repeated .music.Genre genres = 1;</code>
   */
  java.util.List<? extends com.github.tozastation.clasickcoreapi.grpc.GenreOrBuilder> 
      getGenresOrBuilderList();
  /**
   * <code>repeated .music.Genre genres = 1;</code>
   */
  com.github.tozastation.clasickcoreapi.grpc.GenreOrBuilder getGenresOrBuilder(
      int index);
}
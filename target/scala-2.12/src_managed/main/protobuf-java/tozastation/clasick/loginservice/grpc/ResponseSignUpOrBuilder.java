// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login_service.proto

package tozastation.clasick.loginservice.grpc;

public interface ResponseSignUpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ResponseSignUp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string access_token = 1;</code>
   */
  java.lang.String getAccessToken();
  /**
   * <code>string access_token = 1;</code>
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>.Result result = 2;</code>
   */
  int getResultValue();
  /**
   * <code>.Result result = 2;</code>
   */
  tozastation.clasick.loginservice.grpc.Result getResult();
}

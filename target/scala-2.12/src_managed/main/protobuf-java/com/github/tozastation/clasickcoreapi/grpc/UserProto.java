// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_rpc.proto

package com.github.tozastation.clasickcoreapi.grpc;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RequestSignIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RequestSignIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ResponseSignIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ResponseSignIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_Contact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RequestSignUp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RequestSignUp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ResponseSignUp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ResponseSignUp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ResponseUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ResponseUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RequestGetSingleUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RequestGetSingleUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ResponseGetSingleUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ResponseGetSingleUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016user_rpc.proto\022\004user\"/\n\rRequestSignIn\022" +
      "\014\n\004name\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"&\n\016Respo" +
      "nseSignIn\022\024\n\014access_token\030\001 \001(\t\"+\n\007Conta" +
      "ct\022\021\n\tphone_num\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\"O\n\r" +
      "RequestSignUp\022\014\n\004name\030\001 \001(\t\022\020\n\010password\030" +
      "\002 \001(\t\022\036\n\007contact\030\003 \001(\0132\r.user.Contact\"&\n" +
      "\016ResponseSignUp\022\024\n\014access_token\030\001 \001(\t\"[\n" +
      "\014ResponseUser\022\017\n\007user_id\030\001 \001(\005\022\021\n\tuser_n" +
      "ame\030\002 \001(\t\022\021\n\ticon_path\030\003 \001(\t\022\024\n\014introduc" +
      "tion\030\004 \001(\t\"\'\n\024RequestGetSingleUser\022\017\n\007us" +
      "er_id\030\001 \001(\005\"9\n\025ResponseGetSingleUser\022 \n\004" +
      "user\030\001 \001(\0132\022.user.ResponseUser2\303\001\n\007UserR" +
      "pc\0225\n\006SignIn\022\023.user.RequestSignIn\032\024.user" +
      ".ResponseSignIn\"\000\0225\n\006SignUp\022\023.user.Reque" +
      "stSignUp\032\024.user.ResponseSignUp\"\000\022J\n\rGetS" +
      "ingleUser\022\032.user.RequestGetSingleUser\032\033." +
      "user.ResponseGetSingleUser\"\000B9\n*com.gith" +
      "ub.tozastation.clasickcoreapi.grpcB\tUser" +
      "ProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_user_RequestSignIn_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_RequestSignIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RequestSignIn_descriptor,
        new java.lang.String[] { "Name", "Password", });
    internal_static_user_ResponseSignIn_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_ResponseSignIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ResponseSignIn_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_user_Contact_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_Contact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_Contact_descriptor,
        new java.lang.String[] { "PhoneNum", "Email", });
    internal_static_user_RequestSignUp_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_RequestSignUp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RequestSignUp_descriptor,
        new java.lang.String[] { "Name", "Password", "Contact", });
    internal_static_user_ResponseSignUp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_ResponseSignUp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ResponseSignUp_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_user_ResponseUser_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_user_ResponseUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ResponseUser_descriptor,
        new java.lang.String[] { "UserId", "UserName", "IconPath", "Introduction", });
    internal_static_user_RequestGetSingleUser_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_user_RequestGetSingleUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RequestGetSingleUser_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_user_ResponseGetSingleUser_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_user_ResponseGetSingleUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ResponseGetSingleUser_descriptor,
        new java.lang.String[] { "User", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

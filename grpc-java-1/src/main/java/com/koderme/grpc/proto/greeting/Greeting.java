// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.koderme.grpc.proto.greeting;

public final class Greeting {
  private Greeting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016greeting.proto\022\010greeting\"%\n\017GreetingRe" +
      "quest\022\022\n\nfirst_name\030\001 \001(\t\"\"\n\020GreetingRes" +
      "ponse\022\016\n\006result\030\001 \001(\t2\372\002\n\017GreetingServic" +
      "e\022>\n\005Greet\022\031.greeting.GreetingRequest\032\032." +
      "greeting.GreetingResponse\022I\n\016GreetManyTi" +
      "mes\022\031.greeting.GreetingRequest\032\032.greetin" +
      "g.GreetingResponse0\001\022D\n\tLongGreet\022\031.gree" +
      "ting.GreetingRequest\032\032.greeting.Greeting" +
      "Response(\001\022J\n\rGreetEveryone\022\031.greeting.G" +
      "reetingRequest\032\032.greeting.GreetingRespon" +
      "se(\0010\001\022J\n\021GreetWithDeadline\022\031.greeting.G" +
      "reetingRequest\032\032.greeting.GreetingRespon" +
      "seB#\n\037com.koderme.grpc.proto.greetingP\001b" +
      "\006proto3"
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
    internal_static_greeting_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greeting_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingRequest_descriptor,
        new java.lang.String[] { "FirstName", });
    internal_static_greeting_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greeting_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

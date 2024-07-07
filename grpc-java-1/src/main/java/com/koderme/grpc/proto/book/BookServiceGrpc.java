package com.koderme.grpc.proto.book;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * *
 * rpc methods send request/s and get response/s that are define in code as messages.
 * When we want multiple request/responses we will use the key word stream in front of the parameter
 * 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: book.proto")
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.BooksRequest,
      com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getGetBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBooks",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.BooksRequest.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.BooksRequest,
      com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getGetBooksMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.BooksRequest, com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getGetBooksMethod;
    if ((getGetBooksMethod = BookServiceGrpc.getGetBooksMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBooksMethod = BookServiceGrpc.getGetBooksMethod) == null) {
          BookServiceGrpc.getGetBooksMethod = getGetBooksMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.BooksRequest, com.koderme.grpc.proto.book.BookOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "getBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.BooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("getBooks"))
                  .build();
          }
        }
     }
     return getGetBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.BookRequest,
      com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getGetBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBook",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.BookRequest.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.BookRequest,
      com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getGetBookMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.BookRequest, com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getGetBookMethod;
    if ((getGetBookMethod = BookServiceGrpc.getGetBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBookMethod = BookServiceGrpc.getGetBookMethod) == null) {
          BookServiceGrpc.getGetBookMethod = getGetBookMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.BookRequest, com.koderme.grpc.proto.book.BookOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "getBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("getBook"))
                  .build();
          }
        }
     }
     return getGetBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Book,
      com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBook",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.Book.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Book,
      com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetBookMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Book, com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetBookMethod;
    if ((getSetBookMethod = BookServiceGrpc.getSetBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSetBookMethod = BookServiceGrpc.getSetBookMethod) == null) {
          BookServiceGrpc.getSetBookMethod = getSetBookMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.Book, com.koderme.grpc.proto.book.BookOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "setBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.Book.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("setBook"))
                  .build();
          }
        }
     }
     return getSetBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.PagesRequest,
      com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getGetPagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPages",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.PagesRequest.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.PageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.PagesRequest,
      com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getGetPagesMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.PagesRequest, com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getGetPagesMethod;
    if ((getGetPagesMethod = BookServiceGrpc.getGetPagesMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetPagesMethod = BookServiceGrpc.getGetPagesMethod) == null) {
          BookServiceGrpc.getGetPagesMethod = getGetPagesMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.PagesRequest, com.koderme.grpc.proto.book.BookOuterClass.PageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "getPages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.PagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.PageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("getPages"))
                  .build();
          }
        }
     }
     return getGetPagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.PageRequest,
      com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getGetPageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPage",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.PageRequest.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.PageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.PageRequest,
      com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getGetPageMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.PageRequest, com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getGetPageMethod;
    if ((getGetPageMethod = BookServiceGrpc.getGetPageMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetPageMethod = BookServiceGrpc.getGetPageMethod) == null) {
          BookServiceGrpc.getGetPageMethod = getGetPageMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.PageRequest, com.koderme.grpc.proto.book.BookOuterClass.PageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "getPage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.PageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.PageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("getPage"))
                  .build();
          }
        }
     }
     return getGetPageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Page,
      com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetPageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPage",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.Page.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Page,
      com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetPageMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Page, com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetPageMethod;
    if ((getSetPageMethod = BookServiceGrpc.getSetPageMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSetPageMethod = BookServiceGrpc.getSetPageMethod) == null) {
          BookServiceGrpc.getSetPageMethod = getSetPageMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.Page, com.koderme.grpc.proto.book.BookOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "setPage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.Page.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("setPage"))
                  .build();
          }
        }
     }
     return getSetPageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Page,
      com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetPagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPages",
      requestType = com.koderme.grpc.proto.book.BookOuterClass.Page.class,
      responseType = com.koderme.grpc.proto.book.BookOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Page,
      com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetPagesMethod() {
    io.grpc.MethodDescriptor<com.koderme.grpc.proto.book.BookOuterClass.Page, com.koderme.grpc.proto.book.BookOuterClass.Empty> getSetPagesMethod;
    if ((getSetPagesMethod = BookServiceGrpc.getSetPagesMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSetPagesMethod = BookServiceGrpc.getSetPagesMethod) == null) {
          BookServiceGrpc.getSetPagesMethod = getSetPagesMethod = 
              io.grpc.MethodDescriptor.<com.koderme.grpc.proto.book.BookOuterClass.Page, com.koderme.grpc.proto.book.BookOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "setPages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.Page.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.koderme.grpc.proto.book.BookOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("setPages"))
                  .build();
          }
        }
     }
     return getSetPagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    return new BookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookServiceFutureStub(channel);
  }

  /**
   * <pre>
   * *
   * rpc methods send request/s and get response/s that are define in code as messages.
   * When we want multiple request/responses we will use the key word stream in front of the parameter
   * 
   * </pre>
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBooks(com.koderme.grpc.proto.book.BookOuterClass.BooksRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBooksMethod(), responseObserver);
    }

    /**
     */
    public void getBook(com.koderme.grpc.proto.book.BookOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookMethod(), responseObserver);
    }

    /**
     */
    public void setBook(com.koderme.grpc.proto.book.BookOuterClass.Book request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetBookMethod(), responseObserver);
    }

    /**
     */
    public void getPages(com.koderme.grpc.proto.book.BookOuterClass.PagesRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.PageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPagesMethod(), responseObserver);
    }

    /**
     */
    public void getPage(com.koderme.grpc.proto.book.BookOuterClass.PageRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.PageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPageMethod(), responseObserver);
    }

    /**
     */
    public void setPage(com.koderme.grpc.proto.book.BookOuterClass.Page request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Page> setPages(
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetPagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBooksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.BooksRequest,
                com.koderme.grpc.proto.book.BookOuterClass.BookResponse>(
                  this, METHODID_GET_BOOKS)))
          .addMethod(
            getGetBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.BookRequest,
                com.koderme.grpc.proto.book.BookOuterClass.BookResponse>(
                  this, METHODID_GET_BOOK)))
          .addMethod(
            getSetBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.Book,
                com.koderme.grpc.proto.book.BookOuterClass.Empty>(
                  this, METHODID_SET_BOOK)))
          .addMethod(
            getGetPagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.PagesRequest,
                com.koderme.grpc.proto.book.BookOuterClass.PageResponse>(
                  this, METHODID_GET_PAGES)))
          .addMethod(
            getGetPageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.PageRequest,
                com.koderme.grpc.proto.book.BookOuterClass.PageResponse>(
                  this, METHODID_GET_PAGE)))
          .addMethod(
            getSetPageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.Page,
                com.koderme.grpc.proto.book.BookOuterClass.Empty>(
                  this, METHODID_SET_PAGE)))
          .addMethod(
            getSetPagesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.koderme.grpc.proto.book.BookOuterClass.Page,
                com.koderme.grpc.proto.book.BookOuterClass.Empty>(
                  this, METHODID_SET_PAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * *
   * rpc methods send request/s and get response/s that are define in code as messages.
   * When we want multiple request/responses we will use the key word stream in front of the parameter
   * 
   * </pre>
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractStub<BookServiceStub> {
    private BookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBooks(com.koderme.grpc.proto.book.BookOuterClass.BooksRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.BookResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBook(com.koderme.grpc.proto.book.BookOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.BookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setBook(com.koderme.grpc.proto.book.BookOuterClass.Book request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPages(com.koderme.grpc.proto.book.BookOuterClass.PagesRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.PageResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPage(com.koderme.grpc.proto.book.BookOuterClass.PageRequest request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.PageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPage(com.koderme.grpc.proto.book.BookOuterClass.Page request,
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Page> setPages(
        io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSetPagesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * *
   * rpc methods send request/s and get response/s that are define in code as messages.
   * When we want multiple request/responses we will use the key word stream in front of the parameter
   * 
   * </pre>
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getBooks(
        com.koderme.grpc.proto.book.BookOuterClass.BooksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetBooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.koderme.grpc.proto.book.BookOuterClass.BookResponse getBook(com.koderme.grpc.proto.book.BookOuterClass.BookRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.koderme.grpc.proto.book.BookOuterClass.Empty setBook(com.koderme.grpc.proto.book.BookOuterClass.Book request) {
      return blockingUnaryCall(
          getChannel(), getSetBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getPages(
        com.koderme.grpc.proto.book.BookOuterClass.PagesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.koderme.grpc.proto.book.BookOuterClass.PageResponse getPage(com.koderme.grpc.proto.book.BookOuterClass.PageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.koderme.grpc.proto.book.BookOuterClass.Empty setPage(com.koderme.grpc.proto.book.BookOuterClass.Page request) {
      return blockingUnaryCall(
          getChannel(), getSetPageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * *
   * rpc methods send request/s and get response/s that are define in code as messages.
   * When we want multiple request/responses we will use the key word stream in front of the parameter
   * 
   * </pre>
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractStub<BookServiceFutureStub> {
    private BookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.koderme.grpc.proto.book.BookOuterClass.BookResponse> getBook(
        com.koderme.grpc.proto.book.BookOuterClass.BookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.koderme.grpc.proto.book.BookOuterClass.Empty> setBook(
        com.koderme.grpc.proto.book.BookOuterClass.Book request) {
      return futureUnaryCall(
          getChannel().newCall(getSetBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.koderme.grpc.proto.book.BookOuterClass.PageResponse> getPage(
        com.koderme.grpc.proto.book.BookOuterClass.PageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.koderme.grpc.proto.book.BookOuterClass.Empty> setPage(
        com.koderme.grpc.proto.book.BookOuterClass.Page request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOKS = 0;
  private static final int METHODID_GET_BOOK = 1;
  private static final int METHODID_SET_BOOK = 2;
  private static final int METHODID_GET_PAGES = 3;
  private static final int METHODID_GET_PAGE = 4;
  private static final int METHODID_SET_PAGE = 5;
  private static final int METHODID_SET_PAGES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOKS:
          serviceImpl.getBooks((com.koderme.grpc.proto.book.BookOuterClass.BooksRequest) request,
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.BookResponse>) responseObserver);
          break;
        case METHODID_GET_BOOK:
          serviceImpl.getBook((com.koderme.grpc.proto.book.BookOuterClass.BookRequest) request,
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.BookResponse>) responseObserver);
          break;
        case METHODID_SET_BOOK:
          serviceImpl.setBook((com.koderme.grpc.proto.book.BookOuterClass.Book) request,
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_PAGES:
          serviceImpl.getPages((com.koderme.grpc.proto.book.BookOuterClass.PagesRequest) request,
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.PageResponse>) responseObserver);
          break;
        case METHODID_GET_PAGE:
          serviceImpl.getPage((com.koderme.grpc.proto.book.BookOuterClass.PageRequest) request,
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.PageResponse>) responseObserver);
          break;
        case METHODID_SET_PAGE:
          serviceImpl.setPage((com.koderme.grpc.proto.book.BookOuterClass.Page) request,
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_PAGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setPages(
              (io.grpc.stub.StreamObserver<com.koderme.grpc.proto.book.BookOuterClass.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.koderme.grpc.proto.book.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getGetBooksMethod())
              .addMethod(getGetBookMethod())
              .addMethod(getSetBookMethod())
              .addMethod(getGetPagesMethod())
              .addMethod(getGetPageMethod())
              .addMethod(getSetPageMethod())
              .addMethod(getSetPagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

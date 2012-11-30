// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test_rpc_service.proto

package org.apache.hadoop.hbase.ipc.protobuf.generated;

public final class TestRpcServiceProtos {
  private TestRpcServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static abstract class TestProtobufRpcProto
      implements com.google.protobuf.Service {
    protected TestProtobufRpcProto() {}
    
    public interface Interface {
      public abstract void ping(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);
      
      public abstract void echo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto> done);
      
      public abstract void error(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);
      
    }
    
    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new TestProtobufRpcProto() {
        @java.lang.Override
        public  void ping(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
          impl.ping(controller, request, done);
        }
        
        @java.lang.Override
        public  void echo(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto> done) {
          impl.echo(controller, request, done);
        }
        
        @java.lang.Override
        public  void error(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
          impl.error(controller, request, done);
        }
        
      };
    }
    
    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }
        
        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.ping(controller, (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request);
            case 1:
              return impl.echo(controller, (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto)request);
            case 2:
              return impl.error(controller, (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
      };
    }
    
    public abstract void ping(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);
    
    public abstract void echo(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto> done);
    
    public abstract void error(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);
    
    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.ipc.protobuf.generated.TestRpcServiceProtos.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    
    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.ping(controller, (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.echo(controller, (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.error(controller, (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }
    
    public static final class Stub extends org.apache.hadoop.hbase.ipc.protobuf.generated.TestRpcServiceProtos.TestProtobufRpcProto implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.RpcChannel channel;
      
      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }
      
      public  void ping(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.class,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance()));
      }
      
      public  void echo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto.class,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance()));
      }
      
      public  void error(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.class,
            org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance()));
      }
    }
    
    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }
    
    public interface BlockingInterface {
      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto ping(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws com.google.protobuf.ServiceException;
      
      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto echo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto request)
          throws com.google.protobuf.ServiceException;
      
      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto error(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws com.google.protobuf.ServiceException;
    }
    
    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.BlockingRpcChannel channel;
      
      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto ping(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance());
      }
      
      
      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto echo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance());
      }
      
      
      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto error(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance());
      }
      
    }
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026test_rpc_service.proto\032\ntest.proto2\250\001\n" +
      "\024TestProtobufRpcProto\022/\n\004ping\022\022.EmptyReq" +
      "uestProto\032\023.EmptyResponseProto\022-\n\004echo\022\021" +
      ".EchoRequestProto\032\022.EchoResponseProto\0220\n" +
      "\005error\022\022.EmptyRequestProto\032\023.EmptyRespon" +
      "seProtoBL\n.org.apache.hadoop.hbase.ipc.p" +
      "rotobuf.generatedB\024TestRpcServiceProtos\210" +
      "\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.hbase.ipc.protobuf.generated.TestProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}

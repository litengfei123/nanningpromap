package com.ceiv.communication;

public final class NetMgrMsg {
  private NetMgrMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HMulticastOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HMulticast)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string serverIp = 1;</code>
     */
    boolean hasServerIp();
    /**
     * <code>required string serverIp = 1;</code>
     */
    java.lang.String getServerIp();
    /**
     * <code>required string serverIp = 1;</code>
     */
    com.google.protobuf.ByteString
        getServerIpBytes();

    /**
     * <code>required int32 serverPort = 2;</code>
     */
    boolean hasServerPort();
    /**
     * <code>required int32 serverPort = 2;</code>
     */
    int getServerPort();

    /**
     * <code>required .MulticastOptEnum opt = 3;</code>
     */
    boolean hasOpt();
    /**
     * <code>required .MulticastOptEnum opt = 3;</code>
     */
    NetMgrDefine.MulticastOptEnum getOpt();

    /**
     * <code>required int32 content = 4;</code>
     */
    boolean hasContent();
    /**
     * <code>required int32 content = 4;</code>
     */
    int getContent();
  }
  /**
   * <pre>
   * 0x11
   * </pre>
   *
   * Protobuf type {@code HMulticast}
   */
  public  static final class HMulticast extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HMulticast)
      HMulticastOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HMulticast.newBuilder() to construct.
    private HMulticast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HMulticast() {
      serverIp_ = "";
      serverPort_ = 0;
      opt_ = 0;
      content_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HMulticast(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              serverIp_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              serverPort_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.MulticastOptEnum value = NetMgrDefine.MulticastOptEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                opt_ = rawValue;
              }
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              content_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HMulticast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HMulticast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HMulticast.class, NetMgrMsg.HMulticast.Builder.class);
    }

    private int bitField0_;
    public static final int SERVERIP_FIELD_NUMBER = 1;
    private volatile java.lang.Object serverIp_;
    /**
     * <code>required string serverIp = 1;</code>
     */
    public boolean hasServerIp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string serverIp = 1;</code>
     */
    public java.lang.String getServerIp() {
      java.lang.Object ref = serverIp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverIp_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string serverIp = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServerIpBytes() {
      java.lang.Object ref = serverIp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVERPORT_FIELD_NUMBER = 2;
    private int serverPort_;
    /**
     * <code>required int32 serverPort = 2;</code>
     */
    public boolean hasServerPort() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 serverPort = 2;</code>
     */
    public int getServerPort() {
      return serverPort_;
    }

    public static final int OPT_FIELD_NUMBER = 3;
    private int opt_;
    /**
     * <code>required .MulticastOptEnum opt = 3;</code>
     */
    public boolean hasOpt() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .MulticastOptEnum opt = 3;</code>
     */
    public NetMgrDefine.MulticastOptEnum getOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.MulticastOptEnum result = NetMgrDefine.MulticastOptEnum.valueOf(opt_);
      return result == null ? NetMgrDefine.MulticastOptEnum.SEARCH_DEV : result;
    }

    public static final int CONTENT_FIELD_NUMBER = 4;
    private int content_;
    /**
     * <code>required int32 content = 4;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 content = 4;</code>
     */
    public int getContent() {
      return content_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasServerIp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serverIp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, serverPort_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, opt_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, content_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serverIp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, serverPort_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, opt_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, content_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HMulticast)) {
        return super.equals(obj);
      }
      NetMgrMsg.HMulticast other = (NetMgrMsg.HMulticast) obj;

      boolean result = true;
      result = result && (hasServerIp() == other.hasServerIp());
      if (hasServerIp()) {
        result = result && getServerIp()
            .equals(other.getServerIp());
      }
      result = result && (hasServerPort() == other.hasServerPort());
      if (hasServerPort()) {
        result = result && (getServerPort()
            == other.getServerPort());
      }
      result = result && (hasOpt() == other.hasOpt());
      if (hasOpt()) {
        result = result && opt_ == other.opt_;
      }
      result = result && (hasContent() == other.hasContent());
      if (hasContent()) {
        result = result && (getContent()
            == other.getContent());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasServerIp()) {
        hash = (37 * hash) + SERVERIP_FIELD_NUMBER;
        hash = (53 * hash) + getServerIp().hashCode();
      }
      if (hasServerPort()) {
        hash = (37 * hash) + SERVERPORT_FIELD_NUMBER;
        hash = (53 * hash) + getServerPort();
      }
      if (hasOpt()) {
        hash = (37 * hash) + OPT_FIELD_NUMBER;
        hash = (53 * hash) + opt_;
      }
      if (hasContent()) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HMulticast parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HMulticast parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HMulticast parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HMulticast parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HMulticast parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HMulticast parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HMulticast prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x11
     * </pre>
     *
     * Protobuf type {@code HMulticast}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HMulticast)
        NetMgrMsg.HMulticastOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HMulticast_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HMulticast_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HMulticast.class, NetMgrMsg.HMulticast.Builder.class);
      }

      // Construct using NetMgrMsg.HMulticast.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        serverIp_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        opt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        content_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HMulticast_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HMulticast getDefaultInstanceForType() {
        return NetMgrMsg.HMulticast.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HMulticast build() {
        NetMgrMsg.HMulticast result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HMulticast buildPartial() {
        NetMgrMsg.HMulticast result = new NetMgrMsg.HMulticast(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serverIp_ = serverIp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverPort_ = serverPort_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.opt_ = opt_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HMulticast) {
          return mergeFrom((NetMgrMsg.HMulticast)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HMulticast other) {
        if (other == NetMgrMsg.HMulticast.getDefaultInstance()) return this;
        if (other.hasServerIp()) {
          bitField0_ |= 0x00000001;
          serverIp_ = other.serverIp_;
          onChanged();
        }
        if (other.hasServerPort()) {
          setServerPort(other.getServerPort());
        }
        if (other.hasOpt()) {
          setOpt(other.getOpt());
        }
        if (other.hasContent()) {
          setContent(other.getContent());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasServerIp()) {
          return false;
        }
        if (!hasServerPort()) {
          return false;
        }
        if (!hasOpt()) {
          return false;
        }
        if (!hasContent()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HMulticast parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HMulticast) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object serverIp_ = "";
      /**
       * <code>required string serverIp = 1;</code>
       */
      public boolean hasServerIp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string serverIp = 1;</code>
       */
      public java.lang.String getServerIp() {
        java.lang.Object ref = serverIp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverIp_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string serverIp = 1;</code>
       */
      public com.google.protobuf.ByteString
          getServerIpBytes() {
        java.lang.Object ref = serverIp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverIp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string serverIp = 1;</code>
       */
      public Builder setServerIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        serverIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string serverIp = 1;</code>
       */
      public Builder clearServerIp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serverIp_ = getDefaultInstance().getServerIp();
        onChanged();
        return this;
      }
      /**
       * <code>required string serverIp = 1;</code>
       */
      public Builder setServerIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        serverIp_ = value;
        onChanged();
        return this;
      }

      private int serverPort_ ;
      /**
       * <code>required int32 serverPort = 2;</code>
       */
      public boolean hasServerPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 serverPort = 2;</code>
       */
      public int getServerPort() {
        return serverPort_;
      }
      /**
       * <code>required int32 serverPort = 2;</code>
       */
      public Builder setServerPort(int value) {
        bitField0_ |= 0x00000002;
        serverPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 serverPort = 2;</code>
       */
      public Builder clearServerPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverPort_ = 0;
        onChanged();
        return this;
      }

      private int opt_ = 0;
      /**
       * <code>required .MulticastOptEnum opt = 3;</code>
       */
      public boolean hasOpt() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .MulticastOptEnum opt = 3;</code>
       */
      public NetMgrDefine.MulticastOptEnum getOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.MulticastOptEnum result = NetMgrDefine.MulticastOptEnum.valueOf(opt_);
        return result == null ? NetMgrDefine.MulticastOptEnum.SEARCH_DEV : result;
      }
      /**
       * <code>required .MulticastOptEnum opt = 3;</code>
       */
      public Builder setOpt(NetMgrDefine.MulticastOptEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        opt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .MulticastOptEnum opt = 3;</code>
       */
      public Builder clearOpt() {
        bitField0_ = (bitField0_ & ~0x00000004);
        opt_ = 0;
        onChanged();
        return this;
      }

      private int content_ ;
      /**
       * <code>required int32 content = 4;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 content = 4;</code>
       */
      public int getContent() {
        return content_;
      }
      /**
       * <code>required int32 content = 4;</code>
       */
      public Builder setContent(int value) {
        bitField0_ |= 0x00000008;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 content = 4;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000008);
        content_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HMulticast)
    }

    // @@protoc_insertion_point(class_scope:HMulticast)
    private static final NetMgrMsg.HMulticast DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HMulticast();
    }

    public static NetMgrMsg.HMulticast getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HMulticast>
        PARSER = new com.google.protobuf.AbstractParser<HMulticast>() {
      @java.lang.Override
      public HMulticast parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HMulticast(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HMulticast> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HMulticast> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HMulticast getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMulticastOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMulticast)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string ip = 1;</code>
     */
    boolean hasIp();
    /**
     * <code>required string ip = 1;</code>
     */
    java.lang.String getIp();
    /**
     * <code>required string ip = 1;</code>
     */
    com.google.protobuf.ByteString
        getIpBytes();

    /**
     * <code>required string mac = 2;</code>
     */
    boolean hasMac();
    /**
     * <code>required string mac = 2;</code>
     */
    java.lang.String getMac();
    /**
     * <code>required string mac = 2;</code>
     */
    com.google.protobuf.ByteString
        getMacBytes();

    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    int getType();

    /**
     * <code>required string identify = 4;</code>
     */
    boolean hasIdentify();
    /**
     * <code>required string identify = 4;</code>
     */
    java.lang.String getIdentify();
    /**
     * <code>required string identify = 4;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <code>required int32 diskFree = 5;</code>
     */
    boolean hasDiskFree();
    /**
     * <code>required int32 diskFree = 5;</code>
     */
    int getDiskFree();

    /**
     * <code>optional string verApp = 6;</code>
     */
    boolean hasVerApp();
    /**
     * <code>optional string verApp = 6;</code>
     */
    java.lang.String getVerApp();
    /**
     * <code>optional string verApp = 6;</code>
     */
    com.google.protobuf.ByteString
        getVerAppBytes();

    /**
     * <code>optional string verUi = 7;</code>
     */
    boolean hasVerUi();
    /**
     * <code>optional string verUi = 7;</code>
     */
    java.lang.String getVerUi();
    /**
     * <code>optional string verUi = 7;</code>
     */
    com.google.protobuf.ByteString
        getVerUiBytes();

    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    boolean hasIpEth1();
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    java.lang.String getIpEth1();
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    com.google.protobuf.ByteString
        getIpEth1Bytes();

    /**
     * <code>optional string macEth1 = 9;</code>
     */
    boolean hasMacEth1();
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    java.lang.String getMacEth1();
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    com.google.protobuf.ByteString
        getMacEth1Bytes();
  }
  /**
   * <pre>
   * 0x11
   * </pre>
   *
   * Protobuf type {@code CMulticast}
   */
  public  static final class CMulticast extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMulticast)
      CMulticastOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMulticast.newBuilder() to construct.
    private CMulticast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMulticast() {
      ip_ = "";
      mac_ = "";
      type_ = 0;
      identify_ = "";
      diskFree_ = 0;
      verApp_ = "";
      verUi_ = "";
      ipEth1_ = "";
      macEth1_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMulticast(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              ip_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              mac_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              type_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              identify_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              diskFree_ = input.readInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              verApp_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              verUi_ = bs;
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              ipEth1_ = bs;
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              macEth1_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_CMulticast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_CMulticast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.CMulticast.class, NetMgrMsg.CMulticast.Builder.class);
    }

    private int bitField0_;
    public static final int IP_FIELD_NUMBER = 1;
    private volatile java.lang.Object ip_;
    /**
     * <code>required string ip = 1;</code>
     */
    public boolean hasIp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string ip = 1;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ip_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MAC_FIELD_NUMBER = 2;
    private volatile java.lang.Object mac_;
    /**
     * <code>required string mac = 2;</code>
     */
    public boolean hasMac() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string mac = 2;</code>
     */
    public java.lang.String getMac() {
      java.lang.Object ref = mac_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mac_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string mac = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMacBytes() {
      java.lang.Object ref = mac_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mac_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int IDENTIFY_FIELD_NUMBER = 4;
    private volatile java.lang.Object identify_;
    /**
     * <code>required string identify = 4;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string identify = 4;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string identify = 4;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISKFREE_FIELD_NUMBER = 5;
    private int diskFree_;
    /**
     * <code>required int32 diskFree = 5;</code>
     */
    public boolean hasDiskFree() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 diskFree = 5;</code>
     */
    public int getDiskFree() {
      return diskFree_;
    }

    public static final int VERAPP_FIELD_NUMBER = 6;
    private volatile java.lang.Object verApp_;
    /**
     * <code>optional string verApp = 6;</code>
     */
    public boolean hasVerApp() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string verApp = 6;</code>
     */
    public java.lang.String getVerApp() {
      java.lang.Object ref = verApp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verApp_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string verApp = 6;</code>
     */
    public com.google.protobuf.ByteString
        getVerAppBytes() {
      java.lang.Object ref = verApp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verApp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERUI_FIELD_NUMBER = 7;
    private volatile java.lang.Object verUi_;
    /**
     * <code>optional string verUi = 7;</code>
     */
    public boolean hasVerUi() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string verUi = 7;</code>
     */
    public java.lang.String getVerUi() {
      java.lang.Object ref = verUi_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verUi_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string verUi = 7;</code>
     */
    public com.google.protobuf.ByteString
        getVerUiBytes() {
      java.lang.Object ref = verUi_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verUi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IPETH1_FIELD_NUMBER = 8;
    private volatile java.lang.Object ipEth1_;
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    public boolean hasIpEth1() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    public java.lang.String getIpEth1() {
      java.lang.Object ref = ipEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ipEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    public com.google.protobuf.ByteString
        getIpEth1Bytes() {
      java.lang.Object ref = ipEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MACETH1_FIELD_NUMBER = 9;
    private volatile java.lang.Object macEth1_;
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    public boolean hasMacEth1() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    public java.lang.String getMacEth1() {
      java.lang.Object ref = macEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          macEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    public com.google.protobuf.ByteString
        getMacEth1Bytes() {
      java.lang.Object ref = macEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        macEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMac()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDiskFree()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mac_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, identify_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, diskFree_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, verApp_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, verUi_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, ipEth1_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, macEth1_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mac_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, identify_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, diskFree_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, verApp_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, verUi_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, ipEth1_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, macEth1_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.CMulticast)) {
        return super.equals(obj);
      }
      NetMgrMsg.CMulticast other = (NetMgrMsg.CMulticast) obj;

      boolean result = true;
      result = result && (hasIp() == other.hasIp());
      if (hasIp()) {
        result = result && getIp()
            .equals(other.getIp());
      }
      result = result && (hasMac() == other.hasMac());
      if (hasMac()) {
        result = result && getMac()
            .equals(other.getMac());
      }
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && (hasDiskFree() == other.hasDiskFree());
      if (hasDiskFree()) {
        result = result && (getDiskFree()
            == other.getDiskFree());
      }
      result = result && (hasVerApp() == other.hasVerApp());
      if (hasVerApp()) {
        result = result && getVerApp()
            .equals(other.getVerApp());
      }
      result = result && (hasVerUi() == other.hasVerUi());
      if (hasVerUi()) {
        result = result && getVerUi()
            .equals(other.getVerUi());
      }
      result = result && (hasIpEth1() == other.hasIpEth1());
      if (hasIpEth1()) {
        result = result && getIpEth1()
            .equals(other.getIpEth1());
      }
      result = result && (hasMacEth1() == other.hasMacEth1());
      if (hasMacEth1()) {
        result = result && getMacEth1()
            .equals(other.getMacEth1());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIp()) {
        hash = (37 * hash) + IP_FIELD_NUMBER;
        hash = (53 * hash) + getIp().hashCode();
      }
      if (hasMac()) {
        hash = (37 * hash) + MAC_FIELD_NUMBER;
        hash = (53 * hash) + getMac().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (hasDiskFree()) {
        hash = (37 * hash) + DISKFREE_FIELD_NUMBER;
        hash = (53 * hash) + getDiskFree();
      }
      if (hasVerApp()) {
        hash = (37 * hash) + VERAPP_FIELD_NUMBER;
        hash = (53 * hash) + getVerApp().hashCode();
      }
      if (hasVerUi()) {
        hash = (37 * hash) + VERUI_FIELD_NUMBER;
        hash = (53 * hash) + getVerUi().hashCode();
      }
      if (hasIpEth1()) {
        hash = (37 * hash) + IPETH1_FIELD_NUMBER;
        hash = (53 * hash) + getIpEth1().hashCode();
      }
      if (hasMacEth1()) {
        hash = (37 * hash) + MACETH1_FIELD_NUMBER;
        hash = (53 * hash) + getMacEth1().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.CMulticast parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CMulticast parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CMulticast parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CMulticast parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CMulticast parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CMulticast parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.CMulticast prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x11
     * </pre>
     *
     * Protobuf type {@code CMulticast}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMulticast)
        NetMgrMsg.CMulticastOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_CMulticast_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_CMulticast_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.CMulticast.class, NetMgrMsg.CMulticast.Builder.class);
      }

      // Construct using NetMgrMsg.CMulticast.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ip_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        mac_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        diskFree_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        verApp_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        verUi_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        ipEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        macEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_CMulticast_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.CMulticast getDefaultInstanceForType() {
        return NetMgrMsg.CMulticast.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.CMulticast build() {
        NetMgrMsg.CMulticast result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.CMulticast buildPartial() {
        NetMgrMsg.CMulticast result = new NetMgrMsg.CMulticast(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ip_ = ip_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mac_ = mac_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.identify_ = identify_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.diskFree_ = diskFree_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.verApp_ = verApp_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.verUi_ = verUi_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.ipEth1_ = ipEth1_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.macEth1_ = macEth1_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.CMulticast) {
          return mergeFrom((NetMgrMsg.CMulticast)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.CMulticast other) {
        if (other == NetMgrMsg.CMulticast.getDefaultInstance()) return this;
        if (other.hasIp()) {
          bitField0_ |= 0x00000001;
          ip_ = other.ip_;
          onChanged();
        }
        if (other.hasMac()) {
          bitField0_ |= 0x00000002;
          mac_ = other.mac_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000008;
          identify_ = other.identify_;
          onChanged();
        }
        if (other.hasDiskFree()) {
          setDiskFree(other.getDiskFree());
        }
        if (other.hasVerApp()) {
          bitField0_ |= 0x00000020;
          verApp_ = other.verApp_;
          onChanged();
        }
        if (other.hasVerUi()) {
          bitField0_ |= 0x00000040;
          verUi_ = other.verUi_;
          onChanged();
        }
        if (other.hasIpEth1()) {
          bitField0_ |= 0x00000080;
          ipEth1_ = other.ipEth1_;
          onChanged();
        }
        if (other.hasMacEth1()) {
          bitField0_ |= 0x00000100;
          macEth1_ = other.macEth1_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIp()) {
          return false;
        }
        if (!hasMac()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        if (!hasIdentify()) {
          return false;
        }
        if (!hasDiskFree()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.CMulticast parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.CMulticast) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object ip_ = "";
      /**
       * <code>required string ip = 1;</code>
       */
      public boolean hasIp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ip_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ip_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object mac_ = "";
      /**
       * <code>required string mac = 2;</code>
       */
      public boolean hasMac() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public java.lang.String getMac() {
        java.lang.Object ref = mac_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mac_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMacBytes() {
        java.lang.Object ref = mac_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mac_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public Builder setMac(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mac_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public Builder clearMac() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mac_ = getDefaultInstance().getMac();
        onChanged();
        return this;
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public Builder setMacBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mac_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object identify_ = "";
      /**
       * <code>required string identify = 4;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000008);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        identify_ = value;
        onChanged();
        return this;
      }

      private int diskFree_ ;
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public boolean hasDiskFree() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public int getDiskFree() {
        return diskFree_;
      }
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public Builder setDiskFree(int value) {
        bitField0_ |= 0x00000010;
        diskFree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public Builder clearDiskFree() {
        bitField0_ = (bitField0_ & ~0x00000010);
        diskFree_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object verApp_ = "";
      /**
       * <code>optional string verApp = 6;</code>
       */
      public boolean hasVerApp() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public java.lang.String getVerApp() {
        java.lang.Object ref = verApp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verApp_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public com.google.protobuf.ByteString
          getVerAppBytes() {
        java.lang.Object ref = verApp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          verApp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public Builder setVerApp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        verApp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public Builder clearVerApp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        verApp_ = getDefaultInstance().getVerApp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public Builder setVerAppBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        verApp_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object verUi_ = "";
      /**
       * <code>optional string verUi = 7;</code>
       */
      public boolean hasVerUi() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public java.lang.String getVerUi() {
        java.lang.Object ref = verUi_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verUi_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public com.google.protobuf.ByteString
          getVerUiBytes() {
        java.lang.Object ref = verUi_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          verUi_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public Builder setVerUi(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        verUi_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public Builder clearVerUi() {
        bitField0_ = (bitField0_ & ~0x00000040);
        verUi_ = getDefaultInstance().getVerUi();
        onChanged();
        return this;
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public Builder setVerUiBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        verUi_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ipEth1_ = "";
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public boolean hasIpEth1() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public java.lang.String getIpEth1() {
        java.lang.Object ref = ipEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ipEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public com.google.protobuf.ByteString
          getIpEth1Bytes() {
        java.lang.Object ref = ipEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public Builder setIpEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        ipEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public Builder clearIpEth1() {
        bitField0_ = (bitField0_ & ~0x00000080);
        ipEth1_ = getDefaultInstance().getIpEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public Builder setIpEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        ipEth1_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object macEth1_ = "";
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public boolean hasMacEth1() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public java.lang.String getMacEth1() {
        java.lang.Object ref = macEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            macEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public com.google.protobuf.ByteString
          getMacEth1Bytes() {
        java.lang.Object ref = macEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          macEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public Builder setMacEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        macEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public Builder clearMacEth1() {
        bitField0_ = (bitField0_ & ~0x00000100);
        macEth1_ = getDefaultInstance().getMacEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public Builder setMacEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        macEth1_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMulticast)
    }

    // @@protoc_insertion_point(class_scope:CMulticast)
    private static final NetMgrMsg.CMulticast DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.CMulticast();
    }

    public static NetMgrMsg.CMulticast getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMulticast>
        PARSER = new com.google.protobuf.AbstractParser<CMulticast>() {
      @java.lang.Override
      public CMulticast parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMulticast(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMulticast> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMulticast> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.CMulticast getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CHeartBeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CHeartBeat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string ip = 1;</code>
     */
    boolean hasIp();
    /**
     * <code>required string ip = 1;</code>
     */
    java.lang.String getIp();
    /**
     * <code>required string ip = 1;</code>
     */
    com.google.protobuf.ByteString
        getIpBytes();

    /**
     * <code>required string mac = 2;</code>
     */
    boolean hasMac();
    /**
     * <code>required string mac = 2;</code>
     */
    java.lang.String getMac();
    /**
     * <code>required string mac = 2;</code>
     */
    com.google.protobuf.ByteString
        getMacBytes();

    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    int getType();

    /**
     * <code>required string identify = 4;</code>
     */
    boolean hasIdentify();
    /**
     * <code>required string identify = 4;</code>
     */
    java.lang.String getIdentify();
    /**
     * <code>required string identify = 4;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <code>required int32 diskFree = 5;</code>
     */
    boolean hasDiskFree();
    /**
     * <code>required int32 diskFree = 5;</code>
     */
    int getDiskFree();

    /**
     * <code>optional string verApp = 6;</code>
     */
    boolean hasVerApp();
    /**
     * <code>optional string verApp = 6;</code>
     */
    java.lang.String getVerApp();
    /**
     * <code>optional string verApp = 6;</code>
     */
    com.google.protobuf.ByteString
        getVerAppBytes();

    /**
     * <code>optional string verUi = 7;</code>
     */
    boolean hasVerUi();
    /**
     * <code>optional string verUi = 7;</code>
     */
    java.lang.String getVerUi();
    /**
     * <code>optional string verUi = 7;</code>
     */
    com.google.protobuf.ByteString
        getVerUiBytes();

    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    boolean hasIpEth1();
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    java.lang.String getIpEth1();
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    com.google.protobuf.ByteString
        getIpEth1Bytes();

    /**
     * <code>optional string macEth1 = 9;</code>
     */
    boolean hasMacEth1();
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    java.lang.String getMacEth1();
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    com.google.protobuf.ByteString
        getMacEth1Bytes();
  }
  /**
   * <pre>
   * 0x21
   * </pre>
   *
   * Protobuf type {@code CHeartBeat}
   */
  public  static final class CHeartBeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CHeartBeat)
      CHeartBeatOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CHeartBeat.newBuilder() to construct.
    private CHeartBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CHeartBeat() {
      ip_ = "";
      mac_ = "";
      type_ = 0;
      identify_ = "";
      diskFree_ = 0;
      verApp_ = "";
      verUi_ = "";
      ipEth1_ = "";
      macEth1_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CHeartBeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              ip_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              mac_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              type_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              identify_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              diskFree_ = input.readInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              verApp_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              verUi_ = bs;
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              ipEth1_ = bs;
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              macEth1_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_CHeartBeat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_CHeartBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.CHeartBeat.class, NetMgrMsg.CHeartBeat.Builder.class);
    }

    private int bitField0_;
    public static final int IP_FIELD_NUMBER = 1;
    private volatile java.lang.Object ip_;
    /**
     * <code>required string ip = 1;</code>
     */
    public boolean hasIp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string ip = 1;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ip_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MAC_FIELD_NUMBER = 2;
    private volatile java.lang.Object mac_;
    /**
     * <code>required string mac = 2;</code>
     */
    public boolean hasMac() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string mac = 2;</code>
     */
    public java.lang.String getMac() {
      java.lang.Object ref = mac_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mac_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string mac = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMacBytes() {
      java.lang.Object ref = mac_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mac_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * device type 
     * </pre>
     *
     * <code>required int32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int IDENTIFY_FIELD_NUMBER = 4;
    private volatile java.lang.Object identify_;
    /**
     * <code>required string identify = 4;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string identify = 4;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string identify = 4;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISKFREE_FIELD_NUMBER = 5;
    private int diskFree_;
    /**
     * <code>required int32 diskFree = 5;</code>
     */
    public boolean hasDiskFree() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 diskFree = 5;</code>
     */
    public int getDiskFree() {
      return diskFree_;
    }

    public static final int VERAPP_FIELD_NUMBER = 6;
    private volatile java.lang.Object verApp_;
    /**
     * <code>optional string verApp = 6;</code>
     */
    public boolean hasVerApp() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string verApp = 6;</code>
     */
    public java.lang.String getVerApp() {
      java.lang.Object ref = verApp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verApp_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string verApp = 6;</code>
     */
    public com.google.protobuf.ByteString
        getVerAppBytes() {
      java.lang.Object ref = verApp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verApp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERUI_FIELD_NUMBER = 7;
    private volatile java.lang.Object verUi_;
    /**
     * <code>optional string verUi = 7;</code>
     */
    public boolean hasVerUi() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string verUi = 7;</code>
     */
    public java.lang.String getVerUi() {
      java.lang.Object ref = verUi_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verUi_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string verUi = 7;</code>
     */
    public com.google.protobuf.ByteString
        getVerUiBytes() {
      java.lang.Object ref = verUi_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verUi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IPETH1_FIELD_NUMBER = 8;
    private volatile java.lang.Object ipEth1_;
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    public boolean hasIpEth1() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    public java.lang.String getIpEth1() {
      java.lang.Object ref = ipEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ipEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ipEth1 = 8;</code>
     */
    public com.google.protobuf.ByteString
        getIpEth1Bytes() {
      java.lang.Object ref = ipEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MACETH1_FIELD_NUMBER = 9;
    private volatile java.lang.Object macEth1_;
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    public boolean hasMacEth1() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    public java.lang.String getMacEth1() {
      java.lang.Object ref = macEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          macEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string macEth1 = 9;</code>
     */
    public com.google.protobuf.ByteString
        getMacEth1Bytes() {
      java.lang.Object ref = macEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        macEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMac()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDiskFree()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mac_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, identify_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, diskFree_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, verApp_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, verUi_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, ipEth1_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, macEth1_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mac_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, identify_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, diskFree_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, verApp_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, verUi_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, ipEth1_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, macEth1_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.CHeartBeat)) {
        return super.equals(obj);
      }
      NetMgrMsg.CHeartBeat other = (NetMgrMsg.CHeartBeat) obj;

      boolean result = true;
      result = result && (hasIp() == other.hasIp());
      if (hasIp()) {
        result = result && getIp()
            .equals(other.getIp());
      }
      result = result && (hasMac() == other.hasMac());
      if (hasMac()) {
        result = result && getMac()
            .equals(other.getMac());
      }
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && (hasDiskFree() == other.hasDiskFree());
      if (hasDiskFree()) {
        result = result && (getDiskFree()
            == other.getDiskFree());
      }
      result = result && (hasVerApp() == other.hasVerApp());
      if (hasVerApp()) {
        result = result && getVerApp()
            .equals(other.getVerApp());
      }
      result = result && (hasVerUi() == other.hasVerUi());
      if (hasVerUi()) {
        result = result && getVerUi()
            .equals(other.getVerUi());
      }
      result = result && (hasIpEth1() == other.hasIpEth1());
      if (hasIpEth1()) {
        result = result && getIpEth1()
            .equals(other.getIpEth1());
      }
      result = result && (hasMacEth1() == other.hasMacEth1());
      if (hasMacEth1()) {
        result = result && getMacEth1()
            .equals(other.getMacEth1());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIp()) {
        hash = (37 * hash) + IP_FIELD_NUMBER;
        hash = (53 * hash) + getIp().hashCode();
      }
      if (hasMac()) {
        hash = (37 * hash) + MAC_FIELD_NUMBER;
        hash = (53 * hash) + getMac().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (hasDiskFree()) {
        hash = (37 * hash) + DISKFREE_FIELD_NUMBER;
        hash = (53 * hash) + getDiskFree();
      }
      if (hasVerApp()) {
        hash = (37 * hash) + VERAPP_FIELD_NUMBER;
        hash = (53 * hash) + getVerApp().hashCode();
      }
      if (hasVerUi()) {
        hash = (37 * hash) + VERUI_FIELD_NUMBER;
        hash = (53 * hash) + getVerUi().hashCode();
      }
      if (hasIpEth1()) {
        hash = (37 * hash) + IPETH1_FIELD_NUMBER;
        hash = (53 * hash) + getIpEth1().hashCode();
      }
      if (hasMacEth1()) {
        hash = (37 * hash) + MACETH1_FIELD_NUMBER;
        hash = (53 * hash) + getMacEth1().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.CHeartBeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CHeartBeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CHeartBeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CHeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.CHeartBeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x21
     * </pre>
     *
     * Protobuf type {@code CHeartBeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CHeartBeat)
        NetMgrMsg.CHeartBeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_CHeartBeat_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_CHeartBeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.CHeartBeat.class, NetMgrMsg.CHeartBeat.Builder.class);
      }

      // Construct using NetMgrMsg.CHeartBeat.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ip_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        mac_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        diskFree_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        verApp_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        verUi_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        ipEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        macEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_CHeartBeat_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.CHeartBeat getDefaultInstanceForType() {
        return NetMgrMsg.CHeartBeat.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.CHeartBeat build() {
        NetMgrMsg.CHeartBeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.CHeartBeat buildPartial() {
        NetMgrMsg.CHeartBeat result = new NetMgrMsg.CHeartBeat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ip_ = ip_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mac_ = mac_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.identify_ = identify_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.diskFree_ = diskFree_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.verApp_ = verApp_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.verUi_ = verUi_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.ipEth1_ = ipEth1_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.macEth1_ = macEth1_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.CHeartBeat) {
          return mergeFrom((NetMgrMsg.CHeartBeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.CHeartBeat other) {
        if (other == NetMgrMsg.CHeartBeat.getDefaultInstance()) return this;
        if (other.hasIp()) {
          bitField0_ |= 0x00000001;
          ip_ = other.ip_;
          onChanged();
        }
        if (other.hasMac()) {
          bitField0_ |= 0x00000002;
          mac_ = other.mac_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000008;
          identify_ = other.identify_;
          onChanged();
        }
        if (other.hasDiskFree()) {
          setDiskFree(other.getDiskFree());
        }
        if (other.hasVerApp()) {
          bitField0_ |= 0x00000020;
          verApp_ = other.verApp_;
          onChanged();
        }
        if (other.hasVerUi()) {
          bitField0_ |= 0x00000040;
          verUi_ = other.verUi_;
          onChanged();
        }
        if (other.hasIpEth1()) {
          bitField0_ |= 0x00000080;
          ipEth1_ = other.ipEth1_;
          onChanged();
        }
        if (other.hasMacEth1()) {
          bitField0_ |= 0x00000100;
          macEth1_ = other.macEth1_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIp()) {
          return false;
        }
        if (!hasMac()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        if (!hasIdentify()) {
          return false;
        }
        if (!hasDiskFree()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.CHeartBeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.CHeartBeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object ip_ = "";
      /**
       * <code>required string ip = 1;</code>
       */
      public boolean hasIp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ip_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <code>required string ip = 1;</code>
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ip_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object mac_ = "";
      /**
       * <code>required string mac = 2;</code>
       */
      public boolean hasMac() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public java.lang.String getMac() {
        java.lang.Object ref = mac_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mac_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMacBytes() {
        java.lang.Object ref = mac_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mac_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public Builder setMac(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mac_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public Builder clearMac() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mac_ = getDefaultInstance().getMac();
        onChanged();
        return this;
      }
      /**
       * <code>required string mac = 2;</code>
       */
      public Builder setMacBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mac_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * device type 
       * </pre>
       *
       * <code>required int32 type = 3;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object identify_ = "";
      /**
       * <code>required string identify = 4;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000008);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 4;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        identify_ = value;
        onChanged();
        return this;
      }

      private int diskFree_ ;
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public boolean hasDiskFree() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public int getDiskFree() {
        return diskFree_;
      }
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public Builder setDiskFree(int value) {
        bitField0_ |= 0x00000010;
        diskFree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 diskFree = 5;</code>
       */
      public Builder clearDiskFree() {
        bitField0_ = (bitField0_ & ~0x00000010);
        diskFree_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object verApp_ = "";
      /**
       * <code>optional string verApp = 6;</code>
       */
      public boolean hasVerApp() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public java.lang.String getVerApp() {
        java.lang.Object ref = verApp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verApp_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public com.google.protobuf.ByteString
          getVerAppBytes() {
        java.lang.Object ref = verApp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          verApp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public Builder setVerApp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        verApp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public Builder clearVerApp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        verApp_ = getDefaultInstance().getVerApp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string verApp = 6;</code>
       */
      public Builder setVerAppBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        verApp_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object verUi_ = "";
      /**
       * <code>optional string verUi = 7;</code>
       */
      public boolean hasVerUi() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public java.lang.String getVerUi() {
        java.lang.Object ref = verUi_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verUi_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public com.google.protobuf.ByteString
          getVerUiBytes() {
        java.lang.Object ref = verUi_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          verUi_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public Builder setVerUi(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        verUi_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public Builder clearVerUi() {
        bitField0_ = (bitField0_ & ~0x00000040);
        verUi_ = getDefaultInstance().getVerUi();
        onChanged();
        return this;
      }
      /**
       * <code>optional string verUi = 7;</code>
       */
      public Builder setVerUiBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        verUi_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ipEth1_ = "";
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public boolean hasIpEth1() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public java.lang.String getIpEth1() {
        java.lang.Object ref = ipEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ipEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public com.google.protobuf.ByteString
          getIpEth1Bytes() {
        java.lang.Object ref = ipEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public Builder setIpEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        ipEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public Builder clearIpEth1() {
        bitField0_ = (bitField0_ & ~0x00000080);
        ipEth1_ = getDefaultInstance().getIpEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ipEth1 = 8;</code>
       */
      public Builder setIpEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        ipEth1_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object macEth1_ = "";
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public boolean hasMacEth1() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public java.lang.String getMacEth1() {
        java.lang.Object ref = macEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            macEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public com.google.protobuf.ByteString
          getMacEth1Bytes() {
        java.lang.Object ref = macEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          macEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public Builder setMacEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        macEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public Builder clearMacEth1() {
        bitField0_ = (bitField0_ & ~0x00000100);
        macEth1_ = getDefaultInstance().getMacEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string macEth1 = 9;</code>
       */
      public Builder setMacEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        macEth1_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CHeartBeat)
    }

    // @@protoc_insertion_point(class_scope:CHeartBeat)
    private static final NetMgrMsg.CHeartBeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.CHeartBeat();
    }

    public static NetMgrMsg.CHeartBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CHeartBeat>
        PARSER = new com.google.protobuf.AbstractParser<CHeartBeat>() {
      @java.lang.Override
      public CHeartBeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CHeartBeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CHeartBeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CHeartBeat> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.CHeartBeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HNetSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HNetSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>optional string serverIp = 2;</code>
     */
    boolean hasServerIp();
    /**
     * <code>optional string serverIp = 2;</code>
     */
    java.lang.String getServerIp();
    /**
     * <code>optional string serverIp = 2;</code>
     */
    com.google.protobuf.ByteString
        getServerIpBytes();

    /**
     * <code>optional int32 serverPort = 3 [default = -2];</code>
     */
    boolean hasServerPort();
    /**
     * <code>optional int32 serverPort = 3 [default = -2];</code>
     */
    int getServerPort();

    /**
     * <code>optional string serverIpSpare = 4;</code>
     */
    boolean hasServerIpSpare();
    /**
     * <code>optional string serverIpSpare = 4;</code>
     */
    java.lang.String getServerIpSpare();
    /**
     * <code>optional string serverIpSpare = 4;</code>
     */
    com.google.protobuf.ByteString
        getServerIpSpareBytes();

    /**
     * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
     */
    boolean hasServerPortSpare();
    /**
     * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
     */
    int getServerPortSpare();

    /**
     * <code>optional string clientIpEth0 = 6;</code>
     */
    boolean hasClientIpEth0();
    /**
     * <code>optional string clientIpEth0 = 6;</code>
     */
    java.lang.String getClientIpEth0();
    /**
     * <code>optional string clientIpEth0 = 6;</code>
     */
    com.google.protobuf.ByteString
        getClientIpEth0Bytes();

    /**
     * <code>optional string clientMaskEth0 = 7;</code>
     */
    boolean hasClientMaskEth0();
    /**
     * <code>optional string clientMaskEth0 = 7;</code>
     */
    java.lang.String getClientMaskEth0();
    /**
     * <code>optional string clientMaskEth0 = 7;</code>
     */
    com.google.protobuf.ByteString
        getClientMaskEth0Bytes();

    /**
     * <code>optional string clientGwEth0 = 8;</code>
     */
    boolean hasClientGwEth0();
    /**
     * <code>optional string clientGwEth0 = 8;</code>
     */
    java.lang.String getClientGwEth0();
    /**
     * <code>optional string clientGwEth0 = 8;</code>
     */
    com.google.protobuf.ByteString
        getClientGwEth0Bytes();

    /**
     * <code>optional string clientDnsEth0 = 9;</code>
     */
    boolean hasClientDnsEth0();
    /**
     * <code>optional string clientDnsEth0 = 9;</code>
     */
    java.lang.String getClientDnsEth0();
    /**
     * <code>optional string clientDnsEth0 = 9;</code>
     */
    com.google.protobuf.ByteString
        getClientDnsEth0Bytes();

    /**
     * <code>optional string clientIpEth1 = 10;</code>
     */
    boolean hasClientIpEth1();
    /**
     * <code>optional string clientIpEth1 = 10;</code>
     */
    java.lang.String getClientIpEth1();
    /**
     * <code>optional string clientIpEth1 = 10;</code>
     */
    com.google.protobuf.ByteString
        getClientIpEth1Bytes();

    /**
     * <code>optional string clientMaskEth1 = 11;</code>
     */
    boolean hasClientMaskEth1();
    /**
     * <code>optional string clientMaskEth1 = 11;</code>
     */
    java.lang.String getClientMaskEth1();
    /**
     * <code>optional string clientMaskEth1 = 11;</code>
     */
    com.google.protobuf.ByteString
        getClientMaskEth1Bytes();

    /**
     * <code>optional string clientGwEth1 = 12;</code>
     */
    boolean hasClientGwEth1();
    /**
     * <code>optional string clientGwEth1 = 12;</code>
     */
    java.lang.String getClientGwEth1();
    /**
     * <code>optional string clientGwEth1 = 12;</code>
     */
    com.google.protobuf.ByteString
        getClientGwEth1Bytes();

    /**
     * <code>optional string clientDnsEth1 = 13;</code>
     */
    boolean hasClientDnsEth1();
    /**
     * <code>optional string clientDnsEth1 = 13;</code>
     */
    java.lang.String getClientDnsEth1();
    /**
     * <code>optional string clientDnsEth1 = 13;</code>
     */
    com.google.protobuf.ByteString
        getClientDnsEth1Bytes();
  }
  /**
   * <pre>
   * 0x31
   * </pre>
   *
   * Protobuf type {@code HNetSetting}
   */
  public  static final class HNetSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HNetSetting)
      HNetSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HNetSetting.newBuilder() to construct.
    private HNetSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HNetSetting() {
      type_ = 0;
      serverIp_ = "";
      serverPort_ = -2;
      serverIpSpare_ = "";
      serverPortSpare_ = -2;
      clientIpEth0_ = "";
      clientMaskEth0_ = "";
      clientGwEth0_ = "";
      clientDnsEth0_ = "";
      clientIpEth1_ = "";
      clientMaskEth1_ = "";
      clientGwEth1_ = "";
      clientDnsEth1_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HNetSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverIp_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              serverPort_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              serverIpSpare_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              serverPortSpare_ = input.readInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              clientIpEth0_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              clientMaskEth0_ = bs;
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              clientGwEth0_ = bs;
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              clientDnsEth0_ = bs;
              break;
            }
            case 82: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000200;
              clientIpEth1_ = bs;
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000400;
              clientMaskEth1_ = bs;
              break;
            }
            case 98: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000800;
              clientGwEth1_ = bs;
              break;
            }
            case 106: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00001000;
              clientDnsEth1_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HNetSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HNetSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HNetSetting.class, NetMgrMsg.HNetSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int SERVERIP_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverIp_;
    /**
     * <code>optional string serverIp = 2;</code>
     */
    public boolean hasServerIp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string serverIp = 2;</code>
     */
    public java.lang.String getServerIp() {
      java.lang.Object ref = serverIp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverIp_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string serverIp = 2;</code>
     */
    public com.google.protobuf.ByteString
        getServerIpBytes() {
      java.lang.Object ref = serverIp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVERPORT_FIELD_NUMBER = 3;
    private int serverPort_;
    /**
     * <code>optional int32 serverPort = 3 [default = -2];</code>
     */
    public boolean hasServerPort() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 serverPort = 3 [default = -2];</code>
     */
    public int getServerPort() {
      return serverPort_;
    }

    public static final int SERVERIPSPARE_FIELD_NUMBER = 4;
    private volatile java.lang.Object serverIpSpare_;
    /**
     * <code>optional string serverIpSpare = 4;</code>
     */
    public boolean hasServerIpSpare() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string serverIpSpare = 4;</code>
     */
    public java.lang.String getServerIpSpare() {
      java.lang.Object ref = serverIpSpare_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverIpSpare_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string serverIpSpare = 4;</code>
     */
    public com.google.protobuf.ByteString
        getServerIpSpareBytes() {
      java.lang.Object ref = serverIpSpare_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverIpSpare_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVERPORTSPARE_FIELD_NUMBER = 5;
    private int serverPortSpare_;
    /**
     * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
     */
    public boolean hasServerPortSpare() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
     */
    public int getServerPortSpare() {
      return serverPortSpare_;
    }

    public static final int CLIENTIPETH0_FIELD_NUMBER = 6;
    private volatile java.lang.Object clientIpEth0_;
    /**
     * <code>optional string clientIpEth0 = 6;</code>
     */
    public boolean hasClientIpEth0() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string clientIpEth0 = 6;</code>
     */
    public java.lang.String getClientIpEth0() {
      java.lang.Object ref = clientIpEth0_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientIpEth0_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientIpEth0 = 6;</code>
     */
    public com.google.protobuf.ByteString
        getClientIpEth0Bytes() {
      java.lang.Object ref = clientIpEth0_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientIpEth0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTMASKETH0_FIELD_NUMBER = 7;
    private volatile java.lang.Object clientMaskEth0_;
    /**
     * <code>optional string clientMaskEth0 = 7;</code>
     */
    public boolean hasClientMaskEth0() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string clientMaskEth0 = 7;</code>
     */
    public java.lang.String getClientMaskEth0() {
      java.lang.Object ref = clientMaskEth0_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientMaskEth0_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientMaskEth0 = 7;</code>
     */
    public com.google.protobuf.ByteString
        getClientMaskEth0Bytes() {
      java.lang.Object ref = clientMaskEth0_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientMaskEth0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTGWETH0_FIELD_NUMBER = 8;
    private volatile java.lang.Object clientGwEth0_;
    /**
     * <code>optional string clientGwEth0 = 8;</code>
     */
    public boolean hasClientGwEth0() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string clientGwEth0 = 8;</code>
     */
    public java.lang.String getClientGwEth0() {
      java.lang.Object ref = clientGwEth0_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientGwEth0_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientGwEth0 = 8;</code>
     */
    public com.google.protobuf.ByteString
        getClientGwEth0Bytes() {
      java.lang.Object ref = clientGwEth0_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientGwEth0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTDNSETH0_FIELD_NUMBER = 9;
    private volatile java.lang.Object clientDnsEth0_;
    /**
     * <code>optional string clientDnsEth0 = 9;</code>
     */
    public boolean hasClientDnsEth0() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string clientDnsEth0 = 9;</code>
     */
    public java.lang.String getClientDnsEth0() {
      java.lang.Object ref = clientDnsEth0_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientDnsEth0_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientDnsEth0 = 9;</code>
     */
    public com.google.protobuf.ByteString
        getClientDnsEth0Bytes() {
      java.lang.Object ref = clientDnsEth0_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientDnsEth0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTIPETH1_FIELD_NUMBER = 10;
    private volatile java.lang.Object clientIpEth1_;
    /**
     * <code>optional string clientIpEth1 = 10;</code>
     */
    public boolean hasClientIpEth1() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string clientIpEth1 = 10;</code>
     */
    public java.lang.String getClientIpEth1() {
      java.lang.Object ref = clientIpEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientIpEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientIpEth1 = 10;</code>
     */
    public com.google.protobuf.ByteString
        getClientIpEth1Bytes() {
      java.lang.Object ref = clientIpEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientIpEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTMASKETH1_FIELD_NUMBER = 11;
    private volatile java.lang.Object clientMaskEth1_;
    /**
     * <code>optional string clientMaskEth1 = 11;</code>
     */
    public boolean hasClientMaskEth1() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional string clientMaskEth1 = 11;</code>
     */
    public java.lang.String getClientMaskEth1() {
      java.lang.Object ref = clientMaskEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientMaskEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientMaskEth1 = 11;</code>
     */
    public com.google.protobuf.ByteString
        getClientMaskEth1Bytes() {
      java.lang.Object ref = clientMaskEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientMaskEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTGWETH1_FIELD_NUMBER = 12;
    private volatile java.lang.Object clientGwEth1_;
    /**
     * <code>optional string clientGwEth1 = 12;</code>
     */
    public boolean hasClientGwEth1() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional string clientGwEth1 = 12;</code>
     */
    public java.lang.String getClientGwEth1() {
      java.lang.Object ref = clientGwEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientGwEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientGwEth1 = 12;</code>
     */
    public com.google.protobuf.ByteString
        getClientGwEth1Bytes() {
      java.lang.Object ref = clientGwEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientGwEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTDNSETH1_FIELD_NUMBER = 13;
    private volatile java.lang.Object clientDnsEth1_;
    /**
     * <code>optional string clientDnsEth1 = 13;</code>
     */
    public boolean hasClientDnsEth1() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional string clientDnsEth1 = 13;</code>
     */
    public java.lang.String getClientDnsEth1() {
      java.lang.Object ref = clientDnsEth1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientDnsEth1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clientDnsEth1 = 13;</code>
     */
    public com.google.protobuf.ByteString
        getClientDnsEth1Bytes() {
      java.lang.Object ref = clientDnsEth1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientDnsEth1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverIp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, serverPort_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serverIpSpare_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, serverPortSpare_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, clientIpEth0_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, clientMaskEth0_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, clientGwEth0_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, clientDnsEth0_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, clientIpEth1_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, clientMaskEth1_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, clientGwEth1_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, clientDnsEth1_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverIp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, serverPort_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serverIpSpare_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, serverPortSpare_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, clientIpEth0_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, clientMaskEth0_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, clientGwEth0_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, clientDnsEth0_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, clientIpEth1_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, clientMaskEth1_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, clientGwEth1_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, clientDnsEth1_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HNetSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HNetSetting other = (NetMgrMsg.HNetSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasServerIp() == other.hasServerIp());
      if (hasServerIp()) {
        result = result && getServerIp()
            .equals(other.getServerIp());
      }
      result = result && (hasServerPort() == other.hasServerPort());
      if (hasServerPort()) {
        result = result && (getServerPort()
            == other.getServerPort());
      }
      result = result && (hasServerIpSpare() == other.hasServerIpSpare());
      if (hasServerIpSpare()) {
        result = result && getServerIpSpare()
            .equals(other.getServerIpSpare());
      }
      result = result && (hasServerPortSpare() == other.hasServerPortSpare());
      if (hasServerPortSpare()) {
        result = result && (getServerPortSpare()
            == other.getServerPortSpare());
      }
      result = result && (hasClientIpEth0() == other.hasClientIpEth0());
      if (hasClientIpEth0()) {
        result = result && getClientIpEth0()
            .equals(other.getClientIpEth0());
      }
      result = result && (hasClientMaskEth0() == other.hasClientMaskEth0());
      if (hasClientMaskEth0()) {
        result = result && getClientMaskEth0()
            .equals(other.getClientMaskEth0());
      }
      result = result && (hasClientGwEth0() == other.hasClientGwEth0());
      if (hasClientGwEth0()) {
        result = result && getClientGwEth0()
            .equals(other.getClientGwEth0());
      }
      result = result && (hasClientDnsEth0() == other.hasClientDnsEth0());
      if (hasClientDnsEth0()) {
        result = result && getClientDnsEth0()
            .equals(other.getClientDnsEth0());
      }
      result = result && (hasClientIpEth1() == other.hasClientIpEth1());
      if (hasClientIpEth1()) {
        result = result && getClientIpEth1()
            .equals(other.getClientIpEth1());
      }
      result = result && (hasClientMaskEth1() == other.hasClientMaskEth1());
      if (hasClientMaskEth1()) {
        result = result && getClientMaskEth1()
            .equals(other.getClientMaskEth1());
      }
      result = result && (hasClientGwEth1() == other.hasClientGwEth1());
      if (hasClientGwEth1()) {
        result = result && getClientGwEth1()
            .equals(other.getClientGwEth1());
      }
      result = result && (hasClientDnsEth1() == other.hasClientDnsEth1());
      if (hasClientDnsEth1()) {
        result = result && getClientDnsEth1()
            .equals(other.getClientDnsEth1());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasServerIp()) {
        hash = (37 * hash) + SERVERIP_FIELD_NUMBER;
        hash = (53 * hash) + getServerIp().hashCode();
      }
      if (hasServerPort()) {
        hash = (37 * hash) + SERVERPORT_FIELD_NUMBER;
        hash = (53 * hash) + getServerPort();
      }
      if (hasServerIpSpare()) {
        hash = (37 * hash) + SERVERIPSPARE_FIELD_NUMBER;
        hash = (53 * hash) + getServerIpSpare().hashCode();
      }
      if (hasServerPortSpare()) {
        hash = (37 * hash) + SERVERPORTSPARE_FIELD_NUMBER;
        hash = (53 * hash) + getServerPortSpare();
      }
      if (hasClientIpEth0()) {
        hash = (37 * hash) + CLIENTIPETH0_FIELD_NUMBER;
        hash = (53 * hash) + getClientIpEth0().hashCode();
      }
      if (hasClientMaskEth0()) {
        hash = (37 * hash) + CLIENTMASKETH0_FIELD_NUMBER;
        hash = (53 * hash) + getClientMaskEth0().hashCode();
      }
      if (hasClientGwEth0()) {
        hash = (37 * hash) + CLIENTGWETH0_FIELD_NUMBER;
        hash = (53 * hash) + getClientGwEth0().hashCode();
      }
      if (hasClientDnsEth0()) {
        hash = (37 * hash) + CLIENTDNSETH0_FIELD_NUMBER;
        hash = (53 * hash) + getClientDnsEth0().hashCode();
      }
      if (hasClientIpEth1()) {
        hash = (37 * hash) + CLIENTIPETH1_FIELD_NUMBER;
        hash = (53 * hash) + getClientIpEth1().hashCode();
      }
      if (hasClientMaskEth1()) {
        hash = (37 * hash) + CLIENTMASKETH1_FIELD_NUMBER;
        hash = (53 * hash) + getClientMaskEth1().hashCode();
      }
      if (hasClientGwEth1()) {
        hash = (37 * hash) + CLIENTGWETH1_FIELD_NUMBER;
        hash = (53 * hash) + getClientGwEth1().hashCode();
      }
      if (hasClientDnsEth1()) {
        hash = (37 * hash) + CLIENTDNSETH1_FIELD_NUMBER;
        hash = (53 * hash) + getClientDnsEth1().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HNetSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HNetSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HNetSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HNetSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HNetSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HNetSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HNetSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x31
     * </pre>
     *
     * Protobuf type {@code HNetSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HNetSetting)
        NetMgrMsg.HNetSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HNetSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HNetSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HNetSetting.class, NetMgrMsg.HNetSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HNetSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        serverIp_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        serverPort_ = -2;
        bitField0_ = (bitField0_ & ~0x00000004);
        serverIpSpare_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        serverPortSpare_ = -2;
        bitField0_ = (bitField0_ & ~0x00000010);
        clientIpEth0_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        clientMaskEth0_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        clientGwEth0_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        clientDnsEth0_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        clientIpEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        clientMaskEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        clientGwEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00000800);
        clientDnsEth1_ = "";
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HNetSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HNetSetting getDefaultInstanceForType() {
        return NetMgrMsg.HNetSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HNetSetting build() {
        NetMgrMsg.HNetSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HNetSetting buildPartial() {
        NetMgrMsg.HNetSetting result = new NetMgrMsg.HNetSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverIp_ = serverIp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.serverPort_ = serverPort_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.serverIpSpare_ = serverIpSpare_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.serverPortSpare_ = serverPortSpare_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.clientIpEth0_ = clientIpEth0_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.clientMaskEth0_ = clientMaskEth0_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.clientGwEth0_ = clientGwEth0_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.clientDnsEth0_ = clientDnsEth0_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.clientIpEth1_ = clientIpEth1_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.clientMaskEth1_ = clientMaskEth1_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.clientGwEth1_ = clientGwEth1_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.clientDnsEth1_ = clientDnsEth1_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HNetSetting) {
          return mergeFrom((NetMgrMsg.HNetSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HNetSetting other) {
        if (other == NetMgrMsg.HNetSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasServerIp()) {
          bitField0_ |= 0x00000002;
          serverIp_ = other.serverIp_;
          onChanged();
        }
        if (other.hasServerPort()) {
          setServerPort(other.getServerPort());
        }
        if (other.hasServerIpSpare()) {
          bitField0_ |= 0x00000008;
          serverIpSpare_ = other.serverIpSpare_;
          onChanged();
        }
        if (other.hasServerPortSpare()) {
          setServerPortSpare(other.getServerPortSpare());
        }
        if (other.hasClientIpEth0()) {
          bitField0_ |= 0x00000020;
          clientIpEth0_ = other.clientIpEth0_;
          onChanged();
        }
        if (other.hasClientMaskEth0()) {
          bitField0_ |= 0x00000040;
          clientMaskEth0_ = other.clientMaskEth0_;
          onChanged();
        }
        if (other.hasClientGwEth0()) {
          bitField0_ |= 0x00000080;
          clientGwEth0_ = other.clientGwEth0_;
          onChanged();
        }
        if (other.hasClientDnsEth0()) {
          bitField0_ |= 0x00000100;
          clientDnsEth0_ = other.clientDnsEth0_;
          onChanged();
        }
        if (other.hasClientIpEth1()) {
          bitField0_ |= 0x00000200;
          clientIpEth1_ = other.clientIpEth1_;
          onChanged();
        }
        if (other.hasClientMaskEth1()) {
          bitField0_ |= 0x00000400;
          clientMaskEth1_ = other.clientMaskEth1_;
          onChanged();
        }
        if (other.hasClientGwEth1()) {
          bitField0_ |= 0x00000800;
          clientGwEth1_ = other.clientGwEth1_;
          onChanged();
        }
        if (other.hasClientDnsEth1()) {
          bitField0_ |= 0x00001000;
          clientDnsEth1_ = other.clientDnsEth1_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HNetSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HNetSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object serverIp_ = "";
      /**
       * <code>optional string serverIp = 2;</code>
       */
      public boolean hasServerIp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string serverIp = 2;</code>
       */
      public java.lang.String getServerIp() {
        java.lang.Object ref = serverIp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverIp_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string serverIp = 2;</code>
       */
      public com.google.protobuf.ByteString
          getServerIpBytes() {
        java.lang.Object ref = serverIp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverIp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string serverIp = 2;</code>
       */
      public Builder setServerIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        serverIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverIp = 2;</code>
       */
      public Builder clearServerIp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverIp_ = getDefaultInstance().getServerIp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverIp = 2;</code>
       */
      public Builder setServerIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        serverIp_ = value;
        onChanged();
        return this;
      }

      private int serverPort_ = -2;
      /**
       * <code>optional int32 serverPort = 3 [default = -2];</code>
       */
      public boolean hasServerPort() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 serverPort = 3 [default = -2];</code>
       */
      public int getServerPort() {
        return serverPort_;
      }
      /**
       * <code>optional int32 serverPort = 3 [default = -2];</code>
       */
      public Builder setServerPort(int value) {
        bitField0_ |= 0x00000004;
        serverPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 serverPort = 3 [default = -2];</code>
       */
      public Builder clearServerPort() {
        bitField0_ = (bitField0_ & ~0x00000004);
        serverPort_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object serverIpSpare_ = "";
      /**
       * <code>optional string serverIpSpare = 4;</code>
       */
      public boolean hasServerIpSpare() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string serverIpSpare = 4;</code>
       */
      public java.lang.String getServerIpSpare() {
        java.lang.Object ref = serverIpSpare_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverIpSpare_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string serverIpSpare = 4;</code>
       */
      public com.google.protobuf.ByteString
          getServerIpSpareBytes() {
        java.lang.Object ref = serverIpSpare_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverIpSpare_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string serverIpSpare = 4;</code>
       */
      public Builder setServerIpSpare(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        serverIpSpare_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverIpSpare = 4;</code>
       */
      public Builder clearServerIpSpare() {
        bitField0_ = (bitField0_ & ~0x00000008);
        serverIpSpare_ = getDefaultInstance().getServerIpSpare();
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverIpSpare = 4;</code>
       */
      public Builder setServerIpSpareBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        serverIpSpare_ = value;
        onChanged();
        return this;
      }

      private int serverPortSpare_ = -2;
      /**
       * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
       */
      public boolean hasServerPortSpare() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
       */
      public int getServerPortSpare() {
        return serverPortSpare_;
      }
      /**
       * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
       */
      public Builder setServerPortSpare(int value) {
        bitField0_ |= 0x00000010;
        serverPortSpare_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 serverPortSpare = 5 [default = -2];</code>
       */
      public Builder clearServerPortSpare() {
        bitField0_ = (bitField0_ & ~0x00000010);
        serverPortSpare_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object clientIpEth0_ = "";
      /**
       * <code>optional string clientIpEth0 = 6;</code>
       */
      public boolean hasClientIpEth0() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string clientIpEth0 = 6;</code>
       */
      public java.lang.String getClientIpEth0() {
        java.lang.Object ref = clientIpEth0_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientIpEth0_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientIpEth0 = 6;</code>
       */
      public com.google.protobuf.ByteString
          getClientIpEth0Bytes() {
        java.lang.Object ref = clientIpEth0_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientIpEth0_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientIpEth0 = 6;</code>
       */
      public Builder setClientIpEth0(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        clientIpEth0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientIpEth0 = 6;</code>
       */
      public Builder clearClientIpEth0() {
        bitField0_ = (bitField0_ & ~0x00000020);
        clientIpEth0_ = getDefaultInstance().getClientIpEth0();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientIpEth0 = 6;</code>
       */
      public Builder setClientIpEth0Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        clientIpEth0_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientMaskEth0_ = "";
      /**
       * <code>optional string clientMaskEth0 = 7;</code>
       */
      public boolean hasClientMaskEth0() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string clientMaskEth0 = 7;</code>
       */
      public java.lang.String getClientMaskEth0() {
        java.lang.Object ref = clientMaskEth0_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientMaskEth0_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientMaskEth0 = 7;</code>
       */
      public com.google.protobuf.ByteString
          getClientMaskEth0Bytes() {
        java.lang.Object ref = clientMaskEth0_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientMaskEth0_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientMaskEth0 = 7;</code>
       */
      public Builder setClientMaskEth0(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        clientMaskEth0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientMaskEth0 = 7;</code>
       */
      public Builder clearClientMaskEth0() {
        bitField0_ = (bitField0_ & ~0x00000040);
        clientMaskEth0_ = getDefaultInstance().getClientMaskEth0();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientMaskEth0 = 7;</code>
       */
      public Builder setClientMaskEth0Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        clientMaskEth0_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientGwEth0_ = "";
      /**
       * <code>optional string clientGwEth0 = 8;</code>
       */
      public boolean hasClientGwEth0() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string clientGwEth0 = 8;</code>
       */
      public java.lang.String getClientGwEth0() {
        java.lang.Object ref = clientGwEth0_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientGwEth0_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientGwEth0 = 8;</code>
       */
      public com.google.protobuf.ByteString
          getClientGwEth0Bytes() {
        java.lang.Object ref = clientGwEth0_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientGwEth0_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientGwEth0 = 8;</code>
       */
      public Builder setClientGwEth0(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        clientGwEth0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientGwEth0 = 8;</code>
       */
      public Builder clearClientGwEth0() {
        bitField0_ = (bitField0_ & ~0x00000080);
        clientGwEth0_ = getDefaultInstance().getClientGwEth0();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientGwEth0 = 8;</code>
       */
      public Builder setClientGwEth0Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        clientGwEth0_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientDnsEth0_ = "";
      /**
       * <code>optional string clientDnsEth0 = 9;</code>
       */
      public boolean hasClientDnsEth0() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string clientDnsEth0 = 9;</code>
       */
      public java.lang.String getClientDnsEth0() {
        java.lang.Object ref = clientDnsEth0_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientDnsEth0_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientDnsEth0 = 9;</code>
       */
      public com.google.protobuf.ByteString
          getClientDnsEth0Bytes() {
        java.lang.Object ref = clientDnsEth0_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientDnsEth0_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientDnsEth0 = 9;</code>
       */
      public Builder setClientDnsEth0(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        clientDnsEth0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientDnsEth0 = 9;</code>
       */
      public Builder clearClientDnsEth0() {
        bitField0_ = (bitField0_ & ~0x00000100);
        clientDnsEth0_ = getDefaultInstance().getClientDnsEth0();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientDnsEth0 = 9;</code>
       */
      public Builder setClientDnsEth0Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        clientDnsEth0_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientIpEth1_ = "";
      /**
       * <code>optional string clientIpEth1 = 10;</code>
       */
      public boolean hasClientIpEth1() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string clientIpEth1 = 10;</code>
       */
      public java.lang.String getClientIpEth1() {
        java.lang.Object ref = clientIpEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientIpEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientIpEth1 = 10;</code>
       */
      public com.google.protobuf.ByteString
          getClientIpEth1Bytes() {
        java.lang.Object ref = clientIpEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientIpEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientIpEth1 = 10;</code>
       */
      public Builder setClientIpEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        clientIpEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientIpEth1 = 10;</code>
       */
      public Builder clearClientIpEth1() {
        bitField0_ = (bitField0_ & ~0x00000200);
        clientIpEth1_ = getDefaultInstance().getClientIpEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientIpEth1 = 10;</code>
       */
      public Builder setClientIpEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        clientIpEth1_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientMaskEth1_ = "";
      /**
       * <code>optional string clientMaskEth1 = 11;</code>
       */
      public boolean hasClientMaskEth1() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional string clientMaskEth1 = 11;</code>
       */
      public java.lang.String getClientMaskEth1() {
        java.lang.Object ref = clientMaskEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientMaskEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientMaskEth1 = 11;</code>
       */
      public com.google.protobuf.ByteString
          getClientMaskEth1Bytes() {
        java.lang.Object ref = clientMaskEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientMaskEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientMaskEth1 = 11;</code>
       */
      public Builder setClientMaskEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        clientMaskEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientMaskEth1 = 11;</code>
       */
      public Builder clearClientMaskEth1() {
        bitField0_ = (bitField0_ & ~0x00000400);
        clientMaskEth1_ = getDefaultInstance().getClientMaskEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientMaskEth1 = 11;</code>
       */
      public Builder setClientMaskEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        clientMaskEth1_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientGwEth1_ = "";
      /**
       * <code>optional string clientGwEth1 = 12;</code>
       */
      public boolean hasClientGwEth1() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional string clientGwEth1 = 12;</code>
       */
      public java.lang.String getClientGwEth1() {
        java.lang.Object ref = clientGwEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientGwEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientGwEth1 = 12;</code>
       */
      public com.google.protobuf.ByteString
          getClientGwEth1Bytes() {
        java.lang.Object ref = clientGwEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientGwEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientGwEth1 = 12;</code>
       */
      public Builder setClientGwEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
        clientGwEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientGwEth1 = 12;</code>
       */
      public Builder clearClientGwEth1() {
        bitField0_ = (bitField0_ & ~0x00000800);
        clientGwEth1_ = getDefaultInstance().getClientGwEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientGwEth1 = 12;</code>
       */
      public Builder setClientGwEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
        clientGwEth1_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientDnsEth1_ = "";
      /**
       * <code>optional string clientDnsEth1 = 13;</code>
       */
      public boolean hasClientDnsEth1() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional string clientDnsEth1 = 13;</code>
       */
      public java.lang.String getClientDnsEth1() {
        java.lang.Object ref = clientDnsEth1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientDnsEth1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientDnsEth1 = 13;</code>
       */
      public com.google.protobuf.ByteString
          getClientDnsEth1Bytes() {
        java.lang.Object ref = clientDnsEth1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientDnsEth1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientDnsEth1 = 13;</code>
       */
      public Builder setClientDnsEth1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        clientDnsEth1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientDnsEth1 = 13;</code>
       */
      public Builder clearClientDnsEth1() {
        bitField0_ = (bitField0_ & ~0x00001000);
        clientDnsEth1_ = getDefaultInstance().getClientDnsEth1();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientDnsEth1 = 13;</code>
       */
      public Builder setClientDnsEth1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        clientDnsEth1_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HNetSetting)
    }

    // @@protoc_insertion_point(class_scope:HNetSetting)
    private static final NetMgrMsg.HNetSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HNetSetting();
    }

    public static NetMgrMsg.HNetSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HNetSetting>
        PARSER = new com.google.protobuf.AbstractParser<HNetSetting>() {
      @java.lang.Override
      public HNetSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HNetSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HNetSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HNetSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HNetSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HDecoderSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HDecoderSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>optional int32 volume = 2 [default = -2];</code>
     */
    boolean hasVolume();
    /**
     * <code>optional int32 volume = 2 [default = -2];</code>
     */
    int getVolume();

    /**
     * <pre>
     * "play"/"stop"/"timeline 3600"
     * </pre>
     *
     * <code>optional string playCtrl = 3;</code>
     */
    boolean hasPlayCtrl();
    /**
     * <pre>
     * "play"/"stop"/"timeline 3600"
     * </pre>
     *
     * <code>optional string playCtrl = 3;</code>
     */
    java.lang.String getPlayCtrl();
    /**
     * <pre>
     * "play"/"stop"/"timeline 3600"
     * </pre>
     *
     * <code>optional string playCtrl = 3;</code>
     */
    com.google.protobuf.ByteString
        getPlayCtrlBytes();

    /**
     * <pre>
     * "x=0,y=0,w=1920,h=1080"
     * </pre>
     *
     * <code>optional string position = 4;</code>
     */
    boolean hasPosition();
    /**
     * <pre>
     * "x=0,y=0,w=1920,h=1080"
     * </pre>
     *
     * <code>optional string position = 4;</code>
     */
    java.lang.String getPosition();
    /**
     * <pre>
     * "x=0,y=0,w=1920,h=1080"
     * </pre>
     *
     * <code>optional string position = 4;</code>
     */
    com.google.protobuf.ByteString
        getPositionBytes();

    /**
     * <code>optional string masterStreamAddr = 5;</code>
     */
    boolean hasMasterStreamAddr();
    /**
     * <code>optional string masterStreamAddr = 5;</code>
     */
    java.lang.String getMasterStreamAddr();
    /**
     * <code>optional string masterStreamAddr = 5;</code>
     */
    com.google.protobuf.ByteString
        getMasterStreamAddrBytes();

    /**
     * <code>optional string spareStreamAddr = 6;</code>
     */
    boolean hasSpareStreamAddr();
    /**
     * <code>optional string spareStreamAddr = 6;</code>
     */
    java.lang.String getSpareStreamAddr();
    /**
     * <code>optional string spareStreamAddr = 6;</code>
     */
    com.google.protobuf.ByteString
        getSpareStreamAddrBytes();

    /**
     * <pre>
     * 0 close, 1 stream, 2 local
     * </pre>
     *
     * <code>optional int32 switch = 7 [default = -2];</code>
     */
    boolean hasSwitch();
    /**
     * <pre>
     * 0 close, 1 stream, 2 local
     * </pre>
     *
     * <code>optional int32 switch = 7 [default = -2];</code>
     */
    int getSwitch();

    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    java.util.List<NetMgrMsg.MediaResouce> 
        getLocalMediaList();
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    NetMgrMsg.MediaResouce getLocalMedia(int index);
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    int getLocalMediaCount();
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
        getLocalMediaOrBuilderList();
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    NetMgrMsg.MediaResouceOrBuilder getLocalMediaOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 0x32
   * </pre>
   *
   * Protobuf type {@code HDecoderSetting}
   */
  public  static final class HDecoderSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HDecoderSetting)
      HDecoderSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HDecoderSetting.newBuilder() to construct.
    private HDecoderSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HDecoderSetting() {
      type_ = 0;
      volume_ = -2;
      playCtrl_ = "";
      position_ = "";
      masterStreamAddr_ = "";
      spareStreamAddr_ = "";
      switch_ = -2;
      localMedia_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HDecoderSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              volume_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              playCtrl_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              position_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              masterStreamAddr_ = bs;
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              spareStreamAddr_ = bs;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              switch_ = input.readInt32();
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                localMedia_ = new java.util.ArrayList<NetMgrMsg.MediaResouce>();
                mutable_bitField0_ |= 0x00000080;
              }
              localMedia_.add(
                  input.readMessage(NetMgrMsg.MediaResouce.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          localMedia_ = java.util.Collections.unmodifiableList(localMedia_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HDecoderSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HDecoderSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HDecoderSetting.class, NetMgrMsg.HDecoderSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int VOLUME_FIELD_NUMBER = 2;
    private int volume_;
    /**
     * <code>optional int32 volume = 2 [default = -2];</code>
     */
    public boolean hasVolume() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 volume = 2 [default = -2];</code>
     */
    public int getVolume() {
      return volume_;
    }

    public static final int PLAYCTRL_FIELD_NUMBER = 3;
    private volatile java.lang.Object playCtrl_;
    /**
     * <pre>
     * "play"/"stop"/"timeline 3600"
     * </pre>
     *
     * <code>optional string playCtrl = 3;</code>
     */
    public boolean hasPlayCtrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * "play"/"stop"/"timeline 3600"
     * </pre>
     *
     * <code>optional string playCtrl = 3;</code>
     */
    public java.lang.String getPlayCtrl() {
      java.lang.Object ref = playCtrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          playCtrl_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * "play"/"stop"/"timeline 3600"
     * </pre>
     *
     * <code>optional string playCtrl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPlayCtrlBytes() {
      java.lang.Object ref = playCtrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playCtrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int POSITION_FIELD_NUMBER = 4;
    private volatile java.lang.Object position_;
    /**
     * <pre>
     * "x=0,y=0,w=1920,h=1080"
     * </pre>
     *
     * <code>optional string position = 4;</code>
     */
    public boolean hasPosition() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     * "x=0,y=0,w=1920,h=1080"
     * </pre>
     *
     * <code>optional string position = 4;</code>
     */
    public java.lang.String getPosition() {
      java.lang.Object ref = position_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          position_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * "x=0,y=0,w=1920,h=1080"
     * </pre>
     *
     * <code>optional string position = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPositionBytes() {
      java.lang.Object ref = position_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        position_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MASTERSTREAMADDR_FIELD_NUMBER = 5;
    private volatile java.lang.Object masterStreamAddr_;
    /**
     * <code>optional string masterStreamAddr = 5;</code>
     */
    public boolean hasMasterStreamAddr() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string masterStreamAddr = 5;</code>
     */
    public java.lang.String getMasterStreamAddr() {
      java.lang.Object ref = masterStreamAddr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          masterStreamAddr_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string masterStreamAddr = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMasterStreamAddrBytes() {
      java.lang.Object ref = masterStreamAddr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        masterStreamAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SPARESTREAMADDR_FIELD_NUMBER = 6;
    private volatile java.lang.Object spareStreamAddr_;
    /**
     * <code>optional string spareStreamAddr = 6;</code>
     */
    public boolean hasSpareStreamAddr() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string spareStreamAddr = 6;</code>
     */
    public java.lang.String getSpareStreamAddr() {
      java.lang.Object ref = spareStreamAddr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          spareStreamAddr_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string spareStreamAddr = 6;</code>
     */
    public com.google.protobuf.ByteString
        getSpareStreamAddrBytes() {
      java.lang.Object ref = spareStreamAddr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spareStreamAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SWITCH_FIELD_NUMBER = 7;
    private int switch_;
    /**
     * <pre>
     * 0 close, 1 stream, 2 local
     * </pre>
     *
     * <code>optional int32 switch = 7 [default = -2];</code>
     */
    public boolean hasSwitch() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <pre>
     * 0 close, 1 stream, 2 local
     * </pre>
     *
     * <code>optional int32 switch = 7 [default = -2];</code>
     */
    public int getSwitch() {
      return switch_;
    }

    public static final int LOCALMEDIA_FIELD_NUMBER = 8;
    private java.util.List<NetMgrMsg.MediaResouce> localMedia_;
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    public java.util.List<NetMgrMsg.MediaResouce> getLocalMediaList() {
      return localMedia_;
    }
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    public java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
        getLocalMediaOrBuilderList() {
      return localMedia_;
    }
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    public int getLocalMediaCount() {
      return localMedia_.size();
    }
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    public NetMgrMsg.MediaResouce getLocalMedia(int index) {
      return localMedia_.get(index);
    }
    /**
     * <code>repeated .MediaResouce localMedia = 8;</code>
     */
    public NetMgrMsg.MediaResouceOrBuilder getLocalMediaOrBuilder(
        int index) {
      return localMedia_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getLocalMediaCount(); i++) {
        if (!getLocalMedia(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, volume_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, playCtrl_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, position_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, masterStreamAddr_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, spareStreamAddr_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, switch_);
      }
      for (int i = 0; i < localMedia_.size(); i++) {
        output.writeMessage(8, localMedia_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, volume_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, playCtrl_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, position_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, masterStreamAddr_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, spareStreamAddr_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, switch_);
      }
      for (int i = 0; i < localMedia_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, localMedia_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HDecoderSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HDecoderSetting other = (NetMgrMsg.HDecoderSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasVolume() == other.hasVolume());
      if (hasVolume()) {
        result = result && (getVolume()
            == other.getVolume());
      }
      result = result && (hasPlayCtrl() == other.hasPlayCtrl());
      if (hasPlayCtrl()) {
        result = result && getPlayCtrl()
            .equals(other.getPlayCtrl());
      }
      result = result && (hasPosition() == other.hasPosition());
      if (hasPosition()) {
        result = result && getPosition()
            .equals(other.getPosition());
      }
      result = result && (hasMasterStreamAddr() == other.hasMasterStreamAddr());
      if (hasMasterStreamAddr()) {
        result = result && getMasterStreamAddr()
            .equals(other.getMasterStreamAddr());
      }
      result = result && (hasSpareStreamAddr() == other.hasSpareStreamAddr());
      if (hasSpareStreamAddr()) {
        result = result && getSpareStreamAddr()
            .equals(other.getSpareStreamAddr());
      }
      result = result && (hasSwitch() == other.hasSwitch());
      if (hasSwitch()) {
        result = result && (getSwitch()
            == other.getSwitch());
      }
      result = result && getLocalMediaList()
          .equals(other.getLocalMediaList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasVolume()) {
        hash = (37 * hash) + VOLUME_FIELD_NUMBER;
        hash = (53 * hash) + getVolume();
      }
      if (hasPlayCtrl()) {
        hash = (37 * hash) + PLAYCTRL_FIELD_NUMBER;
        hash = (53 * hash) + getPlayCtrl().hashCode();
      }
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      if (hasMasterStreamAddr()) {
        hash = (37 * hash) + MASTERSTREAMADDR_FIELD_NUMBER;
        hash = (53 * hash) + getMasterStreamAddr().hashCode();
      }
      if (hasSpareStreamAddr()) {
        hash = (37 * hash) + SPARESTREAMADDR_FIELD_NUMBER;
        hash = (53 * hash) + getSpareStreamAddr().hashCode();
      }
      if (hasSwitch()) {
        hash = (37 * hash) + SWITCH_FIELD_NUMBER;
        hash = (53 * hash) + getSwitch();
      }
      if (getLocalMediaCount() > 0) {
        hash = (37 * hash) + LOCALMEDIA_FIELD_NUMBER;
        hash = (53 * hash) + getLocalMediaList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HDecoderSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HDecoderSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HDecoderSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HDecoderSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HDecoderSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x32
     * </pre>
     *
     * Protobuf type {@code HDecoderSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HDecoderSetting)
        NetMgrMsg.HDecoderSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HDecoderSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HDecoderSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HDecoderSetting.class, NetMgrMsg.HDecoderSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HDecoderSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLocalMediaFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        volume_ = -2;
        bitField0_ = (bitField0_ & ~0x00000002);
        playCtrl_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        position_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        masterStreamAddr_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        spareStreamAddr_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        switch_ = -2;
        bitField0_ = (bitField0_ & ~0x00000040);
        if (localMediaBuilder_ == null) {
          localMedia_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
        } else {
          localMediaBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HDecoderSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HDecoderSetting getDefaultInstanceForType() {
        return NetMgrMsg.HDecoderSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HDecoderSetting build() {
        NetMgrMsg.HDecoderSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HDecoderSetting buildPartial() {
        NetMgrMsg.HDecoderSetting result = new NetMgrMsg.HDecoderSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.volume_ = volume_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.playCtrl_ = playCtrl_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.position_ = position_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.masterStreamAddr_ = masterStreamAddr_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.spareStreamAddr_ = spareStreamAddr_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.switch_ = switch_;
        if (localMediaBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            localMedia_ = java.util.Collections.unmodifiableList(localMedia_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.localMedia_ = localMedia_;
        } else {
          result.localMedia_ = localMediaBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HDecoderSetting) {
          return mergeFrom((NetMgrMsg.HDecoderSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HDecoderSetting other) {
        if (other == NetMgrMsg.HDecoderSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasVolume()) {
          setVolume(other.getVolume());
        }
        if (other.hasPlayCtrl()) {
          bitField0_ |= 0x00000004;
          playCtrl_ = other.playCtrl_;
          onChanged();
        }
        if (other.hasPosition()) {
          bitField0_ |= 0x00000008;
          position_ = other.position_;
          onChanged();
        }
        if (other.hasMasterStreamAddr()) {
          bitField0_ |= 0x00000010;
          masterStreamAddr_ = other.masterStreamAddr_;
          onChanged();
        }
        if (other.hasSpareStreamAddr()) {
          bitField0_ |= 0x00000020;
          spareStreamAddr_ = other.spareStreamAddr_;
          onChanged();
        }
        if (other.hasSwitch()) {
          setSwitch(other.getSwitch());
        }
        if (localMediaBuilder_ == null) {
          if (!other.localMedia_.isEmpty()) {
            if (localMedia_.isEmpty()) {
              localMedia_ = other.localMedia_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureLocalMediaIsMutable();
              localMedia_.addAll(other.localMedia_);
            }
            onChanged();
          }
        } else {
          if (!other.localMedia_.isEmpty()) {
            if (localMediaBuilder_.isEmpty()) {
              localMediaBuilder_.dispose();
              localMediaBuilder_ = null;
              localMedia_ = other.localMedia_;
              bitField0_ = (bitField0_ & ~0x00000080);
              localMediaBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLocalMediaFieldBuilder() : null;
            } else {
              localMediaBuilder_.addAllMessages(other.localMedia_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        for (int i = 0; i < getLocalMediaCount(); i++) {
          if (!getLocalMedia(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HDecoderSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HDecoderSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int volume_ = -2;
      /**
       * <code>optional int32 volume = 2 [default = -2];</code>
       */
      public boolean hasVolume() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 volume = 2 [default = -2];</code>
       */
      public int getVolume() {
        return volume_;
      }
      /**
       * <code>optional int32 volume = 2 [default = -2];</code>
       */
      public Builder setVolume(int value) {
        bitField0_ |= 0x00000002;
        volume_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 volume = 2 [default = -2];</code>
       */
      public Builder clearVolume() {
        bitField0_ = (bitField0_ & ~0x00000002);
        volume_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object playCtrl_ = "";
      /**
       * <pre>
       * "play"/"stop"/"timeline 3600"
       * </pre>
       *
       * <code>optional string playCtrl = 3;</code>
       */
      public boolean hasPlayCtrl() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       * "play"/"stop"/"timeline 3600"
       * </pre>
       *
       * <code>optional string playCtrl = 3;</code>
       */
      public java.lang.String getPlayCtrl() {
        java.lang.Object ref = playCtrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            playCtrl_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * "play"/"stop"/"timeline 3600"
       * </pre>
       *
       * <code>optional string playCtrl = 3;</code>
       */
      public com.google.protobuf.ByteString
          getPlayCtrlBytes() {
        java.lang.Object ref = playCtrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          playCtrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * "play"/"stop"/"timeline 3600"
       * </pre>
       *
       * <code>optional string playCtrl = 3;</code>
       */
      public Builder setPlayCtrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        playCtrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * "play"/"stop"/"timeline 3600"
       * </pre>
       *
       * <code>optional string playCtrl = 3;</code>
       */
      public Builder clearPlayCtrl() {
        bitField0_ = (bitField0_ & ~0x00000004);
        playCtrl_ = getDefaultInstance().getPlayCtrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * "play"/"stop"/"timeline 3600"
       * </pre>
       *
       * <code>optional string playCtrl = 3;</code>
       */
      public Builder setPlayCtrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        playCtrl_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object position_ = "";
      /**
       * <pre>
       * "x=0,y=0,w=1920,h=1080"
       * </pre>
       *
       * <code>optional string position = 4;</code>
       */
      public boolean hasPosition() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <pre>
       * "x=0,y=0,w=1920,h=1080"
       * </pre>
       *
       * <code>optional string position = 4;</code>
       */
      public java.lang.String getPosition() {
        java.lang.Object ref = position_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            position_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * "x=0,y=0,w=1920,h=1080"
       * </pre>
       *
       * <code>optional string position = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPositionBytes() {
        java.lang.Object ref = position_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          position_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * "x=0,y=0,w=1920,h=1080"
       * </pre>
       *
       * <code>optional string position = 4;</code>
       */
      public Builder setPosition(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        position_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * "x=0,y=0,w=1920,h=1080"
       * </pre>
       *
       * <code>optional string position = 4;</code>
       */
      public Builder clearPosition() {
        bitField0_ = (bitField0_ & ~0x00000008);
        position_ = getDefaultInstance().getPosition();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * "x=0,y=0,w=1920,h=1080"
       * </pre>
       *
       * <code>optional string position = 4;</code>
       */
      public Builder setPositionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        position_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object masterStreamAddr_ = "";
      /**
       * <code>optional string masterStreamAddr = 5;</code>
       */
      public boolean hasMasterStreamAddr() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string masterStreamAddr = 5;</code>
       */
      public java.lang.String getMasterStreamAddr() {
        java.lang.Object ref = masterStreamAddr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            masterStreamAddr_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string masterStreamAddr = 5;</code>
       */
      public com.google.protobuf.ByteString
          getMasterStreamAddrBytes() {
        java.lang.Object ref = masterStreamAddr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          masterStreamAddr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string masterStreamAddr = 5;</code>
       */
      public Builder setMasterStreamAddr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        masterStreamAddr_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string masterStreamAddr = 5;</code>
       */
      public Builder clearMasterStreamAddr() {
        bitField0_ = (bitField0_ & ~0x00000010);
        masterStreamAddr_ = getDefaultInstance().getMasterStreamAddr();
        onChanged();
        return this;
      }
      /**
       * <code>optional string masterStreamAddr = 5;</code>
       */
      public Builder setMasterStreamAddrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        masterStreamAddr_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object spareStreamAddr_ = "";
      /**
       * <code>optional string spareStreamAddr = 6;</code>
       */
      public boolean hasSpareStreamAddr() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string spareStreamAddr = 6;</code>
       */
      public java.lang.String getSpareStreamAddr() {
        java.lang.Object ref = spareStreamAddr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            spareStreamAddr_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string spareStreamAddr = 6;</code>
       */
      public com.google.protobuf.ByteString
          getSpareStreamAddrBytes() {
        java.lang.Object ref = spareStreamAddr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          spareStreamAddr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string spareStreamAddr = 6;</code>
       */
      public Builder setSpareStreamAddr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        spareStreamAddr_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string spareStreamAddr = 6;</code>
       */
      public Builder clearSpareStreamAddr() {
        bitField0_ = (bitField0_ & ~0x00000020);
        spareStreamAddr_ = getDefaultInstance().getSpareStreamAddr();
        onChanged();
        return this;
      }
      /**
       * <code>optional string spareStreamAddr = 6;</code>
       */
      public Builder setSpareStreamAddrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        spareStreamAddr_ = value;
        onChanged();
        return this;
      }

      private int switch_ = -2;
      /**
       * <pre>
       * 0 close, 1 stream, 2 local
       * </pre>
       *
       * <code>optional int32 switch = 7 [default = -2];</code>
       */
      public boolean hasSwitch() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <pre>
       * 0 close, 1 stream, 2 local
       * </pre>
       *
       * <code>optional int32 switch = 7 [default = -2];</code>
       */
      public int getSwitch() {
        return switch_;
      }
      /**
       * <pre>
       * 0 close, 1 stream, 2 local
       * </pre>
       *
       * <code>optional int32 switch = 7 [default = -2];</code>
       */
      public Builder setSwitch(int value) {
        bitField0_ |= 0x00000040;
        switch_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 close, 1 stream, 2 local
       * </pre>
       *
       * <code>optional int32 switch = 7 [default = -2];</code>
       */
      public Builder clearSwitch() {
        bitField0_ = (bitField0_ & ~0x00000040);
        switch_ = -2;
        onChanged();
        return this;
      }

      private java.util.List<NetMgrMsg.MediaResouce> localMedia_ =
        java.util.Collections.emptyList();
      private void ensureLocalMediaIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          localMedia_ = new java.util.ArrayList<NetMgrMsg.MediaResouce>(localMedia_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder> localMediaBuilder_;

      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public java.util.List<NetMgrMsg.MediaResouce> getLocalMediaList() {
        if (localMediaBuilder_ == null) {
          return java.util.Collections.unmodifiableList(localMedia_);
        } else {
          return localMediaBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public int getLocalMediaCount() {
        if (localMediaBuilder_ == null) {
          return localMedia_.size();
        } else {
          return localMediaBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public NetMgrMsg.MediaResouce getLocalMedia(int index) {
        if (localMediaBuilder_ == null) {
          return localMedia_.get(index);
        } else {
          return localMediaBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder setLocalMedia(
          int index, NetMgrMsg.MediaResouce value) {
        if (localMediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLocalMediaIsMutable();
          localMedia_.set(index, value);
          onChanged();
        } else {
          localMediaBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder setLocalMedia(
          int index, NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (localMediaBuilder_ == null) {
          ensureLocalMediaIsMutable();
          localMedia_.set(index, builderForValue.build());
          onChanged();
        } else {
          localMediaBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder addLocalMedia(NetMgrMsg.MediaResouce value) {
        if (localMediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLocalMediaIsMutable();
          localMedia_.add(value);
          onChanged();
        } else {
          localMediaBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder addLocalMedia(
          int index, NetMgrMsg.MediaResouce value) {
        if (localMediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLocalMediaIsMutable();
          localMedia_.add(index, value);
          onChanged();
        } else {
          localMediaBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder addLocalMedia(
          NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (localMediaBuilder_ == null) {
          ensureLocalMediaIsMutable();
          localMedia_.add(builderForValue.build());
          onChanged();
        } else {
          localMediaBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder addLocalMedia(
          int index, NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (localMediaBuilder_ == null) {
          ensureLocalMediaIsMutable();
          localMedia_.add(index, builderForValue.build());
          onChanged();
        } else {
          localMediaBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder addAllLocalMedia(
          java.lang.Iterable<? extends NetMgrMsg.MediaResouce> values) {
        if (localMediaBuilder_ == null) {
          ensureLocalMediaIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, localMedia_);
          onChanged();
        } else {
          localMediaBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder clearLocalMedia() {
        if (localMediaBuilder_ == null) {
          localMedia_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          localMediaBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public Builder removeLocalMedia(int index) {
        if (localMediaBuilder_ == null) {
          ensureLocalMediaIsMutable();
          localMedia_.remove(index);
          onChanged();
        } else {
          localMediaBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public NetMgrMsg.MediaResouce.Builder getLocalMediaBuilder(
          int index) {
        return getLocalMediaFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public NetMgrMsg.MediaResouceOrBuilder getLocalMediaOrBuilder(
          int index) {
        if (localMediaBuilder_ == null) {
          return localMedia_.get(index);  } else {
          return localMediaBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
           getLocalMediaOrBuilderList() {
        if (localMediaBuilder_ != null) {
          return localMediaBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(localMedia_);
        }
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public NetMgrMsg.MediaResouce.Builder addLocalMediaBuilder() {
        return getLocalMediaFieldBuilder().addBuilder(
            NetMgrMsg.MediaResouce.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public NetMgrMsg.MediaResouce.Builder addLocalMediaBuilder(
          int index) {
        return getLocalMediaFieldBuilder().addBuilder(
            index, NetMgrMsg.MediaResouce.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaResouce localMedia = 8;</code>
       */
      public java.util.List<NetMgrMsg.MediaResouce.Builder> 
           getLocalMediaBuilderList() {
        return getLocalMediaFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder> 
          getLocalMediaFieldBuilder() {
        if (localMediaBuilder_ == null) {
          localMediaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder>(
                  localMedia_,
                  ((bitField0_ & 0x00000080) == 0x00000080),
                  getParentForChildren(),
                  isClean());
          localMedia_ = null;
        }
        return localMediaBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HDecoderSetting)
    }

    // @@protoc_insertion_point(class_scope:HDecoderSetting)
    private static final NetMgrMsg.HDecoderSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HDecoderSetting();
    }

    public static NetMgrMsg.HDecoderSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HDecoderSetting>
        PARSER = new com.google.protobuf.AbstractParser<HDecoderSetting>() {
      @java.lang.Override
      public HDecoderSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HDecoderSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HDecoderSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HDecoderSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HDecoderSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HSeederSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HSeederSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>optional int32 isMaster = 2 [default = -2];</code>
     */
    boolean hasIsMaster();
    /**
     * <code>optional int32 isMaster = 2 [default = -2];</code>
     */
    int getIsMaster();

    /**
     * <code>optional string spareIp = 3;</code>
     */
    boolean hasSpareIp();
    /**
     * <code>optional string spareIp = 3;</code>
     */
    java.lang.String getSpareIp();
    /**
     * <code>optional string spareIp = 3;</code>
     */
    com.google.protobuf.ByteString
        getSpareIpBytes();

    /**
     * <code>optional int32 sparePort = 4 [default = -2];</code>
     */
    boolean hasSparePort();
    /**
     * <code>optional int32 sparePort = 4 [default = -2];</code>
     */
    int getSparePort();

    /**
     * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
     */
    boolean hasIsAutoSwitch();
    /**
     * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
     */
    int getIsAutoSwitch();

    /**
     * <code>optional int32 isLive = 6 [default = -2];</code>
     */
    boolean hasIsLive();
    /**
     * <code>optional int32 isLive = 6 [default = -2];</code>
     */
    int getIsLive();

    /**
     * <code>optional string recvStreamAddr = 7;</code>
     */
    boolean hasRecvStreamAddr();
    /**
     * <code>optional string recvStreamAddr = 7;</code>
     */
    java.lang.String getRecvStreamAddr();
    /**
     * <code>optional string recvStreamAddr = 7;</code>
     */
    com.google.protobuf.ByteString
        getRecvStreamAddrBytes();

    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 1
     * </pre>
     *
     * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
     */
    boolean hasRecvStreamPhy();
    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 1
     * </pre>
     *
     * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
     */
    int getRecvStreamPhy();

    /**
     * <code>optional string sendStreamAddr = 9;</code>
     */
    boolean hasSendStreamAddr();
    /**
     * <code>optional string sendStreamAddr = 9;</code>
     */
    java.lang.String getSendStreamAddr();
    /**
     * <code>optional string sendStreamAddr = 9;</code>
     */
    com.google.protobuf.ByteString
        getSendStreamAddrBytes();

    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 0
     * </pre>
     *
     * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
     */
    boolean hasSendStreamPhy();
    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 0
     * </pre>
     *
     * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
     */
    int getSendStreamPhy();

    /**
     * <code>optional int32 switch = 11 [default = -2];</code>
     */
    boolean hasSwitch();
    /**
     * <code>optional int32 switch = 11 [default = -2];</code>
     */
    int getSwitch();
  }
  /**
   * <pre>
   * 0x33
   * </pre>
   *
   * Protobuf type {@code HSeederSetting}
   */
  public  static final class HSeederSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HSeederSetting)
      HSeederSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HSeederSetting.newBuilder() to construct.
    private HSeederSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HSeederSetting() {
      type_ = 0;
      isMaster_ = -2;
      spareIp_ = "";
      sparePort_ = -2;
      isAutoSwitch_ = -2;
      isLive_ = -2;
      recvStreamAddr_ = "";
      recvStreamPhy_ = -2;
      sendStreamAddr_ = "";
      sendStreamPhy_ = -2;
      switch_ = -2;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HSeederSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isMaster_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              spareIp_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              sparePort_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              isAutoSwitch_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              isLive_ = input.readInt32();
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              recvStreamAddr_ = bs;
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              recvStreamPhy_ = input.readInt32();
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              sendStreamAddr_ = bs;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              sendStreamPhy_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              switch_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HSeederSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HSeederSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HSeederSetting.class, NetMgrMsg.HSeederSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int ISMASTER_FIELD_NUMBER = 2;
    private int isMaster_;
    /**
     * <code>optional int32 isMaster = 2 [default = -2];</code>
     */
    public boolean hasIsMaster() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 isMaster = 2 [default = -2];</code>
     */
    public int getIsMaster() {
      return isMaster_;
    }

    public static final int SPAREIP_FIELD_NUMBER = 3;
    private volatile java.lang.Object spareIp_;
    /**
     * <code>optional string spareIp = 3;</code>
     */
    public boolean hasSpareIp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string spareIp = 3;</code>
     */
    public java.lang.String getSpareIp() {
      java.lang.Object ref = spareIp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          spareIp_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string spareIp = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSpareIpBytes() {
      java.lang.Object ref = spareIp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spareIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SPAREPORT_FIELD_NUMBER = 4;
    private int sparePort_;
    /**
     * <code>optional int32 sparePort = 4 [default = -2];</code>
     */
    public boolean hasSparePort() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 sparePort = 4 [default = -2];</code>
     */
    public int getSparePort() {
      return sparePort_;
    }

    public static final int ISAUTOSWITCH_FIELD_NUMBER = 5;
    private int isAutoSwitch_;
    /**
     * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
     */
    public boolean hasIsAutoSwitch() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
     */
    public int getIsAutoSwitch() {
      return isAutoSwitch_;
    }

    public static final int ISLIVE_FIELD_NUMBER = 6;
    private int isLive_;
    /**
     * <code>optional int32 isLive = 6 [default = -2];</code>
     */
    public boolean hasIsLive() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 isLive = 6 [default = -2];</code>
     */
    public int getIsLive() {
      return isLive_;
    }

    public static final int RECVSTREAMADDR_FIELD_NUMBER = 7;
    private volatile java.lang.Object recvStreamAddr_;
    /**
     * <code>optional string recvStreamAddr = 7;</code>
     */
    public boolean hasRecvStreamAddr() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string recvStreamAddr = 7;</code>
     */
    public java.lang.String getRecvStreamAddr() {
      java.lang.Object ref = recvStreamAddr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          recvStreamAddr_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string recvStreamAddr = 7;</code>
     */
    public com.google.protobuf.ByteString
        getRecvStreamAddrBytes() {
      java.lang.Object ref = recvStreamAddr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recvStreamAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECVSTREAMPHY_FIELD_NUMBER = 8;
    private int recvStreamPhy_;
    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 1
     * </pre>
     *
     * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
     */
    public boolean hasRecvStreamPhy() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 1
     * </pre>
     *
     * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
     */
    public int getRecvStreamPhy() {
      return recvStreamPhy_;
    }

    public static final int SENDSTREAMADDR_FIELD_NUMBER = 9;
    private volatile java.lang.Object sendStreamAddr_;
    /**
     * <code>optional string sendStreamAddr = 9;</code>
     */
    public boolean hasSendStreamAddr() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string sendStreamAddr = 9;</code>
     */
    public java.lang.String getSendStreamAddr() {
      java.lang.Object ref = sendStreamAddr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sendStreamAddr_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sendStreamAddr = 9;</code>
     */
    public com.google.protobuf.ByteString
        getSendStreamAddrBytes() {
      java.lang.Object ref = sendStreamAddr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sendStreamAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDSTREAMPHY_FIELD_NUMBER = 10;
    private int sendStreamPhy_;
    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 0
     * </pre>
     *
     * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
     */
    public boolean hasSendStreamPhy() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <pre>
     * 0 for eth0, 1 for eth1, default 0
     * </pre>
     *
     * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
     */
    public int getSendStreamPhy() {
      return sendStreamPhy_;
    }

    public static final int SWITCH_FIELD_NUMBER = 11;
    private int switch_;
    /**
     * <code>optional int32 switch = 11 [default = -2];</code>
     */
    public boolean hasSwitch() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional int32 switch = 11 [default = -2];</code>
     */
    public int getSwitch() {
      return switch_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, isMaster_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, spareIp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, sparePort_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, isAutoSwitch_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, isLive_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, recvStreamAddr_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, recvStreamPhy_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, sendStreamAddr_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, sendStreamPhy_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(11, switch_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, isMaster_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, spareIp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, sparePort_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, isAutoSwitch_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, isLive_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, recvStreamAddr_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, recvStreamPhy_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, sendStreamAddr_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, sendStreamPhy_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, switch_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HSeederSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HSeederSetting other = (NetMgrMsg.HSeederSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasIsMaster() == other.hasIsMaster());
      if (hasIsMaster()) {
        result = result && (getIsMaster()
            == other.getIsMaster());
      }
      result = result && (hasSpareIp() == other.hasSpareIp());
      if (hasSpareIp()) {
        result = result && getSpareIp()
            .equals(other.getSpareIp());
      }
      result = result && (hasSparePort() == other.hasSparePort());
      if (hasSparePort()) {
        result = result && (getSparePort()
            == other.getSparePort());
      }
      result = result && (hasIsAutoSwitch() == other.hasIsAutoSwitch());
      if (hasIsAutoSwitch()) {
        result = result && (getIsAutoSwitch()
            == other.getIsAutoSwitch());
      }
      result = result && (hasIsLive() == other.hasIsLive());
      if (hasIsLive()) {
        result = result && (getIsLive()
            == other.getIsLive());
      }
      result = result && (hasRecvStreamAddr() == other.hasRecvStreamAddr());
      if (hasRecvStreamAddr()) {
        result = result && getRecvStreamAddr()
            .equals(other.getRecvStreamAddr());
      }
      result = result && (hasRecvStreamPhy() == other.hasRecvStreamPhy());
      if (hasRecvStreamPhy()) {
        result = result && (getRecvStreamPhy()
            == other.getRecvStreamPhy());
      }
      result = result && (hasSendStreamAddr() == other.hasSendStreamAddr());
      if (hasSendStreamAddr()) {
        result = result && getSendStreamAddr()
            .equals(other.getSendStreamAddr());
      }
      result = result && (hasSendStreamPhy() == other.hasSendStreamPhy());
      if (hasSendStreamPhy()) {
        result = result && (getSendStreamPhy()
            == other.getSendStreamPhy());
      }
      result = result && (hasSwitch() == other.hasSwitch());
      if (hasSwitch()) {
        result = result && (getSwitch()
            == other.getSwitch());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasIsMaster()) {
        hash = (37 * hash) + ISMASTER_FIELD_NUMBER;
        hash = (53 * hash) + getIsMaster();
      }
      if (hasSpareIp()) {
        hash = (37 * hash) + SPAREIP_FIELD_NUMBER;
        hash = (53 * hash) + getSpareIp().hashCode();
      }
      if (hasSparePort()) {
        hash = (37 * hash) + SPAREPORT_FIELD_NUMBER;
        hash = (53 * hash) + getSparePort();
      }
      if (hasIsAutoSwitch()) {
        hash = (37 * hash) + ISAUTOSWITCH_FIELD_NUMBER;
        hash = (53 * hash) + getIsAutoSwitch();
      }
      if (hasIsLive()) {
        hash = (37 * hash) + ISLIVE_FIELD_NUMBER;
        hash = (53 * hash) + getIsLive();
      }
      if (hasRecvStreamAddr()) {
        hash = (37 * hash) + RECVSTREAMADDR_FIELD_NUMBER;
        hash = (53 * hash) + getRecvStreamAddr().hashCode();
      }
      if (hasRecvStreamPhy()) {
        hash = (37 * hash) + RECVSTREAMPHY_FIELD_NUMBER;
        hash = (53 * hash) + getRecvStreamPhy();
      }
      if (hasSendStreamAddr()) {
        hash = (37 * hash) + SENDSTREAMADDR_FIELD_NUMBER;
        hash = (53 * hash) + getSendStreamAddr().hashCode();
      }
      if (hasSendStreamPhy()) {
        hash = (37 * hash) + SENDSTREAMPHY_FIELD_NUMBER;
        hash = (53 * hash) + getSendStreamPhy();
      }
      if (hasSwitch()) {
        hash = (37 * hash) + SWITCH_FIELD_NUMBER;
        hash = (53 * hash) + getSwitch();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HSeederSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HSeederSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HSeederSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HSeederSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HSeederSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x33
     * </pre>
     *
     * Protobuf type {@code HSeederSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HSeederSetting)
        NetMgrMsg.HSeederSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HSeederSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HSeederSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HSeederSetting.class, NetMgrMsg.HSeederSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HSeederSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        isMaster_ = -2;
        bitField0_ = (bitField0_ & ~0x00000002);
        spareIp_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        sparePort_ = -2;
        bitField0_ = (bitField0_ & ~0x00000008);
        isAutoSwitch_ = -2;
        bitField0_ = (bitField0_ & ~0x00000010);
        isLive_ = -2;
        bitField0_ = (bitField0_ & ~0x00000020);
        recvStreamAddr_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        recvStreamPhy_ = -2;
        bitField0_ = (bitField0_ & ~0x00000080);
        sendStreamAddr_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        sendStreamPhy_ = -2;
        bitField0_ = (bitField0_ & ~0x00000200);
        switch_ = -2;
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HSeederSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HSeederSetting getDefaultInstanceForType() {
        return NetMgrMsg.HSeederSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HSeederSetting build() {
        NetMgrMsg.HSeederSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HSeederSetting buildPartial() {
        NetMgrMsg.HSeederSetting result = new NetMgrMsg.HSeederSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isMaster_ = isMaster_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.spareIp_ = spareIp_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sparePort_ = sparePort_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.isAutoSwitch_ = isAutoSwitch_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.isLive_ = isLive_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.recvStreamAddr_ = recvStreamAddr_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.recvStreamPhy_ = recvStreamPhy_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.sendStreamAddr_ = sendStreamAddr_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.sendStreamPhy_ = sendStreamPhy_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.switch_ = switch_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HSeederSetting) {
          return mergeFrom((NetMgrMsg.HSeederSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HSeederSetting other) {
        if (other == NetMgrMsg.HSeederSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasIsMaster()) {
          setIsMaster(other.getIsMaster());
        }
        if (other.hasSpareIp()) {
          bitField0_ |= 0x00000004;
          spareIp_ = other.spareIp_;
          onChanged();
        }
        if (other.hasSparePort()) {
          setSparePort(other.getSparePort());
        }
        if (other.hasIsAutoSwitch()) {
          setIsAutoSwitch(other.getIsAutoSwitch());
        }
        if (other.hasIsLive()) {
          setIsLive(other.getIsLive());
        }
        if (other.hasRecvStreamAddr()) {
          bitField0_ |= 0x00000040;
          recvStreamAddr_ = other.recvStreamAddr_;
          onChanged();
        }
        if (other.hasRecvStreamPhy()) {
          setRecvStreamPhy(other.getRecvStreamPhy());
        }
        if (other.hasSendStreamAddr()) {
          bitField0_ |= 0x00000100;
          sendStreamAddr_ = other.sendStreamAddr_;
          onChanged();
        }
        if (other.hasSendStreamPhy()) {
          setSendStreamPhy(other.getSendStreamPhy());
        }
        if (other.hasSwitch()) {
          setSwitch(other.getSwitch());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HSeederSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HSeederSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int isMaster_ = -2;
      /**
       * <code>optional int32 isMaster = 2 [default = -2];</code>
       */
      public boolean hasIsMaster() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 isMaster = 2 [default = -2];</code>
       */
      public int getIsMaster() {
        return isMaster_;
      }
      /**
       * <code>optional int32 isMaster = 2 [default = -2];</code>
       */
      public Builder setIsMaster(int value) {
        bitField0_ |= 0x00000002;
        isMaster_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 isMaster = 2 [default = -2];</code>
       */
      public Builder clearIsMaster() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isMaster_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object spareIp_ = "";
      /**
       * <code>optional string spareIp = 3;</code>
       */
      public boolean hasSpareIp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string spareIp = 3;</code>
       */
      public java.lang.String getSpareIp() {
        java.lang.Object ref = spareIp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            spareIp_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string spareIp = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSpareIpBytes() {
        java.lang.Object ref = spareIp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          spareIp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string spareIp = 3;</code>
       */
      public Builder setSpareIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        spareIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string spareIp = 3;</code>
       */
      public Builder clearSpareIp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        spareIp_ = getDefaultInstance().getSpareIp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string spareIp = 3;</code>
       */
      public Builder setSpareIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        spareIp_ = value;
        onChanged();
        return this;
      }

      private int sparePort_ = -2;
      /**
       * <code>optional int32 sparePort = 4 [default = -2];</code>
       */
      public boolean hasSparePort() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 sparePort = 4 [default = -2];</code>
       */
      public int getSparePort() {
        return sparePort_;
      }
      /**
       * <code>optional int32 sparePort = 4 [default = -2];</code>
       */
      public Builder setSparePort(int value) {
        bitField0_ |= 0x00000008;
        sparePort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 sparePort = 4 [default = -2];</code>
       */
      public Builder clearSparePort() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sparePort_ = -2;
        onChanged();
        return this;
      }

      private int isAutoSwitch_ = -2;
      /**
       * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
       */
      public boolean hasIsAutoSwitch() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
       */
      public int getIsAutoSwitch() {
        return isAutoSwitch_;
      }
      /**
       * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
       */
      public Builder setIsAutoSwitch(int value) {
        bitField0_ |= 0x00000010;
        isAutoSwitch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 isAutoSwitch = 5 [default = -2];</code>
       */
      public Builder clearIsAutoSwitch() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isAutoSwitch_ = -2;
        onChanged();
        return this;
      }

      private int isLive_ = -2;
      /**
       * <code>optional int32 isLive = 6 [default = -2];</code>
       */
      public boolean hasIsLive() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 isLive = 6 [default = -2];</code>
       */
      public int getIsLive() {
        return isLive_;
      }
      /**
       * <code>optional int32 isLive = 6 [default = -2];</code>
       */
      public Builder setIsLive(int value) {
        bitField0_ |= 0x00000020;
        isLive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 isLive = 6 [default = -2];</code>
       */
      public Builder clearIsLive() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isLive_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object recvStreamAddr_ = "";
      /**
       * <code>optional string recvStreamAddr = 7;</code>
       */
      public boolean hasRecvStreamAddr() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string recvStreamAddr = 7;</code>
       */
      public java.lang.String getRecvStreamAddr() {
        java.lang.Object ref = recvStreamAddr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            recvStreamAddr_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string recvStreamAddr = 7;</code>
       */
      public com.google.protobuf.ByteString
          getRecvStreamAddrBytes() {
        java.lang.Object ref = recvStreamAddr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          recvStreamAddr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string recvStreamAddr = 7;</code>
       */
      public Builder setRecvStreamAddr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        recvStreamAddr_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string recvStreamAddr = 7;</code>
       */
      public Builder clearRecvStreamAddr() {
        bitField0_ = (bitField0_ & ~0x00000040);
        recvStreamAddr_ = getDefaultInstance().getRecvStreamAddr();
        onChanged();
        return this;
      }
      /**
       * <code>optional string recvStreamAddr = 7;</code>
       */
      public Builder setRecvStreamAddrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        recvStreamAddr_ = value;
        onChanged();
        return this;
      }

      private int recvStreamPhy_ = -2;
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 1
       * </pre>
       *
       * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
       */
      public boolean hasRecvStreamPhy() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 1
       * </pre>
       *
       * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
       */
      public int getRecvStreamPhy() {
        return recvStreamPhy_;
      }
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 1
       * </pre>
       *
       * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
       */
      public Builder setRecvStreamPhy(int value) {
        bitField0_ |= 0x00000080;
        recvStreamPhy_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 1
       * </pre>
       *
       * <code>optional int32 recvStreamPhy = 8 [default = -2];</code>
       */
      public Builder clearRecvStreamPhy() {
        bitField0_ = (bitField0_ & ~0x00000080);
        recvStreamPhy_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object sendStreamAddr_ = "";
      /**
       * <code>optional string sendStreamAddr = 9;</code>
       */
      public boolean hasSendStreamAddr() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string sendStreamAddr = 9;</code>
       */
      public java.lang.String getSendStreamAddr() {
        java.lang.Object ref = sendStreamAddr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sendStreamAddr_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sendStreamAddr = 9;</code>
       */
      public com.google.protobuf.ByteString
          getSendStreamAddrBytes() {
        java.lang.Object ref = sendStreamAddr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sendStreamAddr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sendStreamAddr = 9;</code>
       */
      public Builder setSendStreamAddr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        sendStreamAddr_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sendStreamAddr = 9;</code>
       */
      public Builder clearSendStreamAddr() {
        bitField0_ = (bitField0_ & ~0x00000100);
        sendStreamAddr_ = getDefaultInstance().getSendStreamAddr();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sendStreamAddr = 9;</code>
       */
      public Builder setSendStreamAddrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        sendStreamAddr_ = value;
        onChanged();
        return this;
      }

      private int sendStreamPhy_ = -2;
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 0
       * </pre>
       *
       * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
       */
      public boolean hasSendStreamPhy() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 0
       * </pre>
       *
       * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
       */
      public int getSendStreamPhy() {
        return sendStreamPhy_;
      }
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 0
       * </pre>
       *
       * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
       */
      public Builder setSendStreamPhy(int value) {
        bitField0_ |= 0x00000200;
        sendStreamPhy_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 for eth0, 1 for eth1, default 0
       * </pre>
       *
       * <code>optional int32 sendStreamPhy = 10 [default = -2];</code>
       */
      public Builder clearSendStreamPhy() {
        bitField0_ = (bitField0_ & ~0x00000200);
        sendStreamPhy_ = -2;
        onChanged();
        return this;
      }

      private int switch_ = -2;
      /**
       * <code>optional int32 switch = 11 [default = -2];</code>
       */
      public boolean hasSwitch() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional int32 switch = 11 [default = -2];</code>
       */
      public int getSwitch() {
        return switch_;
      }
      /**
       * <code>optional int32 switch = 11 [default = -2];</code>
       */
      public Builder setSwitch(int value) {
        bitField0_ |= 0x00000400;
        switch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 switch = 11 [default = -2];</code>
       */
      public Builder clearSwitch() {
        bitField0_ = (bitField0_ & ~0x00000400);
        switch_ = -2;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HSeederSetting)
    }

    // @@protoc_insertion_point(class_scope:HSeederSetting)
    private static final NetMgrMsg.HSeederSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HSeederSetting();
    }

    public static NetMgrMsg.HSeederSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HSeederSetting>
        PARSER = new com.google.protobuf.AbstractParser<HSeederSetting>() {
      @java.lang.Override
      public HSeederSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HSeederSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HSeederSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HSeederSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HSeederSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HCommonSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HCommonSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <pre>
     * setting identify
     * </pre>
     *
     * <code>optional string identify = 2;</code>
     */
    boolean hasIdentify();
    /**
     * <pre>
     * setting identify
     * </pre>
     *
     * <code>optional string identify = 2;</code>
     */
    java.lang.String getIdentify();
    /**
     * <pre>
     * setting identify
     * </pre>
     *
     * <code>optional string identify = 2;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <pre>
     * 1 preview, 2 save
     * </pre>
     *
     * <code>optional int32 blOption = 3 [default = -2];</code>
     */
    boolean hasBlOption();
    /**
     * <pre>
     * 1 preview, 2 save
     * </pre>
     *
     * <code>optional int32 blOption = 3 [default = -2];</code>
     */
    int getBlOption();

    /**
     * <code>optional int32 backlight = 4 [default = -2];</code>
     */
    boolean hasBacklight();
    /**
     * <code>optional int32 backlight = 4 [default = -2];</code>
     */
    int getBacklight();

    /**
     * <code>optional string gamma = 5;</code>
     */
    boolean hasGamma();
    /**
     * <code>optional string gamma = 5;</code>
     */
    java.lang.String getGamma();
    /**
     * <code>optional string gamma = 5;</code>
     */
    com.google.protobuf.ByteString
        getGammaBytes();

    /**
     * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
     */
    boolean hasLoggerLevel();
    /**
     * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
     */
    NetMgrDefine.LoggerLevelEnum getLoggerLevel();

    /**
     * <pre>
     * 设置镜像等(1,2,3,4),默认1
     * </pre>
     *
     * <code>optional int32 themeStyle = 7 [default = -2];</code>
     */
    boolean hasThemeStyle();
    /**
     * <pre>
     * 设置镜像等(1,2,3,4),默认1
     * </pre>
     *
     * <code>optional int32 themeStyle = 7 [default = -2];</code>
     */
    int getThemeStyle();

    /**
     * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    boolean hasDevCtrlOpt();
    /**
     * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    NetMgrDefine.DevCtrlEnum getDevCtrlOpt();

    /**
     * <code>optional string devCtrlContent = 9;</code>
     */
    boolean hasDevCtrlContent();
    /**
     * <code>optional string devCtrlContent = 9;</code>
     */
    java.lang.String getDevCtrlContent();
    /**
     * <code>optional string devCtrlContent = 9;</code>
     */
    com.google.protobuf.ByteString
        getDevCtrlContentBytes();

    /**
     * <code>optional int32 rotation = 10 [default = -2];</code>
     */
    boolean hasRotation();
    /**
     * <code>optional int32 rotation = 10 [default = -2];</code>
     */
    int getRotation();
  }
  /**
   * <pre>
   * 0x41
   * </pre>
   *
   * Protobuf type {@code HCommonSetting}
   */
  public  static final class HCommonSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HCommonSetting)
      HCommonSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HCommonSetting.newBuilder() to construct.
    private HCommonSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HCommonSetting() {
      type_ = 0;
      identify_ = "";
      blOption_ = -2;
      backlight_ = -2;
      gamma_ = "";
      loggerLevel_ = 0;
      themeStyle_ = -2;
      devCtrlOpt_ = 0;
      devCtrlContent_ = "";
      rotation_ = -2;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HCommonSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              identify_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              blOption_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              backlight_ = input.readInt32();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              gamma_ = bs;
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.LoggerLevelEnum value = NetMgrDefine.LoggerLevelEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000020;
                loggerLevel_ = rawValue;
              }
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              themeStyle_ = input.readInt32();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.DevCtrlEnum value = NetMgrDefine.DevCtrlEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(8, rawValue);
              } else {
                bitField0_ |= 0x00000080;
                devCtrlOpt_ = rawValue;
              }
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              devCtrlContent_ = bs;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              rotation_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HCommonSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HCommonSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HCommonSetting.class, NetMgrMsg.HCommonSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int IDENTIFY_FIELD_NUMBER = 2;
    private volatile java.lang.Object identify_;
    /**
     * <pre>
     * setting identify
     * </pre>
     *
     * <code>optional string identify = 2;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * setting identify
     * </pre>
     *
     * <code>optional string identify = 2;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * setting identify
     * </pre>
     *
     * <code>optional string identify = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BLOPTION_FIELD_NUMBER = 3;
    private int blOption_;
    /**
     * <pre>
     * 1 preview, 2 save
     * </pre>
     *
     * <code>optional int32 blOption = 3 [default = -2];</code>
     */
    public boolean hasBlOption() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * 1 preview, 2 save
     * </pre>
     *
     * <code>optional int32 blOption = 3 [default = -2];</code>
     */
    public int getBlOption() {
      return blOption_;
    }

    public static final int BACKLIGHT_FIELD_NUMBER = 4;
    private int backlight_;
    /**
     * <code>optional int32 backlight = 4 [default = -2];</code>
     */
    public boolean hasBacklight() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 backlight = 4 [default = -2];</code>
     */
    public int getBacklight() {
      return backlight_;
    }

    public static final int GAMMA_FIELD_NUMBER = 5;
    private volatile java.lang.Object gamma_;
    /**
     * <code>optional string gamma = 5;</code>
     */
    public boolean hasGamma() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string gamma = 5;</code>
     */
    public java.lang.String getGamma() {
      java.lang.Object ref = gamma_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          gamma_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string gamma = 5;</code>
     */
    public com.google.protobuf.ByteString
        getGammaBytes() {
      java.lang.Object ref = gamma_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gamma_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOGGERLEVEL_FIELD_NUMBER = 6;
    private int loggerLevel_;
    /**
     * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
     */
    public boolean hasLoggerLevel() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
     */
    public NetMgrDefine.LoggerLevelEnum getLoggerLevel() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.LoggerLevelEnum result = NetMgrDefine.LoggerLevelEnum.valueOf(loggerLevel_);
      return result == null ? NetMgrDefine.LoggerLevelEnum.INVALID_LOG : result;
    }

    public static final int THEMESTYLE_FIELD_NUMBER = 7;
    private int themeStyle_;
    /**
     * <pre>
     * 设置镜像等(1,2,3,4),默认1
     * </pre>
     *
     * <code>optional int32 themeStyle = 7 [default = -2];</code>
     */
    public boolean hasThemeStyle() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <pre>
     * 设置镜像等(1,2,3,4),默认1
     * </pre>
     *
     * <code>optional int32 themeStyle = 7 [default = -2];</code>
     */
    public int getThemeStyle() {
      return themeStyle_;
    }

    public static final int DEVCTRLOPT_FIELD_NUMBER = 8;
    private int devCtrlOpt_;
    /**
     * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    public boolean hasDevCtrlOpt() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    public NetMgrDefine.DevCtrlEnum getDevCtrlOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.DevCtrlEnum result = NetMgrDefine.DevCtrlEnum.valueOf(devCtrlOpt_);
      return result == null ? NetMgrDefine.DevCtrlEnum.INVALID_DEVCTRL : result;
    }

    public static final int DEVCTRLCONTENT_FIELD_NUMBER = 9;
    private volatile java.lang.Object devCtrlContent_;
    /**
     * <code>optional string devCtrlContent = 9;</code>
     */
    public boolean hasDevCtrlContent() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string devCtrlContent = 9;</code>
     */
    public java.lang.String getDevCtrlContent() {
      java.lang.Object ref = devCtrlContent_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          devCtrlContent_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string devCtrlContent = 9;</code>
     */
    public com.google.protobuf.ByteString
        getDevCtrlContentBytes() {
      java.lang.Object ref = devCtrlContent_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        devCtrlContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROTATION_FIELD_NUMBER = 10;
    private int rotation_;
    /**
     * <code>optional int32 rotation = 10 [default = -2];</code>
     */
    public boolean hasRotation() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional int32 rotation = 10 [default = -2];</code>
     */
    public int getRotation() {
      return rotation_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identify_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, blOption_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, backlight_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gamma_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeEnum(6, loggerLevel_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, themeStyle_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeEnum(8, devCtrlOpt_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, devCtrlContent_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, rotation_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identify_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, blOption_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, backlight_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gamma_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, loggerLevel_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, themeStyle_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, devCtrlOpt_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, devCtrlContent_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, rotation_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HCommonSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HCommonSetting other = (NetMgrMsg.HCommonSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && (hasBlOption() == other.hasBlOption());
      if (hasBlOption()) {
        result = result && (getBlOption()
            == other.getBlOption());
      }
      result = result && (hasBacklight() == other.hasBacklight());
      if (hasBacklight()) {
        result = result && (getBacklight()
            == other.getBacklight());
      }
      result = result && (hasGamma() == other.hasGamma());
      if (hasGamma()) {
        result = result && getGamma()
            .equals(other.getGamma());
      }
      result = result && (hasLoggerLevel() == other.hasLoggerLevel());
      if (hasLoggerLevel()) {
        result = result && loggerLevel_ == other.loggerLevel_;
      }
      result = result && (hasThemeStyle() == other.hasThemeStyle());
      if (hasThemeStyle()) {
        result = result && (getThemeStyle()
            == other.getThemeStyle());
      }
      result = result && (hasDevCtrlOpt() == other.hasDevCtrlOpt());
      if (hasDevCtrlOpt()) {
        result = result && devCtrlOpt_ == other.devCtrlOpt_;
      }
      result = result && (hasDevCtrlContent() == other.hasDevCtrlContent());
      if (hasDevCtrlContent()) {
        result = result && getDevCtrlContent()
            .equals(other.getDevCtrlContent());
      }
      result = result && (hasRotation() == other.hasRotation());
      if (hasRotation()) {
        result = result && (getRotation()
            == other.getRotation());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (hasBlOption()) {
        hash = (37 * hash) + BLOPTION_FIELD_NUMBER;
        hash = (53 * hash) + getBlOption();
      }
      if (hasBacklight()) {
        hash = (37 * hash) + BACKLIGHT_FIELD_NUMBER;
        hash = (53 * hash) + getBacklight();
      }
      if (hasGamma()) {
        hash = (37 * hash) + GAMMA_FIELD_NUMBER;
        hash = (53 * hash) + getGamma().hashCode();
      }
      if (hasLoggerLevel()) {
        hash = (37 * hash) + LOGGERLEVEL_FIELD_NUMBER;
        hash = (53 * hash) + loggerLevel_;
      }
      if (hasThemeStyle()) {
        hash = (37 * hash) + THEMESTYLE_FIELD_NUMBER;
        hash = (53 * hash) + getThemeStyle();
      }
      if (hasDevCtrlOpt()) {
        hash = (37 * hash) + DEVCTRLOPT_FIELD_NUMBER;
        hash = (53 * hash) + devCtrlOpt_;
      }
      if (hasDevCtrlContent()) {
        hash = (37 * hash) + DEVCTRLCONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getDevCtrlContent().hashCode();
      }
      if (hasRotation()) {
        hash = (37 * hash) + ROTATION_FIELD_NUMBER;
        hash = (53 * hash) + getRotation();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HCommonSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HCommonSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HCommonSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HCommonSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HCommonSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x41
     * </pre>
     *
     * Protobuf type {@code HCommonSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HCommonSetting)
        NetMgrMsg.HCommonSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HCommonSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HCommonSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HCommonSetting.class, NetMgrMsg.HCommonSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HCommonSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        blOption_ = -2;
        bitField0_ = (bitField0_ & ~0x00000004);
        backlight_ = -2;
        bitField0_ = (bitField0_ & ~0x00000008);
        gamma_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        loggerLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        themeStyle_ = -2;
        bitField0_ = (bitField0_ & ~0x00000040);
        devCtrlOpt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        devCtrlContent_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        rotation_ = -2;
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HCommonSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HCommonSetting getDefaultInstanceForType() {
        return NetMgrMsg.HCommonSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HCommonSetting build() {
        NetMgrMsg.HCommonSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HCommonSetting buildPartial() {
        NetMgrMsg.HCommonSetting result = new NetMgrMsg.HCommonSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.identify_ = identify_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.blOption_ = blOption_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.backlight_ = backlight_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.gamma_ = gamma_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.loggerLevel_ = loggerLevel_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.themeStyle_ = themeStyle_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.devCtrlOpt_ = devCtrlOpt_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.devCtrlContent_ = devCtrlContent_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.rotation_ = rotation_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HCommonSetting) {
          return mergeFrom((NetMgrMsg.HCommonSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HCommonSetting other) {
        if (other == NetMgrMsg.HCommonSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000002;
          identify_ = other.identify_;
          onChanged();
        }
        if (other.hasBlOption()) {
          setBlOption(other.getBlOption());
        }
        if (other.hasBacklight()) {
          setBacklight(other.getBacklight());
        }
        if (other.hasGamma()) {
          bitField0_ |= 0x00000010;
          gamma_ = other.gamma_;
          onChanged();
        }
        if (other.hasLoggerLevel()) {
          setLoggerLevel(other.getLoggerLevel());
        }
        if (other.hasThemeStyle()) {
          setThemeStyle(other.getThemeStyle());
        }
        if (other.hasDevCtrlOpt()) {
          setDevCtrlOpt(other.getDevCtrlOpt());
        }
        if (other.hasDevCtrlContent()) {
          bitField0_ |= 0x00000100;
          devCtrlContent_ = other.devCtrlContent_;
          onChanged();
        }
        if (other.hasRotation()) {
          setRotation(other.getRotation());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HCommonSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HCommonSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object identify_ = "";
      /**
       * <pre>
       * setting identify
       * </pre>
       *
       * <code>optional string identify = 2;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       * setting identify
       * </pre>
       *
       * <code>optional string identify = 2;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * setting identify
       * </pre>
       *
       * <code>optional string identify = 2;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * setting identify
       * </pre>
       *
       * <code>optional string identify = 2;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * setting identify
       * </pre>
       *
       * <code>optional string identify = 2;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000002);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * setting identify
       * </pre>
       *
       * <code>optional string identify = 2;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        identify_ = value;
        onChanged();
        return this;
      }

      private int blOption_ = -2;
      /**
       * <pre>
       * 1 preview, 2 save
       * </pre>
       *
       * <code>optional int32 blOption = 3 [default = -2];</code>
       */
      public boolean hasBlOption() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       * 1 preview, 2 save
       * </pre>
       *
       * <code>optional int32 blOption = 3 [default = -2];</code>
       */
      public int getBlOption() {
        return blOption_;
      }
      /**
       * <pre>
       * 1 preview, 2 save
       * </pre>
       *
       * <code>optional int32 blOption = 3 [default = -2];</code>
       */
      public Builder setBlOption(int value) {
        bitField0_ |= 0x00000004;
        blOption_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 1 preview, 2 save
       * </pre>
       *
       * <code>optional int32 blOption = 3 [default = -2];</code>
       */
      public Builder clearBlOption() {
        bitField0_ = (bitField0_ & ~0x00000004);
        blOption_ = -2;
        onChanged();
        return this;
      }

      private int backlight_ = -2;
      /**
       * <code>optional int32 backlight = 4 [default = -2];</code>
       */
      public boolean hasBacklight() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 backlight = 4 [default = -2];</code>
       */
      public int getBacklight() {
        return backlight_;
      }
      /**
       * <code>optional int32 backlight = 4 [default = -2];</code>
       */
      public Builder setBacklight(int value) {
        bitField0_ |= 0x00000008;
        backlight_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 backlight = 4 [default = -2];</code>
       */
      public Builder clearBacklight() {
        bitField0_ = (bitField0_ & ~0x00000008);
        backlight_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object gamma_ = "";
      /**
       * <code>optional string gamma = 5;</code>
       */
      public boolean hasGamma() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string gamma = 5;</code>
       */
      public java.lang.String getGamma() {
        java.lang.Object ref = gamma_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            gamma_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string gamma = 5;</code>
       */
      public com.google.protobuf.ByteString
          getGammaBytes() {
        java.lang.Object ref = gamma_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gamma_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string gamma = 5;</code>
       */
      public Builder setGamma(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        gamma_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string gamma = 5;</code>
       */
      public Builder clearGamma() {
        bitField0_ = (bitField0_ & ~0x00000010);
        gamma_ = getDefaultInstance().getGamma();
        onChanged();
        return this;
      }
      /**
       * <code>optional string gamma = 5;</code>
       */
      public Builder setGammaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        gamma_ = value;
        onChanged();
        return this;
      }

      private int loggerLevel_ = 0;
      /**
       * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
       */
      public boolean hasLoggerLevel() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
       */
      public NetMgrDefine.LoggerLevelEnum getLoggerLevel() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.LoggerLevelEnum result = NetMgrDefine.LoggerLevelEnum.valueOf(loggerLevel_);
        return result == null ? NetMgrDefine.LoggerLevelEnum.INVALID_LOG : result;
      }
      /**
       * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
       */
      public Builder setLoggerLevel(NetMgrDefine.LoggerLevelEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        loggerLevel_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .LoggerLevelEnum loggerLevel = 6;</code>
       */
      public Builder clearLoggerLevel() {
        bitField0_ = (bitField0_ & ~0x00000020);
        loggerLevel_ = 0;
        onChanged();
        return this;
      }

      private int themeStyle_ = -2;
      /**
       * <pre>
       * 设置镜像等(1,2,3,4),默认1
       * </pre>
       *
       * <code>optional int32 themeStyle = 7 [default = -2];</code>
       */
      public boolean hasThemeStyle() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <pre>
       * 设置镜像等(1,2,3,4),默认1
       * </pre>
       *
       * <code>optional int32 themeStyle = 7 [default = -2];</code>
       */
      public int getThemeStyle() {
        return themeStyle_;
      }
      /**
       * <pre>
       * 设置镜像等(1,2,3,4),默认1
       * </pre>
       *
       * <code>optional int32 themeStyle = 7 [default = -2];</code>
       */
      public Builder setThemeStyle(int value) {
        bitField0_ |= 0x00000040;
        themeStyle_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 设置镜像等(1,2,3,4),默认1
       * </pre>
       *
       * <code>optional int32 themeStyle = 7 [default = -2];</code>
       */
      public Builder clearThemeStyle() {
        bitField0_ = (bitField0_ & ~0x00000040);
        themeStyle_ = -2;
        onChanged();
        return this;
      }

      private int devCtrlOpt_ = 0;
      /**
       * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public boolean hasDevCtrlOpt() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public NetMgrDefine.DevCtrlEnum getDevCtrlOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.DevCtrlEnum result = NetMgrDefine.DevCtrlEnum.valueOf(devCtrlOpt_);
        return result == null ? NetMgrDefine.DevCtrlEnum.INVALID_DEVCTRL : result;
      }
      /**
       * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public Builder setDevCtrlOpt(NetMgrDefine.DevCtrlEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        devCtrlOpt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public Builder clearDevCtrlOpt() {
        bitField0_ = (bitField0_ & ~0x00000080);
        devCtrlOpt_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object devCtrlContent_ = "";
      /**
       * <code>optional string devCtrlContent = 9;</code>
       */
      public boolean hasDevCtrlContent() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string devCtrlContent = 9;</code>
       */
      public java.lang.String getDevCtrlContent() {
        java.lang.Object ref = devCtrlContent_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            devCtrlContent_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string devCtrlContent = 9;</code>
       */
      public com.google.protobuf.ByteString
          getDevCtrlContentBytes() {
        java.lang.Object ref = devCtrlContent_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          devCtrlContent_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string devCtrlContent = 9;</code>
       */
      public Builder setDevCtrlContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        devCtrlContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string devCtrlContent = 9;</code>
       */
      public Builder clearDevCtrlContent() {
        bitField0_ = (bitField0_ & ~0x00000100);
        devCtrlContent_ = getDefaultInstance().getDevCtrlContent();
        onChanged();
        return this;
      }
      /**
       * <code>optional string devCtrlContent = 9;</code>
       */
      public Builder setDevCtrlContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        devCtrlContent_ = value;
        onChanged();
        return this;
      }

      private int rotation_ = -2;
      /**
       * <code>optional int32 rotation = 10 [default = -2];</code>
       */
      public boolean hasRotation() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional int32 rotation = 10 [default = -2];</code>
       */
      public int getRotation() {
        return rotation_;
      }
      /**
       * <code>optional int32 rotation = 10 [default = -2];</code>
       */
      public Builder setRotation(int value) {
        bitField0_ |= 0x00000200;
        rotation_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 rotation = 10 [default = -2];</code>
       */
      public Builder clearRotation() {
        bitField0_ = (bitField0_ & ~0x00000200);
        rotation_ = -2;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HCommonSetting)
    }

    // @@protoc_insertion_point(class_scope:HCommonSetting)
    private static final NetMgrMsg.HCommonSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HCommonSetting();
    }

    public static NetMgrMsg.HCommonSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HCommonSetting>
        PARSER = new com.google.protobuf.AbstractParser<HCommonSetting>() {
      @java.lang.Override
      public HCommonSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HCommonSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HCommonSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HCommonSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HCommonSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CCommonSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CCommonSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string identify = 1;</code>
     */
    boolean hasIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    java.lang.String getIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    boolean hasDevCtrlOpt();
    /**
     * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    NetMgrDefine.DevCtrlEnum getDevCtrlOpt();

    /**
     * <pre>
     * when upload success, request file name
     * </pre>
     *
     * <code>optional string feedBackContent = 2;</code>
     */
    boolean hasFeedBackContent();
    /**
     * <pre>
     * when upload success, request file name
     * </pre>
     *
     * <code>optional string feedBackContent = 2;</code>
     */
    java.lang.String getFeedBackContent();
    /**
     * <pre>
     * when upload success, request file name
     * </pre>
     *
     * <code>optional string feedBackContent = 2;</code>
     */
    com.google.protobuf.ByteString
        getFeedBackContentBytes();

    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 3;</code>
     */
    boolean hasStatus();
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 3;</code>
     */
    int getStatus();
  }
  /**
   * <pre>
   * 0x41
   * </pre>
   *
   * Protobuf type {@code CCommonSetting}
   */
  public  static final class CCommonSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CCommonSetting)
      CCommonSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CCommonSetting.newBuilder() to construct.
    private CCommonSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CCommonSetting() {
      identify_ = "";
      devCtrlOpt_ = 0;
      feedBackContent_ = "";
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CCommonSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              identify_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              feedBackContent_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000008;
              status_ = input.readInt32();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.DevCtrlEnum value = NetMgrDefine.DevCtrlEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(8, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                devCtrlOpt_ = rawValue;
              }
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_CCommonSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_CCommonSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.CCommonSetting.class, NetMgrMsg.CCommonSetting.Builder.class);
    }

    private int bitField0_;
    public static final int IDENTIFY_FIELD_NUMBER = 1;
    private volatile java.lang.Object identify_;
    /**
     * <code>required string identify = 1;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVCTRLOPT_FIELD_NUMBER = 8;
    private int devCtrlOpt_;
    /**
     * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    public boolean hasDevCtrlOpt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
     */
    public NetMgrDefine.DevCtrlEnum getDevCtrlOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.DevCtrlEnum result = NetMgrDefine.DevCtrlEnum.valueOf(devCtrlOpt_);
      return result == null ? NetMgrDefine.DevCtrlEnum.INVALID_DEVCTRL : result;
    }

    public static final int FEEDBACKCONTENT_FIELD_NUMBER = 2;
    private volatile java.lang.Object feedBackContent_;
    /**
     * <pre>
     * when upload success, request file name
     * </pre>
     *
     * <code>optional string feedBackContent = 2;</code>
     */
    public boolean hasFeedBackContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * when upload success, request file name
     * </pre>
     *
     * <code>optional string feedBackContent = 2;</code>
     */
    public java.lang.String getFeedBackContent() {
      java.lang.Object ref = feedBackContent_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          feedBackContent_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * when upload success, request file name
     * </pre>
     *
     * <code>optional string feedBackContent = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFeedBackContentBytes() {
      java.lang.Object ref = feedBackContent_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feedBackContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private int status_;
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 3;</code>
     */
    public int getStatus() {
      return status_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDevCtrlOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identify_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, feedBackContent_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(3, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(8, devCtrlOpt_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identify_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, feedBackContent_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, devCtrlOpt_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.CCommonSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.CCommonSetting other = (NetMgrMsg.CCommonSetting) obj;

      boolean result = true;
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && (hasDevCtrlOpt() == other.hasDevCtrlOpt());
      if (hasDevCtrlOpt()) {
        result = result && devCtrlOpt_ == other.devCtrlOpt_;
      }
      result = result && (hasFeedBackContent() == other.hasFeedBackContent());
      if (hasFeedBackContent()) {
        result = result && getFeedBackContent()
            .equals(other.getFeedBackContent());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && (getStatus()
            == other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (hasDevCtrlOpt()) {
        hash = (37 * hash) + DEVCTRLOPT_FIELD_NUMBER;
        hash = (53 * hash) + devCtrlOpt_;
      }
      if (hasFeedBackContent()) {
        hash = (37 * hash) + FEEDBACKCONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getFeedBackContent().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.CCommonSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CCommonSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CCommonSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CCommonSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.CCommonSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x41
     * </pre>
     *
     * Protobuf type {@code CCommonSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CCommonSetting)
        NetMgrMsg.CCommonSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_CCommonSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_CCommonSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.CCommonSetting.class, NetMgrMsg.CCommonSetting.Builder.class);
      }

      // Construct using NetMgrMsg.CCommonSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        devCtrlOpt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        feedBackContent_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_CCommonSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.CCommonSetting getDefaultInstanceForType() {
        return NetMgrMsg.CCommonSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.CCommonSetting build() {
        NetMgrMsg.CCommonSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.CCommonSetting buildPartial() {
        NetMgrMsg.CCommonSetting result = new NetMgrMsg.CCommonSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identify_ = identify_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.devCtrlOpt_ = devCtrlOpt_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.feedBackContent_ = feedBackContent_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.CCommonSetting) {
          return mergeFrom((NetMgrMsg.CCommonSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.CCommonSetting other) {
        if (other == NetMgrMsg.CCommonSetting.getDefaultInstance()) return this;
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000001;
          identify_ = other.identify_;
          onChanged();
        }
        if (other.hasDevCtrlOpt()) {
          setDevCtrlOpt(other.getDevCtrlOpt());
        }
        if (other.hasFeedBackContent()) {
          bitField0_ |= 0x00000004;
          feedBackContent_ = other.feedBackContent_;
          onChanged();
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIdentify()) {
          return false;
        }
        if (!hasDevCtrlOpt()) {
          return false;
        }
        if (!hasStatus()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.CCommonSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.CCommonSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object identify_ = "";
      /**
       * <code>required string identify = 1;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }

      private int devCtrlOpt_ = 0;
      /**
       * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public boolean hasDevCtrlOpt() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public NetMgrDefine.DevCtrlEnum getDevCtrlOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.DevCtrlEnum result = NetMgrDefine.DevCtrlEnum.valueOf(devCtrlOpt_);
        return result == null ? NetMgrDefine.DevCtrlEnum.INVALID_DEVCTRL : result;
      }
      /**
       * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public Builder setDevCtrlOpt(NetMgrDefine.DevCtrlEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        devCtrlOpt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .DevCtrlEnum devCtrlOpt = 8;</code>
       */
      public Builder clearDevCtrlOpt() {
        bitField0_ = (bitField0_ & ~0x00000002);
        devCtrlOpt_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object feedBackContent_ = "";
      /**
       * <pre>
       * when upload success, request file name
       * </pre>
       *
       * <code>optional string feedBackContent = 2;</code>
       */
      public boolean hasFeedBackContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       * when upload success, request file name
       * </pre>
       *
       * <code>optional string feedBackContent = 2;</code>
       */
      public java.lang.String getFeedBackContent() {
        java.lang.Object ref = feedBackContent_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            feedBackContent_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * when upload success, request file name
       * </pre>
       *
       * <code>optional string feedBackContent = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFeedBackContentBytes() {
        java.lang.Object ref = feedBackContent_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          feedBackContent_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * when upload success, request file name
       * </pre>
       *
       * <code>optional string feedBackContent = 2;</code>
       */
      public Builder setFeedBackContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        feedBackContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * when upload success, request file name
       * </pre>
       *
       * <code>optional string feedBackContent = 2;</code>
       */
      public Builder clearFeedBackContent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        feedBackContent_ = getDefaultInstance().getFeedBackContent();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * when upload success, request file name
       * </pre>
       *
       * <code>optional string feedBackContent = 2;</code>
       */
      public Builder setFeedBackContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        feedBackContent_ = value;
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 3;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 3;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000008;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 3;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000008);
        status_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CCommonSetting)
    }

    // @@protoc_insertion_point(class_scope:CCommonSetting)
    private static final NetMgrMsg.CCommonSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.CCommonSetting();
    }

    public static NetMgrMsg.CCommonSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CCommonSetting>
        PARSER = new com.google.protobuf.AbstractParser<CCommonSetting>() {
      @java.lang.Override
      public CCommonSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CCommonSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CCommonSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CCommonSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.CCommonSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MediaResouceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MediaResouce)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .MediaTypeEnum mediaType = 1;</code>
     */
    boolean hasMediaType();
    /**
     * <code>required .MediaTypeEnum mediaType = 1;</code>
     */
    NetMgrDefine.MediaTypeEnum getMediaType();

    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string size = 3;</code>
     */
    boolean hasSize();
    /**
     * <code>optional string size = 3;</code>
     */
    java.lang.String getSize();
    /**
     * <code>optional string size = 3;</code>
     */
    com.google.protobuf.ByteString
        getSizeBytes();

    /**
     * <code>optional int32 cycleNum = 4 [default = -2];</code>
     */
    boolean hasCycleNum();
    /**
     * <code>optional int32 cycleNum = 4 [default = -2];</code>
     */
    int getCycleNum();
  }
  /**
   * Protobuf type {@code MediaResouce}
   */
  public  static final class MediaResouce extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MediaResouce)
      MediaResouceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MediaResouce.newBuilder() to construct.
    private MediaResouce(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MediaResouce() {
      mediaType_ = 0;
      name_ = "";
      size_ = "";
      cycleNum_ = -2;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MediaResouce(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.MediaTypeEnum value = NetMgrDefine.MediaTypeEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                mediaType_ = rawValue;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              size_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              cycleNum_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_MediaResouce_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_MediaResouce_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.MediaResouce.class, NetMgrMsg.MediaResouce.Builder.class);
    }

    private int bitField0_;
    public static final int MEDIATYPE_FIELD_NUMBER = 1;
    private int mediaType_;
    /**
     * <code>required .MediaTypeEnum mediaType = 1;</code>
     */
    public boolean hasMediaType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MediaTypeEnum mediaType = 1;</code>
     */
    public NetMgrDefine.MediaTypeEnum getMediaType() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.MediaTypeEnum result = NetMgrDefine.MediaTypeEnum.valueOf(mediaType_);
      return result == null ? NetMgrDefine.MediaTypeEnum.VIDEO : result;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SIZE_FIELD_NUMBER = 3;
    private volatile java.lang.Object size_;
    /**
     * <code>optional string size = 3;</code>
     */
    public boolean hasSize() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string size = 3;</code>
     */
    public java.lang.String getSize() {
      java.lang.Object ref = size_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          size_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string size = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSizeBytes() {
      java.lang.Object ref = size_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        size_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CYCLENUM_FIELD_NUMBER = 4;
    private int cycleNum_;
    /**
     * <code>optional int32 cycleNum = 4 [default = -2];</code>
     */
    public boolean hasCycleNum() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 cycleNum = 4 [default = -2];</code>
     */
    public int getCycleNum() {
      return cycleNum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMediaType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, mediaType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, size_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, cycleNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, mediaType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, size_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, cycleNum_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.MediaResouce)) {
        return super.equals(obj);
      }
      NetMgrMsg.MediaResouce other = (NetMgrMsg.MediaResouce) obj;

      boolean result = true;
      result = result && (hasMediaType() == other.hasMediaType());
      if (hasMediaType()) {
        result = result && mediaType_ == other.mediaType_;
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasSize() == other.hasSize());
      if (hasSize()) {
        result = result && getSize()
            .equals(other.getSize());
      }
      result = result && (hasCycleNum() == other.hasCycleNum());
      if (hasCycleNum()) {
        result = result && (getCycleNum()
            == other.getCycleNum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMediaType()) {
        hash = (37 * hash) + MEDIATYPE_FIELD_NUMBER;
        hash = (53 * hash) + mediaType_;
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasSize()) {
        hash = (37 * hash) + SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getSize().hashCode();
      }
      if (hasCycleNum()) {
        hash = (37 * hash) + CYCLENUM_FIELD_NUMBER;
        hash = (53 * hash) + getCycleNum();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.MediaResouce parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.MediaResouce parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.MediaResouce parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.MediaResouce parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.MediaResouce parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.MediaResouce parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.MediaResouce prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MediaResouce}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MediaResouce)
        NetMgrMsg.MediaResouceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_MediaResouce_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_MediaResouce_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.MediaResouce.class, NetMgrMsg.MediaResouce.Builder.class);
      }

      // Construct using NetMgrMsg.MediaResouce.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        mediaType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        size_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        cycleNum_ = -2;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_MediaResouce_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.MediaResouce getDefaultInstanceForType() {
        return NetMgrMsg.MediaResouce.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.MediaResouce build() {
        NetMgrMsg.MediaResouce result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.MediaResouce buildPartial() {
        NetMgrMsg.MediaResouce result = new NetMgrMsg.MediaResouce(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.mediaType_ = mediaType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.size_ = size_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.cycleNum_ = cycleNum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.MediaResouce) {
          return mergeFrom((NetMgrMsg.MediaResouce)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.MediaResouce other) {
        if (other == NetMgrMsg.MediaResouce.getDefaultInstance()) return this;
        if (other.hasMediaType()) {
          setMediaType(other.getMediaType());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasSize()) {
          bitField0_ |= 0x00000004;
          size_ = other.size_;
          onChanged();
        }
        if (other.hasCycleNum()) {
          setCycleNum(other.getCycleNum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasMediaType()) {
          return false;
        }
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.MediaResouce parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.MediaResouce) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mediaType_ = 0;
      /**
       * <code>required .MediaTypeEnum mediaType = 1;</code>
       */
      public boolean hasMediaType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MediaTypeEnum mediaType = 1;</code>
       */
      public NetMgrDefine.MediaTypeEnum getMediaType() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.MediaTypeEnum result = NetMgrDefine.MediaTypeEnum.valueOf(mediaType_);
        return result == null ? NetMgrDefine.MediaTypeEnum.VIDEO : result;
      }
      /**
       * <code>required .MediaTypeEnum mediaType = 1;</code>
       */
      public Builder setMediaType(NetMgrDefine.MediaTypeEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        mediaType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .MediaTypeEnum mediaType = 1;</code>
       */
      public Builder clearMediaType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mediaType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object size_ = "";
      /**
       * <code>optional string size = 3;</code>
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string size = 3;</code>
       */
      public java.lang.String getSize() {
        java.lang.Object ref = size_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            size_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string size = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSizeBytes() {
        java.lang.Object ref = size_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          size_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string size = 3;</code>
       */
      public Builder setSize(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string size = 3;</code>
       */
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000004);
        size_ = getDefaultInstance().getSize();
        onChanged();
        return this;
      }
      /**
       * <code>optional string size = 3;</code>
       */
      public Builder setSizeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        size_ = value;
        onChanged();
        return this;
      }

      private int cycleNum_ = -2;
      /**
       * <code>optional int32 cycleNum = 4 [default = -2];</code>
       */
      public boolean hasCycleNum() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 cycleNum = 4 [default = -2];</code>
       */
      public int getCycleNum() {
        return cycleNum_;
      }
      /**
       * <code>optional int32 cycleNum = 4 [default = -2];</code>
       */
      public Builder setCycleNum(int value) {
        bitField0_ |= 0x00000008;
        cycleNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 cycleNum = 4 [default = -2];</code>
       */
      public Builder clearCycleNum() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cycleNum_ = -2;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MediaResouce)
    }

    // @@protoc_insertion_point(class_scope:MediaResouce)
    private static final NetMgrMsg.MediaResouce DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.MediaResouce();
    }

    public static NetMgrMsg.MediaResouce getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MediaResouce>
        PARSER = new com.google.protobuf.AbstractParser<MediaResouce>() {
      @java.lang.Override
      public MediaResouce parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MediaResouce(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MediaResouce> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MediaResouce> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.MediaResouce getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HMediaSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HMediaSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    boolean hasOpt();
    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    NetMgrDefine.MediaOptEnum getOpt();

    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    java.util.List<NetMgrMsg.MediaResouce> 
        getMediaList();
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    NetMgrMsg.MediaResouce getMedia(int index);
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    int getMediaCount();
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
        getMediaOrBuilderList();
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    NetMgrMsg.MediaResouceOrBuilder getMediaOrBuilder(
        int index);

    /**
     * <code>optional string mediaServerPrefix = 4;</code>
     */
    boolean hasMediaServerPrefix();
    /**
     * <code>optional string mediaServerPrefix = 4;</code>
     */
    java.lang.String getMediaServerPrefix();
    /**
     * <code>optional string mediaServerPrefix = 4;</code>
     */
    com.google.protobuf.ByteString
        getMediaServerPrefixBytes();
  }
  /**
   * <pre>
   * 0x51
   * </pre>
   *
   * Protobuf type {@code HMediaSetting}
   */
  public  static final class HMediaSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HMediaSetting)
      HMediaSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HMediaSetting.newBuilder() to construct.
    private HMediaSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HMediaSetting() {
      type_ = 0;
      opt_ = 0;
      media_ = java.util.Collections.emptyList();
      mediaServerPrefix_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HMediaSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.MediaOptEnum value = NetMgrDefine.MediaOptEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                opt_ = rawValue;
              }
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                media_ = new java.util.ArrayList<NetMgrMsg.MediaResouce>();
                mutable_bitField0_ |= 0x00000004;
              }
              media_.add(
                  input.readMessage(NetMgrMsg.MediaResouce.PARSER, extensionRegistry));
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              mediaServerPrefix_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          media_ = java.util.Collections.unmodifiableList(media_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HMediaSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HMediaSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HMediaSetting.class, NetMgrMsg.HMediaSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * 0 respresent all device
     * </pre>
     *
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int OPT_FIELD_NUMBER = 2;
    private int opt_;
    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    public boolean hasOpt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    public NetMgrDefine.MediaOptEnum getOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.MediaOptEnum result = NetMgrDefine.MediaOptEnum.valueOf(opt_);
      return result == null ? NetMgrDefine.MediaOptEnum.Invalid_MediaOpt : result;
    }

    public static final int MEDIA_FIELD_NUMBER = 3;
    private java.util.List<NetMgrMsg.MediaResouce> media_;
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    public java.util.List<NetMgrMsg.MediaResouce> getMediaList() {
      return media_;
    }
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    public java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
        getMediaOrBuilderList() {
      return media_;
    }
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    public int getMediaCount() {
      return media_.size();
    }
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    public NetMgrMsg.MediaResouce getMedia(int index) {
      return media_.get(index);
    }
    /**
     * <code>repeated .MediaResouce media = 3;</code>
     */
    public NetMgrMsg.MediaResouceOrBuilder getMediaOrBuilder(
        int index) {
      return media_.get(index);
    }

    public static final int MEDIASERVERPREFIX_FIELD_NUMBER = 4;
    private volatile java.lang.Object mediaServerPrefix_;
    /**
     * <code>optional string mediaServerPrefix = 4;</code>
     */
    public boolean hasMediaServerPrefix() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string mediaServerPrefix = 4;</code>
     */
    public java.lang.String getMediaServerPrefix() {
      java.lang.Object ref = mediaServerPrefix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mediaServerPrefix_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mediaServerPrefix = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMediaServerPrefixBytes() {
      java.lang.Object ref = mediaServerPrefix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaServerPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getMediaCount(); i++) {
        if (!getMedia(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, opt_);
      }
      for (int i = 0; i < media_.size(); i++) {
        output.writeMessage(3, media_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mediaServerPrefix_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, opt_);
      }
      for (int i = 0; i < media_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, media_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mediaServerPrefix_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HMediaSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HMediaSetting other = (NetMgrMsg.HMediaSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasOpt() == other.hasOpt());
      if (hasOpt()) {
        result = result && opt_ == other.opt_;
      }
      result = result && getMediaList()
          .equals(other.getMediaList());
      result = result && (hasMediaServerPrefix() == other.hasMediaServerPrefix());
      if (hasMediaServerPrefix()) {
        result = result && getMediaServerPrefix()
            .equals(other.getMediaServerPrefix());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasOpt()) {
        hash = (37 * hash) + OPT_FIELD_NUMBER;
        hash = (53 * hash) + opt_;
      }
      if (getMediaCount() > 0) {
        hash = (37 * hash) + MEDIA_FIELD_NUMBER;
        hash = (53 * hash) + getMediaList().hashCode();
      }
      if (hasMediaServerPrefix()) {
        hash = (37 * hash) + MEDIASERVERPREFIX_FIELD_NUMBER;
        hash = (53 * hash) + getMediaServerPrefix().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HMediaSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HMediaSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HMediaSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HMediaSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HMediaSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x51
     * </pre>
     *
     * Protobuf type {@code HMediaSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HMediaSetting)
        NetMgrMsg.HMediaSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HMediaSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HMediaSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HMediaSetting.class, NetMgrMsg.HMediaSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HMediaSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getMediaFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (mediaBuilder_ == null) {
          media_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          mediaBuilder_.clear();
        }
        mediaServerPrefix_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HMediaSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HMediaSetting getDefaultInstanceForType() {
        return NetMgrMsg.HMediaSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HMediaSetting build() {
        NetMgrMsg.HMediaSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HMediaSetting buildPartial() {
        NetMgrMsg.HMediaSetting result = new NetMgrMsg.HMediaSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opt_ = opt_;
        if (mediaBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            media_ = java.util.Collections.unmodifiableList(media_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.media_ = media_;
        } else {
          result.media_ = mediaBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.mediaServerPrefix_ = mediaServerPrefix_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HMediaSetting) {
          return mergeFrom((NetMgrMsg.HMediaSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HMediaSetting other) {
        if (other == NetMgrMsg.HMediaSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasOpt()) {
          setOpt(other.getOpt());
        }
        if (mediaBuilder_ == null) {
          if (!other.media_.isEmpty()) {
            if (media_.isEmpty()) {
              media_ = other.media_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureMediaIsMutable();
              media_.addAll(other.media_);
            }
            onChanged();
          }
        } else {
          if (!other.media_.isEmpty()) {
            if (mediaBuilder_.isEmpty()) {
              mediaBuilder_.dispose();
              mediaBuilder_ = null;
              media_ = other.media_;
              bitField0_ = (bitField0_ & ~0x00000004);
              mediaBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMediaFieldBuilder() : null;
            } else {
              mediaBuilder_.addAllMessages(other.media_);
            }
          }
        }
        if (other.hasMediaServerPrefix()) {
          bitField0_ |= 0x00000008;
          mediaServerPrefix_ = other.mediaServerPrefix_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        if (!hasOpt()) {
          return false;
        }
        for (int i = 0; i < getMediaCount(); i++) {
          if (!getMedia(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HMediaSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HMediaSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 respresent all device
       * </pre>
       *
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int opt_ = 0;
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public boolean hasOpt() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public NetMgrDefine.MediaOptEnum getOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.MediaOptEnum result = NetMgrDefine.MediaOptEnum.valueOf(opt_);
        return result == null ? NetMgrDefine.MediaOptEnum.Invalid_MediaOpt : result;
      }
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public Builder setOpt(NetMgrDefine.MediaOptEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        opt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public Builder clearOpt() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opt_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<NetMgrMsg.MediaResouce> media_ =
        java.util.Collections.emptyList();
      private void ensureMediaIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          media_ = new java.util.ArrayList<NetMgrMsg.MediaResouce>(media_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder> mediaBuilder_;

      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public java.util.List<NetMgrMsg.MediaResouce> getMediaList() {
        if (mediaBuilder_ == null) {
          return java.util.Collections.unmodifiableList(media_);
        } else {
          return mediaBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public int getMediaCount() {
        if (mediaBuilder_ == null) {
          return media_.size();
        } else {
          return mediaBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public NetMgrMsg.MediaResouce getMedia(int index) {
        if (mediaBuilder_ == null) {
          return media_.get(index);
        } else {
          return mediaBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder setMedia(
          int index, NetMgrMsg.MediaResouce value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.set(index, value);
          onChanged();
        } else {
          mediaBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder setMedia(
          int index, NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.set(index, builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder addMedia(NetMgrMsg.MediaResouce value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.add(value);
          onChanged();
        } else {
          mediaBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder addMedia(
          int index, NetMgrMsg.MediaResouce value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.add(index, value);
          onChanged();
        } else {
          mediaBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder addMedia(
          NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.add(builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder addMedia(
          int index, NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.add(index, builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder addAllMedia(
          java.lang.Iterable<? extends NetMgrMsg.MediaResouce> values) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, media_);
          onChanged();
        } else {
          mediaBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder clearMedia() {
        if (mediaBuilder_ == null) {
          media_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          mediaBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public Builder removeMedia(int index) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.remove(index);
          onChanged();
        } else {
          mediaBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public NetMgrMsg.MediaResouce.Builder getMediaBuilder(
          int index) {
        return getMediaFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public NetMgrMsg.MediaResouceOrBuilder getMediaOrBuilder(
          int index) {
        if (mediaBuilder_ == null) {
          return media_.get(index);  } else {
          return mediaBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
           getMediaOrBuilderList() {
        if (mediaBuilder_ != null) {
          return mediaBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(media_);
        }
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public NetMgrMsg.MediaResouce.Builder addMediaBuilder() {
        return getMediaFieldBuilder().addBuilder(
            NetMgrMsg.MediaResouce.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public NetMgrMsg.MediaResouce.Builder addMediaBuilder(
          int index) {
        return getMediaFieldBuilder().addBuilder(
            index, NetMgrMsg.MediaResouce.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaResouce media = 3;</code>
       */
      public java.util.List<NetMgrMsg.MediaResouce.Builder> 
           getMediaBuilderList() {
        return getMediaFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder> 
          getMediaFieldBuilder() {
        if (mediaBuilder_ == null) {
          mediaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder>(
                  media_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          media_ = null;
        }
        return mediaBuilder_;
      }

      private java.lang.Object mediaServerPrefix_ = "";
      /**
       * <code>optional string mediaServerPrefix = 4;</code>
       */
      public boolean hasMediaServerPrefix() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string mediaServerPrefix = 4;</code>
       */
      public java.lang.String getMediaServerPrefix() {
        java.lang.Object ref = mediaServerPrefix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mediaServerPrefix_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string mediaServerPrefix = 4;</code>
       */
      public com.google.protobuf.ByteString
          getMediaServerPrefixBytes() {
        java.lang.Object ref = mediaServerPrefix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mediaServerPrefix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mediaServerPrefix = 4;</code>
       */
      public Builder setMediaServerPrefix(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        mediaServerPrefix_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mediaServerPrefix = 4;</code>
       */
      public Builder clearMediaServerPrefix() {
        bitField0_ = (bitField0_ & ~0x00000008);
        mediaServerPrefix_ = getDefaultInstance().getMediaServerPrefix();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mediaServerPrefix = 4;</code>
       */
      public Builder setMediaServerPrefixBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        mediaServerPrefix_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HMediaSetting)
    }

    // @@protoc_insertion_point(class_scope:HMediaSetting)
    private static final NetMgrMsg.HMediaSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HMediaSetting();
    }

    public static NetMgrMsg.HMediaSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HMediaSetting>
        PARSER = new com.google.protobuf.AbstractParser<HMediaSetting>() {
      @java.lang.Override
      public HMediaSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HMediaSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HMediaSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HMediaSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HMediaSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMediaSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMediaSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string identify = 1;</code>
     */
    boolean hasIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    java.lang.String getIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    boolean hasOpt();
    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    NetMgrDefine.MediaOptEnum getOpt();

    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    java.util.List<NetMgrMsg.MediaResouce> 
        getFeedBackMediaList();
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    NetMgrMsg.MediaResouce getFeedBackMedia(int index);
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    int getFeedBackMediaCount();
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
        getFeedBackMediaOrBuilderList();
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    NetMgrMsg.MediaResouceOrBuilder getFeedBackMediaOrBuilder(
        int index);

    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    boolean hasStatus();
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    int getStatus();
  }
  /**
   * <pre>
   * 0x51
   * </pre>
   *
   * Protobuf type {@code CMediaSetting}
   */
  public  static final class CMediaSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMediaSetting)
      CMediaSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMediaSetting.newBuilder() to construct.
    private CMediaSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMediaSetting() {
      identify_ = "";
      opt_ = 0;
      feedBackMedia_ = java.util.Collections.emptyList();
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMediaSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              identify_ = bs;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.MediaOptEnum value = NetMgrDefine.MediaOptEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                opt_ = rawValue;
              }
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                feedBackMedia_ = new java.util.ArrayList<NetMgrMsg.MediaResouce>();
                mutable_bitField0_ |= 0x00000004;
              }
              feedBackMedia_.add(
                  input.readMessage(NetMgrMsg.MediaResouce.PARSER, extensionRegistry));
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              status_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          feedBackMedia_ = java.util.Collections.unmodifiableList(feedBackMedia_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_CMediaSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_CMediaSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.CMediaSetting.class, NetMgrMsg.CMediaSetting.Builder.class);
    }

    private int bitField0_;
    public static final int IDENTIFY_FIELD_NUMBER = 1;
    private volatile java.lang.Object identify_;
    /**
     * <code>required string identify = 1;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OPT_FIELD_NUMBER = 2;
    private int opt_;
    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    public boolean hasOpt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .MediaOptEnum opt = 2;</code>
     */
    public NetMgrDefine.MediaOptEnum getOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.MediaOptEnum result = NetMgrDefine.MediaOptEnum.valueOf(opt_);
      return result == null ? NetMgrDefine.MediaOptEnum.Invalid_MediaOpt : result;
    }

    public static final int FEEDBACKMEDIA_FIELD_NUMBER = 3;
    private java.util.List<NetMgrMsg.MediaResouce> feedBackMedia_;
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    public java.util.List<NetMgrMsg.MediaResouce> getFeedBackMediaList() {
      return feedBackMedia_;
    }
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    public java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
        getFeedBackMediaOrBuilderList() {
      return feedBackMedia_;
    }
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    public int getFeedBackMediaCount() {
      return feedBackMedia_.size();
    }
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    public NetMgrMsg.MediaResouce getFeedBackMedia(int index) {
      return feedBackMedia_.get(index);
    }
    /**
     * <code>repeated .MediaResouce feedBackMedia = 3;</code>
     */
    public NetMgrMsg.MediaResouceOrBuilder getFeedBackMediaOrBuilder(
        int index) {
      return feedBackMedia_.get(index);
    }

    public static final int STATUS_FIELD_NUMBER = 4;
    private int status_;
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    public int getStatus() {
      return status_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getFeedBackMediaCount(); i++) {
        if (!getFeedBackMedia(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identify_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, opt_);
      }
      for (int i = 0; i < feedBackMedia_.size(); i++) {
        output.writeMessage(3, feedBackMedia_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(4, status_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identify_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, opt_);
      }
      for (int i = 0; i < feedBackMedia_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, feedBackMedia_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, status_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.CMediaSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.CMediaSetting other = (NetMgrMsg.CMediaSetting) obj;

      boolean result = true;
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && (hasOpt() == other.hasOpt());
      if (hasOpt()) {
        result = result && opt_ == other.opt_;
      }
      result = result && getFeedBackMediaList()
          .equals(other.getFeedBackMediaList());
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && (getStatus()
            == other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (hasOpt()) {
        hash = (37 * hash) + OPT_FIELD_NUMBER;
        hash = (53 * hash) + opt_;
      }
      if (getFeedBackMediaCount() > 0) {
        hash = (37 * hash) + FEEDBACKMEDIA_FIELD_NUMBER;
        hash = (53 * hash) + getFeedBackMediaList().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.CMediaSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CMediaSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CMediaSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CMediaSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.CMediaSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x51
     * </pre>
     *
     * Protobuf type {@code CMediaSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMediaSetting)
        NetMgrMsg.CMediaSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_CMediaSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_CMediaSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.CMediaSetting.class, NetMgrMsg.CMediaSetting.Builder.class);
      }

      // Construct using NetMgrMsg.CMediaSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getFeedBackMediaFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        opt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (feedBackMediaBuilder_ == null) {
          feedBackMedia_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          feedBackMediaBuilder_.clear();
        }
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_CMediaSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.CMediaSetting getDefaultInstanceForType() {
        return NetMgrMsg.CMediaSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.CMediaSetting build() {
        NetMgrMsg.CMediaSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.CMediaSetting buildPartial() {
        NetMgrMsg.CMediaSetting result = new NetMgrMsg.CMediaSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identify_ = identify_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opt_ = opt_;
        if (feedBackMediaBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            feedBackMedia_ = java.util.Collections.unmodifiableList(feedBackMedia_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.feedBackMedia_ = feedBackMedia_;
        } else {
          result.feedBackMedia_ = feedBackMediaBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.CMediaSetting) {
          return mergeFrom((NetMgrMsg.CMediaSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.CMediaSetting other) {
        if (other == NetMgrMsg.CMediaSetting.getDefaultInstance()) return this;
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000001;
          identify_ = other.identify_;
          onChanged();
        }
        if (other.hasOpt()) {
          setOpt(other.getOpt());
        }
        if (feedBackMediaBuilder_ == null) {
          if (!other.feedBackMedia_.isEmpty()) {
            if (feedBackMedia_.isEmpty()) {
              feedBackMedia_ = other.feedBackMedia_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureFeedBackMediaIsMutable();
              feedBackMedia_.addAll(other.feedBackMedia_);
            }
            onChanged();
          }
        } else {
          if (!other.feedBackMedia_.isEmpty()) {
            if (feedBackMediaBuilder_.isEmpty()) {
              feedBackMediaBuilder_.dispose();
              feedBackMediaBuilder_ = null;
              feedBackMedia_ = other.feedBackMedia_;
              bitField0_ = (bitField0_ & ~0x00000004);
              feedBackMediaBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFeedBackMediaFieldBuilder() : null;
            } else {
              feedBackMediaBuilder_.addAllMessages(other.feedBackMedia_);
            }
          }
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIdentify()) {
          return false;
        }
        if (!hasOpt()) {
          return false;
        }
        if (!hasStatus()) {
          return false;
        }
        for (int i = 0; i < getFeedBackMediaCount(); i++) {
          if (!getFeedBackMedia(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.CMediaSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.CMediaSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object identify_ = "";
      /**
       * <code>required string identify = 1;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }

      private int opt_ = 0;
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public boolean hasOpt() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public NetMgrDefine.MediaOptEnum getOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.MediaOptEnum result = NetMgrDefine.MediaOptEnum.valueOf(opt_);
        return result == null ? NetMgrDefine.MediaOptEnum.Invalid_MediaOpt : result;
      }
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public Builder setOpt(NetMgrDefine.MediaOptEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        opt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .MediaOptEnum opt = 2;</code>
       */
      public Builder clearOpt() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opt_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<NetMgrMsg.MediaResouce> feedBackMedia_ =
        java.util.Collections.emptyList();
      private void ensureFeedBackMediaIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          feedBackMedia_ = new java.util.ArrayList<NetMgrMsg.MediaResouce>(feedBackMedia_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder> feedBackMediaBuilder_;

      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public java.util.List<NetMgrMsg.MediaResouce> getFeedBackMediaList() {
        if (feedBackMediaBuilder_ == null) {
          return java.util.Collections.unmodifiableList(feedBackMedia_);
        } else {
          return feedBackMediaBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public int getFeedBackMediaCount() {
        if (feedBackMediaBuilder_ == null) {
          return feedBackMedia_.size();
        } else {
          return feedBackMediaBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public NetMgrMsg.MediaResouce getFeedBackMedia(int index) {
        if (feedBackMediaBuilder_ == null) {
          return feedBackMedia_.get(index);
        } else {
          return feedBackMediaBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder setFeedBackMedia(
          int index, NetMgrMsg.MediaResouce value) {
        if (feedBackMediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.set(index, value);
          onChanged();
        } else {
          feedBackMediaBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder setFeedBackMedia(
          int index, NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (feedBackMediaBuilder_ == null) {
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.set(index, builderForValue.build());
          onChanged();
        } else {
          feedBackMediaBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder addFeedBackMedia(NetMgrMsg.MediaResouce value) {
        if (feedBackMediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.add(value);
          onChanged();
        } else {
          feedBackMediaBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder addFeedBackMedia(
          int index, NetMgrMsg.MediaResouce value) {
        if (feedBackMediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.add(index, value);
          onChanged();
        } else {
          feedBackMediaBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder addFeedBackMedia(
          NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (feedBackMediaBuilder_ == null) {
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.add(builderForValue.build());
          onChanged();
        } else {
          feedBackMediaBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder addFeedBackMedia(
          int index, NetMgrMsg.MediaResouce.Builder builderForValue) {
        if (feedBackMediaBuilder_ == null) {
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.add(index, builderForValue.build());
          onChanged();
        } else {
          feedBackMediaBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder addAllFeedBackMedia(
          java.lang.Iterable<? extends NetMgrMsg.MediaResouce> values) {
        if (feedBackMediaBuilder_ == null) {
          ensureFeedBackMediaIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, feedBackMedia_);
          onChanged();
        } else {
          feedBackMediaBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder clearFeedBackMedia() {
        if (feedBackMediaBuilder_ == null) {
          feedBackMedia_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          feedBackMediaBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public Builder removeFeedBackMedia(int index) {
        if (feedBackMediaBuilder_ == null) {
          ensureFeedBackMediaIsMutable();
          feedBackMedia_.remove(index);
          onChanged();
        } else {
          feedBackMediaBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public NetMgrMsg.MediaResouce.Builder getFeedBackMediaBuilder(
          int index) {
        return getFeedBackMediaFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public NetMgrMsg.MediaResouceOrBuilder getFeedBackMediaOrBuilder(
          int index) {
        if (feedBackMediaBuilder_ == null) {
          return feedBackMedia_.get(index);  } else {
          return feedBackMediaBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public java.util.List<? extends NetMgrMsg.MediaResouceOrBuilder> 
           getFeedBackMediaOrBuilderList() {
        if (feedBackMediaBuilder_ != null) {
          return feedBackMediaBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(feedBackMedia_);
        }
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public NetMgrMsg.MediaResouce.Builder addFeedBackMediaBuilder() {
        return getFeedBackMediaFieldBuilder().addBuilder(
            NetMgrMsg.MediaResouce.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public NetMgrMsg.MediaResouce.Builder addFeedBackMediaBuilder(
          int index) {
        return getFeedBackMediaFieldBuilder().addBuilder(
            index, NetMgrMsg.MediaResouce.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaResouce feedBackMedia = 3;</code>
       */
      public java.util.List<NetMgrMsg.MediaResouce.Builder> 
           getFeedBackMediaBuilderList() {
        return getFeedBackMediaFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder> 
          getFeedBackMediaFieldBuilder() {
        if (feedBackMediaBuilder_ == null) {
          feedBackMediaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              NetMgrMsg.MediaResouce, NetMgrMsg.MediaResouce.Builder, NetMgrMsg.MediaResouceOrBuilder>(
                  feedBackMedia_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          feedBackMedia_ = null;
        }
        return feedBackMediaBuilder_;
      }

      private int status_ ;
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000008;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000008);
        status_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMediaSetting)
    }

    // @@protoc_insertion_point(class_scope:CMediaSetting)
    private static final NetMgrMsg.CMediaSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.CMediaSetting();
    }

    public static NetMgrMsg.CMediaSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMediaSetting>
        PARSER = new com.google.protobuf.AbstractParser<CMediaSetting>() {
      @java.lang.Override
      public CMediaSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMediaSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMediaSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMediaSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.CMediaSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HDispSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HDispSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>optional int32 textType = 2 [default = -2];</code>
     */
    boolean hasTextType();
    /**
     * <code>optional int32 textType = 2 [default = -2];</code>
     */
    int getTextType();

    /**
     * <code>optional int32 textColor = 3 [default = -2];</code>
     */
    boolean hasTextColor();
    /**
     * <code>optional int32 textColor = 3 [default = -2];</code>
     */
    int getTextColor();

    /**
     * <code>optional int32 textSize = 4 [default = -2];</code>
     */
    boolean hasTextSize();
    /**
     * <code>optional int32 textSize = 4 [default = -2];</code>
     */
    int getTextSize();

    /**
     * <code>optional string textFont = 5;</code>
     */
    boolean hasTextFont();
    /**
     * <code>optional string textFont = 5;</code>
     */
    java.lang.String getTextFont();
    /**
     * <code>optional string textFont = 5;</code>
     */
    com.google.protobuf.ByteString
        getTextFontBytes();

    /**
     * <pre>
     * 0 slowest
     * </pre>
     *
     * <code>optional int32 textSpeed = 6 [default = -2];</code>
     */
    boolean hasTextSpeed();
    /**
     * <pre>
     * 0 slowest
     * </pre>
     *
     * <code>optional int32 textSpeed = 6 [default = -2];</code>
     */
    int getTextSpeed();

    /**
     * <code>optional int32 picType = 7 [default = -2];</code>
     */
    boolean hasPicType();
    /**
     * <code>optional int32 picType = 7 [default = -2];</code>
     */
    int getPicType();

    /**
     * <pre>
     * 0 always display
     * </pre>
     *
     * <code>optional int32 picDispTime = 8 [default = -2];</code>
     */
    boolean hasPicDispTime();
    /**
     * <pre>
     * 0 always display
     * </pre>
     *
     * <code>optional int32 picDispTime = 8 [default = -2];</code>
     */
    int getPicDispTime();

    /**
     * <pre>
     * 0 default time
     * </pre>
     *
     * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
     */
    boolean hasVideoPlayTime();
    /**
     * <pre>
     * 0 default time
     * </pre>
     *
     * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
     */
    int getVideoPlayTime();

    /**
     * <code>optional string videoPlayStyle = 10;</code>
     */
    boolean hasVideoPlayStyle();
    /**
     * <code>optional string videoPlayStyle = 10;</code>
     */
    java.lang.String getVideoPlayStyle();
    /**
     * <code>optional string videoPlayStyle = 10;</code>
     */
    com.google.protobuf.ByteString
        getVideoPlayStyleBytes();
  }
  /**
   * <pre>
   * 0x52
   * </pre>
   *
   * Protobuf type {@code HDispSetting}
   */
  public  static final class HDispSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HDispSetting)
      HDispSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HDispSetting.newBuilder() to construct.
    private HDispSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HDispSetting() {
      type_ = 0;
      textType_ = -2;
      textColor_ = -2;
      textSize_ = -2;
      textFont_ = "";
      textSpeed_ = -2;
      picType_ = -2;
      picDispTime_ = -2;
      videoPlayTime_ = -2;
      videoPlayStyle_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HDispSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              textType_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              textColor_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              textSize_ = input.readInt32();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              textFont_ = bs;
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              textSpeed_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              picType_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              picDispTime_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              videoPlayTime_ = input.readInt32();
              break;
            }
            case 82: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000200;
              videoPlayStyle_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HDispSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HDispSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HDispSetting.class, NetMgrMsg.HDispSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int TEXTTYPE_FIELD_NUMBER = 2;
    private int textType_;
    /**
     * <code>optional int32 textType = 2 [default = -2];</code>
     */
    public boolean hasTextType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 textType = 2 [default = -2];</code>
     */
    public int getTextType() {
      return textType_;
    }

    public static final int TEXTCOLOR_FIELD_NUMBER = 3;
    private int textColor_;
    /**
     * <code>optional int32 textColor = 3 [default = -2];</code>
     */
    public boolean hasTextColor() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 textColor = 3 [default = -2];</code>
     */
    public int getTextColor() {
      return textColor_;
    }

    public static final int TEXTSIZE_FIELD_NUMBER = 4;
    private int textSize_;
    /**
     * <code>optional int32 textSize = 4 [default = -2];</code>
     */
    public boolean hasTextSize() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 textSize = 4 [default = -2];</code>
     */
    public int getTextSize() {
      return textSize_;
    }

    public static final int TEXTFONT_FIELD_NUMBER = 5;
    private volatile java.lang.Object textFont_;
    /**
     * <code>optional string textFont = 5;</code>
     */
    public boolean hasTextFont() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string textFont = 5;</code>
     */
    public java.lang.String getTextFont() {
      java.lang.Object ref = textFont_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          textFont_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string textFont = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTextFontBytes() {
      java.lang.Object ref = textFont_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textFont_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEXTSPEED_FIELD_NUMBER = 6;
    private int textSpeed_;
    /**
     * <pre>
     * 0 slowest
     * </pre>
     *
     * <code>optional int32 textSpeed = 6 [default = -2];</code>
     */
    public boolean hasTextSpeed() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <pre>
     * 0 slowest
     * </pre>
     *
     * <code>optional int32 textSpeed = 6 [default = -2];</code>
     */
    public int getTextSpeed() {
      return textSpeed_;
    }

    public static final int PICTYPE_FIELD_NUMBER = 7;
    private int picType_;
    /**
     * <code>optional int32 picType = 7 [default = -2];</code>
     */
    public boolean hasPicType() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int32 picType = 7 [default = -2];</code>
     */
    public int getPicType() {
      return picType_;
    }

    public static final int PICDISPTIME_FIELD_NUMBER = 8;
    private int picDispTime_;
    /**
     * <pre>
     * 0 always display
     * </pre>
     *
     * <code>optional int32 picDispTime = 8 [default = -2];</code>
     */
    public boolean hasPicDispTime() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <pre>
     * 0 always display
     * </pre>
     *
     * <code>optional int32 picDispTime = 8 [default = -2];</code>
     */
    public int getPicDispTime() {
      return picDispTime_;
    }

    public static final int VIDEOPLAYTIME_FIELD_NUMBER = 9;
    private int videoPlayTime_;
    /**
     * <pre>
     * 0 default time
     * </pre>
     *
     * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
     */
    public boolean hasVideoPlayTime() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <pre>
     * 0 default time
     * </pre>
     *
     * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
     */
    public int getVideoPlayTime() {
      return videoPlayTime_;
    }

    public static final int VIDEOPLAYSTYLE_FIELD_NUMBER = 10;
    private volatile java.lang.Object videoPlayStyle_;
    /**
     * <code>optional string videoPlayStyle = 10;</code>
     */
    public boolean hasVideoPlayStyle() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string videoPlayStyle = 10;</code>
     */
    public java.lang.String getVideoPlayStyle() {
      java.lang.Object ref = videoPlayStyle_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          videoPlayStyle_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string videoPlayStyle = 10;</code>
     */
    public com.google.protobuf.ByteString
        getVideoPlayStyleBytes() {
      java.lang.Object ref = videoPlayStyle_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        videoPlayStyle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, textType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, textColor_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, textSize_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, textFont_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, textSpeed_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, picType_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, picDispTime_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, videoPlayTime_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, videoPlayStyle_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, textType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, textColor_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, textSize_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, textFont_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, textSpeed_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, picType_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, picDispTime_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, videoPlayTime_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, videoPlayStyle_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HDispSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HDispSetting other = (NetMgrMsg.HDispSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasTextType() == other.hasTextType());
      if (hasTextType()) {
        result = result && (getTextType()
            == other.getTextType());
      }
      result = result && (hasTextColor() == other.hasTextColor());
      if (hasTextColor()) {
        result = result && (getTextColor()
            == other.getTextColor());
      }
      result = result && (hasTextSize() == other.hasTextSize());
      if (hasTextSize()) {
        result = result && (getTextSize()
            == other.getTextSize());
      }
      result = result && (hasTextFont() == other.hasTextFont());
      if (hasTextFont()) {
        result = result && getTextFont()
            .equals(other.getTextFont());
      }
      result = result && (hasTextSpeed() == other.hasTextSpeed());
      if (hasTextSpeed()) {
        result = result && (getTextSpeed()
            == other.getTextSpeed());
      }
      result = result && (hasPicType() == other.hasPicType());
      if (hasPicType()) {
        result = result && (getPicType()
            == other.getPicType());
      }
      result = result && (hasPicDispTime() == other.hasPicDispTime());
      if (hasPicDispTime()) {
        result = result && (getPicDispTime()
            == other.getPicDispTime());
      }
      result = result && (hasVideoPlayTime() == other.hasVideoPlayTime());
      if (hasVideoPlayTime()) {
        result = result && (getVideoPlayTime()
            == other.getVideoPlayTime());
      }
      result = result && (hasVideoPlayStyle() == other.hasVideoPlayStyle());
      if (hasVideoPlayStyle()) {
        result = result && getVideoPlayStyle()
            .equals(other.getVideoPlayStyle());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasTextType()) {
        hash = (37 * hash) + TEXTTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getTextType();
      }
      if (hasTextColor()) {
        hash = (37 * hash) + TEXTCOLOR_FIELD_NUMBER;
        hash = (53 * hash) + getTextColor();
      }
      if (hasTextSize()) {
        hash = (37 * hash) + TEXTSIZE_FIELD_NUMBER;
        hash = (53 * hash) + getTextSize();
      }
      if (hasTextFont()) {
        hash = (37 * hash) + TEXTFONT_FIELD_NUMBER;
        hash = (53 * hash) + getTextFont().hashCode();
      }
      if (hasTextSpeed()) {
        hash = (37 * hash) + TEXTSPEED_FIELD_NUMBER;
        hash = (53 * hash) + getTextSpeed();
      }
      if (hasPicType()) {
        hash = (37 * hash) + PICTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getPicType();
      }
      if (hasPicDispTime()) {
        hash = (37 * hash) + PICDISPTIME_FIELD_NUMBER;
        hash = (53 * hash) + getPicDispTime();
      }
      if (hasVideoPlayTime()) {
        hash = (37 * hash) + VIDEOPLAYTIME_FIELD_NUMBER;
        hash = (53 * hash) + getVideoPlayTime();
      }
      if (hasVideoPlayStyle()) {
        hash = (37 * hash) + VIDEOPLAYSTYLE_FIELD_NUMBER;
        hash = (53 * hash) + getVideoPlayStyle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HDispSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HDispSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HDispSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HDispSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HDispSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HDispSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HDispSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x52
     * </pre>
     *
     * Protobuf type {@code HDispSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HDispSetting)
        NetMgrMsg.HDispSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HDispSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HDispSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HDispSetting.class, NetMgrMsg.HDispSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HDispSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        textType_ = -2;
        bitField0_ = (bitField0_ & ~0x00000002);
        textColor_ = -2;
        bitField0_ = (bitField0_ & ~0x00000004);
        textSize_ = -2;
        bitField0_ = (bitField0_ & ~0x00000008);
        textFont_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        textSpeed_ = -2;
        bitField0_ = (bitField0_ & ~0x00000020);
        picType_ = -2;
        bitField0_ = (bitField0_ & ~0x00000040);
        picDispTime_ = -2;
        bitField0_ = (bitField0_ & ~0x00000080);
        videoPlayTime_ = -2;
        bitField0_ = (bitField0_ & ~0x00000100);
        videoPlayStyle_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HDispSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HDispSetting getDefaultInstanceForType() {
        return NetMgrMsg.HDispSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HDispSetting build() {
        NetMgrMsg.HDispSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HDispSetting buildPartial() {
        NetMgrMsg.HDispSetting result = new NetMgrMsg.HDispSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.textType_ = textType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.textColor_ = textColor_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.textSize_ = textSize_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.textFont_ = textFont_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.textSpeed_ = textSpeed_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.picType_ = picType_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.picDispTime_ = picDispTime_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.videoPlayTime_ = videoPlayTime_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.videoPlayStyle_ = videoPlayStyle_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HDispSetting) {
          return mergeFrom((NetMgrMsg.HDispSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HDispSetting other) {
        if (other == NetMgrMsg.HDispSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasTextType()) {
          setTextType(other.getTextType());
        }
        if (other.hasTextColor()) {
          setTextColor(other.getTextColor());
        }
        if (other.hasTextSize()) {
          setTextSize(other.getTextSize());
        }
        if (other.hasTextFont()) {
          bitField0_ |= 0x00000010;
          textFont_ = other.textFont_;
          onChanged();
        }
        if (other.hasTextSpeed()) {
          setTextSpeed(other.getTextSpeed());
        }
        if (other.hasPicType()) {
          setPicType(other.getPicType());
        }
        if (other.hasPicDispTime()) {
          setPicDispTime(other.getPicDispTime());
        }
        if (other.hasVideoPlayTime()) {
          setVideoPlayTime(other.getVideoPlayTime());
        }
        if (other.hasVideoPlayStyle()) {
          bitField0_ |= 0x00000200;
          videoPlayStyle_ = other.videoPlayStyle_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HDispSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HDispSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int textType_ = -2;
      /**
       * <code>optional int32 textType = 2 [default = -2];</code>
       */
      public boolean hasTextType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 textType = 2 [default = -2];</code>
       */
      public int getTextType() {
        return textType_;
      }
      /**
       * <code>optional int32 textType = 2 [default = -2];</code>
       */
      public Builder setTextType(int value) {
        bitField0_ |= 0x00000002;
        textType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 textType = 2 [default = -2];</code>
       */
      public Builder clearTextType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        textType_ = -2;
        onChanged();
        return this;
      }

      private int textColor_ = -2;
      /**
       * <code>optional int32 textColor = 3 [default = -2];</code>
       */
      public boolean hasTextColor() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 textColor = 3 [default = -2];</code>
       */
      public int getTextColor() {
        return textColor_;
      }
      /**
       * <code>optional int32 textColor = 3 [default = -2];</code>
       */
      public Builder setTextColor(int value) {
        bitField0_ |= 0x00000004;
        textColor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 textColor = 3 [default = -2];</code>
       */
      public Builder clearTextColor() {
        bitField0_ = (bitField0_ & ~0x00000004);
        textColor_ = -2;
        onChanged();
        return this;
      }

      private int textSize_ = -2;
      /**
       * <code>optional int32 textSize = 4 [default = -2];</code>
       */
      public boolean hasTextSize() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 textSize = 4 [default = -2];</code>
       */
      public int getTextSize() {
        return textSize_;
      }
      /**
       * <code>optional int32 textSize = 4 [default = -2];</code>
       */
      public Builder setTextSize(int value) {
        bitField0_ |= 0x00000008;
        textSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 textSize = 4 [default = -2];</code>
       */
      public Builder clearTextSize() {
        bitField0_ = (bitField0_ & ~0x00000008);
        textSize_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object textFont_ = "";
      /**
       * <code>optional string textFont = 5;</code>
       */
      public boolean hasTextFont() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string textFont = 5;</code>
       */
      public java.lang.String getTextFont() {
        java.lang.Object ref = textFont_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            textFont_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string textFont = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTextFontBytes() {
        java.lang.Object ref = textFont_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          textFont_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string textFont = 5;</code>
       */
      public Builder setTextFont(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        textFont_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string textFont = 5;</code>
       */
      public Builder clearTextFont() {
        bitField0_ = (bitField0_ & ~0x00000010);
        textFont_ = getDefaultInstance().getTextFont();
        onChanged();
        return this;
      }
      /**
       * <code>optional string textFont = 5;</code>
       */
      public Builder setTextFontBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        textFont_ = value;
        onChanged();
        return this;
      }

      private int textSpeed_ = -2;
      /**
       * <pre>
       * 0 slowest
       * </pre>
       *
       * <code>optional int32 textSpeed = 6 [default = -2];</code>
       */
      public boolean hasTextSpeed() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <pre>
       * 0 slowest
       * </pre>
       *
       * <code>optional int32 textSpeed = 6 [default = -2];</code>
       */
      public int getTextSpeed() {
        return textSpeed_;
      }
      /**
       * <pre>
       * 0 slowest
       * </pre>
       *
       * <code>optional int32 textSpeed = 6 [default = -2];</code>
       */
      public Builder setTextSpeed(int value) {
        bitField0_ |= 0x00000020;
        textSpeed_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 slowest
       * </pre>
       *
       * <code>optional int32 textSpeed = 6 [default = -2];</code>
       */
      public Builder clearTextSpeed() {
        bitField0_ = (bitField0_ & ~0x00000020);
        textSpeed_ = -2;
        onChanged();
        return this;
      }

      private int picType_ = -2;
      /**
       * <code>optional int32 picType = 7 [default = -2];</code>
       */
      public boolean hasPicType() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 picType = 7 [default = -2];</code>
       */
      public int getPicType() {
        return picType_;
      }
      /**
       * <code>optional int32 picType = 7 [default = -2];</code>
       */
      public Builder setPicType(int value) {
        bitField0_ |= 0x00000040;
        picType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 picType = 7 [default = -2];</code>
       */
      public Builder clearPicType() {
        bitField0_ = (bitField0_ & ~0x00000040);
        picType_ = -2;
        onChanged();
        return this;
      }

      private int picDispTime_ = -2;
      /**
       * <pre>
       * 0 always display
       * </pre>
       *
       * <code>optional int32 picDispTime = 8 [default = -2];</code>
       */
      public boolean hasPicDispTime() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <pre>
       * 0 always display
       * </pre>
       *
       * <code>optional int32 picDispTime = 8 [default = -2];</code>
       */
      public int getPicDispTime() {
        return picDispTime_;
      }
      /**
       * <pre>
       * 0 always display
       * </pre>
       *
       * <code>optional int32 picDispTime = 8 [default = -2];</code>
       */
      public Builder setPicDispTime(int value) {
        bitField0_ |= 0x00000080;
        picDispTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 always display
       * </pre>
       *
       * <code>optional int32 picDispTime = 8 [default = -2];</code>
       */
      public Builder clearPicDispTime() {
        bitField0_ = (bitField0_ & ~0x00000080);
        picDispTime_ = -2;
        onChanged();
        return this;
      }

      private int videoPlayTime_ = -2;
      /**
       * <pre>
       * 0 default time
       * </pre>
       *
       * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
       */
      public boolean hasVideoPlayTime() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <pre>
       * 0 default time
       * </pre>
       *
       * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
       */
      public int getVideoPlayTime() {
        return videoPlayTime_;
      }
      /**
       * <pre>
       * 0 default time
       * </pre>
       *
       * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
       */
      public Builder setVideoPlayTime(int value) {
        bitField0_ |= 0x00000100;
        videoPlayTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0 default time
       * </pre>
       *
       * <code>optional int32 videoPlayTime = 9 [default = -2];</code>
       */
      public Builder clearVideoPlayTime() {
        bitField0_ = (bitField0_ & ~0x00000100);
        videoPlayTime_ = -2;
        onChanged();
        return this;
      }

      private java.lang.Object videoPlayStyle_ = "";
      /**
       * <code>optional string videoPlayStyle = 10;</code>
       */
      public boolean hasVideoPlayStyle() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string videoPlayStyle = 10;</code>
       */
      public java.lang.String getVideoPlayStyle() {
        java.lang.Object ref = videoPlayStyle_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            videoPlayStyle_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string videoPlayStyle = 10;</code>
       */
      public com.google.protobuf.ByteString
          getVideoPlayStyleBytes() {
        java.lang.Object ref = videoPlayStyle_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          videoPlayStyle_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string videoPlayStyle = 10;</code>
       */
      public Builder setVideoPlayStyle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        videoPlayStyle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string videoPlayStyle = 10;</code>
       */
      public Builder clearVideoPlayStyle() {
        bitField0_ = (bitField0_ & ~0x00000200);
        videoPlayStyle_ = getDefaultInstance().getVideoPlayStyle();
        onChanged();
        return this;
      }
      /**
       * <code>optional string videoPlayStyle = 10;</code>
       */
      public Builder setVideoPlayStyleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        videoPlayStyle_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HDispSetting)
    }

    // @@protoc_insertion_point(class_scope:HDispSetting)
    private static final NetMgrMsg.HDispSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HDispSetting();
    }

    public static NetMgrMsg.HDispSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HDispSetting>
        PARSER = new com.google.protobuf.AbstractParser<HDispSetting>() {
      @java.lang.Override
      public HDispSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HDispSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HDispSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HDispSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HDispSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HPlayListSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HPlayListSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    boolean hasOpt();
    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    NetMgrDefine.PlayListOptEnum getOpt();

    /**
     * <code>repeated string content = 3;</code>
     */
    java.util.List<java.lang.String>
        getContentList();
    /**
     * <code>repeated string content = 3;</code>
     */
    int getContentCount();
    /**
     * <code>repeated string content = 3;</code>
     */
    java.lang.String getContent(int index);
    /**
     * <code>repeated string content = 3;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes(int index);
  }
  /**
   * <pre>
   * 0x61
   * </pre>
   *
   * Protobuf type {@code HPlayListSetting}
   */
  public  static final class HPlayListSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HPlayListSetting)
      HPlayListSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HPlayListSetting.newBuilder() to construct.
    private HPlayListSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HPlayListSetting() {
      type_ = 0;
      opt_ = 0;
      content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HPlayListSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.PlayListOptEnum value = NetMgrDefine.PlayListOptEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                opt_ = rawValue;
              }
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                content_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              content_.add(bs);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          content_ = content_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HPlayListSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HPlayListSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HPlayListSetting.class, NetMgrMsg.HPlayListSetting.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int OPT_FIELD_NUMBER = 2;
    private int opt_;
    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    public boolean hasOpt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    public NetMgrDefine.PlayListOptEnum getOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.PlayListOptEnum result = NetMgrDefine.PlayListOptEnum.valueOf(opt_);
      return result == null ? NetMgrDefine.PlayListOptEnum.Invalid_PlaylistOpt : result;
    }

    public static final int CONTENT_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList content_;
    /**
     * <code>repeated string content = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getContentList() {
      return content_;
    }
    /**
     * <code>repeated string content = 3;</code>
     */
    public int getContentCount() {
      return content_.size();
    }
    /**
     * <code>repeated string content = 3;</code>
     */
    public java.lang.String getContent(int index) {
      return content_.get(index);
    }
    /**
     * <code>repeated string content = 3;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes(int index) {
      return content_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, opt_);
      }
      for (int i = 0; i < content_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, opt_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < content_.size(); i++) {
          dataSize += computeStringSizeNoTag(content_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getContentList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HPlayListSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.HPlayListSetting other = (NetMgrMsg.HPlayListSetting) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasOpt() == other.hasOpt());
      if (hasOpt()) {
        result = result && opt_ == other.opt_;
      }
      result = result && getContentList()
          .equals(other.getContentList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasOpt()) {
        hash = (37 * hash) + OPT_FIELD_NUMBER;
        hash = (53 * hash) + opt_;
      }
      if (getContentCount() > 0) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContentList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HPlayListSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HPlayListSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HPlayListSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HPlayListSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HPlayListSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x61
     * </pre>
     *
     * Protobuf type {@code HPlayListSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HPlayListSetting)
        NetMgrMsg.HPlayListSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HPlayListSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HPlayListSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HPlayListSetting.class, NetMgrMsg.HPlayListSetting.Builder.class);
      }

      // Construct using NetMgrMsg.HPlayListSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HPlayListSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HPlayListSetting getDefaultInstanceForType() {
        return NetMgrMsg.HPlayListSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HPlayListSetting build() {
        NetMgrMsg.HPlayListSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HPlayListSetting buildPartial() {
        NetMgrMsg.HPlayListSetting result = new NetMgrMsg.HPlayListSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opt_ = opt_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          content_ = content_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HPlayListSetting) {
          return mergeFrom((NetMgrMsg.HPlayListSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HPlayListSetting other) {
        if (other == NetMgrMsg.HPlayListSetting.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasOpt()) {
          setOpt(other.getOpt());
        }
        if (!other.content_.isEmpty()) {
          if (content_.isEmpty()) {
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureContentIsMutable();
            content_.addAll(other.content_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        if (!hasOpt()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HPlayListSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HPlayListSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int opt_ = 0;
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public boolean hasOpt() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public NetMgrDefine.PlayListOptEnum getOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.PlayListOptEnum result = NetMgrDefine.PlayListOptEnum.valueOf(opt_);
        return result == null ? NetMgrDefine.PlayListOptEnum.Invalid_PlaylistOpt : result;
      }
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public Builder setOpt(NetMgrDefine.PlayListOptEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        opt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public Builder clearOpt() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opt_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureContentIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          content_ = new com.google.protobuf.LazyStringArrayList(content_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getContentList() {
        return content_.getUnmodifiableView();
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public int getContentCount() {
        return content_.size();
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public java.lang.String getContent(int index) {
        return content_.get(index);
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes(int index) {
        return content_.getByteString(index);
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder setContent(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder addContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder addAllContent(
          java.lang.Iterable<java.lang.String> values) {
        ensureContentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, content_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder clearContent() {
        content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder addContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HPlayListSetting)
    }

    // @@protoc_insertion_point(class_scope:HPlayListSetting)
    private static final NetMgrMsg.HPlayListSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HPlayListSetting();
    }

    public static NetMgrMsg.HPlayListSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HPlayListSetting>
        PARSER = new com.google.protobuf.AbstractParser<HPlayListSetting>() {
      @java.lang.Override
      public HPlayListSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HPlayListSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HPlayListSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HPlayListSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HPlayListSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CPlayListSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CPlayListSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string identify = 1;</code>
     */
    boolean hasIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    java.lang.String getIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    boolean hasOpt();
    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    NetMgrDefine.PlayListOptEnum getOpt();

    /**
     * <code>repeated string content = 3;</code>
     */
    java.util.List<java.lang.String>
        getContentList();
    /**
     * <code>repeated string content = 3;</code>
     */
    int getContentCount();
    /**
     * <code>repeated string content = 3;</code>
     */
    java.lang.String getContent(int index);
    /**
     * <code>repeated string content = 3;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes(int index);

    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    boolean hasStatus();
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    int getStatus();
  }
  /**
   * <pre>
   * 0x61
   * </pre>
   *
   * Protobuf type {@code CPlayListSetting}
   */
  public  static final class CPlayListSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CPlayListSetting)
      CPlayListSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CPlayListSetting.newBuilder() to construct.
    private CPlayListSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CPlayListSetting() {
      identify_ = "";
      opt_ = 0;
      content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CPlayListSetting(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              identify_ = bs;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.PlayListOptEnum value = NetMgrDefine.PlayListOptEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                opt_ = rawValue;
              }
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                content_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              content_.add(bs);
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              status_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          content_ = content_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_CPlayListSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_CPlayListSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.CPlayListSetting.class, NetMgrMsg.CPlayListSetting.Builder.class);
    }

    private int bitField0_;
    public static final int IDENTIFY_FIELD_NUMBER = 1;
    private volatile java.lang.Object identify_;
    /**
     * <code>required string identify = 1;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OPT_FIELD_NUMBER = 2;
    private int opt_;
    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    public boolean hasOpt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .PlayListOptEnum opt = 2;</code>
     */
    public NetMgrDefine.PlayListOptEnum getOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.PlayListOptEnum result = NetMgrDefine.PlayListOptEnum.valueOf(opt_);
      return result == null ? NetMgrDefine.PlayListOptEnum.Invalid_PlaylistOpt : result;
    }

    public static final int CONTENT_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList content_;
    /**
     * <code>repeated string content = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getContentList() {
      return content_;
    }
    /**
     * <code>repeated string content = 3;</code>
     */
    public int getContentCount() {
      return content_.size();
    }
    /**
     * <code>repeated string content = 3;</code>
     */
    public java.lang.String getContent(int index) {
      return content_.get(index);
    }
    /**
     * <code>repeated string content = 3;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes(int index) {
      return content_.getByteString(index);
    }

    public static final int STATUS_FIELD_NUMBER = 4;
    private int status_;
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * 0~100 percent, -1 failed
     * </pre>
     *
     * <code>required int32 status = 4;</code>
     */
    public int getStatus() {
      return status_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identify_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, opt_);
      }
      for (int i = 0; i < content_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_.getRaw(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(4, status_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identify_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, opt_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < content_.size(); i++) {
          dataSize += computeStringSizeNoTag(content_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getContentList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, status_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.CPlayListSetting)) {
        return super.equals(obj);
      }
      NetMgrMsg.CPlayListSetting other = (NetMgrMsg.CPlayListSetting) obj;

      boolean result = true;
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && (hasOpt() == other.hasOpt());
      if (hasOpt()) {
        result = result && opt_ == other.opt_;
      }
      result = result && getContentList()
          .equals(other.getContentList());
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && (getStatus()
            == other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (hasOpt()) {
        hash = (37 * hash) + OPT_FIELD_NUMBER;
        hash = (53 * hash) + opt_;
      }
      if (getContentCount() > 0) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContentList().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.CPlayListSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CPlayListSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CPlayListSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CPlayListSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.CPlayListSetting prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x61
     * </pre>
     *
     * Protobuf type {@code CPlayListSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CPlayListSetting)
        NetMgrMsg.CPlayListSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_CPlayListSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_CPlayListSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.CPlayListSetting.class, NetMgrMsg.CPlayListSetting.Builder.class);
      }

      // Construct using NetMgrMsg.CPlayListSetting.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        opt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_CPlayListSetting_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.CPlayListSetting getDefaultInstanceForType() {
        return NetMgrMsg.CPlayListSetting.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.CPlayListSetting build() {
        NetMgrMsg.CPlayListSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.CPlayListSetting buildPartial() {
        NetMgrMsg.CPlayListSetting result = new NetMgrMsg.CPlayListSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identify_ = identify_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opt_ = opt_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          content_ = content_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.CPlayListSetting) {
          return mergeFrom((NetMgrMsg.CPlayListSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.CPlayListSetting other) {
        if (other == NetMgrMsg.CPlayListSetting.getDefaultInstance()) return this;
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000001;
          identify_ = other.identify_;
          onChanged();
        }
        if (other.hasOpt()) {
          setOpt(other.getOpt());
        }
        if (!other.content_.isEmpty()) {
          if (content_.isEmpty()) {
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureContentIsMutable();
            content_.addAll(other.content_);
          }
          onChanged();
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIdentify()) {
          return false;
        }
        if (!hasOpt()) {
          return false;
        }
        if (!hasStatus()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.CPlayListSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.CPlayListSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object identify_ = "";
      /**
       * <code>required string identify = 1;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }

      private int opt_ = 0;
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public boolean hasOpt() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public NetMgrDefine.PlayListOptEnum getOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.PlayListOptEnum result = NetMgrDefine.PlayListOptEnum.valueOf(opt_);
        return result == null ? NetMgrDefine.PlayListOptEnum.Invalid_PlaylistOpt : result;
      }
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public Builder setOpt(NetMgrDefine.PlayListOptEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        opt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .PlayListOptEnum opt = 2;</code>
       */
      public Builder clearOpt() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opt_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureContentIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          content_ = new com.google.protobuf.LazyStringArrayList(content_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getContentList() {
        return content_.getUnmodifiableView();
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public int getContentCount() {
        return content_.size();
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public java.lang.String getContent(int index) {
        return content_.get(index);
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes(int index) {
        return content_.getByteString(index);
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder setContent(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder addContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder addAllContent(
          java.lang.Iterable<java.lang.String> values) {
        ensureContentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, content_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder clearContent() {
        content_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string content = 3;</code>
       */
      public Builder addContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.add(value);
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000008;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 0~100 percent, -1 failed
       * </pre>
       *
       * <code>required int32 status = 4;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000008);
        status_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CPlayListSetting)
    }

    // @@protoc_insertion_point(class_scope:CPlayListSetting)
    private static final NetMgrMsg.CPlayListSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.CPlayListSetting();
    }

    public static NetMgrMsg.CPlayListSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CPlayListSetting>
        PARSER = new com.google.protobuf.AbstractParser<CPlayListSetting>() {
      @java.lang.Override
      public CPlayListSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CPlayListSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CPlayListSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CPlayListSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.CPlayListSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MediaStatisticOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MediaStatistic)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required int32 count = 2;</code>
     */
    boolean hasCount();
    /**
     * <code>required int32 count = 2;</code>
     */
    int getCount();
  }
  /**
   * Protobuf type {@code MediaStatistic}
   */
  public  static final class MediaStatistic extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MediaStatistic)
      MediaStatisticOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MediaStatistic.newBuilder() to construct.
    private MediaStatistic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MediaStatistic() {
      name_ = "";
      count_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MediaStatistic(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              count_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_MediaStatistic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_MediaStatistic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.MediaStatistic.class, NetMgrMsg.MediaStatistic.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>required int32 count = 2;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, count_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, count_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.MediaStatistic)) {
        return super.equals(obj);
      }
      NetMgrMsg.MediaStatistic other = (NetMgrMsg.MediaStatistic) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasCount() == other.hasCount());
      if (hasCount()) {
        result = result && (getCount()
            == other.getCount());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasCount()) {
        hash = (37 * hash) + COUNT_FIELD_NUMBER;
        hash = (53 * hash) + getCount();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.MediaStatistic parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.MediaStatistic parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.MediaStatistic parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.MediaStatistic parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.MediaStatistic prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MediaStatistic}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MediaStatistic)
        NetMgrMsg.MediaStatisticOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_MediaStatistic_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_MediaStatistic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.MediaStatistic.class, NetMgrMsg.MediaStatistic.Builder.class);
      }

      // Construct using NetMgrMsg.MediaStatistic.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_MediaStatistic_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.MediaStatistic getDefaultInstanceForType() {
        return NetMgrMsg.MediaStatistic.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.MediaStatistic build() {
        NetMgrMsg.MediaStatistic result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.MediaStatistic buildPartial() {
        NetMgrMsg.MediaStatistic result = new NetMgrMsg.MediaStatistic(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.count_ = count_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.MediaStatistic) {
          return mergeFrom((NetMgrMsg.MediaStatistic)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.MediaStatistic other) {
        if (other == NetMgrMsg.MediaStatistic.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasCount()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.MediaStatistic parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.MediaStatistic) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>required int32 count = 2;</code>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 count = 2;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>required int32 count = 2;</code>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000002;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 count = 2;</code>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MediaStatistic)
    }

    // @@protoc_insertion_point(class_scope:MediaStatistic)
    private static final NetMgrMsg.MediaStatistic DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.MediaStatistic();
    }

    public static NetMgrMsg.MediaStatistic getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MediaStatistic>
        PARSER = new com.google.protobuf.AbstractParser<MediaStatistic>() {
      @java.lang.Override
      public MediaStatistic parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MediaStatistic(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MediaStatistic> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MediaStatistic> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.MediaStatistic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PlayListStatisticOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayListStatistic)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required int32 count = 2;</code>
     */
    boolean hasCount();
    /**
     * <code>required int32 count = 2;</code>
     */
    int getCount();

    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    java.util.List<NetMgrMsg.MediaStatistic> 
        getMediaList();
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    NetMgrMsg.MediaStatistic getMedia(int index);
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    int getMediaCount();
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    java.util.List<? extends NetMgrMsg.MediaStatisticOrBuilder> 
        getMediaOrBuilderList();
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    NetMgrMsg.MediaStatisticOrBuilder getMediaOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PlayListStatistic}
   */
  public  static final class PlayListStatistic extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayListStatistic)
      PlayListStatisticOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayListStatistic.newBuilder() to construct.
    private PlayListStatistic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayListStatistic() {
      name_ = "";
      count_ = 0;
      media_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayListStatistic(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              count_ = input.readInt32();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                media_ = new java.util.ArrayList<NetMgrMsg.MediaStatistic>();
                mutable_bitField0_ |= 0x00000004;
              }
              media_.add(
                  input.readMessage(NetMgrMsg.MediaStatistic.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          media_ = java.util.Collections.unmodifiableList(media_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_PlayListStatistic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_PlayListStatistic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.PlayListStatistic.class, NetMgrMsg.PlayListStatistic.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>required int32 count = 2;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }

    public static final int MEDIA_FIELD_NUMBER = 3;
    private java.util.List<NetMgrMsg.MediaStatistic> media_;
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    public java.util.List<NetMgrMsg.MediaStatistic> getMediaList() {
      return media_;
    }
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    public java.util.List<? extends NetMgrMsg.MediaStatisticOrBuilder> 
        getMediaOrBuilderList() {
      return media_;
    }
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    public int getMediaCount() {
      return media_.size();
    }
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    public NetMgrMsg.MediaStatistic getMedia(int index) {
      return media_.get(index);
    }
    /**
     * <code>repeated .MediaStatistic media = 3;</code>
     */
    public NetMgrMsg.MediaStatisticOrBuilder getMediaOrBuilder(
        int index) {
      return media_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getMediaCount(); i++) {
        if (!getMedia(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, count_);
      }
      for (int i = 0; i < media_.size(); i++) {
        output.writeMessage(3, media_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, count_);
      }
      for (int i = 0; i < media_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, media_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.PlayListStatistic)) {
        return super.equals(obj);
      }
      NetMgrMsg.PlayListStatistic other = (NetMgrMsg.PlayListStatistic) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasCount() == other.hasCount());
      if (hasCount()) {
        result = result && (getCount()
            == other.getCount());
      }
      result = result && getMediaList()
          .equals(other.getMediaList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasCount()) {
        hash = (37 * hash) + COUNT_FIELD_NUMBER;
        hash = (53 * hash) + getCount();
      }
      if (getMediaCount() > 0) {
        hash = (37 * hash) + MEDIA_FIELD_NUMBER;
        hash = (53 * hash) + getMediaList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.PlayListStatistic parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.PlayListStatistic parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.PlayListStatistic parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.PlayListStatistic parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.PlayListStatistic prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayListStatistic}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayListStatistic)
        NetMgrMsg.PlayListStatisticOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_PlayListStatistic_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_PlayListStatistic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.PlayListStatistic.class, NetMgrMsg.PlayListStatistic.Builder.class);
      }

      // Construct using NetMgrMsg.PlayListStatistic.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getMediaFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (mediaBuilder_ == null) {
          media_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          mediaBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_PlayListStatistic_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.PlayListStatistic getDefaultInstanceForType() {
        return NetMgrMsg.PlayListStatistic.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.PlayListStatistic build() {
        NetMgrMsg.PlayListStatistic result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.PlayListStatistic buildPartial() {
        NetMgrMsg.PlayListStatistic result = new NetMgrMsg.PlayListStatistic(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.count_ = count_;
        if (mediaBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            media_ = java.util.Collections.unmodifiableList(media_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.media_ = media_;
        } else {
          result.media_ = mediaBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.PlayListStatistic) {
          return mergeFrom((NetMgrMsg.PlayListStatistic)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.PlayListStatistic other) {
        if (other == NetMgrMsg.PlayListStatistic.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        if (mediaBuilder_ == null) {
          if (!other.media_.isEmpty()) {
            if (media_.isEmpty()) {
              media_ = other.media_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureMediaIsMutable();
              media_.addAll(other.media_);
            }
            onChanged();
          }
        } else {
          if (!other.media_.isEmpty()) {
            if (mediaBuilder_.isEmpty()) {
              mediaBuilder_.dispose();
              mediaBuilder_ = null;
              media_ = other.media_;
              bitField0_ = (bitField0_ & ~0x00000004);
              mediaBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMediaFieldBuilder() : null;
            } else {
              mediaBuilder_.addAllMessages(other.media_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasCount()) {
          return false;
        }
        for (int i = 0; i < getMediaCount(); i++) {
          if (!getMedia(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.PlayListStatistic parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.PlayListStatistic) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>required int32 count = 2;</code>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 count = 2;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>required int32 count = 2;</code>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000002;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 count = 2;</code>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<NetMgrMsg.MediaStatistic> media_ =
        java.util.Collections.emptyList();
      private void ensureMediaIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          media_ = new java.util.ArrayList<NetMgrMsg.MediaStatistic>(media_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaStatistic, NetMgrMsg.MediaStatistic.Builder, NetMgrMsg.MediaStatisticOrBuilder> mediaBuilder_;

      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public java.util.List<NetMgrMsg.MediaStatistic> getMediaList() {
        if (mediaBuilder_ == null) {
          return java.util.Collections.unmodifiableList(media_);
        } else {
          return mediaBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public int getMediaCount() {
        if (mediaBuilder_ == null) {
          return media_.size();
        } else {
          return mediaBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public NetMgrMsg.MediaStatistic getMedia(int index) {
        if (mediaBuilder_ == null) {
          return media_.get(index);
        } else {
          return mediaBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder setMedia(
          int index, NetMgrMsg.MediaStatistic value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.set(index, value);
          onChanged();
        } else {
          mediaBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder setMedia(
          int index, NetMgrMsg.MediaStatistic.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.set(index, builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder addMedia(NetMgrMsg.MediaStatistic value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.add(value);
          onChanged();
        } else {
          mediaBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder addMedia(
          int index, NetMgrMsg.MediaStatistic value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.add(index, value);
          onChanged();
        } else {
          mediaBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder addMedia(
          NetMgrMsg.MediaStatistic.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.add(builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder addMedia(
          int index, NetMgrMsg.MediaStatistic.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.add(index, builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder addAllMedia(
          java.lang.Iterable<? extends NetMgrMsg.MediaStatistic> values) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, media_);
          onChanged();
        } else {
          mediaBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder clearMedia() {
        if (mediaBuilder_ == null) {
          media_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          mediaBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public Builder removeMedia(int index) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.remove(index);
          onChanged();
        } else {
          mediaBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public NetMgrMsg.MediaStatistic.Builder getMediaBuilder(
          int index) {
        return getMediaFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public NetMgrMsg.MediaStatisticOrBuilder getMediaOrBuilder(
          int index) {
        if (mediaBuilder_ == null) {
          return media_.get(index);  } else {
          return mediaBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public java.util.List<? extends NetMgrMsg.MediaStatisticOrBuilder> 
           getMediaOrBuilderList() {
        if (mediaBuilder_ != null) {
          return mediaBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(media_);
        }
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public NetMgrMsg.MediaStatistic.Builder addMediaBuilder() {
        return getMediaFieldBuilder().addBuilder(
            NetMgrMsg.MediaStatistic.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public NetMgrMsg.MediaStatistic.Builder addMediaBuilder(
          int index) {
        return getMediaFieldBuilder().addBuilder(
            index, NetMgrMsg.MediaStatistic.getDefaultInstance());
      }
      /**
       * <code>repeated .MediaStatistic media = 3;</code>
       */
      public java.util.List<NetMgrMsg.MediaStatistic.Builder> 
           getMediaBuilderList() {
        return getMediaFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.MediaStatistic, NetMgrMsg.MediaStatistic.Builder, NetMgrMsg.MediaStatisticOrBuilder> 
          getMediaFieldBuilder() {
        if (mediaBuilder_ == null) {
          mediaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              NetMgrMsg.MediaStatistic, NetMgrMsg.MediaStatistic.Builder, NetMgrMsg.MediaStatisticOrBuilder>(
                  media_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          media_ = null;
        }
        return mediaBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayListStatistic)
    }

    // @@protoc_insertion_point(class_scope:PlayListStatistic)
    private static final NetMgrMsg.PlayListStatistic DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.PlayListStatistic();
    }

    public static NetMgrMsg.PlayListStatistic getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PlayListStatistic>
        PARSER = new com.google.protobuf.AbstractParser<PlayListStatistic>() {
      @java.lang.Override
      public PlayListStatistic parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayListStatistic(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayListStatistic> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayListStatistic> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.PlayListStatistic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CPlayStatisticOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CPlayStatistic)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string identify = 1;</code>
     */
    boolean hasIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    java.lang.String getIdentify();
    /**
     * <code>required string identify = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdentifyBytes();

    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    java.util.List<NetMgrMsg.PlayListStatistic> 
        getPlaylistList();
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    NetMgrMsg.PlayListStatistic getPlaylist(int index);
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    int getPlaylistCount();
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    java.util.List<? extends NetMgrMsg.PlayListStatisticOrBuilder> 
        getPlaylistOrBuilderList();
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    NetMgrMsg.PlayListStatisticOrBuilder getPlaylistOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 0x62
   * </pre>
   *
   * Protobuf type {@code CPlayStatistic}
   */
  public  static final class CPlayStatistic extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CPlayStatistic)
      CPlayStatisticOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CPlayStatistic.newBuilder() to construct.
    private CPlayStatistic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CPlayStatistic() {
      identify_ = "";
      playlist_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CPlayStatistic(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              identify_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                playlist_ = new java.util.ArrayList<NetMgrMsg.PlayListStatistic>();
                mutable_bitField0_ |= 0x00000002;
              }
              playlist_.add(
                  input.readMessage(NetMgrMsg.PlayListStatistic.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          playlist_ = java.util.Collections.unmodifiableList(playlist_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_CPlayStatistic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_CPlayStatistic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.CPlayStatistic.class, NetMgrMsg.CPlayStatistic.Builder.class);
    }

    private int bitField0_;
    public static final int IDENTIFY_FIELD_NUMBER = 1;
    private volatile java.lang.Object identify_;
    /**
     * <code>required string identify = 1;</code>
     */
    public boolean hasIdentify() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public java.lang.String getIdentify() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identify_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string identify = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifyBytes() {
      java.lang.Object ref = identify_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PLAYLIST_FIELD_NUMBER = 2;
    private java.util.List<NetMgrMsg.PlayListStatistic> playlist_;
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    public java.util.List<NetMgrMsg.PlayListStatistic> getPlaylistList() {
      return playlist_;
    }
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    public java.util.List<? extends NetMgrMsg.PlayListStatisticOrBuilder> 
        getPlaylistOrBuilderList() {
      return playlist_;
    }
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    public int getPlaylistCount() {
      return playlist_.size();
    }
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    public NetMgrMsg.PlayListStatistic getPlaylist(int index) {
      return playlist_.get(index);
    }
    /**
     * <code>repeated .PlayListStatistic playlist = 2;</code>
     */
    public NetMgrMsg.PlayListStatisticOrBuilder getPlaylistOrBuilder(
        int index) {
      return playlist_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPlaylistCount(); i++) {
        if (!getPlaylist(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identify_);
      }
      for (int i = 0; i < playlist_.size(); i++) {
        output.writeMessage(2, playlist_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identify_);
      }
      for (int i = 0; i < playlist_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, playlist_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.CPlayStatistic)) {
        return super.equals(obj);
      }
      NetMgrMsg.CPlayStatistic other = (NetMgrMsg.CPlayStatistic) obj;

      boolean result = true;
      result = result && (hasIdentify() == other.hasIdentify());
      if (hasIdentify()) {
        result = result && getIdentify()
            .equals(other.getIdentify());
      }
      result = result && getPlaylistList()
          .equals(other.getPlaylistList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIdentify()) {
        hash = (37 * hash) + IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getIdentify().hashCode();
      }
      if (getPlaylistCount() > 0) {
        hash = (37 * hash) + PLAYLIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlaylistList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.CPlayStatistic parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CPlayStatistic parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CPlayStatistic parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.CPlayStatistic parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.CPlayStatistic prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x62
     * </pre>
     *
     * Protobuf type {@code CPlayStatistic}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CPlayStatistic)
        NetMgrMsg.CPlayStatisticOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_CPlayStatistic_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_CPlayStatistic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.CPlayStatistic.class, NetMgrMsg.CPlayStatistic.Builder.class);
      }

      // Construct using NetMgrMsg.CPlayStatistic.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPlaylistFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        identify_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (playlistBuilder_ == null) {
          playlist_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          playlistBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_CPlayStatistic_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.CPlayStatistic getDefaultInstanceForType() {
        return NetMgrMsg.CPlayStatistic.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.CPlayStatistic build() {
        NetMgrMsg.CPlayStatistic result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.CPlayStatistic buildPartial() {
        NetMgrMsg.CPlayStatistic result = new NetMgrMsg.CPlayStatistic(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identify_ = identify_;
        if (playlistBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            playlist_ = java.util.Collections.unmodifiableList(playlist_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.playlist_ = playlist_;
        } else {
          result.playlist_ = playlistBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.CPlayStatistic) {
          return mergeFrom((NetMgrMsg.CPlayStatistic)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.CPlayStatistic other) {
        if (other == NetMgrMsg.CPlayStatistic.getDefaultInstance()) return this;
        if (other.hasIdentify()) {
          bitField0_ |= 0x00000001;
          identify_ = other.identify_;
          onChanged();
        }
        if (playlistBuilder_ == null) {
          if (!other.playlist_.isEmpty()) {
            if (playlist_.isEmpty()) {
              playlist_ = other.playlist_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePlaylistIsMutable();
              playlist_.addAll(other.playlist_);
            }
            onChanged();
          }
        } else {
          if (!other.playlist_.isEmpty()) {
            if (playlistBuilder_.isEmpty()) {
              playlistBuilder_.dispose();
              playlistBuilder_ = null;
              playlist_ = other.playlist_;
              bitField0_ = (bitField0_ & ~0x00000002);
              playlistBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlaylistFieldBuilder() : null;
            } else {
              playlistBuilder_.addAllMessages(other.playlist_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIdentify()) {
          return false;
        }
        for (int i = 0; i < getPlaylistCount(); i++) {
          if (!getPlaylist(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.CPlayStatistic parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.CPlayStatistic) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object identify_ = "";
      /**
       * <code>required string identify = 1;</code>
       */
      public boolean hasIdentify() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public java.lang.String getIdentify() {
        java.lang.Object ref = identify_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identify_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifyBytes() {
        java.lang.Object ref = identify_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identify_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentify(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder clearIdentify() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identify_ = getDefaultInstance().getIdentify();
        onChanged();
        return this;
      }
      /**
       * <code>required string identify = 1;</code>
       */
      public Builder setIdentifyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identify_ = value;
        onChanged();
        return this;
      }

      private java.util.List<NetMgrMsg.PlayListStatistic> playlist_ =
        java.util.Collections.emptyList();
      private void ensurePlaylistIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          playlist_ = new java.util.ArrayList<NetMgrMsg.PlayListStatistic>(playlist_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.PlayListStatistic, NetMgrMsg.PlayListStatistic.Builder, NetMgrMsg.PlayListStatisticOrBuilder> playlistBuilder_;

      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public java.util.List<NetMgrMsg.PlayListStatistic> getPlaylistList() {
        if (playlistBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playlist_);
        } else {
          return playlistBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public int getPlaylistCount() {
        if (playlistBuilder_ == null) {
          return playlist_.size();
        } else {
          return playlistBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public NetMgrMsg.PlayListStatistic getPlaylist(int index) {
        if (playlistBuilder_ == null) {
          return playlist_.get(index);
        } else {
          return playlistBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder setPlaylist(
          int index, NetMgrMsg.PlayListStatistic value) {
        if (playlistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlaylistIsMutable();
          playlist_.set(index, value);
          onChanged();
        } else {
          playlistBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder setPlaylist(
          int index, NetMgrMsg.PlayListStatistic.Builder builderForValue) {
        if (playlistBuilder_ == null) {
          ensurePlaylistIsMutable();
          playlist_.set(index, builderForValue.build());
          onChanged();
        } else {
          playlistBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder addPlaylist(NetMgrMsg.PlayListStatistic value) {
        if (playlistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlaylistIsMutable();
          playlist_.add(value);
          onChanged();
        } else {
          playlistBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder addPlaylist(
          int index, NetMgrMsg.PlayListStatistic value) {
        if (playlistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlaylistIsMutable();
          playlist_.add(index, value);
          onChanged();
        } else {
          playlistBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder addPlaylist(
          NetMgrMsg.PlayListStatistic.Builder builderForValue) {
        if (playlistBuilder_ == null) {
          ensurePlaylistIsMutable();
          playlist_.add(builderForValue.build());
          onChanged();
        } else {
          playlistBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder addPlaylist(
          int index, NetMgrMsg.PlayListStatistic.Builder builderForValue) {
        if (playlistBuilder_ == null) {
          ensurePlaylistIsMutable();
          playlist_.add(index, builderForValue.build());
          onChanged();
        } else {
          playlistBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder addAllPlaylist(
          java.lang.Iterable<? extends NetMgrMsg.PlayListStatistic> values) {
        if (playlistBuilder_ == null) {
          ensurePlaylistIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playlist_);
          onChanged();
        } else {
          playlistBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder clearPlaylist() {
        if (playlistBuilder_ == null) {
          playlist_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          playlistBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public Builder removePlaylist(int index) {
        if (playlistBuilder_ == null) {
          ensurePlaylistIsMutable();
          playlist_.remove(index);
          onChanged();
        } else {
          playlistBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public NetMgrMsg.PlayListStatistic.Builder getPlaylistBuilder(
          int index) {
        return getPlaylistFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public NetMgrMsg.PlayListStatisticOrBuilder getPlaylistOrBuilder(
          int index) {
        if (playlistBuilder_ == null) {
          return playlist_.get(index);  } else {
          return playlistBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public java.util.List<? extends NetMgrMsg.PlayListStatisticOrBuilder> 
           getPlaylistOrBuilderList() {
        if (playlistBuilder_ != null) {
          return playlistBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playlist_);
        }
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public NetMgrMsg.PlayListStatistic.Builder addPlaylistBuilder() {
        return getPlaylistFieldBuilder().addBuilder(
            NetMgrMsg.PlayListStatistic.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public NetMgrMsg.PlayListStatistic.Builder addPlaylistBuilder(
          int index) {
        return getPlaylistFieldBuilder().addBuilder(
            index, NetMgrMsg.PlayListStatistic.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayListStatistic playlist = 2;</code>
       */
      public java.util.List<NetMgrMsg.PlayListStatistic.Builder> 
           getPlaylistBuilderList() {
        return getPlaylistFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          NetMgrMsg.PlayListStatistic, NetMgrMsg.PlayListStatistic.Builder, NetMgrMsg.PlayListStatisticOrBuilder> 
          getPlaylistFieldBuilder() {
        if (playlistBuilder_ == null) {
          playlistBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              NetMgrMsg.PlayListStatistic, NetMgrMsg.PlayListStatistic.Builder, NetMgrMsg.PlayListStatisticOrBuilder>(
                  playlist_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          playlist_ = null;
        }
        return playlistBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CPlayStatistic)
    }

    // @@protoc_insertion_point(class_scope:CPlayStatistic)
    private static final NetMgrMsg.CPlayStatistic DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.CPlayStatistic();
    }

    public static NetMgrMsg.CPlayStatistic getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CPlayStatistic>
        PARSER = new com.google.protobuf.AbstractParser<CPlayStatistic>() {
      @java.lang.Override
      public CPlayStatistic parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CPlayStatistic(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CPlayStatistic> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CPlayStatistic> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.CPlayStatistic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HPlayStatisticOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HPlayStatistic)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>required .StatisticOptEnum opt = 2;</code>
     */
    boolean hasOpt();
    /**
     * <code>required .StatisticOptEnum opt = 2;</code>
     */
    NetMgrDefine.StatisticOptEnum getOpt();
  }
  /**
   * <pre>
   * 0x62
   * </pre>
   *
   * Protobuf type {@code HPlayStatistic}
   */
  public  static final class HPlayStatistic extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HPlayStatistic)
      HPlayStatisticOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HPlayStatistic.newBuilder() to construct.
    private HPlayStatistic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HPlayStatistic() {
      type_ = 0;
      opt_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HPlayStatistic(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              NetMgrDefine.StatisticOptEnum value = NetMgrDefine.StatisticOptEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                opt_ = rawValue;
              }
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMgrMsg.internal_static_HPlayStatistic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMgrMsg.internal_static_HPlayStatistic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetMgrMsg.HPlayStatistic.class, NetMgrMsg.HPlayStatistic.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int OPT_FIELD_NUMBER = 2;
    private int opt_;
    /**
     * <code>required .StatisticOptEnum opt = 2;</code>
     */
    public boolean hasOpt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .StatisticOptEnum opt = 2;</code>
     */
    public NetMgrDefine.StatisticOptEnum getOpt() {
      @SuppressWarnings("deprecation")
      NetMgrDefine.StatisticOptEnum result = NetMgrDefine.StatisticOptEnum.valueOf(opt_);
      return result == null ? NetMgrDefine.StatisticOptEnum.INVALID_StaOpt : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, opt_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, opt_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof NetMgrMsg.HPlayStatistic)) {
        return super.equals(obj);
      }
      NetMgrMsg.HPlayStatistic other = (NetMgrMsg.HPlayStatistic) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && (hasOpt() == other.hasOpt());
      if (hasOpt()) {
        result = result && opt_ == other.opt_;
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      if (hasOpt()) {
        hash = (37 * hash) + OPT_FIELD_NUMBER;
        hash = (53 * hash) + opt_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NetMgrMsg.HPlayStatistic parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HPlayStatistic parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HPlayStatistic parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NetMgrMsg.HPlayStatistic parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(NetMgrMsg.HPlayStatistic prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 0x62
     * </pre>
     *
     * Protobuf type {@code HPlayStatistic}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HPlayStatistic)
        NetMgrMsg.HPlayStatisticOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NetMgrMsg.internal_static_HPlayStatistic_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NetMgrMsg.internal_static_HPlayStatistic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NetMgrMsg.HPlayStatistic.class, NetMgrMsg.HPlayStatistic.Builder.class);
      }

      // Construct using NetMgrMsg.HPlayStatistic.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opt_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NetMgrMsg.internal_static_HPlayStatistic_descriptor;
      }

      @java.lang.Override
      public NetMgrMsg.HPlayStatistic getDefaultInstanceForType() {
        return NetMgrMsg.HPlayStatistic.getDefaultInstance();
      }

      @java.lang.Override
      public NetMgrMsg.HPlayStatistic build() {
        NetMgrMsg.HPlayStatistic result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NetMgrMsg.HPlayStatistic buildPartial() {
        NetMgrMsg.HPlayStatistic result = new NetMgrMsg.HPlayStatistic(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opt_ = opt_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NetMgrMsg.HPlayStatistic) {
          return mergeFrom((NetMgrMsg.HPlayStatistic)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NetMgrMsg.HPlayStatistic other) {
        if (other == NetMgrMsg.HPlayStatistic.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasOpt()) {
          setOpt(other.getOpt());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        if (!hasOpt()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        NetMgrMsg.HPlayStatistic parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NetMgrMsg.HPlayStatistic) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int opt_ = 0;
      /**
       * <code>required .StatisticOptEnum opt = 2;</code>
       */
      public boolean hasOpt() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .StatisticOptEnum opt = 2;</code>
       */
      public NetMgrDefine.StatisticOptEnum getOpt() {
        @SuppressWarnings("deprecation")
        NetMgrDefine.StatisticOptEnum result = NetMgrDefine.StatisticOptEnum.valueOf(opt_);
        return result == null ? NetMgrDefine.StatisticOptEnum.INVALID_StaOpt : result;
      }
      /**
       * <code>required .StatisticOptEnum opt = 2;</code>
       */
      public Builder setOpt(NetMgrDefine.StatisticOptEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        opt_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .StatisticOptEnum opt = 2;</code>
       */
      public Builder clearOpt() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opt_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HPlayStatistic)
    }

    // @@protoc_insertion_point(class_scope:HPlayStatistic)
    private static final NetMgrMsg.HPlayStatistic DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NetMgrMsg.HPlayStatistic();
    }

    public static NetMgrMsg.HPlayStatistic getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HPlayStatistic>
        PARSER = new com.google.protobuf.AbstractParser<HPlayStatistic>() {
      @java.lang.Override
      public HPlayStatistic parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HPlayStatistic(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HPlayStatistic> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HPlayStatistic> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NetMgrMsg.HPlayStatistic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HMulticast_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HMulticast_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMulticast_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMulticast_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CHeartBeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CHeartBeat_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HNetSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HNetSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HDecoderSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HDecoderSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HSeederSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HSeederSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HCommonSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HCommonSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CCommonSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CCommonSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MediaResouce_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MediaResouce_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HMediaSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HMediaSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMediaSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMediaSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HDispSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HDispSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HPlayListSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HPlayListSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CPlayListSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CPlayListSetting_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MediaStatistic_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MediaStatistic_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayListStatistic_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayListStatistic_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CPlayStatistic_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CPlayStatistic_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HPlayStatistic_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HPlayStatistic_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017NetMgrMsg.proto\032\022NetMgrDefine.proto\"c\n" +
      "\nHMulticast\022\020\n\010serverIp\030\001 \002(\t\022\022\n\nserverP" +
      "ort\030\002 \002(\005\022\036\n\003opt\030\003 \002(\0162\021.MulticastOptEnu" +
      "m\022\017\n\007content\030\004 \002(\005\"\227\001\n\nCMulticast\022\n\n\002ip\030" +
      "\001 \002(\t\022\013\n\003mac\030\002 \002(\t\022\014\n\004type\030\003 \002(\005\022\020\n\010iden" +
      "tify\030\004 \002(\t\022\020\n\010diskFree\030\005 \002(\005\022\016\n\006verApp\030\006" +
      " \001(\t\022\r\n\005verUi\030\007 \001(\t\022\016\n\006ipEth1\030\010 \001(\t\022\017\n\007m" +
      "acEth1\030\t \001(\t\"\227\001\n\nCHeartBeat\022\n\n\002ip\030\001 \002(\t\022" +
      "\013\n\003mac\030\002 \002(\t\022\014\n\004type\030\003 \002(\005\022\020\n\010identify\030\004" +
      " \002(\t\022\020\n\010diskFree\030\005 \002(\005\022\016\n\006verApp\030\006 \001(\t\022\r" +
      "\n\005verUi\030\007 \001(\t\022\016\n\006ipEth1\030\010 \001(\t\022\017\n\007macEth1" +
      "\030\t \001(\t\"\257\002\n\013HNetSetting\022\014\n\004type\030\001 \002(\005\022\020\n\010" +
      "serverIp\030\002 \001(\t\022\026\n\nserverPort\030\003 \001(\005:\002-2\022\025" +
      "\n\rserverIpSpare\030\004 \001(\t\022\033\n\017serverPortSpare" +
      "\030\005 \001(\005:\002-2\022\024\n\014clientIpEth0\030\006 \001(\t\022\026\n\016clie" +
      "ntMaskEth0\030\007 \001(\t\022\024\n\014clientGwEth0\030\010 \001(\t\022\025" +
      "\n\rclientDnsEth0\030\t \001(\t\022\024\n\014clientIpEth1\030\n " +
      "\001(\t\022\026\n\016clientMaskEth1\030\013 \001(\t\022\024\n\014clientGwE" +
      "th1\030\014 \001(\t\022\025\n\rclientDnsEth1\030\r \001(\t\"\301\001\n\017HDe" +
      "coderSetting\022\014\n\004type\030\001 \002(\005\022\022\n\006volume\030\002 \001" +
      "(\005:\002-2\022\020\n\010playCtrl\030\003 \001(\t\022\020\n\010position\030\004 \001" +
      "(\t\022\030\n\020masterStreamAddr\030\005 \001(\t\022\027\n\017spareStr" +
      "eamAddr\030\006 \001(\t\022\022\n\006switch\030\007 \001(\005:\002-2\022!\n\nloc" +
      "alMedia\030\010 \003(\0132\r.MediaResouce\"\204\002\n\016HSeeder" +
      "Setting\022\014\n\004type\030\001 \002(\005\022\024\n\010isMaster\030\002 \001(\005:" +
      "\002-2\022\017\n\007spareIp\030\003 \001(\t\022\025\n\tsparePort\030\004 \001(\005:" +
      "\002-2\022\030\n\014isAutoSwitch\030\005 \001(\005:\002-2\022\022\n\006isLive\030" +
      "\006 \001(\005:\002-2\022\026\n\016recvStreamAddr\030\007 \001(\t\022\031\n\rrec" +
      "vStreamPhy\030\010 \001(\005:\002-2\022\026\n\016sendStreamAddr\030\t" +
      " \001(\t\022\031\n\rsendStreamPhy\030\n \001(\005:\002-2\022\022\n\006switc" +
      "h\030\013 \001(\005:\002-2\"\373\001\n\016HCommonSetting\022\014\n\004type\030\001" +
      " \002(\005\022\020\n\010identify\030\002 \001(\t\022\024\n\010blOption\030\003 \001(\005" +
      ":\002-2\022\025\n\tbacklight\030\004 \001(\005:\002-2\022\r\n\005gamma\030\005 \001" +
      "(\t\022%\n\013loggerLevel\030\006 \001(\0162\020.LoggerLevelEnu" +
      "m\022\026\n\nthemeStyle\030\007 \001(\005:\002-2\022 \n\ndevCtrlOpt\030" +
      "\010 \001(\0162\014.DevCtrlEnum\022\026\n\016devCtrlContent\030\t " +
      "\001(\t\022\024\n\010rotation\030\n \001(\005:\002-2\"m\n\016CCommonSett" +
      "ing\022\020\n\010identify\030\001 \002(\t\022 \n\ndevCtrlOpt\030\010 \002(" +
      "\0162\014.DevCtrlEnum\022\027\n\017feedBackContent\030\002 \001(\t" +
      "\022\016\n\006status\030\003 \002(\005\"c\n\014MediaResouce\022!\n\tmedi" +
      "aType\030\001 \002(\0162\016.MediaTypeEnum\022\014\n\004name\030\002 \002(" +
      "\t\022\014\n\004size\030\003 \001(\t\022\024\n\010cycleNum\030\004 \001(\005:\002-2\"r\n" +
      "\rHMediaSetting\022\014\n\004type\030\001 \002(\005\022\032\n\003opt\030\002 \002(" +
      "\0162\r.MediaOptEnum\022\034\n\005media\030\003 \003(\0132\r.MediaR" +
      "esouce\022\031\n\021mediaServerPrefix\030\004 \001(\t\"s\n\rCMe" +
      "diaSetting\022\020\n\010identify\030\001 \002(\t\022\032\n\003opt\030\002 \002(" +
      "\0162\r.MediaOptEnum\022$\n\rfeedBackMedia\030\003 \003(\0132" +
      "\r.MediaResouce\022\016\n\006status\030\004 \002(\005\"\351\001\n\014HDisp" +
      "Setting\022\014\n\004type\030\001 \002(\005\022\024\n\010textType\030\002 \001(\005:" +
      "\002-2\022\025\n\ttextColor\030\003 \001(\005:\002-2\022\024\n\010textSize\030\004" +
      " \001(\005:\002-2\022\020\n\010textFont\030\005 \001(\t\022\025\n\ttextSpeed\030" +
      "\006 \001(\005:\002-2\022\023\n\007picType\030\007 \001(\005:\002-2\022\027\n\013picDis" +
      "pTime\030\010 \001(\005:\002-2\022\031\n\rvideoPlayTime\030\t \001(\005:\002" +
      "-2\022\026\n\016videoPlayStyle\030\n \001(\t\"P\n\020HPlayListS" +
      "etting\022\014\n\004type\030\001 \002(\005\022\035\n\003opt\030\002 \002(\0162\020.Play" +
      "ListOptEnum\022\017\n\007content\030\003 \003(\t\"d\n\020CPlayLis" +
      "tSetting\022\020\n\010identify\030\001 \002(\t\022\035\n\003opt\030\002 \002(\0162" +
      "\020.PlayListOptEnum\022\017\n\007content\030\003 \003(\t\022\016\n\006st" +
      "atus\030\004 \002(\005\"-\n\016MediaStatistic\022\014\n\004name\030\001 \002" +
      "(\t\022\r\n\005count\030\002 \002(\005\"P\n\021PlayListStatistic\022\014" +
      "\n\004name\030\001 \002(\t\022\r\n\005count\030\002 \002(\005\022\036\n\005media\030\003 \003" +
      "(\0132\017.MediaStatistic\"H\n\016CPlayStatistic\022\020\n" +
      "\010identify\030\001 \002(\t\022$\n\010playlist\030\002 \003(\0132\022.Play" +
      "ListStatistic\">\n\016HPlayStatistic\022\014\n\004type\030" +
      "\001 \002(\005\022\036\n\003opt\030\002 \002(\0162\021.StatisticOptEnum"
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
          NetMgrDefine.getDescriptor(),
        }, assigner);
    internal_static_HMulticast_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HMulticast_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HMulticast_descriptor,
        new java.lang.String[] { "ServerIp", "ServerPort", "Opt", "Content", });
    internal_static_CMulticast_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CMulticast_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMulticast_descriptor,
        new java.lang.String[] { "Ip", "Mac", "Type", "Identify", "DiskFree", "VerApp", "VerUi", "IpEth1", "MacEth1", });
    internal_static_CHeartBeat_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CHeartBeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CHeartBeat_descriptor,
        new java.lang.String[] { "Ip", "Mac", "Type", "Identify", "DiskFree", "VerApp", "VerUi", "IpEth1", "MacEth1", });
    internal_static_HNetSetting_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_HNetSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HNetSetting_descriptor,
        new java.lang.String[] { "Type", "ServerIp", "ServerPort", "ServerIpSpare", "ServerPortSpare", "ClientIpEth0", "ClientMaskEth0", "ClientGwEth0", "ClientDnsEth0", "ClientIpEth1", "ClientMaskEth1", "ClientGwEth1", "ClientDnsEth1", });
    internal_static_HDecoderSetting_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_HDecoderSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HDecoderSetting_descriptor,
        new java.lang.String[] { "Type", "Volume", "PlayCtrl", "Position", "MasterStreamAddr", "SpareStreamAddr", "Switch", "LocalMedia", });
    internal_static_HSeederSetting_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_HSeederSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HSeederSetting_descriptor,
        new java.lang.String[] { "Type", "IsMaster", "SpareIp", "SparePort", "IsAutoSwitch", "IsLive", "RecvStreamAddr", "RecvStreamPhy", "SendStreamAddr", "SendStreamPhy", "Switch", });
    internal_static_HCommonSetting_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_HCommonSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HCommonSetting_descriptor,
        new java.lang.String[] { "Type", "Identify", "BlOption", "Backlight", "Gamma", "LoggerLevel", "ThemeStyle", "DevCtrlOpt", "DevCtrlContent", "Rotation", });
    internal_static_CCommonSetting_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CCommonSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CCommonSetting_descriptor,
        new java.lang.String[] { "Identify", "DevCtrlOpt", "FeedBackContent", "Status", });
    internal_static_MediaResouce_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_MediaResouce_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MediaResouce_descriptor,
        new java.lang.String[] { "MediaType", "Name", "Size", "CycleNum", });
    internal_static_HMediaSetting_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_HMediaSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HMediaSetting_descriptor,
        new java.lang.String[] { "Type", "Opt", "Media", "MediaServerPrefix", });
    internal_static_CMediaSetting_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_CMediaSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMediaSetting_descriptor,
        new java.lang.String[] { "Identify", "Opt", "FeedBackMedia", "Status", });
    internal_static_HDispSetting_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_HDispSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HDispSetting_descriptor,
        new java.lang.String[] { "Type", "TextType", "TextColor", "TextSize", "TextFont", "TextSpeed", "PicType", "PicDispTime", "VideoPlayTime", "VideoPlayStyle", });
    internal_static_HPlayListSetting_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_HPlayListSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HPlayListSetting_descriptor,
        new java.lang.String[] { "Type", "Opt", "Content", });
    internal_static_CPlayListSetting_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_CPlayListSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CPlayListSetting_descriptor,
        new java.lang.String[] { "Identify", "Opt", "Content", "Status", });
    internal_static_MediaStatistic_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_MediaStatistic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MediaStatistic_descriptor,
        new java.lang.String[] { "Name", "Count", });
    internal_static_PlayListStatistic_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_PlayListStatistic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayListStatistic_descriptor,
        new java.lang.String[] { "Name", "Count", "Media", });
    internal_static_CPlayStatistic_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_CPlayStatistic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CPlayStatistic_descriptor,
        new java.lang.String[] { "Identify", "Playlist", });
    internal_static_HPlayStatistic_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_HPlayStatistic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HPlayStatistic_descriptor,
        new java.lang.String[] { "Type", "Opt", });
    NetMgrDefine.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

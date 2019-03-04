// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sennotech/sennofit/insole/app/proto/stock.proto

package com.sennotech.sennofit.insole.app.stock.generated;

/**
 * Protobuf type {@code insole.app.stock.StockResponse}
 */
public  final class StockResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:insole.app.stock.StockResponse)
    StockResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StockResponse.newBuilder() to construct.
  private StockResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StockResponse() {
    stock_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StockResponse(
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

            stock_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.sennotech.sennofit.insole.app.stock.generated.Stock.internal_static_insole_app_stock_StockResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sennotech.sennofit.insole.app.stock.generated.Stock.internal_static_insole_app_stock_StockResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sennotech.sennofit.insole.app.stock.generated.StockResponse.class, com.sennotech.sennofit.insole.app.stock.generated.StockResponse.Builder.class);
  }

  public static final int STOCK_FIELD_NUMBER = 1;
  private int stock_;
  /**
   * <code>int32 stock = 1;</code>
   */
  public int getStock() {
    return stock_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stock_ != 0) {
      output.writeInt32(1, stock_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stock_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, stock_);
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
    if (!(obj instanceof com.sennotech.sennofit.insole.app.stock.generated.StockResponse)) {
      return super.equals(obj);
    }
    com.sennotech.sennofit.insole.app.stock.generated.StockResponse other = (com.sennotech.sennofit.insole.app.stock.generated.StockResponse) obj;

    boolean result = true;
    result = result && (getStock()
        == other.getStock());
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
    hash = (37 * hash) + STOCK_FIELD_NUMBER;
    hash = (53 * hash) + getStock();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse parseFrom(
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
  public static Builder newBuilder(com.sennotech.sennofit.insole.app.stock.generated.StockResponse prototype) {
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
   * Protobuf type {@code insole.app.stock.StockResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:insole.app.stock.StockResponse)
      com.sennotech.sennofit.insole.app.stock.generated.StockResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sennotech.sennofit.insole.app.stock.generated.Stock.internal_static_insole_app_stock_StockResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sennotech.sennofit.insole.app.stock.generated.Stock.internal_static_insole_app_stock_StockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sennotech.sennofit.insole.app.stock.generated.StockResponse.class, com.sennotech.sennofit.insole.app.stock.generated.StockResponse.Builder.class);
    }

    // Construct using com.sennotech.sennofit.insole.app.stock.generated.StockResponse.newBuilder()
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
      stock_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sennotech.sennofit.insole.app.stock.generated.Stock.internal_static_insole_app_stock_StockResponse_descriptor;
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.stock.generated.StockResponse getDefaultInstanceForType() {
      return com.sennotech.sennofit.insole.app.stock.generated.StockResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.stock.generated.StockResponse build() {
      com.sennotech.sennofit.insole.app.stock.generated.StockResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.stock.generated.StockResponse buildPartial() {
      com.sennotech.sennofit.insole.app.stock.generated.StockResponse result = new com.sennotech.sennofit.insole.app.stock.generated.StockResponse(this);
      result.stock_ = stock_;
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
      if (other instanceof com.sennotech.sennofit.insole.app.stock.generated.StockResponse) {
        return mergeFrom((com.sennotech.sennofit.insole.app.stock.generated.StockResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sennotech.sennofit.insole.app.stock.generated.StockResponse other) {
      if (other == com.sennotech.sennofit.insole.app.stock.generated.StockResponse.getDefaultInstance()) return this;
      if (other.getStock() != 0) {
        setStock(other.getStock());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sennotech.sennofit.insole.app.stock.generated.StockResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sennotech.sennofit.insole.app.stock.generated.StockResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int stock_ ;
    /**
     * <code>int32 stock = 1;</code>
     */
    public int getStock() {
      return stock_;
    }
    /**
     * <code>int32 stock = 1;</code>
     */
    public Builder setStock(int value) {
      
      stock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 stock = 1;</code>
     */
    public Builder clearStock() {
      
      stock_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:insole.app.stock.StockResponse)
  }

  // @@protoc_insertion_point(class_scope:insole.app.stock.StockResponse)
  private static final com.sennotech.sennofit.insole.app.stock.generated.StockResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sennotech.sennofit.insole.app.stock.generated.StockResponse();
  }

  public static com.sennotech.sennofit.insole.app.stock.generated.StockResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StockResponse>
      PARSER = new com.google.protobuf.AbstractParser<StockResponse>() {
    @java.lang.Override
    public StockResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StockResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StockResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StockResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sennotech.sennofit.insole.app.stock.generated.StockResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


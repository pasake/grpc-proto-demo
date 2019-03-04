// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sennotech/sennofit/insole/app/proto/sku.proto

package com.sennotech.sennofit.insole.app.sku.generated;

/**
 * Protobuf type {@code insole.app.sku.SkuDetail}
 */
public  final class SkuDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:insole.app.sku.SkuDetail)
    SkuDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkuDetail.newBuilder() to construct.
  private SkuDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkuDetail() {
    skuName_ = "";
    picUrl_ = "";
    oriPrice_ = 0;
    curPrice_ = 0;
    id_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SkuDetail(
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
            java.lang.String s = input.readStringRequireUtf8();

            skuName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            picUrl_ = s;
            break;
          }
          case 24: {

            oriPrice_ = input.readInt32();
            break;
          }
          case 32: {

            curPrice_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 50: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (desc_ != null) {
              subBuilder = desc_.toBuilder();
            }
            desc_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(desc_);
              desc_ = subBuilder.buildPartial();
            }

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
    return com.sennotech.sennofit.insole.app.sku.generated.Sku.internal_static_insole_app_sku_SkuDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sennotech.sennofit.insole.app.sku.generated.Sku.internal_static_insole_app_sku_SkuDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.class, com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.Builder.class);
  }

  public static final int SKUNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object skuName_;
  /**
   * <code>string skuName = 1;</code>
   */
  public java.lang.String getSkuName() {
    java.lang.Object ref = skuName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuName_ = s;
      return s;
    }
  }
  /**
   * <code>string skuName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSkuNameBytes() {
    java.lang.Object ref = skuName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skuName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PICURL_FIELD_NUMBER = 2;
  private volatile java.lang.Object picUrl_;
  /**
   * <code>string picUrl = 2;</code>
   */
  public java.lang.String getPicUrl() {
    java.lang.Object ref = picUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      picUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string picUrl = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPicUrlBytes() {
    java.lang.Object ref = picUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      picUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORIPRICE_FIELD_NUMBER = 3;
  private int oriPrice_;
  /**
   * <code>int32 oriPrice = 3;</code>
   */
  public int getOriPrice() {
    return oriPrice_;
  }

  public static final int CURPRICE_FIELD_NUMBER = 4;
  private int curPrice_;
  /**
   * <code>int32 curPrice = 4;</code>
   */
  public int getCurPrice() {
    return curPrice_;
  }

  public static final int ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 5;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 5;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESC_FIELD_NUMBER = 6;
  private com.google.protobuf.StringValue desc_;
  /**
   * <code>.google.protobuf.StringValue desc = 6;</code>
   */
  public boolean hasDesc() {
    return desc_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue desc = 6;</code>
   */
  public com.google.protobuf.StringValue getDesc() {
    return desc_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : desc_;
  }
  /**
   * <code>.google.protobuf.StringValue desc = 6;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getDescOrBuilder() {
    return getDesc();
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
    if (!getSkuNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skuName_);
    }
    if (!getPicUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, picUrl_);
    }
    if (oriPrice_ != 0) {
      output.writeInt32(3, oriPrice_);
    }
    if (curPrice_ != 0) {
      output.writeInt32(4, curPrice_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, id_);
    }
    if (desc_ != null) {
      output.writeMessage(6, getDesc());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSkuNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skuName_);
    }
    if (!getPicUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, picUrl_);
    }
    if (oriPrice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, oriPrice_);
    }
    if (curPrice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, curPrice_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, id_);
    }
    if (desc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getDesc());
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
    if (!(obj instanceof com.sennotech.sennofit.insole.app.sku.generated.SkuDetail)) {
      return super.equals(obj);
    }
    com.sennotech.sennofit.insole.app.sku.generated.SkuDetail other = (com.sennotech.sennofit.insole.app.sku.generated.SkuDetail) obj;

    boolean result = true;
    result = result && getSkuName()
        .equals(other.getSkuName());
    result = result && getPicUrl()
        .equals(other.getPicUrl());
    result = result && (getOriPrice()
        == other.getOriPrice());
    result = result && (getCurPrice()
        == other.getCurPrice());
    result = result && getId()
        .equals(other.getId());
    result = result && (hasDesc() == other.hasDesc());
    if (hasDesc()) {
      result = result && getDesc()
          .equals(other.getDesc());
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
    hash = (37 * hash) + SKUNAME_FIELD_NUMBER;
    hash = (53 * hash) + getSkuName().hashCode();
    hash = (37 * hash) + PICURL_FIELD_NUMBER;
    hash = (53 * hash) + getPicUrl().hashCode();
    hash = (37 * hash) + ORIPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getOriPrice();
    hash = (37 * hash) + CURPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getCurPrice();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasDesc()) {
      hash = (37 * hash) + DESC_FIELD_NUMBER;
      hash = (53 * hash) + getDesc().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parseFrom(
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
  public static Builder newBuilder(com.sennotech.sennofit.insole.app.sku.generated.SkuDetail prototype) {
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
   * Protobuf type {@code insole.app.sku.SkuDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:insole.app.sku.SkuDetail)
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sennotech.sennofit.insole.app.sku.generated.Sku.internal_static_insole_app_sku_SkuDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sennotech.sennofit.insole.app.sku.generated.Sku.internal_static_insole_app_sku_SkuDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.class, com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.Builder.class);
    }

    // Construct using com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.newBuilder()
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
      skuName_ = "";

      picUrl_ = "";

      oriPrice_ = 0;

      curPrice_ = 0;

      id_ = "";

      if (descBuilder_ == null) {
        desc_ = null;
      } else {
        desc_ = null;
        descBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sennotech.sennofit.insole.app.sku.generated.Sku.internal_static_insole_app_sku_SkuDetail_descriptor;
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.sku.generated.SkuDetail getDefaultInstanceForType() {
      return com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.sku.generated.SkuDetail build() {
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.sku.generated.SkuDetail buildPartial() {
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetail result = new com.sennotech.sennofit.insole.app.sku.generated.SkuDetail(this);
      result.skuName_ = skuName_;
      result.picUrl_ = picUrl_;
      result.oriPrice_ = oriPrice_;
      result.curPrice_ = curPrice_;
      result.id_ = id_;
      if (descBuilder_ == null) {
        result.desc_ = desc_;
      } else {
        result.desc_ = descBuilder_.build();
      }
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
      if (other instanceof com.sennotech.sennofit.insole.app.sku.generated.SkuDetail) {
        return mergeFrom((com.sennotech.sennofit.insole.app.sku.generated.SkuDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sennotech.sennofit.insole.app.sku.generated.SkuDetail other) {
      if (other == com.sennotech.sennofit.insole.app.sku.generated.SkuDetail.getDefaultInstance()) return this;
      if (!other.getSkuName().isEmpty()) {
        skuName_ = other.skuName_;
        onChanged();
      }
      if (!other.getPicUrl().isEmpty()) {
        picUrl_ = other.picUrl_;
        onChanged();
      }
      if (other.getOriPrice() != 0) {
        setOriPrice(other.getOriPrice());
      }
      if (other.getCurPrice() != 0) {
        setCurPrice(other.getCurPrice());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasDesc()) {
        mergeDesc(other.getDesc());
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
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sennotech.sennofit.insole.app.sku.generated.SkuDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object skuName_ = "";
    /**
     * <code>string skuName = 1;</code>
     */
    public java.lang.String getSkuName() {
      java.lang.Object ref = skuName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string skuName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSkuNameBytes() {
      java.lang.Object ref = skuName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skuName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string skuName = 1;</code>
     */
    public Builder setSkuName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skuName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string skuName = 1;</code>
     */
    public Builder clearSkuName() {
      
      skuName_ = getDefaultInstance().getSkuName();
      onChanged();
      return this;
    }
    /**
     * <code>string skuName = 1;</code>
     */
    public Builder setSkuNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skuName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object picUrl_ = "";
    /**
     * <code>string picUrl = 2;</code>
     */
    public java.lang.String getPicUrl() {
      java.lang.Object ref = picUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        picUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string picUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPicUrlBytes() {
      java.lang.Object ref = picUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        picUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string picUrl = 2;</code>
     */
    public Builder setPicUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      picUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string picUrl = 2;</code>
     */
    public Builder clearPicUrl() {
      
      picUrl_ = getDefaultInstance().getPicUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string picUrl = 2;</code>
     */
    public Builder setPicUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      picUrl_ = value;
      onChanged();
      return this;
    }

    private int oriPrice_ ;
    /**
     * <code>int32 oriPrice = 3;</code>
     */
    public int getOriPrice() {
      return oriPrice_;
    }
    /**
     * <code>int32 oriPrice = 3;</code>
     */
    public Builder setOriPrice(int value) {
      
      oriPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 oriPrice = 3;</code>
     */
    public Builder clearOriPrice() {
      
      oriPrice_ = 0;
      onChanged();
      return this;
    }

    private int curPrice_ ;
    /**
     * <code>int32 curPrice = 4;</code>
     */
    public int getCurPrice() {
      return curPrice_;
    }
    /**
     * <code>int32 curPrice = 4;</code>
     */
    public Builder setCurPrice(int value) {
      
      curPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 curPrice = 4;</code>
     */
    public Builder clearCurPrice() {
      
      curPrice_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 5;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 5;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 5;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 5;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 5;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue desc_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> descBuilder_;
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public boolean hasDesc() {
      return descBuilder_ != null || desc_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public com.google.protobuf.StringValue getDesc() {
      if (descBuilder_ == null) {
        return desc_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : desc_;
      } else {
        return descBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public Builder setDesc(com.google.protobuf.StringValue value) {
      if (descBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        desc_ = value;
        onChanged();
      } else {
        descBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public Builder setDesc(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (descBuilder_ == null) {
        desc_ = builderForValue.build();
        onChanged();
      } else {
        descBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public Builder mergeDesc(com.google.protobuf.StringValue value) {
      if (descBuilder_ == null) {
        if (desc_ != null) {
          desc_ =
            com.google.protobuf.StringValue.newBuilder(desc_).mergeFrom(value).buildPartial();
        } else {
          desc_ = value;
        }
        onChanged();
      } else {
        descBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public Builder clearDesc() {
      if (descBuilder_ == null) {
        desc_ = null;
        onChanged();
      } else {
        desc_ = null;
        descBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescBuilder() {
      
      onChanged();
      return getDescFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescOrBuilder() {
      if (descBuilder_ != null) {
        return descBuilder_.getMessageOrBuilder();
      } else {
        return desc_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : desc_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue desc = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescFieldBuilder() {
      if (descBuilder_ == null) {
        descBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDesc(),
                getParentForChildren(),
                isClean());
        desc_ = null;
      }
      return descBuilder_;
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


    // @@protoc_insertion_point(builder_scope:insole.app.sku.SkuDetail)
  }

  // @@protoc_insertion_point(class_scope:insole.app.sku.SkuDetail)
  private static final com.sennotech.sennofit.insole.app.sku.generated.SkuDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sennotech.sennofit.insole.app.sku.generated.SkuDetail();
  }

  public static com.sennotech.sennofit.insole.app.sku.generated.SkuDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkuDetail>
      PARSER = new com.google.protobuf.AbstractParser<SkuDetail>() {
    @java.lang.Override
    public SkuDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SkuDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SkuDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkuDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sennotech.sennofit.insole.app.sku.generated.SkuDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sennotech/sennofit/insole/app/proto/order.proto

package com.sennotech.sennofit.insole.app.order.generated;

/**
 * Protobuf type {@code insole.app.order.AddressDetail}
 */
public  final class AddressDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:insole.app.order.AddressDetail)
    AddressDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressDetail.newBuilder() to construct.
  private AddressDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressDetail() {
    gender_ = "";
    shippingAddress_ = "";
    customerName_ = "";
    customerPhone_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressDetail(
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

            gender_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            shippingAddress_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            customerName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            customerPhone_ = s;
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
    return com.sennotech.sennofit.insole.app.order.generated.Order.internal_static_insole_app_order_AddressDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sennotech.sennofit.insole.app.order.generated.Order.internal_static_insole_app_order_AddressDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sennotech.sennofit.insole.app.order.generated.AddressDetail.class, com.sennotech.sennofit.insole.app.order.generated.AddressDetail.Builder.class);
  }

  public static final int GENDER_FIELD_NUMBER = 1;
  private volatile java.lang.Object gender_;
  /**
   * <code>string gender = 1;</code>
   */
  public java.lang.String getGender() {
    java.lang.Object ref = gender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gender_ = s;
      return s;
    }
  }
  /**
   * <code>string gender = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGenderBytes() {
    java.lang.Object ref = gender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHIPPINGADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object shippingAddress_;
  /**
   * <code>string shippingAddress = 2;</code>
   */
  public java.lang.String getShippingAddress() {
    java.lang.Object ref = shippingAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shippingAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string shippingAddress = 2;</code>
   */
  public com.google.protobuf.ByteString
      getShippingAddressBytes() {
    java.lang.Object ref = shippingAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shippingAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMERNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object customerName_;
  /**
   * <code>string customerName = 3;</code>
   */
  public java.lang.String getCustomerName() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerName_ = s;
      return s;
    }
  }
  /**
   * <code>string customerName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerNameBytes() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMERPHONE_FIELD_NUMBER = 4;
  private volatile java.lang.Object customerPhone_;
  /**
   * <code>string customerPhone = 4;</code>
   */
  public java.lang.String getCustomerPhone() {
    java.lang.Object ref = customerPhone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerPhone_ = s;
      return s;
    }
  }
  /**
   * <code>string customerPhone = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerPhoneBytes() {
    java.lang.Object ref = customerPhone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerPhone_ = b;
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

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getGenderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gender_);
    }
    if (!getShippingAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, shippingAddress_);
    }
    if (!getCustomerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerName_);
    }
    if (!getCustomerPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, customerPhone_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGenderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gender_);
    }
    if (!getShippingAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, shippingAddress_);
    }
    if (!getCustomerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customerName_);
    }
    if (!getCustomerPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, customerPhone_);
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
    if (!(obj instanceof com.sennotech.sennofit.insole.app.order.generated.AddressDetail)) {
      return super.equals(obj);
    }
    com.sennotech.sennofit.insole.app.order.generated.AddressDetail other = (com.sennotech.sennofit.insole.app.order.generated.AddressDetail) obj;

    boolean result = true;
    result = result && getGender()
        .equals(other.getGender());
    result = result && getShippingAddress()
        .equals(other.getShippingAddress());
    result = result && getCustomerName()
        .equals(other.getCustomerName());
    result = result && getCustomerPhone()
        .equals(other.getCustomerPhone());
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
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + getGender().hashCode();
    hash = (37 * hash) + SHIPPINGADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getShippingAddress().hashCode();
    hash = (37 * hash) + CUSTOMERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerName().hashCode();
    hash = (37 * hash) + CUSTOMERPHONE_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerPhone().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail parseFrom(
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
  public static Builder newBuilder(com.sennotech.sennofit.insole.app.order.generated.AddressDetail prototype) {
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
   * Protobuf type {@code insole.app.order.AddressDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:insole.app.order.AddressDetail)
      com.sennotech.sennofit.insole.app.order.generated.AddressDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sennotech.sennofit.insole.app.order.generated.Order.internal_static_insole_app_order_AddressDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sennotech.sennofit.insole.app.order.generated.Order.internal_static_insole_app_order_AddressDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sennotech.sennofit.insole.app.order.generated.AddressDetail.class, com.sennotech.sennofit.insole.app.order.generated.AddressDetail.Builder.class);
    }

    // Construct using com.sennotech.sennofit.insole.app.order.generated.AddressDetail.newBuilder()
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
      gender_ = "";

      shippingAddress_ = "";

      customerName_ = "";

      customerPhone_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sennotech.sennofit.insole.app.order.generated.Order.internal_static_insole_app_order_AddressDetail_descriptor;
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.order.generated.AddressDetail getDefaultInstanceForType() {
      return com.sennotech.sennofit.insole.app.order.generated.AddressDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.order.generated.AddressDetail build() {
      com.sennotech.sennofit.insole.app.order.generated.AddressDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sennotech.sennofit.insole.app.order.generated.AddressDetail buildPartial() {
      com.sennotech.sennofit.insole.app.order.generated.AddressDetail result = new com.sennotech.sennofit.insole.app.order.generated.AddressDetail(this);
      result.gender_ = gender_;
      result.shippingAddress_ = shippingAddress_;
      result.customerName_ = customerName_;
      result.customerPhone_ = customerPhone_;
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
      if (other instanceof com.sennotech.sennofit.insole.app.order.generated.AddressDetail) {
        return mergeFrom((com.sennotech.sennofit.insole.app.order.generated.AddressDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sennotech.sennofit.insole.app.order.generated.AddressDetail other) {
      if (other == com.sennotech.sennofit.insole.app.order.generated.AddressDetail.getDefaultInstance()) return this;
      if (!other.getGender().isEmpty()) {
        gender_ = other.gender_;
        onChanged();
      }
      if (!other.getShippingAddress().isEmpty()) {
        shippingAddress_ = other.shippingAddress_;
        onChanged();
      }
      if (!other.getCustomerName().isEmpty()) {
        customerName_ = other.customerName_;
        onChanged();
      }
      if (!other.getCustomerPhone().isEmpty()) {
        customerPhone_ = other.customerPhone_;
        onChanged();
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
      com.sennotech.sennofit.insole.app.order.generated.AddressDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sennotech.sennofit.insole.app.order.generated.AddressDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gender_ = "";
    /**
     * <code>string gender = 1;</code>
     */
    public java.lang.String getGender() {
      java.lang.Object ref = gender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gender = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGenderBytes() {
      java.lang.Object ref = gender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gender = 1;</code>
     */
    public Builder setGender(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gender = 1;</code>
     */
    public Builder clearGender() {
      
      gender_ = getDefaultInstance().getGender();
      onChanged();
      return this;
    }
    /**
     * <code>string gender = 1;</code>
     */
    public Builder setGenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gender_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object shippingAddress_ = "";
    /**
     * <code>string shippingAddress = 2;</code>
     */
    public java.lang.String getShippingAddress() {
      java.lang.Object ref = shippingAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shippingAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shippingAddress = 2;</code>
     */
    public com.google.protobuf.ByteString
        getShippingAddressBytes() {
      java.lang.Object ref = shippingAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shippingAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shippingAddress = 2;</code>
     */
    public Builder setShippingAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      shippingAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string shippingAddress = 2;</code>
     */
    public Builder clearShippingAddress() {
      
      shippingAddress_ = getDefaultInstance().getShippingAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string shippingAddress = 2;</code>
     */
    public Builder setShippingAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      shippingAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerName_ = "";
    /**
     * <code>string customerName = 3;</code>
     */
    public java.lang.String getCustomerName() {
      java.lang.Object ref = customerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerNameBytes() {
      java.lang.Object ref = customerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerName = 3;</code>
     */
    public Builder setCustomerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerName = 3;</code>
     */
    public Builder clearCustomerName() {
      
      customerName_ = getDefaultInstance().getCustomerName();
      onChanged();
      return this;
    }
    /**
     * <code>string customerName = 3;</code>
     */
    public Builder setCustomerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerPhone_ = "";
    /**
     * <code>string customerPhone = 4;</code>
     */
    public java.lang.String getCustomerPhone() {
      java.lang.Object ref = customerPhone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerPhone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerPhone = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerPhoneBytes() {
      java.lang.Object ref = customerPhone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerPhone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerPhone = 4;</code>
     */
    public Builder setCustomerPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerPhone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerPhone = 4;</code>
     */
    public Builder clearCustomerPhone() {
      
      customerPhone_ = getDefaultInstance().getCustomerPhone();
      onChanged();
      return this;
    }
    /**
     * <code>string customerPhone = 4;</code>
     */
    public Builder setCustomerPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerPhone_ = value;
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


    // @@protoc_insertion_point(builder_scope:insole.app.order.AddressDetail)
  }

  // @@protoc_insertion_point(class_scope:insole.app.order.AddressDetail)
  private static final com.sennotech.sennofit.insole.app.order.generated.AddressDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sennotech.sennofit.insole.app.order.generated.AddressDetail();
  }

  public static com.sennotech.sennofit.insole.app.order.generated.AddressDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressDetail>
      PARSER = new com.google.protobuf.AbstractParser<AddressDetail>() {
    @java.lang.Override
    public AddressDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sennotech.sennofit.insole.app.order.generated.AddressDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


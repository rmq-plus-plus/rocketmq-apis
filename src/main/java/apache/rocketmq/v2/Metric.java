// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.Metric}
 */
public final class Metric extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.Metric)
    MetricOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metric.newBuilder() to construct.
  private Metric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metric() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metric();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metric(
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

            on_ = input.readBool();
            break;
          }
          case 18: {
            apache.rocketmq.v2.Endpoints.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = metricEndpoints_.toBuilder();
            }
            metricEndpoints_ = input.readMessage(apache.rocketmq.v2.Endpoints.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metricEndpoints_);
              metricEndpoints_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_Metric_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_Metric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.Metric.class, apache.rocketmq.v2.Metric.Builder.class);
  }

  private int bitField0_;
  public static final int ON_FIELD_NUMBER = 1;
  private boolean on_;
  /**
   * <pre>
   * Indicates that if client should export local metrics to server.
   * </pre>
   *
   * <code>bool on = 1;</code>
   * @return The on.
   */
  @java.lang.Override
  public boolean getOn() {
    return on_;
  }

  public static final int METRIC_ENDPOINTS_FIELD_NUMBER = 2;
  private apache.rocketmq.v2.Endpoints metricEndpoints_;
  /**
   * <pre>
   * The endpoint that client metrics should be exported to, which is required if the switch is on.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
   * @return Whether the metricEndpoints field is set.
   */
  @java.lang.Override
  public boolean hasMetricEndpoints() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The endpoint that client metrics should be exported to, which is required if the switch is on.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
   * @return The metricEndpoints.
   */
  @java.lang.Override
  public apache.rocketmq.v2.Endpoints getMetricEndpoints() {
    return metricEndpoints_ == null ? apache.rocketmq.v2.Endpoints.getDefaultInstance() : metricEndpoints_;
  }
  /**
   * <pre>
   * The endpoint that client metrics should be exported to, which is required if the switch is on.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.EndpointsOrBuilder getMetricEndpointsOrBuilder() {
    return metricEndpoints_ == null ? apache.rocketmq.v2.Endpoints.getDefaultInstance() : metricEndpoints_;
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
    if (on_ != false) {
      output.writeBool(1, on_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMetricEndpoints());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (on_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, on_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetricEndpoints());
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
    if (!(obj instanceof apache.rocketmq.v2.Metric)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.Metric other = (apache.rocketmq.v2.Metric) obj;

    if (getOn()
        != other.getOn()) return false;
    if (hasMetricEndpoints() != other.hasMetricEndpoints()) return false;
    if (hasMetricEndpoints()) {
      if (!getMetricEndpoints()
          .equals(other.getMetricEndpoints())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOn());
    if (hasMetricEndpoints()) {
      hash = (37 * hash) + METRIC_ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricEndpoints().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.Metric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Metric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.Metric prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.Metric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.Metric)
      apache.rocketmq.v2.MetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_Metric_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_Metric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.Metric.class, apache.rocketmq.v2.Metric.Builder.class);
    }

    // Construct using apache.rocketmq.v2.Metric.newBuilder()
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
        getMetricEndpointsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      on_ = false;

      if (metricEndpointsBuilder_ == null) {
        metricEndpoints_ = null;
      } else {
        metricEndpointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_Metric_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.Metric getDefaultInstanceForType() {
      return apache.rocketmq.v2.Metric.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.Metric build() {
      apache.rocketmq.v2.Metric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.Metric buildPartial() {
      apache.rocketmq.v2.Metric result = new apache.rocketmq.v2.Metric(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.on_ = on_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (metricEndpointsBuilder_ == null) {
          result.metricEndpoints_ = metricEndpoints_;
        } else {
          result.metricEndpoints_ = metricEndpointsBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof apache.rocketmq.v2.Metric) {
        return mergeFrom((apache.rocketmq.v2.Metric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.Metric other) {
      if (other == apache.rocketmq.v2.Metric.getDefaultInstance()) return this;
      if (other.getOn() != false) {
        setOn(other.getOn());
      }
      if (other.hasMetricEndpoints()) {
        mergeMetricEndpoints(other.getMetricEndpoints());
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
      apache.rocketmq.v2.Metric parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.Metric) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean on_ ;
    /**
     * <pre>
     * Indicates that if client should export local metrics to server.
     * </pre>
     *
     * <code>bool on = 1;</code>
     * @return The on.
     */
    @java.lang.Override
    public boolean getOn() {
      return on_;
    }
    /**
     * <pre>
     * Indicates that if client should export local metrics to server.
     * </pre>
     *
     * <code>bool on = 1;</code>
     * @param value The on to set.
     * @return This builder for chaining.
     */
    public Builder setOn(boolean value) {
      
      on_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that if client should export local metrics to server.
     * </pre>
     *
     * <code>bool on = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOn() {
      
      on_ = false;
      onChanged();
      return this;
    }

    private apache.rocketmq.v2.Endpoints metricEndpoints_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Endpoints, apache.rocketmq.v2.Endpoints.Builder, apache.rocketmq.v2.EndpointsOrBuilder> metricEndpointsBuilder_;
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     * @return Whether the metricEndpoints field is set.
     */
    public boolean hasMetricEndpoints() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     * @return The metricEndpoints.
     */
    public apache.rocketmq.v2.Endpoints getMetricEndpoints() {
      if (metricEndpointsBuilder_ == null) {
        return metricEndpoints_ == null ? apache.rocketmq.v2.Endpoints.getDefaultInstance() : metricEndpoints_;
      } else {
        return metricEndpointsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    public Builder setMetricEndpoints(apache.rocketmq.v2.Endpoints value) {
      if (metricEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricEndpoints_ = value;
        onChanged();
      } else {
        metricEndpointsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    public Builder setMetricEndpoints(
        apache.rocketmq.v2.Endpoints.Builder builderForValue) {
      if (metricEndpointsBuilder_ == null) {
        metricEndpoints_ = builderForValue.build();
        onChanged();
      } else {
        metricEndpointsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    public Builder mergeMetricEndpoints(apache.rocketmq.v2.Endpoints value) {
      if (metricEndpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            metricEndpoints_ != null &&
            metricEndpoints_ != apache.rocketmq.v2.Endpoints.getDefaultInstance()) {
          metricEndpoints_ =
            apache.rocketmq.v2.Endpoints.newBuilder(metricEndpoints_).mergeFrom(value).buildPartial();
        } else {
          metricEndpoints_ = value;
        }
        onChanged();
      } else {
        metricEndpointsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    public Builder clearMetricEndpoints() {
      if (metricEndpointsBuilder_ == null) {
        metricEndpoints_ = null;
        onChanged();
      } else {
        metricEndpointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    public apache.rocketmq.v2.Endpoints.Builder getMetricEndpointsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetricEndpointsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    public apache.rocketmq.v2.EndpointsOrBuilder getMetricEndpointsOrBuilder() {
      if (metricEndpointsBuilder_ != null) {
        return metricEndpointsBuilder_.getMessageOrBuilder();
      } else {
        return metricEndpoints_ == null ?
            apache.rocketmq.v2.Endpoints.getDefaultInstance() : metricEndpoints_;
      }
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints metric_endpoints = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Endpoints, apache.rocketmq.v2.Endpoints.Builder, apache.rocketmq.v2.EndpointsOrBuilder> 
        getMetricEndpointsFieldBuilder() {
      if (metricEndpointsBuilder_ == null) {
        metricEndpointsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.Endpoints, apache.rocketmq.v2.Endpoints.Builder, apache.rocketmq.v2.EndpointsOrBuilder>(
                getMetricEndpoints(),
                getParentForChildren(),
                isClean());
        metricEndpoints_ = null;
      }
      return metricEndpointsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.Metric)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.Metric)
  private static final apache.rocketmq.v2.Metric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.Metric();
  }

  public static apache.rocketmq.v2.Metric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metric>
      PARSER = new com.google.protobuf.AbstractParser<Metric>() {
    @java.lang.Override
    public Metric parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metric(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metric> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.Metric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


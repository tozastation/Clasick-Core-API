// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: music_rpc.proto

package com.github.tozastation.clasickcoreapi.grpc;

/**
 * Protobuf type {@code music.ResponseGetAllAlbumsFromGenre}
 */
public  final class ResponseGetAllAlbumsFromGenre extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:music.ResponseGetAllAlbumsFromGenre)
    ResponseGetAllAlbumsFromGenreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseGetAllAlbumsFromGenre.newBuilder() to construct.
  private ResponseGetAllAlbumsFromGenre(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseGetAllAlbumsFromGenre() {
    albums_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseGetAllAlbumsFromGenre(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              albums_ = new java.util.ArrayList<com.github.tozastation.clasickcoreapi.grpc.Album>();
              mutable_bitField0_ |= 0x00000001;
            }
            albums_.add(
                input.readMessage(com.github.tozastation.clasickcoreapi.grpc.Album.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        albums_ = java.util.Collections.unmodifiableList(albums_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.tozastation.clasickcoreapi.grpc.MusicProto.internal_static_music_ResponseGetAllAlbumsFromGenre_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.tozastation.clasickcoreapi.grpc.MusicProto.internal_static_music_ResponseGetAllAlbumsFromGenre_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.class, com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.Builder.class);
  }

  public static final int ALBUMS_FIELD_NUMBER = 1;
  private java.util.List<com.github.tozastation.clasickcoreapi.grpc.Album> albums_;
  /**
   * <code>repeated .music.Album albums = 1;</code>
   */
  public java.util.List<com.github.tozastation.clasickcoreapi.grpc.Album> getAlbumsList() {
    return albums_;
  }
  /**
   * <code>repeated .music.Album albums = 1;</code>
   */
  public java.util.List<? extends com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder> 
      getAlbumsOrBuilderList() {
    return albums_;
  }
  /**
   * <code>repeated .music.Album albums = 1;</code>
   */
  public int getAlbumsCount() {
    return albums_.size();
  }
  /**
   * <code>repeated .music.Album albums = 1;</code>
   */
  public com.github.tozastation.clasickcoreapi.grpc.Album getAlbums(int index) {
    return albums_.get(index);
  }
  /**
   * <code>repeated .music.Album albums = 1;</code>
   */
  public com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder getAlbumsOrBuilder(
      int index) {
    return albums_.get(index);
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
    for (int i = 0; i < albums_.size(); i++) {
      output.writeMessage(1, albums_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < albums_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, albums_.get(i));
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
    if (!(obj instanceof com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre)) {
      return super.equals(obj);
    }
    com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre other = (com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre) obj;

    boolean result = true;
    result = result && getAlbumsList()
        .equals(other.getAlbumsList());
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
    if (getAlbumsCount() > 0) {
      hash = (37 * hash) + ALBUMS_FIELD_NUMBER;
      hash = (53 * hash) + getAlbumsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parseFrom(
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
  public static Builder newBuilder(com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre prototype) {
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
   * Protobuf type {@code music.ResponseGetAllAlbumsFromGenre}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:music.ResponseGetAllAlbumsFromGenre)
      com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.tozastation.clasickcoreapi.grpc.MusicProto.internal_static_music_ResponseGetAllAlbumsFromGenre_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.tozastation.clasickcoreapi.grpc.MusicProto.internal_static_music_ResponseGetAllAlbumsFromGenre_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.class, com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.Builder.class);
    }

    // Construct using com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.newBuilder()
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
        getAlbumsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (albumsBuilder_ == null) {
        albums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        albumsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.tozastation.clasickcoreapi.grpc.MusicProto.internal_static_music_ResponseGetAllAlbumsFromGenre_descriptor;
    }

    @java.lang.Override
    public com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre getDefaultInstanceForType() {
      return com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre build() {
      com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre buildPartial() {
      com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre result = new com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre(this);
      int from_bitField0_ = bitField0_;
      if (albumsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          albums_ = java.util.Collections.unmodifiableList(albums_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.albums_ = albums_;
      } else {
        result.albums_ = albumsBuilder_.build();
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
      if (other instanceof com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre) {
        return mergeFrom((com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre other) {
      if (other == com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre.getDefaultInstance()) return this;
      if (albumsBuilder_ == null) {
        if (!other.albums_.isEmpty()) {
          if (albums_.isEmpty()) {
            albums_ = other.albums_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlbumsIsMutable();
            albums_.addAll(other.albums_);
          }
          onChanged();
        }
      } else {
        if (!other.albums_.isEmpty()) {
          if (albumsBuilder_.isEmpty()) {
            albumsBuilder_.dispose();
            albumsBuilder_ = null;
            albums_ = other.albums_;
            bitField0_ = (bitField0_ & ~0x00000001);
            albumsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlbumsFieldBuilder() : null;
          } else {
            albumsBuilder_.addAllMessages(other.albums_);
          }
        }
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
      com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.github.tozastation.clasickcoreapi.grpc.Album> albums_ =
      java.util.Collections.emptyList();
    private void ensureAlbumsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        albums_ = new java.util.ArrayList<com.github.tozastation.clasickcoreapi.grpc.Album>(albums_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.tozastation.clasickcoreapi.grpc.Album, com.github.tozastation.clasickcoreapi.grpc.Album.Builder, com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder> albumsBuilder_;

    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public java.util.List<com.github.tozastation.clasickcoreapi.grpc.Album> getAlbumsList() {
      if (albumsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(albums_);
      } else {
        return albumsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public int getAlbumsCount() {
      if (albumsBuilder_ == null) {
        return albums_.size();
      } else {
        return albumsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public com.github.tozastation.clasickcoreapi.grpc.Album getAlbums(int index) {
      if (albumsBuilder_ == null) {
        return albums_.get(index);
      } else {
        return albumsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder setAlbums(
        int index, com.github.tozastation.clasickcoreapi.grpc.Album value) {
      if (albumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlbumsIsMutable();
        albums_.set(index, value);
        onChanged();
      } else {
        albumsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder setAlbums(
        int index, com.github.tozastation.clasickcoreapi.grpc.Album.Builder builderForValue) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.set(index, builderForValue.build());
        onChanged();
      } else {
        albumsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder addAlbums(com.github.tozastation.clasickcoreapi.grpc.Album value) {
      if (albumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlbumsIsMutable();
        albums_.add(value);
        onChanged();
      } else {
        albumsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder addAlbums(
        int index, com.github.tozastation.clasickcoreapi.grpc.Album value) {
      if (albumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlbumsIsMutable();
        albums_.add(index, value);
        onChanged();
      } else {
        albumsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder addAlbums(
        com.github.tozastation.clasickcoreapi.grpc.Album.Builder builderForValue) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.add(builderForValue.build());
        onChanged();
      } else {
        albumsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder addAlbums(
        int index, com.github.tozastation.clasickcoreapi.grpc.Album.Builder builderForValue) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.add(index, builderForValue.build());
        onChanged();
      } else {
        albumsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder addAllAlbums(
        java.lang.Iterable<? extends com.github.tozastation.clasickcoreapi.grpc.Album> values) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, albums_);
        onChanged();
      } else {
        albumsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder clearAlbums() {
      if (albumsBuilder_ == null) {
        albums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        albumsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public Builder removeAlbums(int index) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.remove(index);
        onChanged();
      } else {
        albumsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public com.github.tozastation.clasickcoreapi.grpc.Album.Builder getAlbumsBuilder(
        int index) {
      return getAlbumsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder getAlbumsOrBuilder(
        int index) {
      if (albumsBuilder_ == null) {
        return albums_.get(index);  } else {
        return albumsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public java.util.List<? extends com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder> 
         getAlbumsOrBuilderList() {
      if (albumsBuilder_ != null) {
        return albumsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(albums_);
      }
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public com.github.tozastation.clasickcoreapi.grpc.Album.Builder addAlbumsBuilder() {
      return getAlbumsFieldBuilder().addBuilder(
          com.github.tozastation.clasickcoreapi.grpc.Album.getDefaultInstance());
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public com.github.tozastation.clasickcoreapi.grpc.Album.Builder addAlbumsBuilder(
        int index) {
      return getAlbumsFieldBuilder().addBuilder(
          index, com.github.tozastation.clasickcoreapi.grpc.Album.getDefaultInstance());
    }
    /**
     * <code>repeated .music.Album albums = 1;</code>
     */
    public java.util.List<com.github.tozastation.clasickcoreapi.grpc.Album.Builder> 
         getAlbumsBuilderList() {
      return getAlbumsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.tozastation.clasickcoreapi.grpc.Album, com.github.tozastation.clasickcoreapi.grpc.Album.Builder, com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder> 
        getAlbumsFieldBuilder() {
      if (albumsBuilder_ == null) {
        albumsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.tozastation.clasickcoreapi.grpc.Album, com.github.tozastation.clasickcoreapi.grpc.Album.Builder, com.github.tozastation.clasickcoreapi.grpc.AlbumOrBuilder>(
                albums_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        albums_ = null;
      }
      return albumsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:music.ResponseGetAllAlbumsFromGenre)
  }

  // @@protoc_insertion_point(class_scope:music.ResponseGetAllAlbumsFromGenre)
  private static final com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre();
  }

  public static com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseGetAllAlbumsFromGenre>
      PARSER = new com.google.protobuf.AbstractParser<ResponseGetAllAlbumsFromGenre>() {
    @java.lang.Override
    public ResponseGetAllAlbumsFromGenre parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseGetAllAlbumsFromGenre(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseGetAllAlbumsFromGenre> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseGetAllAlbumsFromGenre> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllAlbumsFromGenre getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


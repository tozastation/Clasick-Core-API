// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: music_rpc.proto

package com.github.tozastation.clasickcoreapi.grpc;

public final class MusicProto {
  private MusicProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_Genre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_Genre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_Album_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_Album_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_Artist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_Artist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_Music_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_Music_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_RequestGetAllGenres_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_RequestGetAllGenres_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_ResponseGetAllGenres_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_ResponseGetAllGenres_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_RequestGetAllAlbumsFromGenre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_RequestGetAllAlbumsFromGenre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_ResponseGetAllAlbumsFromGenre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_ResponseGetAllAlbumsFromGenre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_RequestGetAllArtistsFromGenre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_RequestGetAllArtistsFromGenre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_ResponseGetAllArtistsFromGenre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_ResponseGetAllArtistsFromGenre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_RequestGetAllAlbumsFromArtist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_RequestGetAllAlbumsFromArtist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_ResponseGetAllAlbumsFromArtist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_ResponseGetAllAlbumsFromArtist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_RequestGetAllMusicFromAlbum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_RequestGetAllMusicFromAlbum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_music_ResponseGetAllMusicFromAlbum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_music_ResponseGetAllMusicFromAlbum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017music_rpc.proto\022\005music\"\007\n\005Empty\"4\n\005Gen" +
      "re\022\n\n\002id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022\021\n\ticon_pat" +
      "h\030\003 \001(\t\"I\n\005Album\022\n\n\002id\030\001 \001(\r\022\014\n\004name\030\002 \001" +
      "(\t\022\021\n\ticon_path\030\003 \001(\t\022\023\n\013artist_name\030\004 \001" +
      "(\t\"J\n\006Artist\022\n\n\002id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022\021" +
      "\n\ticon_path\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\"I" +
      "\n\005Music\022\n\n\002id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022\023\n\013des" +
      "cription\030\003 \001(\t\022\021\n\tm3u8_path\030\004 \001(\t\"2\n\023Req" +
      "uestGetAllGenres\022\033\n\005empty\030\001 \001(\0132\014.music." +
      "Empty\"4\n\024ResponseGetAllGenres\022\034\n\006genres\030" +
      "\001 \003(\0132\014.music.Genre\"0\n\034RequestGetAllAlbu" +
      "msFromGenre\022\020\n\010genre_id\030\001 \001(\r\"=\n\035Respons" +
      "eGetAllAlbumsFromGenre\022\034\n\006albums\030\001 \003(\0132\014" +
      ".music.Album\"1\n\035RequestGetAllArtistsFrom" +
      "Genre\022\020\n\010genre_id\030\001 \001(\r\"@\n\036ResponseGetAl" +
      "lArtistsFromGenre\022\036\n\007artists\030\001 \003(\0132\r.mus" +
      "ic.Artist\"2\n\035RequestGetAllAlbumsFromArti" +
      "st\022\021\n\tartist_id\030\001 \001(\r\">\n\036ResponseGetAllA" +
      "lbumsFromArtist\022\034\n\006albums\030\001 \003(\0132\014.music." +
      "Album\"/\n\033RequestGetAllMusicFromAlbum\022\020\n\010" +
      "album_id\030\001 \001(\r\"<\n\034ResponseGetAllMusicFro" +
      "mAlbum\022\034\n\006musics\030\001 \003(\0132\014.music.Music2\360\003\n" +
      "\010MusicRpc\022I\n\014GetAllGenres\022\032.music.Reques" +
      "tGetAllGenres\032\033.music.ResponseGetAllGenr" +
      "es\"\000\022d\n\025GetAllAlbumsFromGenre\022#.music.Re" +
      "questGetAllAlbumsFromGenre\032$.music.Respo" +
      "nseGetAllAlbumsFromGenre\"\000\022g\n\026GetAllArti" +
      "stsFromGenre\022$.music.RequestGetAllArtist" +
      "sFromGenre\032%.music.ResponseGetAllArtists" +
      "FromGenre\"\000\022g\n\026GetAllAlbumsFromArtist\022$." +
      "music.RequestGetAllAlbumsFromArtist\032%.mu" +
      "sic.ResponseGetAllAlbumsFromArtist\"\000\022a\n\024" +
      "GetAllMusicFromAlbum\022\".music.RequestGetA" +
      "llMusicFromAlbum\032#.music.ResponseGetAllM" +
      "usicFromAlbum\"\000B:\n*com.github.tozastatio" +
      "n.clasickcoreapi.grpcB\nMusicProtoP\001b\006pro" +
      "to3"
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
    internal_static_music_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_music_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_music_Genre_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_music_Genre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_Genre_descriptor,
        new java.lang.String[] { "Id", "Name", "IconPath", });
    internal_static_music_Album_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_music_Album_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_Album_descriptor,
        new java.lang.String[] { "Id", "Name", "IconPath", "ArtistName", });
    internal_static_music_Artist_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_music_Artist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_Artist_descriptor,
        new java.lang.String[] { "Id", "Name", "IconPath", "Description", });
    internal_static_music_Music_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_music_Music_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_Music_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "M3U8Path", });
    internal_static_music_RequestGetAllGenres_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_music_RequestGetAllGenres_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_RequestGetAllGenres_descriptor,
        new java.lang.String[] { "Empty", });
    internal_static_music_ResponseGetAllGenres_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_music_ResponseGetAllGenres_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_ResponseGetAllGenres_descriptor,
        new java.lang.String[] { "Genres", });
    internal_static_music_RequestGetAllAlbumsFromGenre_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_music_RequestGetAllAlbumsFromGenre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_RequestGetAllAlbumsFromGenre_descriptor,
        new java.lang.String[] { "GenreId", });
    internal_static_music_ResponseGetAllAlbumsFromGenre_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_music_ResponseGetAllAlbumsFromGenre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_ResponseGetAllAlbumsFromGenre_descriptor,
        new java.lang.String[] { "Albums", });
    internal_static_music_RequestGetAllArtistsFromGenre_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_music_RequestGetAllArtistsFromGenre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_RequestGetAllArtistsFromGenre_descriptor,
        new java.lang.String[] { "GenreId", });
    internal_static_music_ResponseGetAllArtistsFromGenre_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_music_ResponseGetAllArtistsFromGenre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_ResponseGetAllArtistsFromGenre_descriptor,
        new java.lang.String[] { "Artists", });
    internal_static_music_RequestGetAllAlbumsFromArtist_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_music_RequestGetAllAlbumsFromArtist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_RequestGetAllAlbumsFromArtist_descriptor,
        new java.lang.String[] { "ArtistId", });
    internal_static_music_ResponseGetAllAlbumsFromArtist_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_music_ResponseGetAllAlbumsFromArtist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_ResponseGetAllAlbumsFromArtist_descriptor,
        new java.lang.String[] { "Albums", });
    internal_static_music_RequestGetAllMusicFromAlbum_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_music_RequestGetAllMusicFromAlbum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_RequestGetAllMusicFromAlbum_descriptor,
        new java.lang.String[] { "AlbumId", });
    internal_static_music_ResponseGetAllMusicFromAlbum_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_music_ResponseGetAllMusicFromAlbum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_music_ResponseGetAllMusicFromAlbum_descriptor,
        new java.lang.String[] { "Musics", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
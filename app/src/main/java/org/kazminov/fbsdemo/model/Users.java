// automatically generated by the FlatBuffers compiler, do not modify

package org.kazminov.fbsdemo.model;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Users extends Table {
  public static Users getRootAsUsers(ByteBuffer _bb) { return getRootAsUsers(_bb, new Users()); }
  public static Users getRootAsUsers(ByteBuffer _bb, Users obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Users __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public User users(int j) { return users(new User(), j); }
  public User users(User obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int usersLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createUsers(FlatBufferBuilder builder,
      int usersOffset) {
    builder.startObject(1);
    Users.addUsers(builder, usersOffset);
    return Users.endUsers(builder);
  }

  public static void startUsers(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addUsers(FlatBufferBuilder builder, int usersOffset) { builder.addOffset(0, usersOffset, 0); }
  public static int createUsersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUsersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endUsers(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishUsersBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}


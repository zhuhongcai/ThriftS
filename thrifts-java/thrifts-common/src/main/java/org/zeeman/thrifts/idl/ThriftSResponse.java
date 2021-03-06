/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.zeeman.thrifts.idl;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-27")
public class ThriftSResponse implements org.apache.thrift.TBase<ThriftSResponse, ThriftSResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftSResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftSResponse");

  private static final org.apache.thrift.protocol.TField HEADERS_FIELD_DESC = new org.apache.thrift.protocol.TField("Headers", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("Result", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftSResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftSResponseTupleSchemeFactory());
  }

  public Map<String,String> Headers; // required
  public ThriftSResult Result; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADERS((short)1, "Headers"),
    RESULT((short)2, "Result");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEADERS
          return HEADERS;
        case 2: // RESULT
          return RESULT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.RESULT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADERS, new org.apache.thrift.meta_data.FieldMetaData("Headers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("Result", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftSResult.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftSResponse.class, metaDataMap);
  }

  public ThriftSResponse() {
  }

  public ThriftSResponse(
    Map<String,String> Headers)
  {
    this();
    this.Headers = Headers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftSResponse(ThriftSResponse other) {
    if (other.isSetHeaders()) {
      Map<String,String> __this__Headers = new HashMap<String,String>(other.Headers);
      this.Headers = __this__Headers;
    }
    if (other.isSetResult()) {
      this.Result = new ThriftSResult(other.Result);
    }
  }

  public ThriftSResponse deepCopy() {
    return new ThriftSResponse(this);
  }

  @Override
  public void clear() {
    this.Headers = null;
    this.Result = null;
  }

  public int getHeadersSize() {
    return (this.Headers == null) ? 0 : this.Headers.size();
  }

  public void putToHeaders(String key, String val) {
    if (this.Headers == null) {
      this.Headers = new HashMap<String,String>();
    }
    this.Headers.put(key, val);
  }

  public Map<String,String> getHeaders() {
    return this.Headers;
  }

  public ThriftSResponse setHeaders(Map<String,String> Headers) {
    this.Headers = Headers;
    return this;
  }

  public void unsetHeaders() {
    this.Headers = null;
  }

  /** Returns true if field Headers is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaders() {
    return this.Headers != null;
  }

  public void setHeadersIsSet(boolean value) {
    if (!value) {
      this.Headers = null;
    }
  }

  public ThriftSResult getResult() {
    return this.Result;
  }

  public ThriftSResponse setResult(ThriftSResult Result) {
    this.Result = Result;
    return this;
  }

  public void unsetResult() {
    this.Result = null;
  }

  /** Returns true if field Result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.Result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.Result = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADERS:
      if (value == null) {
        unsetHeaders();
      } else {
        setHeaders((Map<String,String>)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((ThriftSResult)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADERS:
      return getHeaders();

    case RESULT:
      return getResult();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADERS:
      return isSetHeaders();
    case RESULT:
      return isSetResult();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftSResponse)
      return this.equals((ThriftSResponse)that);
    return false;
  }

  public boolean equals(ThriftSResponse that) {
    if (that == null)
      return false;

    boolean this_present_Headers = true && this.isSetHeaders();
    boolean that_present_Headers = true && that.isSetHeaders();
    if (this_present_Headers || that_present_Headers) {
      if (!(this_present_Headers && that_present_Headers))
        return false;
      if (!this.Headers.equals(that.Headers))
        return false;
    }

    boolean this_present_Result = true && this.isSetResult();
    boolean that_present_Result = true && that.isSetResult();
    if (this_present_Result || that_present_Result) {
      if (!(this_present_Result && that_present_Result))
        return false;
      if (!this.Result.equals(that.Result))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Headers = true && (isSetHeaders());
    list.add(present_Headers);
    if (present_Headers)
      list.add(Headers);

    boolean present_Result = true && (isSetResult());
    list.add(present_Result);
    if (present_Result)
      list.add(Result);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftSResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHeaders()).compareTo(other.isSetHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Headers, other.Headers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Result, other.Result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftSResponse(");
    boolean first = true;

    sb.append("Headers:");
    if (this.Headers == null) {
      sb.append("null");
    } else {
      sb.append(this.Headers);
    }
    first = false;
    if (isSetResult()) {
      if (!first) sb.append(", ");
      sb.append("Result:");
      if (this.Result == null) {
        sb.append("null");
      } else {
        sb.append(this.Result);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Headers == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Headers' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (Result != null) {
      Result.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftSResponseStandardSchemeFactory implements SchemeFactory {
    public ThriftSResponseStandardScheme getScheme() {
      return new ThriftSResponseStandardScheme();
    }
  }

  private static class ThriftSResponseStandardScheme extends StandardScheme<ThriftSResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftSResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.Headers = new HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.Headers.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setHeadersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Result = new ThriftSResult();
              struct.Result.read(iprot);
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftSResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Headers != null) {
        oprot.writeFieldBegin(HEADERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.Headers.size()));
          for (Map.Entry<String, String> _iter4 : struct.Headers.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Result != null) {
        if (struct.isSetResult()) {
          oprot.writeFieldBegin(RESULT_FIELD_DESC);
          struct.Result.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftSResponseTupleSchemeFactory implements SchemeFactory {
    public ThriftSResponseTupleScheme getScheme() {
      return new ThriftSResponseTupleScheme();
    }
  }

  private static class ThriftSResponseTupleScheme extends TupleScheme<ThriftSResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftSResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.Headers.size());
        for (Map.Entry<String, String> _iter5 : struct.Headers.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          oprot.writeString(_iter5.getValue());
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetResult()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetResult()) {
        struct.Result.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftSResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.Headers = new HashMap<String,String>(2*_map6.size);
        String _key7;
        String _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readString();
          _val8 = iprot.readString();
          struct.Headers.put(_key7, _val8);
        }
      }
      struct.setHeadersIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.Result = new ThriftSResult();
        struct.Result.read(iprot);
        struct.setResultIsSet(true);
      }
    }
  }

}


package org.zeeman.thrifts.demo.contract;

//import com.baidu.bjf.remoting.protobuf.FieldType;
//import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import org.zeeman.thrifts.common.SerializerMode;
import org.zeeman.thrifts.common.annotations.ThriftSMember;
import org.zeeman.thrifts.common.annotations.ThriftSModel;

@ThriftSModel(SerializerMode = SerializerMode.ProtoBuf)
public class Member {
    //@Protobuf(fieldType = FieldType.STRING, order = 1, required = true)
    @ThriftSMember(tag = 1)
    private String memberId;

    @ThriftSMember(tag = 2)
    private int age;

    public Member() {
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

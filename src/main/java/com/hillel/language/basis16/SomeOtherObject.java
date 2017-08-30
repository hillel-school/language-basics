package com.hillel.language.basis16;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class SomeOtherObject implements Externalizable {

    long SSN = 12312321223L;
    String name = "Ivan";
    int age = 22;

    public long getSSN() {
        return SSN;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeLong(this.SSN);
        out.writeObject(this.name);
        out.writeInt(this.age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.SSN = in.readLong();
        this.name = (String)in.readObject();
        this.age = in.readInt();
    }
}

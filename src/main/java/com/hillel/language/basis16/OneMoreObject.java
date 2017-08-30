package com.hillel.language.basis16;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class OneMoreObject implements Externalizable {

    boolean a = false;
    boolean b = true;
    boolean c = true;
    boolean d = false;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        int mask = 0;
        if (a) mask = mask | 1;
        if (b) mask = mask | 2;
        if (c) mask = mask | 4;
        if (d) mask = mask | 8;

        out.writeInt(mask);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int mask = in.readInt();
        if((mask & 1) == 1) a = true;
        if((mask & 2) == 2) b = true;
        if((mask & 4) == 4) c = true;
        if((mask & 8) == 8) d = true;
    }


    public boolean isD() {
        return d;
    }

    public boolean isA() {
        return a;
    }

    public boolean isB() {
        return b;
    }

    public boolean isC() {
        return c;
    }
}

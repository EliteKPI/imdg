package com.elitekpi.imdg;

import java.io.*;

public interface DataSerializable extends Serializable {
    void toData(DataOutput out) throws IOException;
    void fromData(DataInput in)
            throws IOException, ClassNotFoundException;

    interface Replaceable {
        Object replace() throws IOException;
    }
}

package com.dreambandsdk;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by seanf on 10/3/2017.
 */

public class TableColumn implements Parcelable {
    // Private members
    private String key, value;

    // Constructor
    private TableColumn(Parcel in) {
        key = in.readString();
        value = in.readString();
    }

    public TableColumn(String keyIn, String valueIn) {
        key = keyIn;
        value = valueIn;
    }

    @Override
    public int describeContents() {
        return this.hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(key);
        dest.writeString(value);
    }

    public static final Creator<TableColumn> CREATOR
            = new Creator<TableColumn>() {
        public TableColumn createFromParcel(Parcel in) {
            return new TableColumn(in);
        }

        public TableColumn[] newArray(int size) {
            return new TableColumn[size];
        }
    };

    @Override
    public String toString() {
        return "{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
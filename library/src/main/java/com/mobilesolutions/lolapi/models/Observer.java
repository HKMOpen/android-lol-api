package com.mobilesolutions.lolapi.models;

import com.google.gson.annotations.Expose;

public class Observer {

    @Expose
    private String encryptionKey;

    public String getEncryptionKey() {
        return encryptionKey;
    }
}

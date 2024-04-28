package com.example.hellojava;

import androidx.datastore.rxjava2.RxDataStore;

import java.util.prefs.Preferences;
public class DataStore {


    RxDataStore<Preferences> datastore;
    private static final DataStore ourInstance = new DataStore();
    public static synchronized DataStore getInstance() {
        return ourInstance;
    }
    private DataStore() { }
    public void setDataStore(RxDataStore<Preferences> datastore) {
        this.datastore = datastore;
    }
    public RxDataStore<Preferences> getDataStore() {
        return datastore;
    }
}

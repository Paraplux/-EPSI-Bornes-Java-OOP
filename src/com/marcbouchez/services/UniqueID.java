package com.marcbouchez.services;

import com.marcbouchez.interfaces.Countable;

import java.util.List;

public class UniqueID {

    /**
     * Genrate a id from a list of countable object
     * @param entries Entries is a list of Object that must implements Countable
     * @return a unique ID
     */
    public static int generateFrom (List<?> entries) {
        int uid;
        uid = 0;

        if (entries.size() != 0) {
            System.out.println("size != 0");
            Countable lastObject = (Countable) entries.get(entries.size() - 1);
            if (lastObject != null) {
                uid = lastObject.getId() + 1;
            }
        } else {
            uid = 1;
        }
        if(uid > 0) {
            return uid;
        }

        return -1;
    }
}

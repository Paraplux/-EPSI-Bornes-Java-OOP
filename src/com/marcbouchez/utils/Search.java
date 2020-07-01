package com.marcbouchez.utils;

import java.util.List;

public class Search {


    /**
     * Search and id in a list and return the item
     * @param id id to search for
     * @param items list to be run through
     * @return Countable item
     */
    public static Object withId (int id, List<?> items) {
        for (Object item : items) {
            Countable castedEntry = (Countable) item;
            if (castedEntry.getId() == id) {
                return item;
            }
        }
        return null;
    }

}

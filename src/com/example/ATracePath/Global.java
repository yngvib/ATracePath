package com.example.ATracePath;

import java.util.List;

/**
 * Created by yngvi on 15.9.2014.
 */
public class Global {

    public List<Pack> mPacks;

    ///
    private static Global mInstance = new Global();

    public static Global getInstance() {
        return mInstance;
    }

    private Global() {}

}

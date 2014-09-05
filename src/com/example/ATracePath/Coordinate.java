package com.example.ATracePath;

/**
 * Created by yngvi on 5.9.2014.
 */
public class Coordinate {

    private int m_col;
    private int m_row;

    Coordinate( int col, int row ) {
        m_col = col;
        m_row = row;
    }

    public int getCol() {
        return m_col;
    }

    public int getRow() {
        return m_row;
    }
}

package com.example.desingpattern.Structurals.Composite;

import android.util.Log;

public class FileLeaf implements FileComponent {

    private String fileName;
    private long size;

    public FileLeaf(String name, long size) {
        this.fileName = name;
        this.size = size;
    }

    @Override
    public void showProps() {
        Log.d("Composite", "Show props: file name - " + fileName);
    }

    @Override
    public long totalSize() {
        return size;
    }
}

package com.example.desingpattern.Structurals.Composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComponent implements FileComponent {

    private List<FileLeaf> fileLeafList = new ArrayList<>();
    private String nameFolder;

    public FolderComponent(String name) {
        this.nameFolder = name;
    }

    public void addFile(FileLeaf fileLeaf) {
        this.fileLeafList.add(fileLeaf);
    }

    @Override
    public void showProps() {
        for (FileLeaf fileLeaf: this.fileLeafList) {
            fileLeaf.showProps();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileLeaf file : this.fileLeafList) {
            total += file.totalSize();
        }
        return total;
    }
}

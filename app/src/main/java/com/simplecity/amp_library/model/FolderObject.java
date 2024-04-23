package com.simplecity.amp_library.model;

import com.simplecity.amp_library.interfaces.FileType;

public class FolderObject extends BaseFileObject {

    public int fileCount;
    public int folderCount;

    public FolderObject() {
        this.fileType = FileType.FOLDER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FolderObject that = (FolderObject) o;

        if (fileCount != that.fileCount) return false;
        return folderCount == that.folderCount;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fileCount;
        result = 31 * result + folderCount;
        return result;
    }

    @Override
    public String toString() {
        return "FolderObject{" +
                "fileCount=" + fileCount +
                ", folderCount=" + folderCount +
                "} " + super.toString();
    }
}

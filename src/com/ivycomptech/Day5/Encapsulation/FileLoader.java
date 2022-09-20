package com.ivycomptech.Day5.Encapsulation;

abstract public class FileLoader {

    String fileName;
    String fileType;

    void fileOpen(ImageFile image) {
        System.out.println("opened " + image.fileType + "   Successfully");

    }

    void readFile() {
        System.out.println("read successfully");

    }

    abstract void produceReport();
}

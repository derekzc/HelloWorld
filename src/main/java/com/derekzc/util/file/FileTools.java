package com.derekzc.util.file;

import java.io.File;

public class FileTools
{
    public static String[] geFileName(String path)
    {

        File filePath = new File(path);
        return filePath.list();
    }


    public static void main(String[] args)
    {

        String path = "I:\\Video";
        String[] fileNames = FileTools.geFileName(path);
        System.out.println(fileNames.length);

        for (String fileName: fileNames)
        {
            System.out.println(fileName);
        }


    }

}

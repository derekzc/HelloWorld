package com.derekzc.file.rename;

import com.derekzc.util.file.FileTools;
import com.derekzc.util.string.StringTools;
import com.derekzc.util.time.TimeTools;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileReName
{
    private static String FILE_NAME_FORMAT = "yyyyMMdd_HHmmss";

    public static void main(String[] args)
    {
        String path = "I:\\Video";
        /**
         * I:\Video\1500639633954.mp4
         */
        String[] fileFullNames = FileTools.geFileName(path);

        String newFileFullName;
        String tempName;
        String fileNamePrefix;

        for(String oldFileFullName: fileFullNames)
        {
            fileNamePrefix = StringTools.getFileNameSuffix(oldFileFullName);

            tempName = StringTools.deleteStringSuffix(oldFileFullName, fileNamePrefix);

            tempName = TimeTools.GMTToFormatTime(tempName, FILE_NAME_FORMAT);

            newFileFullName = tempName + fileNamePrefix;

            System.out.println("oldFullName = "+ oldFileFullName+ "      newName = "+ newFileFullName);

            File oldFile = new File(path + File.separator + oldFileFullName);
            File newFile = new File(path + File.separator + newFileFullName);
            oldFile.renameTo(newFile);
        }
    }
}

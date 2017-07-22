package com.derekzc.file.rename;

import com.derekzc.util.file.FileTools;
import com.derekzc.util.string.StringTools;
import com.derekzc.util.time.TimeTools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileReName
{
    private static String FILE_NAME_FORMAT = "yyyyMMdd_HHmmss";

    private static String PREFIX_1 = "wx_camera_";

    public static void main(String[] args)
    {
        String path = "I:\\Video";
        String[] fileFullNames = FileTools.geFileName(path);
        String newFileFullName;
        String tempName;

        for(String oldFileFullName: fileFullNames)
        {
            tempName = StringTools.deleteStringPrefix(oldFileFullName, PREFIX_1 );

            String fileNamePrefix = StringTools.getFileNameSuffix(tempName);

            tempName = StringTools.deleteStringSuffix(tempName, fileNamePrefix);

            tempName = TimeTools.GMTToFormatTime(tempName, FILE_NAME_FORMAT);

            newFileFullName = tempName + fileNamePrefix;

            System.out.println("oldFullName = "+ oldFileFullName+ "      newName = "+ newFileFullName);
        }
    }
}

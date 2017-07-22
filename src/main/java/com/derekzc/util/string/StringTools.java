package com.derekzc.util.string;

import java.io.File;

public class StringTools
{
    public static String deleteStringPrefix(String sourceString, String prefix)
    {
        if (sourceString.startsWith(prefix))
        {
            return sourceString.replace(prefix, "");
        }

        return sourceString;
    }

    public static String getFileNameSuffix(String fileFullName)
    {
        return fileFullName.substring(fileFullName.lastIndexOf("."));
    }

    public static String deleteStringSuffix(String sourceString, String suffix)
    {
        if (sourceString.endsWith(suffix))
        {
            return sourceString.replace(suffix, "");
        }

        return sourceString;
    }

    public static void main(String[] args)
    {
        String sourceString = "wx_camera_1489316225269.mp4";
        String prefix = "wx_camera_";
        System.out.println(StringTools.deleteStringPrefix(sourceString, prefix ));
        System.out.println(StringTools.getFileNameSuffix(sourceString));
    }
}

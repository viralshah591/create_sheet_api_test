package com.api.common;

import java.io.File;

public class FolderPath {

    // return the path of project
    public static final String projectPath = System.getProperty("user.dir") + File.separator;

    // return the path of property files
    public static final String propertyFilePath = projectPath + "src" + File.separator + "main" + File.separator
            + "resources" + File.separator + "properties" + File.separator;
}
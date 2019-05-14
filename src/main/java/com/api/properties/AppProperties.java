package com.api.properties;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.BeforeSuite;
import com.api.common.FolderPath;

public class AppProperties {
    /**
     * Method to read all properties from a prop file
     *
     * @param propertName
     * @return
     */
    @BeforeSuite(alwaysRun = true)
    public static String getPopertyFromStageConfig(String propertName) {
        Properties props;
        try {
            props = new Properties();
            props.load(new FileInputStream(FolderPath.propertyFilePath + "config.properties"));
            return props.getProperty(propertName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getRESTFulSecureURL() {
        return getPopertyFromStageConfig("baseSecureUri").trim();
    }
}
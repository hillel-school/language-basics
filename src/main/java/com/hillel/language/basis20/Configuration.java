package com.hillel.language.basis20;

public class Configuration {

    private String directory;
    private String extension;

    public static Configuration create(String xmlConf) {

        String dir = "";
        String ext = "";
        return new Configuration();
    }

//    public static Configuration create() {
//        return null;
//    }


    public String getDirectory() {
        return directory;
    }

    public String getExtension() {
        return extension;
    }
}

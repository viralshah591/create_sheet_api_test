package com.test.api;

public class Columns {

    private String primary;
    private String title;
    private String type;

    // optional values
    private String options;
    private String symbol;
    private String systemColumnType;
    private String width;

    private String autoNumberFormat;

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAutoNumberFormat() {
        return autoNumberFormat;
    }

    public void setAutoNumberFormat(String autoNumberFormat) {
        this.autoNumberFormat = autoNumberFormat;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSystemColumnType() {
        return systemColumnType;
    }

    public void setSystemColumnType(String systemColumnType) {
        this.systemColumnType = systemColumnType;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
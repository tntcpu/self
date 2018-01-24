package com.tcps.self.core.Object.enumTest;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018-01-24 17:23
 **/
public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbveriation;

    Size(String abbveriation) {
        this.abbveriation = abbveriation;
    }

    public String getAbbveriation() {
        return abbveriation;
    }
}

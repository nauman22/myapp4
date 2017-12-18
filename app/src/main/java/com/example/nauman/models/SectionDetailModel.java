package com.example.nauman.models;

/**
 * Created by nauman on 06-Dec-17.
 */

public class SectionDetailModel {
    private String TestName;
    private String TestInst;
    private int TestPassingPercent;
    private int TestTotalQ;
    private String SecName;
    private int SecTotalQ;
    private int SecPriority;
    private int isNegativeMarks;
    private int SpecMarks;

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String testName) {
        TestName = testName;
    }

    public String getTestInst() {
        return TestInst;
    }

    public void setTestInst(String testInst) {
        TestInst = testInst;
    }

    public int getTestPassingPercent() {
        return TestPassingPercent;
    }

    public void setTestPassingPercent(int testPassingPercent) {
        TestPassingPercent = testPassingPercent;
    }

    public int getTestTotalQ() {
        return TestTotalQ;
    }

    public void setTestTotalQ(int testTotalQ) {
        TestTotalQ = testTotalQ;
    }

    public String getSecName() {
        return SecName;
    }

    public void setSecName(String secName) {
        SecName = secName;
    }

    public int getSecTotalQ() {
        return SecTotalQ;
    }

    public void setSecTotalQ(int secTotalQ) {
        SecTotalQ = secTotalQ;
    }

    public int getSecPriority() {
        return SecPriority;
    }

    public void setSecPriority(int secPriority) {
        SecPriority = secPriority;
    }

    public int getIsNegativeMarks() {
        return isNegativeMarks;
    }

    public void setIsNegativeMarks(int isNegativeMarks) {
        this.isNegativeMarks = isNegativeMarks;
    }

    public int getSpecMarks() {
        return SpecMarks;
    }

    public void setSpecMarks(int specMarks) {
        SpecMarks = specMarks;
    }

    public String getSecDetail() {
        return SecDetail;
    }

    public void setSecDetail(String secDetail) {
        SecDetail = secDetail;
    }

    private String SecDetail;
}


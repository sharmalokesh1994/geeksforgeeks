package com.company.design.project.project1.BugReportTooljson.bugTools.bugzilla;

public class BugzilaJSON {

    //Todo:there are some json objects are also present
    private String bugName;
    private String Description;
    private String bugType;

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBugType() {
        return bugType;
    }

    public void setBugType(String bugType) {
        this.bugType = bugType;
    }

    @Override
    public String toString() {
        return "BugzilaJSON{" +
                "bugName='" + bugName + '\'' +
                ", Description='" + Description + '\'' +
                ", bugType='" + bugType + '\'' +
                '}';
    }
}

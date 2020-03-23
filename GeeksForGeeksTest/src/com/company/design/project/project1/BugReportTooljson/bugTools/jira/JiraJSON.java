package com.company.design.project.project1.BugReportTooljson.bugTools.jira;

public class JiraJSON {

    //Todo:there are some json objects are also present
    private String issue;
    private String Description;
    private String issueType;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    @Override
    public String toString() {
        return "JiraJSON{" +
                "issue='" + issue + '\'' +
                ", Description='" + Description + '\'' +
                ", issueType='" + issueType + '\'' +
                '}';
    }
}

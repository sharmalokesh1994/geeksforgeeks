package com.company.design.project.project1.BugReportTooljson.bugTools;

public interface BugTool {

    String getIssue();

    void setIssue(String issue);

    String getDescription();

    void setDescription(String description);

    String getIssueType();

    void setIssueType(String issueType);

    String getJSON();

}

package com.company.design.project.project1.BugReportTooljson.bugTools.jira;

import com.company.design.project.project1.BugReportTooljson.bugTools.BugTool;

public class JiraJSONAdapter implements BugTool {


    private JiraJSON jiraJSON;

    public JiraJSONAdapter(){
        jiraJSON = new JiraJSON();
    }

    @Override
    public String getIssue() {
        return jiraJSON.getIssue();
    }

    @Override
    public void setIssue(String issue) {
        jiraJSON.setIssue(issue);
    }

    @Override
    public String getDescription() {
        return jiraJSON.getDescription();
    }

    @Override
    public void setDescription(String description) {
        jiraJSON.setDescription(description);
    }

    @Override
    public String getIssueType() {
        return jiraJSON.getIssueType();
    }

    @Override
    public void setIssueType(String issueType) {
        jiraJSON.setIssueType(issueType);
    }

    @Override
    public String getJSON() {
        //Todo: User Jackson jar for converting object to json
        return jiraJSON.toString();
    }


}

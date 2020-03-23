package com.company.design.project.project1.BugReportTooljson.bugTools.bugzilla;

import com.company.design.project.project1.BugReportTooljson.bugTools.BugTool;

public class BugzilaJSONAdapter implements BugTool {

    private BugzilaJSON bugzilaJSON;

    // Thumb rule of the coding
    public BugzilaJSONAdapter(){
        bugzilaJSON = new BugzilaJSON();
    }

    @Override
    public String getIssue() {
        return bugzilaJSON.getBugName();
    }

    @Override
    public void setIssue(String issue) {
        bugzilaJSON.setBugName(issue);
    }

    @Override
    public String getDescription() {
        return bugzilaJSON.getDescription();
    }

    @Override
    public void setDescription(String description) {
        bugzilaJSON.setDescription(description);
    }

    @Override
    public String getIssueType() {
        return bugzilaJSON.getBugType();
    }

    @Override
    public void setIssueType(String issueType) {
        bugzilaJSON.setBugType(issueType);
    }

    @Override
    public String getJSON() {
        //Todo: User Jackson jar for converting object to json
        return bugzilaJSON.toString();
    }


}

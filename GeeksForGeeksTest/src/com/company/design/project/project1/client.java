package com.company.design.project.project1;

import com.company.design.project.project1.BugReportTooljson.bugTools.BugTool;
import com.company.design.project.project1.BugReportTooljson.bugTools.BugToolFactory;
import com.company.design.project.project1.BugReportTooljson.bugTools.BugToolType;
import com.company.design.project.project1.BugReportTooljson.exception.BugToolNotPresent;

public class client {

    public static void main(String[] args) {

        BugTool bugTool = null;

        try {
            bugTool = BugToolFactory.getInstance().getBugTool(BugToolType.BUGZILA);
            bugTool.setIssue("It is normal UI issue");
            bugTool.setDescription("Issue is reported please check");
            bugTool.setIssueType("Normal");
        }
        catch (BugToolNotPresent e){
            e.printStackTrace();
        }

        System.out.println(bugTool.getJSON());


        try {
            bugTool = BugToolFactory.getInstance().getBugTool(BugToolType.JIRA);
            bugTool.setIssue("It is normal UI issue");
            bugTool.setDescription("Issue is reported please check");
            bugTool.setIssueType("Normal");
        }
        catch (BugToolNotPresent e){
            e.printStackTrace();
        }

        System.out.println(bugTool.getJSON());

    }

}

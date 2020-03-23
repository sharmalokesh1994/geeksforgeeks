package com.company.design.project.project1.BugReportTooljson.bugTools;

import com.company.design.project.project1.BugReportTooljson.bugTools.bugzilla.BugzilaJSONAdapter;
import com.company.design.project.project1.BugReportTooljson.bugTools.jira.JiraJSONAdapter;
import com.company.design.project.project1.BugReportTooljson.exception.BugToolNotPresent;


import java.util.HashMap;

public class BugToolFactory {

    private static BugToolFactory instance;

    private HashMap<BugToolType,BugTool> bugToolHashMap;

    private BugToolFactory(){
        bugToolHashMap = new HashMap<>();
        bugToolHashMap.put(BugToolType.BUGZILA,new BugzilaJSONAdapter());
        bugToolHashMap.put( BugToolType.JIRA,new JiraJSONAdapter() );

    }

    public static BugToolFactory getInstance(){

        if(instance==null){
            synchronized (BugToolFactory.class){
                if(instance==null){
                    instance = new BugToolFactory();
                }
            }

        }

        return instance;

    }

    public BugTool getBugTool(BugToolType type) throws BugToolNotPresent {
        if( bugToolHashMap.containsKey(type) ){
            return bugToolHashMap.get(type);
        }

        throw  new BugToolNotPresent("This Service is not available for this tool");
    }

}

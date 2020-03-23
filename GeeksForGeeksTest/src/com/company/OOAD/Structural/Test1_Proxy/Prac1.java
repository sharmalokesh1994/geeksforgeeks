package com.company.OOAD.Structural.Test1_Proxy;

interface DataBase{

    void queryImp(String query) throws Exception;

}

class DataBaseImp implements DataBase{


    public void queryImp(String query) {
        System.out.println(query);
    }

}


class DataBaseProxy{

    DataBase dataBaseImp=new DataBaseImp();

    public void queryImp( DataBaseUser dbUser,String query) throws Exception{

        if(dbUser.isAdmin()){
            dataBaseImp.queryImp(query);
        }else{
            if( query.equals("DELETE") ){
                throw new Exception("You are not eligible to process this query");
            }else {
                dataBaseImp.queryImp(query);
            }
        }

    }

}

class DataBaseUser{

    String name;
    boolean isAdmin;

    DataBaseUser(String name, boolean isAdmin){
        this.name = name;
        this.isAdmin=isAdmin;
    }

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}

public class Prac1 {

    public static void main(String[] args) {

        DataBaseUser dbUser1 = new DataBaseUser("Admin",true);
        DataBaseUser dbUser2 = new DataBaseUser("Non - Admin",false);

        DataBaseProxy dataBaseProxy = new DataBaseProxy();
        try {
            dataBaseProxy.queryImp(dbUser1,"DELETE");

            dataBaseProxy.queryImp(dbUser2,"DELETE");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

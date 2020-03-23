package com.company.OOAD.Structural.Test7_Bridge_2;

interface FileDownload{

    void download(String s);

}

class FileDownloadImpl implements FileDownload{

    private OS os;

    FileDownloadImpl(OS os){
        this.os = os;
    }


    @Override
    public void download(String s){
        os.downloadInOs(s);
    }

}

interface OS{

    void downloadInOs(String s);

}

class Linux implements OS{

    @Override
    public void downloadInOs(String s){
        System.out.println(s+ " downloaded in Linux");
    }

}


class Windows implements OS{

    @Override
    public void downloadInOs(String s){
        System.out.println(s+ " downloaded in Windows");
    }

}
public class Prac1 {

    public static void main(String[] args) {
        Linux linux = new Linux();
        Windows windows = new Windows();

        FileDownload f1 = new FileDownloadImpl(linux);
        f1.download("file 1");

        f1 = new FileDownloadImpl(windows);
        f1.download("file 1");
    }

}

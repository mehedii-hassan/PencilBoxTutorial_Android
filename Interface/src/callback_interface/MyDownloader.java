package callback_interface;


import java.util.logging.Level;
import java.util.logging.Logger;

 
public class MyDownloader {
    public void startDownload(MyDownloadListener listener){
        System.out.println("Downloading.........");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    //System.out.println("Download completed...");
                    listener.onDownloadComplete("Download completed......");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }
    
}

package callback_interface;

 
public class TestClass {
    public static void main(String[] args) {
        MyDownloader downloader = new MyDownloader();
        downloader.startDownload(new MyDownloadListener() {
            @Override
            public void onDownloadComplete(String msg) {
                System.out.println(msg);
            }
        } );
        
        System.out.println(2+2);
    }
    
}

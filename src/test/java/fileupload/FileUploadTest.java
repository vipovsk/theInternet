package fileupload;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTestNew {
    @Test

    public void testUploadFile(){
        FileUploadPage fileUploadpage = homepage.clickFileUpload();
        fileUploadpage.uploadFile("C:\\Users\\убийца винтов\\IdeaProjects\\theInternet\\src\\chromedriver.exe");
        Assert.assertEquals(fileUploadpage.getUploadedFiles(),
                "chromedriver.exe",
                "Wrong files uploded");
    }

}

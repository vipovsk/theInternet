package frames;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class WYSIWYGTest extends BaseTestNew {
    @Test
    public void testWysiwyg(){
        WYSIWYGEditorPage editorpage = homepage.clickWysiwygEditor();
        editorpage.clearTextArea();
        editorpage.typeTexttoTextArea("Я шагаю по столу");
        editorpage.increaseIndent();
        editorpage.typeTexttoTextArea(" как Назарбаев в Астану");
        Assert.assertEquals(editorpage.getTextAreaContent(), "Я шагаю по столу как Назарбаев в Астану", "Wrong text");
        
    }


}

package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GalleryTests extends BaseTestsPage {
    @BeforeClass
    public void setUp() {
        getNavigationMenuPage().driverGoToLogin();
        getLoginPage().login(getEmail(), getPassword());

    }

    @Test(priority = 1)
    public void addAGallery() {
        getAllGalleriesPage().clickCreateGallery();
        getAllGalleriesPage().makeAGallery(getGalleryTitle(), getGalleryDescription(), getImage1(), getImage2());
        getAllGalleriesPage().clickMyGalleryOptions();

        Assert.assertTrue(getAllGalleriesPage().firstGalleryTitle().contains(getGalleryTitle()));


    }

    @Test(priority = 4)
    public void editGallery() {
        getAllGalleriesPage().clickMyGalleryOptions();
        getAllGalleriesPage().clickFirstGallery();
        getAllGalleriesPage().clickEditGalleryBtn();
        getAllGalleriesPage().editGalleryTitle(getGalleryTitleEdited());
        getAllGalleriesPage().clickSubmitBtn();
        Assert.assertTrue(getAllGalleriesPage().editedGalleryNotificationText().contains("GALLERY EDITED"));


    }

    @Test(priority = 6)
    public void addComment() {
        getAllGalleriesPage().addComment(getCommentOnGallery());
        Assert.assertTrue(getAllGalleriesPage().getCommentTitleText().contains(getCommentOnGallery()));

    }

    @Test(priority = 8)
    public void deleteComment(){
        getAllGalleriesPage().clickMyGalleryOptions();
        getAllGalleriesPage().clickFirstGallery();
        getAllGalleriesPage().clickDeleteCommentBtn();
        getAllGalleriesPage().closeAlert();
        Assert.assertTrue(getAllGalleriesPage().isCommentListEmpty());

    }


    @Test(priority = 10)
    public void deleteGallery() {
        getAllGalleriesPage().clickMyGalleryOptions();
        getAllGalleriesPage().clickFirstGallery();
        getAllGalleriesPage().clickDeleteGalleryBtn();
        getAllGalleriesPage().closeAlert();
        getAllGalleriesPage().clickMyGalleryOptions();
        Assert.assertTrue(getAllGalleriesPage().isNoGalleryFoundNotificationPresent());

    }
}

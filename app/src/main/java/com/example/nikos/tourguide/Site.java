package com.example.nikos.tourguide;

//{@link Site} represents an attraction that the user wants to see.
//It contains resource IDs for the title of the attraction, description of the attraction and image file for the attraction.
//
public class Site {

    /**
     * String resource ID for the title of the site
     */
    private int mTitleSite;

    /**
     * String resource ID for the description of the site
     */
    private int mDescriptionSite;

    /**
     * Image resource ID for the Site
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this Site
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Site object.
     *
     * @param titleSite       is the string resource ID for the title of the Site
     * @param descriptionSite is the string resource Id for the description of the Site
     * @param imageResourceId       is the drawable resource ID for the image associated with the Site
     */
    public Site(int titleSite, int descriptionSite, int imageResourceId) {
        mTitleSite = titleSite;
        mDescriptionSite = descriptionSite;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the title of the Site.
     */
    public int getTitleSite() {
        return mTitleSite;
    }

    /**
     * Get the string resource ID for the description of the Site.
     */
    public int getDescriptionSite() {
        return mDescriptionSite;
    }

    /**
     * Return the image resource ID of the Site.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Site;
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}


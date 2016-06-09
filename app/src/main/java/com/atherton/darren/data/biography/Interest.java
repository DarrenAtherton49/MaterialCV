
package com.atherton.darren.data.biography;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Interest {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("image")
    @Expose
    private String image;

    /**
     * 
     * @return
     *     The title of the interest
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The title of the interest
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     An image to display alongside the interest text
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     An image to display alongside the interest text
     */
    public void setImage(String image) {
        this.image = image;
    }

}

package com.arwrld.artwitter.models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by davidhodge on 1/26/18.
 */

public class Description {
    @Expose
    private List<Object> urls = new ArrayList<Object>();

    /**
     *
     * @return
     *     The urls
     */
    public List<Object> getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     *     The urls
     */
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }
}

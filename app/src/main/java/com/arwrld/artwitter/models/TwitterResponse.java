package com.arwrld.artwitter.models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidhodge on 1/26/18.
 */

public class TwitterResponse {
    @Expose
    private List<Status> statuses = new ArrayList<>();

    /**
     *
     * @return
     *     The statuses
     */
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     *
     * @param statuses
     *     The statuses
     */
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }
}

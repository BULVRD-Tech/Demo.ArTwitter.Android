package com.arwrld.artwitter.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by davidhodge on 1/26/18.
 */

public class Status {
//    @Expose
//    private Object coordinates;
    @Expose
    private Boolean favorited;
    @Expose
    private Boolean truncated;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @Expose
    private Object contributors;
    @Expose
    private String text;
    @SerializedName("retweet_count")
    @Expose
    private Integer retweetCount;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @Expose
    private String id;
    @SerializedName("coordinates")
    @Expose
    private Geo geo;
    @Expose
    private Boolean retweeted;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @Expose
    private Object place;
    @Expose
    private User user;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @Expose
    private String source;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;

    /**
     *
     * @return
     *     The coordinates
     */
//    public Object getCoordinates() {
//        return coordinates;
//    }
//
//    /**
//     *
//     * @param coordinates
//     *     The coordinates
//     */
//    public void setCoordinates(Object coordinates) {
//        this.coordinates = coordinates;
//    }

    /**
     *
     * @return
     *     The favorited
     */
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     *
     * @param favorited
     *     The favorited
     */
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     *
     * @return
     *     The truncated
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     *
     * @param truncated
     *     The truncated
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     *
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     *     The idStr
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     *
     * @param idStr
     *     The id_str
     */
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     *
     * @return
     *     The inReplyToUserIdStr
     */
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     *
     * @param inReplyToUserIdStr
     *     The in_reply_to_user_id_str
     */
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    /**
     *
     * @return
     *     The contributors
     */
    public Object getContributors() {
        return contributors;
    }

    /**
     *
     * @param contributors
     *     The contributors
     */
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     *
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     *     The retweetCount
     */
    public Integer getRetweetCount() {
        return retweetCount;
    }

    /**
     *
     * @param retweetCount
     *     The retweet_count
     */
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     *
     * @return
     *     The inReplyToStatusIdStr
     */
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     *
     * @param inReplyToStatusIdStr
     *     The in_reply_to_status_id_str
     */
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The geo
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     *
     * @param geo
     *     The geo
     */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    /**
     *
     * @return
     *     The retweeted
     */
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     *
     * @param retweeted
     *     The retweeted
     */
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     *
     * @return
     *     The inReplyToUserId
     */
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     *
     * @param inReplyToUserId
     *     The in_reply_to_user_id
     */
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     *
     * @return
     *     The place
     */
    public Object getPlace() {
        return place;
    }

    /**
     *
     * @param place
     *     The place
     */
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     *
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     *     The inReplyToScreenName
     */
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     *
     * @param inReplyToScreenName
     *     The in_reply_to_screen_name
     */
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     *
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     *     The inReplyToStatusId
     */
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     *
     * @param inReplyToStatusId
     *     The in_reply_to_status_id
     */
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }
}

package com.arwrld.artwitter.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by davidhodge on 1/26/18.
 */

public class User {
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    private String profileSidebarFillColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    private String profileSidebarBorderColor;
    @SerializedName("profile_background_tile")
    @Expose
    private Boolean profileBackgroundTile;
    @Expose
    private String name;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private String location;
    @SerializedName("follow_request_sent")
    @Expose
    private Object followRequestSent;
    @SerializedName("profile_link_color")
    @Expose
    private String profileLinkColor;
    @SerializedName("is_translator")
    @Expose
    private Boolean isTranslator;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("default_profile")
    @Expose
    private Boolean defaultProfile;
    @SerializedName("contributors_enabled")
    @Expose
    private Boolean contributorsEnabled;
    @SerializedName("favourites_count")
    @Expose
    private Integer favouritesCount;
    @Expose
    private String url;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("utc_offset")
    @Expose
    private Integer utcOffset;
    @Expose
    private String id;
    @SerializedName("profile_use_background_image")
    @Expose
    private Boolean profileUseBackgroundImage;
    @SerializedName("listed_count")
    @Expose
    private Integer listedCount;
    @SerializedName("profile_text_color")
    @Expose
    private String profileTextColor;
    @Expose
    private String lang;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @SerializedName("protected")
    @Expose
    private Boolean _protected;
    @Expose
    private Object notifications;
    @SerializedName("profile_background_image_url_https")
    @Expose
    private String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_color")
    @Expose
    private String profileBackgroundColor;
    @Expose
    private Boolean verified;
    @SerializedName("geo_enabled")
    @Expose
    private Boolean geoEnabled;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @Expose
    private String description;
    @SerializedName("default_profile_image")
    @Expose
    private Boolean defaultProfileImage;
    @SerializedName("profile_background_image_url")
    @Expose
    private String profileBackgroundImageUrl;
    @SerializedName("statuses_count")
    @Expose
    private Integer statusesCount;
    @SerializedName("friends_count")
    @Expose
    private Integer friendsCount;
    @Expose
    private Object following;
    @SerializedName("show_all_inline_media")
    @Expose
    private Boolean showAllInlineMedia;
    @SerializedName("screen_name")
    @Expose
    private String screenName;

    /**
     *
     * @return
     *     The profileSidebarFillColor
     */
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    /**
     *
     * @param profileSidebarFillColor
     *     The profile_sidebar_fill_color
     */
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    /**
     *
     * @return
     *     The profileSidebarBorderColor
     */
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    /**
     *
     * @param profileSidebarBorderColor
     *     The profile_sidebar_border_color
     */
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    /**
     *
     * @return
     *     The profileBackgroundTile
     */
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    /**
     *
     * @param profileBackgroundTile
     *     The profile_background_tile
     */
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The profileImageUrl
     */
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     *
     * @param profileImageUrl
     *     The profile_image_url
     */
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
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
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     *     The followRequestSent
     */
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    /**
     *
     * @param followRequestSent
     *     The follow_request_sent
     */
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    /**
     *
     * @return
     *     The profileLinkColor
     */
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    /**
     *
     * @param profileLinkColor
     *     The profile_link_color
     */
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    /**
     *
     * @return
     *     The isTranslator
     */
    public Boolean getIsTranslator() {
        return isTranslator;
    }

    /**
     *
     * @param isTranslator
     *     The is_translator
     */
    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
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
     *     The defaultProfile
     */
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    /**
     *
     * @param defaultProfile
     *     The default_profile
     */
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    /**
     *
     * @return
     *     The contributorsEnabled
     */
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    /**
     *
     * @param contributorsEnabled
     *     The contributors_enabled
     */
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    /**
     *
     * @return
     *     The favouritesCount
     */
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    /**
     *
     * @param favouritesCount
     *     The favourites_count
     */
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     *
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     *     The profileImageUrlHttps
     */
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     *
     * @param profileImageUrlHttps
     *     The profile_image_url_https
     */
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    /**
     *
     * @return
     *     The utcOffset
     */
    public Integer getUtcOffset() {
        return utcOffset;
    }

    /**
     *
     * @param utcOffset
     *     The utc_offset
     */
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
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
     *     The profileUseBackgroundImage
     */
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    /**
     *
     * @param profileUseBackgroundImage
     *     The profile_use_background_image
     */
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    /**
     *
     * @return
     *     The listedCount
     */
    public Integer getListedCount() {
        return listedCount;
    }

    /**
     *
     * @param listedCount
     *     The listed_count
     */
    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    /**
     *
     * @return
     *     The profileTextColor
     */
    public String getProfileTextColor() {
        return profileTextColor;
    }

    /**
     *
     * @param profileTextColor
     *     The profile_text_color
     */
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    /**
     *
     * @return
     *     The lang
     */
    public String getLang() {
        return lang;
    }

    /**
     *
     * @param lang
     *     The lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     *
     * @return
     *     The followersCount
     */
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     *
     * @param followersCount
     *     The followers_count
     */
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     *
     * @return
     *     The _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    /**
     *
     * @param _protected
     *     The protected
     */
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    /**
     *
     * @return
     *     The notifications
     */
    public Object getNotifications() {
        return notifications;
    }

    /**
     *
     * @param notifications
     *     The notifications
     */
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    /**
     *
     * @return
     *     The profileBackgroundImageUrlHttps
     */
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    /**
     *
     * @param profileBackgroundImageUrlHttps
     *     The profile_background_image_url_https
     */
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    /**
     *
     * @return
     *     The profileBackgroundColor
     */
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    /**
     *
     * @param profileBackgroundColor
     *     The profile_background_color
     */
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    /**
     *
     * @return
     *     The verified
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     *
     * @param verified
     *     The verified
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     *
     * @return
     *     The geoEnabled
     */
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    /**
     *
     * @param geoEnabled
     *     The geo_enabled
     */
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    /**
     *
     * @return
     *     The timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     *
     * @param timeZone
     *     The time_zone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     *
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     *     The defaultProfileImage
     */
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    /**
     *
     * @param defaultProfileImage
     *     The default_profile_image
     */
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    /**
     *
     * @return
     *     The profileBackgroundImageUrl
     */
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    /**
     *
     * @param profileBackgroundImageUrl
     *     The profile_background_image_url
     */
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    /**
     *
     * @return
     *     The statusesCount
     */
    public Integer getStatusesCount() {
        return statusesCount;
    }

    /**
     *
     * @param statusesCount
     *     The statuses_count
     */
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    /**
     *
     * @return
     *     The friendsCount
     */
    public Integer getFriendsCount() {
        return friendsCount;
    }

    /**
     *
     * @param friendsCount
     *     The friends_count
     */
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    /**
     *
     * @return
     *     The following
     */
    public Object getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     *     The following
     */
    public void setFollowing(Object following) {
        this.following = following;
    }

    /**
     *
     * @return
     *     The showAllInlineMedia
     */
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    /**
     *
     * @param showAllInlineMedia
     *     The show_all_inline_media
     */
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    /**
     *
     * @return
     *     The screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     *
     * @param screenName
     *     The screen_name
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}

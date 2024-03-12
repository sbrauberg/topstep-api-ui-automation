package com.topstep.model.updateusermanagementservice.request;

public class User {
    private int profile_id;
    private UserProfileAttributes private_attributes;

    public User(int profile_id, UserProfileAttributes private_attributes) {
        this.profile_id = profile_id;
        this.private_attributes = private_attributes;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public UserProfileAttributes getPrivate_attributes() {
        return private_attributes;
    }

    public void setPrivate_attributes(UserProfileAttributes private_attributes) {
        this.private_attributes = private_attributes;
    }



}

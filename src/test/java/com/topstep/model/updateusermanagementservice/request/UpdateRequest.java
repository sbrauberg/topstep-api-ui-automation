package com.topstep.model.updateusermanagementservice.request;

public class UpdateRequest {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UpdateRequest generateUserRequest() {
        UserProfileAttributes userProfileAttributes = new UserProfileAttributes(1272015, 2, 0, 0, "a", "a", "a", "a", "a", "a", "a", new int[]{1});
        User user = new User(1272015, userProfileAttributes);
        return new UpdateRequest(user);
    }

    public UpdateRequest generateModifiedUserRequest() {
        UserProfileAttributes userProfileAttributes = new UserProfileAttributes(1272016, 2, 0, 0, "a", "a", "a", "a", "a", "a", "a", null);
        User user = new User(1272016, userProfileAttributes);
        return new UpdateRequest(user);
    }

    public UpdateRequest(User user) {
        this.user = user;
    }

    public UpdateRequest() {
    }
}

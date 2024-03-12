package com.topstep.model.signinmanagementservice.request;

public class SignInRequest {
    private String email;
    private String password;
    private boolean remember_me;
    private String device_uuid;
    private boolean ignoreAuthError;

    public SignInRequest() {
    }

    public SignInRequest(String email, String password, boolean remember_me, String device_uuid, boolean ignoreAuthError) {
        this.email = email;
        this.password = password;
        this.remember_me = remember_me;
        this.device_uuid = device_uuid;
        this.ignoreAuthError = ignoreAuthError;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember_me() {
        return remember_me;
    }

    public void setRemember_me(boolean remember_me) {
        this.remember_me = remember_me;
    }

    public String getDevice_uuid() {
        return device_uuid;
    }

    public void setDevice_uuid(String device_uuid) {
        this.device_uuid = device_uuid;
    }

    public boolean isIgnoreAuthError() {
        return ignoreAuthError;
    }

    public void setIgnoreAuthError(boolean ignoreAuthError) {
        this.ignoreAuthError = ignoreAuthError;
    }
}

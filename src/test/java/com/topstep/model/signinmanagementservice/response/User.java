package com.topstep.model.signinmanagementservice.response;

public class User {
    private int id;
    private long created_at;
    private long updated_at;
    private String email;
    private String first_name;
    private String last_name;
    private String username;
    private int legacy_user_id;
    private int profile_id;
    private int address_id;
    private int integration_id;
    private String status;
    private boolean approved_agreements;
    private boolean new_user_onboarding;
    private boolean show_new_sub_practice_account_modal;
    private boolean chart_overview_modal_viewed;
    private boolean daily_journal_modal_viewed;
    private int first_reset_discount_code_id;
    private String mobile_verification_number;
    private boolean mobile_verified;
    private boolean alerts_menu_viewed;
    private boolean welcome_video_viewed;
    private boolean hide_insights_onboarding_modal;
    private boolean show_funded_password_modal;
    private boolean coach_t_modal_viewed;
    private int mobile_verification_attempts;
    private boolean affiliate;
    private UserAddress address;
    private UserProfile profile;
    private boolean can_buy_topstep_x;
    private String avatar_url;
    private String confirmation_token;
    private long confirmed_at;
    private boolean has_payment_problem;
    private boolean has_datamarket_payment_problem;
    private String referral_link;
    private int trial_days_remaining;
    private boolean has_trial;
    private boolean has_step_1;
    private boolean has_step_2;
    private boolean has_funded;
    private boolean has_tradingview;
    private boolean has_quantower;
    private boolean has_ninjatrader;
    private boolean has_topstepx;
    private boolean has_t4;
    private boolean has_tradovate;
    private boolean has_accepted_trade_station_agreement;
    private boolean allow_trial;
    private boolean show_chart_overview_modal;
    private boolean show_daily_journal_modal;
    private String[] user_cohorts;
    private boolean has_live_tradovate_user;
    private boolean hide_switch_practice_account_modal;
    private boolean is_banned;
    private String banned_reason;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLegacy_user_id() {
        return legacy_user_id;
    }

    public void setLegacy_user_id(int legacy_user_id) {
        this.legacy_user_id = legacy_user_id;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getIntegration_id() {
        return integration_id;
    }

    public void setIntegration_id(int integration_id) {
        this.integration_id = integration_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isApproved_agreements() {
        return approved_agreements;
    }

    public void setApproved_agreements(boolean approved_agreements) {
        this.approved_agreements = approved_agreements;
    }

    public boolean isNew_user_onboarding() {
        return new_user_onboarding;
    }

    public void setNew_user_onboarding(boolean new_user_onboarding) {
        this.new_user_onboarding = new_user_onboarding;
    }

    public boolean isShow_new_sub_practice_account_modal() {
        return show_new_sub_practice_account_modal;
    }

    public void setShow_new_sub_practice_account_modal(boolean show_new_sub_practice_account_modal) {
        this.show_new_sub_practice_account_modal = show_new_sub_practice_account_modal;
    }

    public boolean isChart_overview_modal_viewed() {
        return chart_overview_modal_viewed;
    }

    public void setChart_overview_modal_viewed(boolean chart_overview_modal_viewed) {
        this.chart_overview_modal_viewed = chart_overview_modal_viewed;
    }

    public boolean isDaily_journal_modal_viewed() {
        return daily_journal_modal_viewed;
    }

    public void setDaily_journal_modal_viewed(boolean daily_journal_modal_viewed) {
        this.daily_journal_modal_viewed = daily_journal_modal_viewed;
    }

    public int getFirst_reset_discount_code_id() {
        return first_reset_discount_code_id;
    }

    public void setFirst_reset_discount_code_id(int first_reset_discount_code_id) {
        this.first_reset_discount_code_id = first_reset_discount_code_id;
    }

    public String getMobile_verification_number() {
        return mobile_verification_number;
    }

    public void setMobile_verification_number(String mobile_verification_number) {
        this.mobile_verification_number = mobile_verification_number;
    }

    public boolean isMobile_verified() {
        return mobile_verified;
    }

    public void setMobile_verified(boolean mobile_verified) {
        this.mobile_verified = mobile_verified;
    }

    public boolean isAlerts_menu_viewed() {
        return alerts_menu_viewed;
    }

    public void setAlerts_menu_viewed(boolean alerts_menu_viewed) {
        this.alerts_menu_viewed = alerts_menu_viewed;
    }

    public boolean isWelcome_video_viewed() {
        return welcome_video_viewed;
    }

    public void setWelcome_video_viewed(boolean welcome_video_viewed) {
        this.welcome_video_viewed = welcome_video_viewed;
    }

    public boolean isHide_insights_onboarding_modal() {
        return hide_insights_onboarding_modal;
    }

    public void setHide_insights_onboarding_modal(boolean hide_insights_onboarding_modal) {
        this.hide_insights_onboarding_modal = hide_insights_onboarding_modal;
    }

    public boolean isShow_funded_password_modal() {
        return show_funded_password_modal;
    }

    public void setShow_funded_password_modal(boolean show_funded_password_modal) {
        this.show_funded_password_modal = show_funded_password_modal;
    }

    public boolean isCoach_t_modal_viewed() {
        return coach_t_modal_viewed;
    }

    public void setCoach_t_modal_viewed(boolean coach_t_modal_viewed) {
        this.coach_t_modal_viewed = coach_t_modal_viewed;
    }

    public int getMobile_verification_attempts() {
        return mobile_verification_attempts;
    }

    public void setMobile_verification_attempts(int mobile_verification_attempts) {
        this.mobile_verification_attempts = mobile_verification_attempts;
    }

    public boolean isAffiliate() {
        return affiliate;
    }

    public void setAffiliate(boolean affiliate) {
        this.affiliate = affiliate;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public boolean isCan_buy_topstep_x() {
        return can_buy_topstep_x;
    }

    public void setCan_buy_topstep_x(boolean can_buy_topstep_x) {
        this.can_buy_topstep_x = can_buy_topstep_x;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getConfirmation_token() {
        return confirmation_token;
    }

    public void setConfirmation_token(String confirmation_token) {
        this.confirmation_token = confirmation_token;
    }

    public long getConfirmed_at() {
        return confirmed_at;
    }

    public void setConfirmed_at(long confirmed_at) {
        this.confirmed_at = confirmed_at;
    }

    public boolean isHas_payment_problem() {
        return has_payment_problem;
    }

    public void setHas_payment_problem(boolean has_payment_problem) {
        this.has_payment_problem = has_payment_problem;
    }

    public boolean isHas_datamarket_payment_problem() {
        return has_datamarket_payment_problem;
    }

    public void setHas_datamarket_payment_problem(boolean has_datamarket_payment_problem) {
        this.has_datamarket_payment_problem = has_datamarket_payment_problem;
    }

    public String getReferral_link() {
        return referral_link;
    }

    public void setReferral_link(String referral_link) {
        this.referral_link = referral_link;
    }

    public int getTrial_days_remaining() {
        return trial_days_remaining;
    }

    public void setTrial_days_remaining(int trial_days_remaining) {
        this.trial_days_remaining = trial_days_remaining;
    }

    public boolean isHas_trial() {
        return has_trial;
    }

    public void setHas_trial(boolean has_trial) {
        this.has_trial = has_trial;
    }

    public boolean isHas_step_1() {
        return has_step_1;
    }

    public void setHas_step_1(boolean has_step_1) {
        this.has_step_1 = has_step_1;
    }

    public boolean isHas_step_2() {
        return has_step_2;
    }

    public void setHas_step_2(boolean has_step_2) {
        this.has_step_2 = has_step_2;
    }

    public boolean isHas_funded() {
        return has_funded;
    }

    public void setHas_funded(boolean has_funded) {
        this.has_funded = has_funded;
    }

    public boolean isHas_tradingview() {
        return has_tradingview;
    }

    public void setHas_tradingview(boolean has_tradingview) {
        this.has_tradingview = has_tradingview;
    }

    public boolean isHas_quantower() {
        return has_quantower;
    }

    public void setHas_quantower(boolean has_quantower) {
        this.has_quantower = has_quantower;
    }

    public boolean isHas_ninjatrader() {
        return has_ninjatrader;
    }

    public void setHas_ninjatrader(boolean has_ninjatrader) {
        this.has_ninjatrader = has_ninjatrader;
    }

    public boolean isHas_topstepx() {
        return has_topstepx;
    }

    public void setHas_topstepx(boolean has_topstepx) {
        this.has_topstepx = has_topstepx;
    }

    public boolean isHas_t4() {
        return has_t4;
    }

    public void setHas_t4(boolean has_t4) {
        this.has_t4 = has_t4;
    }

    public boolean isHas_tradovate() {
        return has_tradovate;
    }

    public void setHas_tradovate(boolean has_tradovate) {
        this.has_tradovate = has_tradovate;
    }

    public boolean isHas_accepted_trade_station_agreement() {
        return has_accepted_trade_station_agreement;
    }

    public void setHas_accepted_trade_station_agreement(boolean has_accepted_trade_station_agreement) {
        this.has_accepted_trade_station_agreement = has_accepted_trade_station_agreement;
    }

    public boolean isAllow_trial() {
        return allow_trial;
    }

    public void setAllow_trial(boolean allow_trial) {
        this.allow_trial = allow_trial;
    }

    public boolean isShow_chart_overview_modal() {
        return show_chart_overview_modal;
    }

    public void setShow_chart_overview_modal(boolean show_chart_overview_modal) {
        this.show_chart_overview_modal = show_chart_overview_modal;
    }

    public boolean isShow_daily_journal_modal() {
        return show_daily_journal_modal;
    }

    public void setShow_daily_journal_modal(boolean show_daily_journal_modal) {
        this.show_daily_journal_modal = show_daily_journal_modal;
    }

    public String[] getUser_cohorts() {
        return user_cohorts;
    }

    public void setUser_cohorts(String[] user_cohorts) {
        this.user_cohorts = user_cohorts;
    }

    public boolean isHas_live_tradovate_user() {
        return has_live_tradovate_user;
    }

    public void setHas_live_tradovate_user(boolean has_live_tradovate_user) {
        this.has_live_tradovate_user = has_live_tradovate_user;
    }

    public boolean isHide_switch_practice_account_modal() {
        return hide_switch_practice_account_modal;
    }

    public void setHide_switch_practice_account_modal(boolean hide_switch_practice_account_modal) {
        this.hide_switch_practice_account_modal = hide_switch_practice_account_modal;
    }

    public boolean isIs_banned() {
        return is_banned;
    }

    public void setIs_banned(boolean is_banned) {
        this.is_banned = is_banned;
    }

    public String getBanned_reason() {
        return banned_reason;
    }

    public void setBanned_reason(String banned_reason) {
        this.banned_reason = banned_reason;
    }
}

package com.topstep.model.updateusermanagementservice.request;

public class UserProfileAttributes {
    private int id;
    private int trading_hours;
    private int experience;
    private int preferred_chart_time;
    private String trader_background;
    private String motto;
    private String trading_style;
    private String short_term_goals;
    private String long_term_goals;
    private String trading_strengths;
    private String trading_weaknesses;
    private int[] trading_indicators;

    public UserProfileAttributes(int id, int trading_hours, int experience, int preferred_chart_time, String trader_background, String motto, String trading_style, String short_term_goals, String long_term_goals, String trading_strengths, String trading_weaknesses, int[] trading_indicators) {
        this.id = id;
        this.trading_hours = trading_hours;
        this.experience = experience;
        this.preferred_chart_time = preferred_chart_time;
        this.trader_background = trader_background;
        this.motto = motto;
        this.trading_style = trading_style;
        this.short_term_goals = short_term_goals;
        this.long_term_goals = long_term_goals;
        this.trading_strengths = trading_strengths;
        this.trading_weaknesses = trading_weaknesses;
        this.trading_indicators = trading_indicators;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrading_hours() {
        return trading_hours;
    }

    public void setTrading_hours(int trading_hours) {
        this.trading_hours = trading_hours;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPreferred_chart_time() {
        return preferred_chart_time;
    }

    public void setPreferred_chart_time(int preferred_chart_time) {
        this.preferred_chart_time = preferred_chart_time;
    }

    public String getTrader_background() {
        return trader_background;
    }

    public void setTrader_background(String trader_background) {
        this.trader_background = trader_background;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getTrading_style() {
        return trading_style;
    }

    public void setTrading_style(String trading_style) {
        this.trading_style = trading_style;
    }

    public String getShort_term_goals() {
        return short_term_goals;
    }

    public void setShort_term_goals(String short_term_goals) {
        this.short_term_goals = short_term_goals;
    }

    public String getLong_term_goals() {
        return long_term_goals;
    }

    public void setLong_term_goals(String long_term_goals) {
        this.long_term_goals = long_term_goals;
    }

    public String getTrading_strengths() {
        return trading_strengths;
    }

    public void setTrading_strengths(String trading_strengths) {
        this.trading_strengths = trading_strengths;
    }

    public String getTrading_weaknesses() {
        return trading_weaknesses;
    }

    public void setTrading_weaknesses(String trading_weaknesses) {
        this.trading_weaknesses = trading_weaknesses;
    }

    public int[] getTrading_indicators() {
        return trading_indicators;
    }

    public void setTrading_indicators(int[] trading_indicators) {
        this.trading_indicators = trading_indicators;
    }
}

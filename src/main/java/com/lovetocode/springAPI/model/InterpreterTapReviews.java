package com.lovetocode.springAPI.model;

import javax.persistence.*;

/**
 * Created by macbook on 5/29/17.
 */
@Entity
@Table(name = "tbl_reviews")
public class InterpreterTapReviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "interpreter_id")
    private int interpreterId;

    @Column(name = "call_rate")
    private int callRating;

    @Column(name = "call_feedback")
    private String callFeedback;

    @Column(name = "call_feedback_date")
    private String callFeedbackDate;

    @Column(name = "app_rate")
    private int appRating;

    @Column(name = "app_feedback")
    private String appFeedback;

    @Column(name = "app_feedback_date")
    private int appFeedbackDate;

    public InterpreterTapReviews(){

    }

    public InterpreterTapReviews(int id, int clientId, int interpreterId, int callRating,
                                 String callFeedback, String callFeedbackDate, int appRating,
                                 String appFeedback, int appFeedbackDate) {

        this.id = id;
        this.clientId = clientId;
        this.interpreterId = interpreterId;
        this.callRating = callRating;
        this.callFeedback = callFeedback;
        this.callFeedbackDate = callFeedbackDate;
        this.appRating = appRating;
        this.appFeedback = appFeedback;
        this.appFeedbackDate = appFeedbackDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getInterpreterId() {
        return interpreterId;
    }

    public void setInterpreterId(int interpreterId) {
        this.interpreterId = interpreterId;
    }

    public int getCallRating() {
        return callRating;
    }

    public void setCallRating(int callRating) {
        this.callRating = callRating;
    }

    public String getCallFeedback() {
        return callFeedback;
    }

    public void setCallFeedback(String callFeedback) {
        this.callFeedback = callFeedback;
    }

    public String getCallFeedbackDate() {
        return callFeedbackDate;
    }

    public void setCallFeedbackDate(String callFeedbackDate) {
        this.callFeedbackDate = callFeedbackDate;
    }

    public int getAppRating() {
        return appRating;
    }

    public void setAppRating(int appRating) {
        this.appRating = appRating;
    }

    public String getAppFeedback() {
        return appFeedback;
    }

    public void setAppFeedback(String appFeedback) {
        this.appFeedback = appFeedback;
    }

    public int getAppFeedbackDate() {
        return appFeedbackDate;
    }

    public void setAppFeedbackDate(int appFeedbackDate) {
        this.appFeedbackDate = appFeedbackDate;
    }
}

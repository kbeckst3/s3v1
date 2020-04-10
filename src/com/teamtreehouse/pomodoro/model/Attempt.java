package com.teamtreehouse.pomodoro.model;

public class Attempt {
    private String mMessage;
    private int mRemainingSeconds;


    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String message) {
        mMessage = message;
        mKind = kind;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "mMessage='" + mMessage + '\'' +
                ", mRemainingSeconds=" + mRemainingSeconds +
                ", mKind=" + mKind +
                '}';
    }


    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving: %s %n", this);
    }
}

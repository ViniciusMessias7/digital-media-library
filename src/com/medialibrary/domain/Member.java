package com.medialibrary.domain;

public class Member extends Person {
    private final String joinDate;
    private String membershipType;

    public Member(String name, String id, String joinDate, String membershipType) {
        super(name, id);
        this.joinDate = joinDate;
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "Member" +
                "\nName: " + getName() +
                "\nID: " + getId() +
                "\nJoinDate: " + this.joinDate +
                "\nMembership type: " + this.membershipType;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}

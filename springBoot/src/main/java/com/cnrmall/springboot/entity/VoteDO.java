package com.cnrmall.springboot.entity;

import java.util.Date;

public class VoteDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.id
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.nickname
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.gender
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.avatarUrl
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private String avatarurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.phone
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.voteid
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private Integer voteid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.openid
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_date
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    private Date voteDate;


    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.id
     *
     * @return the value of vote.id
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.id
     *
     * @param id the value for vote.id
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.nickname
     *
     * @return the value of vote.nickname
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.nickname
     *
     * @param nickname the value for vote.nickname
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.gender
     *
     * @return the value of vote.gender
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.gender
     *
     * @param gender the value for vote.gender
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.avatarUrl
     *
     * @return the value of vote.avatarUrl
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public String getAvatarurl() {
        return avatarurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.avatarUrl
     *
     * @param avatarurl the value for vote.avatarUrl
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.phone
     *
     * @return the value of vote.phone
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.phone
     *
     * @param phone the value for vote.phone
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.voteid
     *
     * @return the value of vote.voteid
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public Integer getVoteid() {
        return voteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.voteid
     *
     * @param voteid the value for vote.voteid
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.openid
     *
     * @return the value of vote.openid
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.openid
     *
     * @param openid the value for vote.openid
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_date
     *
     * @return the value of vote.vote_date
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public Date getVoteDate() {
        return voteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_date
     *
     * @param voteDate the value for vote.vote_date
     *
     * @mbg.generated Wed Nov 13 09:21:40 CST 2019
     */
    public void setVoteDate(Date voteDate) {
        this.voteDate = voteDate;
    }
}
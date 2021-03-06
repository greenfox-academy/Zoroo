package com.greenfox.zoroo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  private String username;
  @NotNull
  private String password;
  @Column(name = "good_answers")
  private int goodAnswers;
  @Column(name = "bad_answers")
  private int badAnswers;
  @Transient
  private int totalNumberOfQuestionsAnswered;
  @Transient
  private float precentage;

  public UserProfile() {
  }

  public UserProfile(String username, String password, int goodAnswers, int badAnswers,
      int totalNumberOfQuestionsAnswered, float precentage) {
    this.username = username;
    this.password = password;
    this.goodAnswers = goodAnswers;
    this.badAnswers = badAnswers;
    this.totalNumberOfQuestionsAnswered = totalNumberOfQuestionsAnswered;
    this.precentage = precentage;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getGoodAnswers() {
    return goodAnswers;
  }

  public void setGoodAnswers(int goodAnswers) {
    this.goodAnswers = goodAnswers;
  }

  public int getBadAnswers() {
    return badAnswers;
  }

  public void setBadAnswers(int badAnswers) {
    this.badAnswers = badAnswers;
  }

  public int getTotalNumberOfQuestionsAnswered() {
    return totalNumberOfQuestionsAnswered;
  }

  public void setTotalNumberOfQuestionsAnswered(int totalNumberOfQuestionsAnswered) {
    this.totalNumberOfQuestionsAnswered = totalNumberOfQuestionsAnswered;
  }

  public float getPrecentage() {
    return precentage;
  }

  public void setPrecentage(float precentage) {
    this.precentage = precentage;
  }
}

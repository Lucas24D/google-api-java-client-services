/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Extension data for use in Maps Product Profile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiMapsExtendedData extends com.google.api.client.json.GenericJson {

  /**
   * Failure type if there is an error when fetching product profile data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiProductProfileFailure failure;

  /**
   * Number of people the user is following.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long followeeCount;

  /**
   * Number of people who are following the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer followerCount;

  /**
   * Sum of creators contributions i.e. reviews, rating, questions, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numContributions;

  /**
   * The user's profile photo that might have a badge rendered at the corner if the user is eligible
   * for a badge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profilePhotoUrl;

  /**
   * A user's bio, or tagline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagline;

  /**
   * A topic that creator has expertise in. This will be in the format: emoji associated with the
   * topic, display name of the topic, topic score
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> topicExpertise;

  /**
   * A user's caption displayed under the user name on their profile page i.e. 'Local Guide Level 8'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userCaption;

  /**
   * Failure type if there is an error when fetching product profile data.
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiProductProfileFailure getFailure() {
    return failure;
  }

  /**
   * Failure type if there is an error when fetching product profile data.
   * @param failure failure or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setFailure(AppsPeopleOzExternalMergedpeopleapiProductProfileFailure failure) {
    this.failure = failure;
    return this;
  }

  /**
   * Number of people the user is following.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFolloweeCount() {
    return followeeCount;
  }

  /**
   * Number of people the user is following.
   * @param followeeCount followeeCount or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setFolloweeCount(java.lang.Long followeeCount) {
    this.followeeCount = followeeCount;
    return this;
  }

  /**
   * Number of people who are following the user.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFollowerCount() {
    return followerCount;
  }

  /**
   * Number of people who are following the user.
   * @param followerCount followerCount or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setFollowerCount(java.lang.Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

  /**
   * Sum of creators contributions i.e. reviews, rating, questions, etc.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumContributions() {
    return numContributions;
  }

  /**
   * Sum of creators contributions i.e. reviews, rating, questions, etc.
   * @param numContributions numContributions or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setNumContributions(java.lang.Long numContributions) {
    this.numContributions = numContributions;
    return this;
  }

  /**
   * The user's profile photo that might have a badge rendered at the corner if the user is eligible
   * for a badge.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfilePhotoUrl() {
    return profilePhotoUrl;
  }

  /**
   * The user's profile photo that might have a badge rendered at the corner if the user is eligible
   * for a badge.
   * @param profilePhotoUrl profilePhotoUrl or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setProfilePhotoUrl(java.lang.String profilePhotoUrl) {
    this.profilePhotoUrl = profilePhotoUrl;
    return this;
  }

  /**
   * A user's bio, or tagline.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagline() {
    return tagline;
  }

  /**
   * A user's bio, or tagline.
   * @param tagline tagline or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setTagline(java.lang.String tagline) {
    this.tagline = tagline;
    return this;
  }

  /**
   * A topic that creator has expertise in. This will be in the format: emoji associated with the
   * topic, display name of the topic, topic score
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTopicExpertise() {
    return topicExpertise;
  }

  /**
   * A topic that creator has expertise in. This will be in the format: emoji associated with the
   * topic, display name of the topic, topic score
   * @param topicExpertise topicExpertise or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setTopicExpertise(java.util.List<java.lang.String> topicExpertise) {
    this.topicExpertise = topicExpertise;
    return this;
  }

  /**
   * A user's caption displayed under the user name on their profile page i.e. 'Local Guide Level 8'
   * @return value or {@code null} for none
   */
  public java.lang.String getUserCaption() {
    return userCaption;
  }

  /**
   * A user's caption displayed under the user name on their profile page i.e. 'Local Guide Level 8'
   * @param userCaption userCaption or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData setUserCaption(java.lang.String userCaption) {
    this.userCaption = userCaption;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiMapsExtendedData) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiMapsExtendedData clone() {
    return (AppsPeopleOzExternalMergedpeopleapiMapsExtendedData) super.clone();
  }

}

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
 * A group of contacts for a given user, as described in
 * http://cs/p#google3/focus/backend/proto/backend.proto Historically (and in still-existing ACLs),
 * this was used to represent Google+ circles as well as contact groups, but this use is now
 * deprecated. New code should use the CIRCLE principal type to represent Google+ circles.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityCredentialsContactGroupProto extends com.google.api.client.json.GenericJson {

  /**
   * Group ID is unique only relative to the owner's Gaia ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long groupId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ownerGaiaId;

  /**
   * If present, then tests for membership in this ContactGroup must use data known to be at least
   * as fresh as the given (FBS-assigned) timestamp. See http://go/fbs-consistent-read-after-
   * important-write Before using this, be sure that any service checking authorization against this
   * group supports checking consistency timestamps. For example, as of 12/2011, Keystore only
   * supports this for the Moonshine configuration, and in others authorization checks will fail if
   * the timestamp is present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long requiredConsistencyTimestampUsec;

  /**
   * Group ID is unique only relative to the owner's Gaia ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGroupId() {
    return groupId;
  }

  /**
   * Group ID is unique only relative to the owner's Gaia ID.
   * @param groupId groupId or {@code null} for none
   */
  public SecurityCredentialsContactGroupProto setGroupId(java.lang.Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getOwnerGaiaId() {
    return ownerGaiaId;
  }

  /**
   * @param ownerGaiaId ownerGaiaId or {@code null} for none
   */
  public SecurityCredentialsContactGroupProto setOwnerGaiaId(java.lang.Long ownerGaiaId) {
    this.ownerGaiaId = ownerGaiaId;
    return this;
  }

  /**
   * If present, then tests for membership in this ContactGroup must use data known to be at least
   * as fresh as the given (FBS-assigned) timestamp. See http://go/fbs-consistent-read-after-
   * important-write Before using this, be sure that any service checking authorization against this
   * group supports checking consistency timestamps. For example, as of 12/2011, Keystore only
   * supports this for the Moonshine configuration, and in others authorization checks will fail if
   * the timestamp is present.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRequiredConsistencyTimestampUsec() {
    return requiredConsistencyTimestampUsec;
  }

  /**
   * If present, then tests for membership in this ContactGroup must use data known to be at least
   * as fresh as the given (FBS-assigned) timestamp. See http://go/fbs-consistent-read-after-
   * important-write Before using this, be sure that any service checking authorization against this
   * group supports checking consistency timestamps. For example, as of 12/2011, Keystore only
   * supports this for the Moonshine configuration, and in others authorization checks will fail if
   * the timestamp is present.
   * @param requiredConsistencyTimestampUsec requiredConsistencyTimestampUsec or {@code null} for none
   */
  public SecurityCredentialsContactGroupProto setRequiredConsistencyTimestampUsec(java.lang.Long requiredConsistencyTimestampUsec) {
    this.requiredConsistencyTimestampUsec = requiredConsistencyTimestampUsec;
    return this;
  }

  @Override
  public SecurityCredentialsContactGroupProto set(String fieldName, Object value) {
    return (SecurityCredentialsContactGroupProto) super.set(fieldName, value);
  }

  @Override
  public SecurityCredentialsContactGroupProto clone() {
    return (SecurityCredentialsContactGroupProto) super.clone();
  }

}

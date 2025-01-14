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
 * From google3/quality/qrewrite/proto/account_provenance.proto;l=14 We need to copy this as the
 * above proto has Enum field which is not compatible between proto2 and proto3. go/proto2-versus-
 * proto3#enums
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantLogsCommunicationGoogleAccountProvenance extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long gaiaId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDasherAccount;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public AssistantLogsCommunicationGoogleAccountProvenance setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getGaiaId() {
    return gaiaId;
  }

  /**
   * @param gaiaId gaiaId or {@code null} for none
   */
  public AssistantLogsCommunicationGoogleAccountProvenance setGaiaId(java.lang.Long gaiaId) {
    this.gaiaId = gaiaId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDasherAccount() {
    return isDasherAccount;
  }

  /**
   * @param isDasherAccount isDasherAccount or {@code null} for none
   */
  public AssistantLogsCommunicationGoogleAccountProvenance setIsDasherAccount(java.lang.Boolean isDasherAccount) {
    this.isDasherAccount = isDasherAccount;
    return this;
  }

  @Override
  public AssistantLogsCommunicationGoogleAccountProvenance set(String fieldName, Object value) {
    return (AssistantLogsCommunicationGoogleAccountProvenance) super.set(fieldName, value);
  }

  @Override
  public AssistantLogsCommunicationGoogleAccountProvenance clone() {
    return (AssistantLogsCommunicationGoogleAccountProvenance) super.clone();
  }

}

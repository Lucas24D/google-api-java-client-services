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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1AliasRevisionConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1AliasRevisionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Location of the alias file. For example, a Google Cloud Storage URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Name of the alias revision included in the keystore in the following format:
   * `organizations/{org}/environments/{env}/keystores/{keystore}/aliases/{alias}/revisions/{rev}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Location of the alias file. For example, a Google Cloud Storage URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location of the alias file. For example, a Google Cloud Storage URI.
   * @param location location or {@code null} for none
   */
  public GoogleCloudApigeeV1AliasRevisionConfig setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of the alias revision included in the keystore in the following format:
   * `organizations/{org}/environments/{env}/keystores/{keystore}/aliases/{alias}/revisions/{rev}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the alias revision included in the keystore in the following format:
   * `organizations/{org}/environments/{env}/keystores/{keystore}/aliases/{alias}/revisions/{rev}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1AliasRevisionConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public GoogleCloudApigeeV1AliasRevisionConfig setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1AliasRevisionConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1AliasRevisionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1AliasRevisionConfig clone() {
    return (GoogleCloudApigeeV1AliasRevisionConfig) super.clone();
  }

}
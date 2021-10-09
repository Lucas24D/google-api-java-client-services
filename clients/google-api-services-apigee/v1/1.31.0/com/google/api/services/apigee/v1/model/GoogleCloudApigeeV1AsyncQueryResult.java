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
 * Model definition for GoogleCloudApigeeV1AsyncQueryResult.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1AsyncQueryResult extends com.google.api.client.json.GenericJson {

  /**
   * Query result will be unaccessable after this time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expires;

  /**
   * Self link of the query results. Example:
   * `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
   * or following format if query is running at host level:
   * `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String self;

  /**
   * Query result will be unaccessable after this time.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpires() {
    return expires;
  }

  /**
   * Query result will be unaccessable after this time.
   * @param expires expires or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResult setExpires(java.lang.String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Self link of the query results. Example:
   * `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
   * or following format if query is running at host level:
   * `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
   * @return value or {@code null} for none
   */
  public java.lang.String getSelf() {
    return self;
  }

  /**
   * Self link of the query results. Example:
   * `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
   * or following format if query is running at host level:
   * `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
   * @param self self or {@code null} for none
   */
  public GoogleCloudApigeeV1AsyncQueryResult setSelf(java.lang.String self) {
    this.self = self;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1AsyncQueryResult set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1AsyncQueryResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1AsyncQueryResult clone() {
    return (GoogleCloudApigeeV1AsyncQueryResult) super.clone();
  }

}
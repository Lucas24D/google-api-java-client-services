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
 * Device annotation mention from query
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantLogsDeviceAnnotationLog extends com.google.api.client.json.GenericJson {

  /**
   * The raw text mentioning a device from the query, such as "any tv".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawTextFromQuery;

  /**
   * The annotation type mentioned in the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The matched device name set by the user, such as "big screen tv".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userDefinedName;

  /**
   * The raw text mentioning a device from the query, such as "any tv".
   * @return value or {@code null} for none
   */
  public java.lang.String getRawTextFromQuery() {
    return rawTextFromQuery;
  }

  /**
   * The raw text mentioning a device from the query, such as "any tv".
   * @param rawTextFromQuery rawTextFromQuery or {@code null} for none
   */
  public AssistantLogsDeviceAnnotationLog setRawTextFromQuery(java.lang.String rawTextFromQuery) {
    this.rawTextFromQuery = rawTextFromQuery;
    return this;
  }

  /**
   * The annotation type mentioned in the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The annotation type mentioned in the query.
   * @param type type or {@code null} for none
   */
  public AssistantLogsDeviceAnnotationLog setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The matched device name set by the user, such as "big screen tv".
   * @return value or {@code null} for none
   */
  public java.lang.String getUserDefinedName() {
    return userDefinedName;
  }

  /**
   * The matched device name set by the user, such as "big screen tv".
   * @param userDefinedName userDefinedName or {@code null} for none
   */
  public AssistantLogsDeviceAnnotationLog setUserDefinedName(java.lang.String userDefinedName) {
    this.userDefinedName = userDefinedName;
    return this;
  }

  @Override
  public AssistantLogsDeviceAnnotationLog set(String fieldName, Object value) {
    return (AssistantLogsDeviceAnnotationLog) super.set(fieldName, value);
  }

  @Override
  public AssistantLogsDeviceAnnotationLog clone() {
    return (AssistantLogsDeviceAnnotationLog) super.clone();
  }

}

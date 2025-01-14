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
 * Model definition for SocialGraphApiProtoHostAppInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SocialGraphApiProtoHostAppInfo extends com.google.api.client.json.GenericJson {

  /**
   * This string will represent the info for the host app to the Companion sidebar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostAppName;

  /**
   * This string will represent the info for the host app to the Companion sidebar
   * @return value or {@code null} for none
   */
  public java.lang.String getHostAppName() {
    return hostAppName;
  }

  /**
   * This string will represent the info for the host app to the Companion sidebar
   * @param hostAppName hostAppName or {@code null} for none
   */
  public SocialGraphApiProtoHostAppInfo setHostAppName(java.lang.String hostAppName) {
    this.hostAppName = hostAppName;
    return this;
  }

  @Override
  public SocialGraphApiProtoHostAppInfo set(String fieldName, Object value) {
    return (SocialGraphApiProtoHostAppInfo) super.set(fieldName, value);
  }

  @Override
  public SocialGraphApiProtoHostAppInfo clone() {
    return (SocialGraphApiProtoHostAppInfo) super.clone();
  }

}

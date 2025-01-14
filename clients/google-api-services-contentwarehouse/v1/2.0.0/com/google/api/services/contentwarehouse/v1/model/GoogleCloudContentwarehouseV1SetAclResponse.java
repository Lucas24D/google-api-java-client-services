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
 * Response message for DocumentService.SetAcl.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContentwarehouseV1SetAclResponse extends com.google.api.client.json.GenericJson {

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1ResponseMetadata metadata;

  /**
   * The policy will be attached to a resource (e.g. projecct, document).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamV1Policy policy;

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1SetAclResponse setMetadata(GoogleCloudContentwarehouseV1ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The policy will be attached to a resource (e.g. projecct, document).
   * @return value or {@code null} for none
   */
  public GoogleIamV1Policy getPolicy() {
    return policy;
  }

  /**
   * The policy will be attached to a resource (e.g. projecct, document).
   * @param policy policy or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1SetAclResponse setPolicy(GoogleIamV1Policy policy) {
    this.policy = policy;
    return this;
  }

  @Override
  public GoogleCloudContentwarehouseV1SetAclResponse set(String fieldName, Object value) {
    return (GoogleCloudContentwarehouseV1SetAclResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContentwarehouseV1SetAclResponse clone() {
    return (GoogleCloudContentwarehouseV1SetAclResponse) super.clone();
  }

}

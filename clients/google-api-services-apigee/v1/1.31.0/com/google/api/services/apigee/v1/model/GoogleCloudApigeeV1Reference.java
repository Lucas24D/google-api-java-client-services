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
 * A Reference configuration. References must refer to a keystore that also exists in the parent
 * environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1Reference extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A human-readable description of this reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The resource id of this reference. Values must match the regular expression
   * [\w\s\-.]+.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The id of the resource to which this reference refers. Must be the id of a resource
   * that exists in the parent environment and is of the given resource_type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refers;

  /**
   * The type of resource referred to by this reference. Valid values are 'KeyStore' or
   * 'TrustStore'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Optional. A human-readable description of this reference.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A human-readable description of this reference.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApigeeV1Reference setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The resource id of this reference. Values must match the regular expression
   * [\w\s\-.]+.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The resource id of this reference. Values must match the regular expression
   * [\w\s\-.]+.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1Reference setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The id of the resource to which this reference refers. Must be the id of a resource
   * that exists in the parent environment and is of the given resource_type.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefers() {
    return refers;
  }

  /**
   * Required. The id of the resource to which this reference refers. Must be the id of a resource
   * that exists in the parent environment and is of the given resource_type.
   * @param refers refers or {@code null} for none
   */
  public GoogleCloudApigeeV1Reference setRefers(java.lang.String refers) {
    this.refers = refers;
    return this;
  }

  /**
   * The type of resource referred to by this reference. Valid values are 'KeyStore' or
   * 'TrustStore'.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * The type of resource referred to by this reference. Valid values are 'KeyStore' or
   * 'TrustStore'.
   * @param resourceType resourceType or {@code null} for none
   */
  public GoogleCloudApigeeV1Reference setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1Reference set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1Reference) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1Reference clone() {
    return (GoogleCloudApigeeV1Reference) super.clone();
  }

}
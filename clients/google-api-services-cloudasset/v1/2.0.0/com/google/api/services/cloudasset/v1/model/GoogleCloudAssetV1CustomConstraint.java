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

package com.google.api.services.cloudasset.v1.model;

/**
 * The definition of a custom constraint.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1CustomConstraint extends com.google.api.client.json.GenericJson {

  /**
   * Allow or deny type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionType;

  /**
   * Organization policy condition/expression. For example:
   * `resource.instanceName.matches("[production|test]_.*_(\d)+")'` or,
   * `resource.management.auto_upgrade == true`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * Detailed information about this custom policy constraint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * One line display name for the UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * All the operations being applied for this constraint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> methodTypes;

  /**
   * Name of the constraint. This is unique within the organization. Format of the name should be *
   * `organizations/{organization_id}/customConstraints/{custom_constraint_id}` Example :
   * "organizations/123/customConstraints/custom.createOnlyE2TypeVms"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The Resource Instance type on which this policy applies to. Format will be of the form : "/"
   * Example: * `compute.googleapis.com/Instance`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceTypes;

  /**
   * Allow or deny type.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionType() {
    return actionType;
  }

  /**
   * Allow or deny type.
   * @param actionType actionType or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setActionType(java.lang.String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Organization policy condition/expression. For example:
   * `resource.instanceName.matches("[production|test]_.*_(\d)+")'` or,
   * `resource.management.auto_upgrade == true`
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * Organization policy condition/expression. For example:
   * `resource.instanceName.matches("[production|test]_.*_(\d)+")'` or,
   * `resource.management.auto_upgrade == true`
   * @param condition condition or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Detailed information about this custom policy constraint.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Detailed information about this custom policy constraint.
   * @param description description or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * One line display name for the UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * One line display name for the UI.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * All the operations being applied for this constraint.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMethodTypes() {
    return methodTypes;
  }

  /**
   * All the operations being applied for this constraint.
   * @param methodTypes methodTypes or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setMethodTypes(java.util.List<java.lang.String> methodTypes) {
    this.methodTypes = methodTypes;
    return this;
  }

  /**
   * Name of the constraint. This is unique within the organization. Format of the name should be *
   * `organizations/{organization_id}/customConstraints/{custom_constraint_id}` Example :
   * "organizations/123/customConstraints/custom.createOnlyE2TypeVms"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the constraint. This is unique within the organization. Format of the name should be *
   * `organizations/{organization_id}/customConstraints/{custom_constraint_id}` Example :
   * "organizations/123/customConstraints/custom.createOnlyE2TypeVms"
   * @param name name or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The Resource Instance type on which this policy applies to. Format will be of the form : "/"
   * Example: * `compute.googleapis.com/Instance`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceTypes() {
    return resourceTypes;
  }

  /**
   * The Resource Instance type on which this policy applies to. Format will be of the form : "/"
   * Example: * `compute.googleapis.com/Instance`.
   * @param resourceTypes resourceTypes or {@code null} for none
   */
  public GoogleCloudAssetV1CustomConstraint setResourceTypes(java.util.List<java.lang.String> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  @Override
  public GoogleCloudAssetV1CustomConstraint set(String fieldName, Object value) {
    return (GoogleCloudAssetV1CustomConstraint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1CustomConstraint clone() {
    return (GoogleCloudAssetV1CustomConstraint) super.clone();
  }

}

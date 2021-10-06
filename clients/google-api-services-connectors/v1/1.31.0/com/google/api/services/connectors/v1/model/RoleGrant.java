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

package com.google.api.services.connectors.v1.model;

/**
 * This configuration defines all the Cloud IAM roles that needs to be granted to a particular GCP
 * resource for the selected prinicpal like service account. These configurations will let UI
 * display to customers what IAM roles need to be granted by them. Or these configurations can be
 * used by the UI to render a 'grant' button to do the same on behalf of the user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoleGrant extends com.google.api.client.json.GenericJson {

  /**
   * Template that UI can use to provide helper text to customers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String helperTextTemplate;

  /**
   * Prinicipal/Identity for whom the role need to assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principal;

  /**
   * Resource on which the roles needs to be granted for the principal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resource resource;

  /**
   * List of roles that need to be granted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> roles;

  /**
   * Template that UI can use to provide helper text to customers.
   * @return value or {@code null} for none
   */
  public java.lang.String getHelperTextTemplate() {
    return helperTextTemplate;
  }

  /**
   * Template that UI can use to provide helper text to customers.
   * @param helperTextTemplate helperTextTemplate or {@code null} for none
   */
  public RoleGrant setHelperTextTemplate(java.lang.String helperTextTemplate) {
    this.helperTextTemplate = helperTextTemplate;
    return this;
  }

  /**
   * Prinicipal/Identity for whom the role need to assigned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipal() {
    return principal;
  }

  /**
   * Prinicipal/Identity for whom the role need to assigned.
   * @param principal principal or {@code null} for none
   */
  public RoleGrant setPrincipal(java.lang.String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * Resource on which the roles needs to be granted for the principal.
   * @return value or {@code null} for none
   */
  public Resource getResource() {
    return resource;
  }

  /**
   * Resource on which the roles needs to be granted for the principal.
   * @param resource resource or {@code null} for none
   */
  public RoleGrant setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * List of roles that need to be granted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRoles() {
    return roles;
  }

  /**
   * List of roles that need to be granted.
   * @param roles roles or {@code null} for none
   */
  public RoleGrant setRoles(java.util.List<java.lang.String> roles) {
    this.roles = roles;
    return this;
  }

  @Override
  public RoleGrant set(String fieldName, Object value) {
    return (RoleGrant) super.set(fieldName, value);
  }

  @Override
  public RoleGrant clone() {
    return (RoleGrant) super.clone();
  }

}
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

package com.google.api.services.iap.v1.model;

/**
 * Configuration for propagating attributes to customer applications protected by IAP. These
 * attributes may be SAML attributes from a 3rd party IdP, or potentially other sources in the
 * future.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity-Aware Proxy API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttributePropagationSettings extends com.google.api.client.json.GenericJson {

  /**
   * Whether the provided attribute propagation settings should be evaluated on user requests. If
   * set to true, attributes returned from the expression will be propagated in the set output
   * credentials.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enable;

  /**
   * Raw string CEL expression. Expression should be of the form
   * attributes.saml_attributes.filter(attribute, attribute.name in [{attribute_list}]). An example
   * expression to select the attributes "my_attr" and "other_attr":
   * attributes.saml_attributes.filter(attribute, attribute.name in ["my_attr", "other_attr"])
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expression;

  /**
   * Which output credentials attributes selected by the CEL expression should be propagated in. All
   * attributes will be fully duplicated in each selected output credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> outputCredentials;

  /**
   * Whether the provided attribute propagation settings should be evaluated on user requests. If
   * set to true, attributes returned from the expression will be propagated in the set output
   * credentials.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnable() {
    return enable;
  }

  /**
   * Whether the provided attribute propagation settings should be evaluated on user requests. If
   * set to true, attributes returned from the expression will be propagated in the set output
   * credentials.
   * @param enable enable or {@code null} for none
   */
  public AttributePropagationSettings setEnable(java.lang.Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Raw string CEL expression. Expression should be of the form
   * attributes.saml_attributes.filter(attribute, attribute.name in [{attribute_list}]). An example
   * expression to select the attributes "my_attr" and "other_attr":
   * attributes.saml_attributes.filter(attribute, attribute.name in ["my_attr", "other_attr"])
   * @return value or {@code null} for none
   */
  public java.lang.String getExpression() {
    return expression;
  }

  /**
   * Raw string CEL expression. Expression should be of the form
   * attributes.saml_attributes.filter(attribute, attribute.name in [{attribute_list}]). An example
   * expression to select the attributes "my_attr" and "other_attr":
   * attributes.saml_attributes.filter(attribute, attribute.name in ["my_attr", "other_attr"])
   * @param expression expression or {@code null} for none
   */
  public AttributePropagationSettings setExpression(java.lang.String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Which output credentials attributes selected by the CEL expression should be propagated in. All
   * attributes will be fully duplicated in each selected output credential.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOutputCredentials() {
    return outputCredentials;
  }

  /**
   * Which output credentials attributes selected by the CEL expression should be propagated in. All
   * attributes will be fully duplicated in each selected output credential.
   * @param outputCredentials outputCredentials or {@code null} for none
   */
  public AttributePropagationSettings setOutputCredentials(java.util.List<java.lang.String> outputCredentials) {
    this.outputCredentials = outputCredentials;
    return this;
  }

  @Override
  public AttributePropagationSettings set(String fieldName, Object value) {
    return (AttributePropagationSettings) super.set(fieldName, value);
  }

  @Override
  public AttributePropagationSettings clone() {
    return (AttributePropagationSettings) super.clone();
  }

}

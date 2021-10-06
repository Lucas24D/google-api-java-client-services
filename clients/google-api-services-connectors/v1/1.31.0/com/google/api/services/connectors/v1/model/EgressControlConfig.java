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
 * Egress control config for connector runtime. These configurations define the rules to identify
 * which outbound domains/hosts needs to be whitelisted. It may be a static information for a
 * particular connector version or it is derived from the configurations provided by the customer in
 * Connection resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EgressControlConfig extends com.google.api.client.json.GenericJson {

  /**
   * Static Comma separated backends which are common for all Connection resources. Supported
   * formats for each backend are host:port or just host (host can be ip address or domain name).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backends;

  /**
   * Extractions Rules to extract the backends from customer provided configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtractionRules extractionRules;

  /**
   * Static Comma separated backends which are common for all Connection resources. Supported
   * formats for each backend are host:port or just host (host can be ip address or domain name).
   * @return value or {@code null} for none
   */
  public java.lang.String getBackends() {
    return backends;
  }

  /**
   * Static Comma separated backends which are common for all Connection resources. Supported
   * formats for each backend are host:port or just host (host can be ip address or domain name).
   * @param backends backends or {@code null} for none
   */
  public EgressControlConfig setBackends(java.lang.String backends) {
    this.backends = backends;
    return this;
  }

  /**
   * Extractions Rules to extract the backends from customer provided configuration.
   * @return value or {@code null} for none
   */
  public ExtractionRules getExtractionRules() {
    return extractionRules;
  }

  /**
   * Extractions Rules to extract the backends from customer provided configuration.
   * @param extractionRules extractionRules or {@code null} for none
   */
  public EgressControlConfig setExtractionRules(ExtractionRules extractionRules) {
    this.extractionRules = extractionRules;
    return this;
  }

  @Override
  public EgressControlConfig set(String fieldName, Object value) {
    return (EgressControlConfig) super.set(fieldName, value);
  }

  @Override
  public EgressControlConfig clone() {
    return (EgressControlConfig) super.clone();
  }

}
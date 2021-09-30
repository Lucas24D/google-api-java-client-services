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

package com.google.api.services.networkconnectivity.v1.model;

/**
 * A hub is a collection of spokes. A single hub can contain spokes from multiple regions. However,
 * all of a hub's spokes must be associated with resources that reside in the same VPC network.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Connectivity API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Hub extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time the hub was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * An optional description of the hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional labels in key:value format. For more information about labels, see [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Immutable. The name of the hub. Hub names must be unique. They use the following form:
   * `projects/{project_number}/locations/global/hubs/{hub_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments,
   * and router appliance instances referenced by this hub's spokes must belong to this VPC network.
   * This field is read-only. Network Connectivity Center automatically populates it based on the
   * set of spokes attached to the hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RoutingVPC> routingVpcs;

  /**
   * Output only. The current lifecycle state of this hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The Google-generated UUID for the hub. This value is unique across all hub
   * resources. If a hub is deleted and another with the same name is created, the new hub is
   * assigned a different unique_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniqueId;

  /**
   * Output only. The time the hub was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time the hub was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the hub was created.
   * @param createTime createTime or {@code null} for none
   */
  public Hub setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * An optional description of the hub.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of the hub.
   * @param description description or {@code null} for none
   */
  public Hub setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional labels in key:value format. For more information about labels, see [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional labels in key:value format. For more information about labels, see [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * @param labels labels or {@code null} for none
   */
  public Hub setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Immutable. The name of the hub. Hub names must be unique. They use the following form:
   * `projects/{project_number}/locations/global/hubs/{hub_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The name of the hub. Hub names must be unique. They use the following form:
   * `projects/{project_number}/locations/global/hubs/{hub_id}`
   * @param name name or {@code null} for none
   */
  public Hub setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments,
   * and router appliance instances referenced by this hub's spokes must belong to this VPC network.
   * This field is read-only. Network Connectivity Center automatically populates it based on the
   * set of spokes attached to the hub.
   * @return value or {@code null} for none
   */
  public java.util.List<RoutingVPC> getRoutingVpcs() {
    return routingVpcs;
  }

  /**
   * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments,
   * and router appliance instances referenced by this hub's spokes must belong to this VPC network.
   * This field is read-only. Network Connectivity Center automatically populates it based on the
   * set of spokes attached to the hub.
   * @param routingVpcs routingVpcs or {@code null} for none
   */
  public Hub setRoutingVpcs(java.util.List<RoutingVPC> routingVpcs) {
    this.routingVpcs = routingVpcs;
    return this;
  }

  /**
   * Output only. The current lifecycle state of this hub.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current lifecycle state of this hub.
   * @param state state or {@code null} for none
   */
  public Hub setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The Google-generated UUID for the hub. This value is unique across all hub
   * resources. If a hub is deleted and another with the same name is created, the new hub is
   * assigned a different unique_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniqueId() {
    return uniqueId;
  }

  /**
   * Output only. The Google-generated UUID for the hub. This value is unique across all hub
   * resources. If a hub is deleted and another with the same name is created, the new hub is
   * assigned a different unique_id.
   * @param uniqueId uniqueId or {@code null} for none
   */
  public Hub setUniqueId(java.lang.String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * Output only. The time the hub was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time the hub was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Hub setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Hub set(String fieldName, Object value) {
    return (Hub) super.set(fieldName, value);
  }

  @Override
  public Hub clone() {
    return (Hub) super.clone();
  }

}
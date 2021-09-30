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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * The evaluated state of this restriction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipRoleRestrictionEvaluation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The current state of the restriction
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The current state of the restriction
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the restriction
   * @param state state or {@code null} for none
   */
  public MembershipRoleRestrictionEvaluation setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public MembershipRoleRestrictionEvaluation set(String fieldName, Object value) {
    return (MembershipRoleRestrictionEvaluation) super.set(fieldName, value);
  }

  @Override
  public MembershipRoleRestrictionEvaluation clone() {
    return (MembershipRoleRestrictionEvaluation) super.clone();
  }

}
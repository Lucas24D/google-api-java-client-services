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

package com.google.api.services.compute.model;

/**
 * Model definition for RouteAsPath.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouteAsPath extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The AS numbers of the AS Path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Long> asLists;

  /**
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET':
   * unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered
   * set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of
   * Member Autonomous Systems in the local confederation that the route has traversed -
   * 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the
   * route has traversed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pathSegmentType;

  /**
   * [Output Only] The AS numbers of the AS Path.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getAsLists() {
    return asLists;
  }

  /**
   * [Output Only] The AS numbers of the AS Path.
   * @param asLists asLists or {@code null} for none
   */
  public RouteAsPath setAsLists(java.util.List<java.lang.Long> asLists) {
    this.asLists = asLists;
    return this;
  }

  /**
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET':
   * unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered
   * set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of
   * Member Autonomous Systems in the local confederation that the route has traversed -
   * 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the
   * route has traversed
   * @return value or {@code null} for none
   */
  public java.lang.String getPathSegmentType() {
    return pathSegmentType;
  }

  /**
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET':
   * unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered
   * set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of
   * Member Autonomous Systems in the local confederation that the route has traversed -
   * 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the
   * route has traversed
   * @param pathSegmentType pathSegmentType or {@code null} for none
   */
  public RouteAsPath setPathSegmentType(java.lang.String pathSegmentType) {
    this.pathSegmentType = pathSegmentType;
    return this;
  }

  @Override
  public RouteAsPath set(String fieldName, Object value) {
    return (RouteAsPath) super.set(fieldName, value);
  }

  @Override
  public RouteAsPath clone() {
    return (RouteAsPath) super.clone();
  }

}
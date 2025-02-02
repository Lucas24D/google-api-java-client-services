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
 * An anchor label can be attached to any element to give it a reference address. LogicalEntity
 * links (see goodoc-semantics.proto) may use anchor labels to point to goodoc elements (they may
 * also use indices to locate the element, but the indices could become invalid if the goodocs are
 * allowed to mutate). Multiple elements may have the same anchor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoodocAnchorLabel extends com.google.api.client.json.GenericJson {

  /**
   * There is a generic method for composing such strings. Please take a look at
   * GoodocUtils::GenerateUniqueAnchorName(...) in ocr/goodoc/goodoc-utils.h.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Anchor")
  private java.lang.String anchor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer anchorScope;

  /**
   * There is a generic method for composing such strings. Please take a look at
   * GoodocUtils::GenerateUniqueAnchorName(...) in ocr/goodoc/goodoc-utils.h.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnchor() {
    return anchor;
  }

  /**
   * There is a generic method for composing such strings. Please take a look at
   * GoodocUtils::GenerateUniqueAnchorName(...) in ocr/goodoc/goodoc-utils.h.
   * @param anchor anchor or {@code null} for none
   */
  public GoodocAnchorLabel setAnchor(java.lang.String anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAnchorScope() {
    return anchorScope;
  }

  /**
   * @param anchorScope anchorScope or {@code null} for none
   */
  public GoodocAnchorLabel setAnchorScope(java.lang.Integer anchorScope) {
    this.anchorScope = anchorScope;
    return this;
  }

  @Override
  public GoodocAnchorLabel set(String fieldName, Object value) {
    return (GoodocAnchorLabel) super.set(fieldName, value);
  }

  @Override
  public GoodocAnchorLabel clone() {
    return (GoodocAnchorLabel) super.clone();
  }

}

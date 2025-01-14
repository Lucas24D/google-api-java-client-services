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
 * If this is a source document, the levels of discussion of the references this document cites.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScienceCitationReferenceDiscussion extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Level")
  private java.lang.Integer level;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("TargetID") @com.google.api.client.json.JsonString
  private java.math.BigInteger targetID;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLevel() {
    return level;
  }

  /**
   * @param level level or {@code null} for none
   */
  public ScienceCitationReferenceDiscussion setLevel(java.lang.Integer level) {
    this.level = level;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTargetID() {
    return targetID;
  }

  /**
   * @param targetID targetID or {@code null} for none
   */
  public ScienceCitationReferenceDiscussion setTargetID(java.math.BigInteger targetID) {
    this.targetID = targetID;
    return this;
  }

  @Override
  public ScienceCitationReferenceDiscussion set(String fieldName, Object value) {
    return (ScienceCitationReferenceDiscussion) super.set(fieldName, value);
  }

  @Override
  public ScienceCitationReferenceDiscussion clone() {
    return (ScienceCitationReferenceDiscussion) super.clone();
  }

}

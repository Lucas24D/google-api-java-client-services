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
 * A fact about potentially sensitive personal info (http://what/SPII) can be "certified" iff it
 * meets specific requirements. See go/kg-spii-certification for details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageGraphBfgSpiiCertification extends com.google.api.client.json.GenericJson {

  /**
   * This fact was provided via KGO / Entity Authority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageGraphBfgAuthorityFeedbackMetadata authorityFeedback;

  /**
   * This fact was provided via a legal request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageGraphBfgLegalRequestMetadata legalRequest;

  /**
   * This fact is public information. (See go/kg-spii-certification for a description of what
   * qualifies as public information -- simply finding a fact online is not sufficient to certify a
   * fact as public.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageGraphBfgPublicInformationMetadata publicInformation;

  /**
   * This fact was provided via KGO / Entity Authority.
   * @return value or {@code null} for none
   */
  public StorageGraphBfgAuthorityFeedbackMetadata getAuthorityFeedback() {
    return authorityFeedback;
  }

  /**
   * This fact was provided via KGO / Entity Authority.
   * @param authorityFeedback authorityFeedback or {@code null} for none
   */
  public StorageGraphBfgSpiiCertification setAuthorityFeedback(StorageGraphBfgAuthorityFeedbackMetadata authorityFeedback) {
    this.authorityFeedback = authorityFeedback;
    return this;
  }

  /**
   * This fact was provided via a legal request.
   * @return value or {@code null} for none
   */
  public StorageGraphBfgLegalRequestMetadata getLegalRequest() {
    return legalRequest;
  }

  /**
   * This fact was provided via a legal request.
   * @param legalRequest legalRequest or {@code null} for none
   */
  public StorageGraphBfgSpiiCertification setLegalRequest(StorageGraphBfgLegalRequestMetadata legalRequest) {
    this.legalRequest = legalRequest;
    return this;
  }

  /**
   * This fact is public information. (See go/kg-spii-certification for a description of what
   * qualifies as public information -- simply finding a fact online is not sufficient to certify a
   * fact as public.)
   * @return value or {@code null} for none
   */
  public StorageGraphBfgPublicInformationMetadata getPublicInformation() {
    return publicInformation;
  }

  /**
   * This fact is public information. (See go/kg-spii-certification for a description of what
   * qualifies as public information -- simply finding a fact online is not sufficient to certify a
   * fact as public.)
   * @param publicInformation publicInformation or {@code null} for none
   */
  public StorageGraphBfgSpiiCertification setPublicInformation(StorageGraphBfgPublicInformationMetadata publicInformation) {
    this.publicInformation = publicInformation;
    return this;
  }

  @Override
  public StorageGraphBfgSpiiCertification set(String fieldName, Object value) {
    return (StorageGraphBfgSpiiCertification) super.set(fieldName, value);
  }

  @Override
  public StorageGraphBfgSpiiCertification clone() {
    return (StorageGraphBfgSpiiCertification) super.clone();
  }

}

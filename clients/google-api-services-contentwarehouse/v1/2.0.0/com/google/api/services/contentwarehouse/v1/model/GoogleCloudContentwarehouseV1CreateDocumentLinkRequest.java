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
 * Request message for DocumentLinkService.CreateDocumentLink.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContentwarehouseV1CreateDocumentLinkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Document links associated with the source documents (source_document_id).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1DocumentLink documentLink;

  /**
   * The meta information collected about the document creator, used to enforce access control for
   * the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1RequestMetadata requestMetadata;

  /**
   * Required. Document links associated with the source documents (source_document_id).
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1DocumentLink getDocumentLink() {
    return documentLink;
  }

  /**
   * Required. Document links associated with the source documents (source_document_id).
   * @param documentLink documentLink or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1CreateDocumentLinkRequest setDocumentLink(GoogleCloudContentwarehouseV1DocumentLink documentLink) {
    this.documentLink = documentLink;
    return this;
  }

  /**
   * The meta information collected about the document creator, used to enforce access control for
   * the service.
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * The meta information collected about the document creator, used to enforce access control for
   * the service.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1CreateDocumentLinkRequest setRequestMetadata(GoogleCloudContentwarehouseV1RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  @Override
  public GoogleCloudContentwarehouseV1CreateDocumentLinkRequest set(String fieldName, Object value) {
    return (GoogleCloudContentwarehouseV1CreateDocumentLinkRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContentwarehouseV1CreateDocumentLinkRequest clone() {
    return (GoogleCloudContentwarehouseV1CreateDocumentLinkRequest) super.clone();
  }

}

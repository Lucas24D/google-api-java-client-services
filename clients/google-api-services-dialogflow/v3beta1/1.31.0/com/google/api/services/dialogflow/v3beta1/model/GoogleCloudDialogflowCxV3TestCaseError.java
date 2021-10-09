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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Error info for importing a test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3TestCaseError extends com.google.api.client.json.GenericJson {

  /**
   * The status associated with the test case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * The test case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TestCase testCase;

  /**
   * The status associated with the test case.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * The status associated with the test case.
   * @param status status or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCaseError setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The test case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase getTestCase() {
    return testCase;
  }

  /**
   * The test case.
   * @param testCase testCase or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCaseError setTestCase(GoogleCloudDialogflowCxV3TestCase testCase) {
    this.testCase = testCase;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3TestCaseError set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3TestCaseError) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3TestCaseError clone() {
    return (GoogleCloudDialogflowCxV3TestCaseError) super.clone();
  }

}
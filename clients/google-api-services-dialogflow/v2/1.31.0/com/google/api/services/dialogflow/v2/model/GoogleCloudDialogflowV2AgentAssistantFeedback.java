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

package com.google.api.services.dialogflow.v2.model;

/**
 * Detail feedback of Agent Assist result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2AgentAssistantFeedback extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Whether or not the suggested answer is relevant. For example: * Query: "Can I change
   * my mailing address?" * Suggested document says: "Items must be returned/exchanged within 60
   * days of the purchase date." * answer_relevance: AnswerRelevance.IRRELEVANT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answerRelevance;

  /**
   * Optional. Whether or not the information in the document is correct. For example: * Query: "Can
   * I return the package in 2 days once received?" * Suggested document says: "Items must be
   * returned/exchanged within 60 days of the purchase date." * Ground truth: "No return or exchange
   * is allowed." * [document_correctness]: INCORRECT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentCorrectness;

  /**
   * Optional. Whether or not the suggested document is efficient. For example, if the document is
   * poorly written, hard to understand, hard to use or too long to find useful information,
   * document_efficiency is DocumentEfficiency.INEFFICIENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentEfficiency;

  /**
   * Optional. Whether or not the suggested answer is relevant. For example: * Query: "Can I change
   * my mailing address?" * Suggested document says: "Items must be returned/exchanged within 60
   * days of the purchase date." * answer_relevance: AnswerRelevance.IRRELEVANT
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswerRelevance() {
    return answerRelevance;
  }

  /**
   * Optional. Whether or not the suggested answer is relevant. For example: * Query: "Can I change
   * my mailing address?" * Suggested document says: "Items must be returned/exchanged within 60
   * days of the purchase date." * answer_relevance: AnswerRelevance.IRRELEVANT
   * @param answerRelevance answerRelevance or {@code null} for none
   */
  public GoogleCloudDialogflowV2AgentAssistantFeedback setAnswerRelevance(java.lang.String answerRelevance) {
    this.answerRelevance = answerRelevance;
    return this;
  }

  /**
   * Optional. Whether or not the information in the document is correct. For example: * Query: "Can
   * I return the package in 2 days once received?" * Suggested document says: "Items must be
   * returned/exchanged within 60 days of the purchase date." * Ground truth: "No return or exchange
   * is allowed." * [document_correctness]: INCORRECT
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentCorrectness() {
    return documentCorrectness;
  }

  /**
   * Optional. Whether or not the information in the document is correct. For example: * Query: "Can
   * I return the package in 2 days once received?" * Suggested document says: "Items must be
   * returned/exchanged within 60 days of the purchase date." * Ground truth: "No return or exchange
   * is allowed." * [document_correctness]: INCORRECT
   * @param documentCorrectness documentCorrectness or {@code null} for none
   */
  public GoogleCloudDialogflowV2AgentAssistantFeedback setDocumentCorrectness(java.lang.String documentCorrectness) {
    this.documentCorrectness = documentCorrectness;
    return this;
  }

  /**
   * Optional. Whether or not the suggested document is efficient. For example, if the document is
   * poorly written, hard to understand, hard to use or too long to find useful information,
   * document_efficiency is DocumentEfficiency.INEFFICIENT.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentEfficiency() {
    return documentEfficiency;
  }

  /**
   * Optional. Whether or not the suggested document is efficient. For example, if the document is
   * poorly written, hard to understand, hard to use or too long to find useful information,
   * document_efficiency is DocumentEfficiency.INEFFICIENT.
   * @param documentEfficiency documentEfficiency or {@code null} for none
   */
  public GoogleCloudDialogflowV2AgentAssistantFeedback setDocumentEfficiency(java.lang.String documentEfficiency) {
    this.documentEfficiency = documentEfficiency;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2AgentAssistantFeedback set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2AgentAssistantFeedback) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2AgentAssistantFeedback clone() {
    return (GoogleCloudDialogflowV2AgentAssistantFeedback) super.clone();
  }

}
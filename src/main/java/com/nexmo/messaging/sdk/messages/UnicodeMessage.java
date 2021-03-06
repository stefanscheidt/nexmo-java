/*
 * Copyright (c) 2011-2017 Nexmo Inc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.nexmo.messaging.sdk.messages;


import com.nexmo.messaging.sdk.messages.parameters.MessageClass;

/**
 * Represents the details of a unicode text message that is to be submitted via the Nexmo SMS API.
 * <p>
 * Unicode messages are required when sending messages to the handset that contain characters that are not
 * within the GSM character set, for example when sending messages in Arabic or Chinese.
 *
 * @author  Paul Cook
 */
public class UnicodeMessage extends Message {

    private static final long serialVersionUID = 8327129506926552344L;

    /**
     * Instantiate a new unicode text-message request<br>
     * This message will be submitted as a unicode 16 bit text message
     *
     * @param from the 'from' address that will be seen on the handset when this message arrives,
     *             typically either a valid short-code / long code that can be replied to, or a short text description of the application sending the message (Max 11 chars)
     * @param to   the phone number of the handset that you wish to send the message to
     * @param messageBody The text of the message to be sent to the handset
     */
    public UnicodeMessage(final String from,
                          final String to,
                          final String messageBody) {
        super(MESSAGE_TYPE_UNICODE,
              from,
              to,
              messageBody,
              null,
              null,
              null,
              true,
              false,
              null,
              null,
              0,
              null,
              null);
    }

    /**
     * Instantiate a new unicode text-message request, exposing all of the available parameters, and optionally requesting a delivery notification<br>
     * This message will be submitted as a unicode 16 bit text message
     *
     * @param from the 'from' address that will be seen on the handset when this message arrives,
     *             typically either a valid short-code / long code that can be replied to, or a short text description of the application sending the message (Max 11 chars)
     * @param to   the phone number of the handset that you wish to send the message to
     * @param messageBody The text of the message to be sent to the handset
     * @param clientReference This is a user definable reference that will be stored in the Nexmo messaging records. It will be available in detailed reporting / analytics
     *                        In order to help with reconciliation of messages
     * @param statusReportRequired If set to true, then a delivery notification will be requested for this message delivery attempt.
     *                             Upon receiving notification of delivery or failure from the network, the Nexmo platform will submit a notification to the url configured in your
     *                             Nexmo REST account that represents the outcome of this message.
     * @param messageClass (Optional) The message class that is to be applied to this message.
     * @param protocolId The value of the GSM Protocol ID field to be submitted with this message. Ordinarily this should be left as the default value of 0
     */
    public UnicodeMessage(final String from,
                          final String to,
                          final String messageBody,
                          final String clientReference,
                          final boolean statusReportRequired,
                          final MessageClass messageClass,
                          final Integer protocolId) {
        super(MESSAGE_TYPE_TEXT,
              from,
              to,
              messageBody,
              null,
              null,
              clientReference,
              true,
              statusReportRequired,
              null,
              null,
              0,
              messageClass,
              protocolId);
    }

}
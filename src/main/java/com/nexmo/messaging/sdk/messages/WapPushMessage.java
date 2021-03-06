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


/**
 * Represents the details of a wap-push message that is to be submitted via the Nexmo REST api.
 *
 * @author  Paul Cook
 */
public class WapPushMessage extends Message {

    private static final long serialVersionUID = -8412926886570923963L;

    /**
     * Instantiate a new wap-push message request, to submit a browsable / downloadable URL to the handset
     *
     * @param from the 'from' address that will be seen on the handset when this message arrives,
     *             typically either a valid short-code / long code that can be replied to, or a short text description of the application sending the message (Max 11 chars)
     * @param to   the phone number of the handset that you wish to send the message to
     * @param wapPushUrl This is the url that will be submitted to the handset and will appear as a browsable message in the Inbox.
     * @param wapPushTitle This is the title that will be associated with the url being submitted to the handset
     */
    public WapPushMessage(final String from,
                          final String to,
                          final String wapPushUrl,
                          final String wapPushTitle) {
        super(MESSAGE_TYPE_WAPPUSH,
              from,
              to,
              null,
              null,
              null,
              null,
              false,
              false,
              wapPushUrl,
              wapPushTitle,
              0,
              null,
              null);
    }

    /**
     * Instantiate a new wap-push message request, to submit a browsable / downloadable URL to the handset,
     * attaching an optional client reference, and optionally requesting a delivery notification
     *
     * @param from the 'from' address that will be seen on the handset when this message arrives,
     *             typically either a valid short-code / long code that can be replied to, or a short text description of the application sending the message (Max 11 chars)
     * @param to   the phone number of the handset that you wish to send the message to
     * @param clientReference This is a user definable reference that will be stored in the Nexmo messaging records. It will be available in detailed reporting / analytics
     *                        In order to help with reconciliation of messages
     * @param statusReportRequired If set to true, then a delivery notification will be requested for this message delivery attempt.
     *                             Upon receiving notification of delivery or failure from the network, the Nexmo platform will submit a notification to the url configured in your
     *                             Nexmo REST account that represents the outcome of this message.
     * @param wapPushUrl This is the url that will be submitted to the handset and will appear as a browsable message in the Inbox.
     * @param wapPushTitle This is the title that will be associated with the url being submitted to the handset
     * @param wapPushValidity This is the length of time (in seconds) that the message will be available for once delivered to the handset.
     *                        Once this time has expired, the url will no longer be visible on the handset to be browsed (Subject to handset compatibility)
     */
    public WapPushMessage(final String from,
                          final String to,
                          final String clientReference,
                          final boolean statusReportRequired,
                          final String wapPushUrl,
                          final String wapPushTitle,
                          final int wapPushValidity) {
        super(MESSAGE_TYPE_WAPPUSH,
              from,
              to,
              null,
              null,
              null,
              clientReference,
              false,
              statusReportRequired,
              wapPushUrl,
              wapPushTitle,
              wapPushValidity,
              null,
              null);
    }

}
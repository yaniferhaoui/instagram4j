/**
 * Copyright (C) 2016 Bruno Candido Volpato da Cunha (brunocvcunha@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brunocvcunha.instagram4j.requests.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * InstagramStepData.
 *
 * @author evosystem
 */
@Getter
@Setter
@ToString
public class InstagramStepData {

    private int choice;
    private String fb_access_token;
    private String big_blue_token;
    private boolean google_oauth_token;
    private String phone_number;
    private String email;
    private String security_code;
    private int resend_delay;
    private int sms_resend_delay;
    private String contact_point;
    private String form_type;
    private String phone_number_preview;
    private String country;
    private long enrollment_time;
    private String enrollment_date;
    private double latitude;
    private double longitude;
    private String city;
    private String platform;
    private String user_agent;
}
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

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Login Payload
 * @author Ozan Karaali
 *
 */
@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class InstagramLoginTwoFactorPayload {
    private String username;
    private String phone_id;
    private String _csrftoken;
    private String guid;
    private String device_id;
    private String verification_code;
    private String two_factor_identifier;
    private String password;
    private int login_attempt_account = 0;
    

}
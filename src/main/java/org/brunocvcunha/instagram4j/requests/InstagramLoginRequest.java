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
package org.brunocvcunha.instagram4j.requests;

import org.brunocvcunha.instagram4j.requests.payload.InstagramLoginPayload;
import org.brunocvcunha.instagram4j.requests.payload.InstagramLoginResult;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

/**
 * Login Request
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@AllArgsConstructor
@Log4j2
public class InstagramLoginRequest extends InstagramPostRequest<InstagramLoginResult> {

    private InstagramLoginPayload payload;

    @Override
    public String getUrl() {
        return "accounts/login/";
    }

    @Override
    @SneakyThrows
    public String getPayload() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(payload);
    }

    @Override
    @SneakyThrows
    public InstagramLoginResult parseResult(int statusCode, String content) {
        return parseJson(statusCode, content, InstagramLoginResult.class);
    }

    @Override
    public boolean requiresLogin() {
        return false;
    }

}

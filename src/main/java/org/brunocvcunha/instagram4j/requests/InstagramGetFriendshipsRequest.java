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

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.brunocvcunha.instagram4j.requests.payload.InstagramGetFriendshipsResult;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

/**
 * Get Friendships Request
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@AllArgsConstructor
@Log4j
public class InstagramGetFriendshipsRequest extends InstagramPostRequest<InstagramGetFriendshipsResult> {

    @NonNull
    private List<Long> userIds;
    
    @Override
    public String getUrl() {
        return "friendships/show_many/";
    }

    @Override
    @SneakyThrows
    public String getPayload() {
        ObjectMapper mapper = new ObjectMapper();
        
        Map<String, Object> payloadMap = new LinkedHashMap<>();
        payloadMap.put("_uuid", api.getUuid());
        payloadMap.put("user_ids", StringUtils.join(userIds, ","));
        payloadMap.put("_csrftoken", api.getOrFetchCsrf());
        
        String payloadJson = mapper.writeValueAsString(payloadMap);

        return payloadJson;
    }

    @Override
    @SneakyThrows
    public InstagramGetFriendshipsResult parseResult(int statusCode, String content) {
        return this.parseJson(content, InstagramGetFriendshipsResult.class);
    }

    @Override
    public boolean isSigned() {
        return false;
    }
}

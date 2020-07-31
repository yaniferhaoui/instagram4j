/**
 * Copyright (C) 2018 Zsombor Gegesy (gzsombor@gmail.com)
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

import org.brunocvcunha.instagram4j.requests.payload.SavedFeedResult;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

/**
 * Request to get the saved images for the User
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class InstagramSavedFeedRequest extends InstagramGetRequest<SavedFeedResult> {

    private String maxId;

    @Override
    public String getUrl() {
        String url = "feed/saved/";
        if (maxId != null && !maxId.isEmpty()) {
            url += "?max_id=" + maxId;
        }
        return url;
    }

    @Override
    @SneakyThrows
    public SavedFeedResult parseResult(int statusCode, String content) {
        return parseJson(statusCode, content, SavedFeedResult.class);
    }

}

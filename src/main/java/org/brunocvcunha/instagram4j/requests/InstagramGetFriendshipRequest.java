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

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import org.brunocvcunha.instagram4j.requests.payload.InstagramFriendshipStatus;

/**
 * Request for getting a user's friendship status
 *
 * @author Akhmad Syaikhul Hadi (akhmad.hadi@gmail.com)
 */
@AllArgsConstructor
@Log4j
public class InstagramGetFriendshipRequest extends InstagramGetRequest<InstagramFriendshipStatus> {
    private long userId;

    @Override
    public String getUrl() {
        return "friendships/show/" + userId;
    }

    @Override
    @SneakyThrows
    public InstagramFriendshipStatus parseResult(int statusCode, String content) {
        return this.parseJson(content, InstagramFriendshipStatus.class);
    }
}

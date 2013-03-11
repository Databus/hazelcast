/*
 * Copyright (c) 2008-2010, Hazel Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hazelcast.collection.multimap.client;

import com.hazelcast.client.ClientCommandHandler;
import com.hazelcast.collection.CollectionService;
import com.hazelcast.collection.multimap.ObjectMultiMapProxy;
import com.hazelcast.nio.Protocol;
import com.hazelcast.nio.serialization.Data;

public class ContainsKeyHandler extends MultiMapCommandHandler {
    public ContainsKeyHandler(CollectionService collectionService) {
        super(collectionService);
    }

    @Override
    protected Protocol processCall(ObjectMultiMapProxy proxy, Protocol protocol) {
        Data key = protocol.buffers[0];
        boolean contains = proxy.containsKey(key);
        return protocol.success(String.valueOf(contains));
    }
}
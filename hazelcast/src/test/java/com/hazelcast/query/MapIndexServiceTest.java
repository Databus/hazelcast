/*
 * Copyright (c) 2008-2012, Hazel Bilisim Ltd. All Rights Reserved.
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
 */

package com.hazelcast.query;

import com.hazelcast.util.TestUtil;
import org.junit.runner.RunWith;

@RunWith(com.hazelcast.util.RandomBlockJUnit4ClassRunner.class)
public class MapIndexServiceTest extends TestUtil {
//    @Test
//    public void testAndWithSingleEntry() throws Exception {
//        IndexService mapIndexService = new IndexService();
//        mapIndexService.addIndex("name", false, 0);
//        mapIndexService.addIndex("age", true, 1);
//        mapIndexService.addIndex("salary", true, 2);
//        for (int i = 0; i < 20000; i++) {
//            Employee employee = new Employee(i + "Name", i % 80, (i % 2 == 0), 100 + (i % 1000));
//            mapIndexService.index(employee);
//        }
//        int count = 1000;
//        Set<String> ages = new HashSet<String>(count);
//        for (int i = 0; i < count; i++) {
//            ages.add(String.valueOf(i));
//        }
//        final EntryObject entryObject = new PredicateBuilder().getEntryObject();
//        final PredicateBuilder predicate = entryObject.get("name").equal("140Name").and(entryObject.get("age").in(ages.toArray(new String[0])));
//        long total = Runtime.getRuntime().totalMemory();
//        long free = Runtime.getRuntime().freeMemory();
//        System.out.println("Used Memory:" + ((total - free) / 1024 / 1024));
//        for (int i = 0; i < 10000; i++) {
//            long start = Clock.currentTimeMillis();
//            QueryContext queryContext = new QueryContext(mapIndexService, predicate);
//            Set<MapEntry> results = QueryService.query(queryContext);
////            System.out.println("result size " + results.size() + " took " + (Clock.currentTimeMillis() - start));
//            assertEquals(1, results.size());
//        }
//    }
//
//    @Test
//    public void testIndex() throws Exception {
//        IndexService mapIndexService = new IndexService();
//        mapIndexService.addIndex("name", false, 0);
//        mapIndexService.addIndex("age", true, 1);
//        mapIndexService.addIndex("salary", true, 2);
//        for (int i = 0; i < 20000; i++) {
//            Employee employee = new Employee(i + "Name", i % 80, (i % 2 == 0), 100 + (i % 1000));
//            mapIndexService.index(employee);
//        }
//        long total = Runtime.getRuntime().totalMemory();
//        long free = Runtime.getRuntime().freeMemory();
//        System.out.println("Used Memory:" + ((total - free) / 1024 / 1024));
//        for (int i = 0; i < 10000; i++) {
//            long start = Clock.currentTimeMillis();
//            SqlPredicate predicate = new SqlPredicate("salary=161 and age >20 and age <23");
//            QueryContext queryContext = new QueryContext(mapIndexService, predicate);
//            Set<MapEntry> results = QueryService.query(queryContext);
//            assertEquals(10, results.size());
//        }
//    }
}

/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.isis.schema.utils.jaxbadapters;

import com.google.common.base.Strings;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Note: not actually registered as a JAXB adapter.
 */
public final class JodaLocalDateStringAdapter {
    private JodaLocalDateStringAdapter() {
    }

    private static DateTimeFormatter dateFormatter = ISODateTimeFormat.localDateParser();

    public static LocalDate parse(final String date) {
        if (Strings.isNullOrEmpty(date)) {
            return null;
        }
        return dateFormatter.parseLocalDate(date);
    }

    public static String print(LocalDate date) {
        if (date == null) {
            return null;
        }
        return dateFormatter.print(date);
    }

}

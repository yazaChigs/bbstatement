/*
 * Copyright 2018 tasu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.totalit.bloodbankstatement.domain.util;


import com.totalit.bloodbankstatement.util.StringUtils;

/**
 *
 * @author Roy Kanavheti
 */
public enum YesNo {

    YES(1), NO(2);

    private final Integer code;
    
    private String name;

    YesNo(Integer code) {
        this.code = code;
    }

    public static YesNo get(Integer code) {
        for (YesNo item : values()) {
            if (item.code.equals(code)) {
                return item;
            }
        }
        throw new IllegalArgumentException("Uknown parameter passed to method:");
    }

    public Integer getCode() {
        return code;
    }
    
    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }

    public void setName(String name) {
        this.name = name;
    }
}

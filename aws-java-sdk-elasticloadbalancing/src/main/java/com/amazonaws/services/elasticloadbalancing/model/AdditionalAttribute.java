/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>AdditionalAttribute</code> data type.
 * </p>
 */
public class AdditionalAttribute implements Serializable {

    /**
     * Reserved for future use.
     */
    private String key;

    /**
     * Reserved for future use.
     */
    private String value;

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * Reserved for future use.
     *
     * @param key Reserved for future use.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdditionalAttribute withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * Reserved for future use.
     *
     * @param value Reserved for future use.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdditionalAttribute withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AdditionalAttribute == false) return false;
        AdditionalAttribute other = (AdditionalAttribute)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    
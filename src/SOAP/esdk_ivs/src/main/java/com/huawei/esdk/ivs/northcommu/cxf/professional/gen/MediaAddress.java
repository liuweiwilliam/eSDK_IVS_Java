/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
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
package com.huawei.esdk.ivs.northcommu.cxf.professional.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dstIP" type="{esdk_ivs_professional_server}IPInfo"/>
 *         &lt;element name="audioPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="videoPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAddress", propOrder = {
    "dstIP",
    "audioPort",
    "videoPort",
    "reserve"
})
public class MediaAddress {

    @XmlElement(required = true)
    protected IPInfo dstIP;
    protected int audioPort;
    protected int videoPort;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the dstIP property.
     * 
     * @return
     *     possible object is
     *     {@link IPInfo }
     *     
     */
    public IPInfo getDstIP() {
        return dstIP;
    }

    /**
     * Sets the value of the dstIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPInfo }
     *     
     */
    public void setDstIP(IPInfo value) {
        this.dstIP = value;
    }

    /**
     * Gets the value of the audioPort property.
     * 
     */
    public int getAudioPort() {
        return audioPort;
    }

    /**
     * Sets the value of the audioPort property.
     * 
     */
    public void setAudioPort(int value) {
        this.audioPort = value;
    }

    /**
     * Gets the value of the videoPort property.
     * 
     */
    public int getVideoPort() {
        return videoPort;
    }

    /**
     * Sets the value of the videoPort property.
     * 
     */
    public void setVideoPort(int value) {
        this.videoPort = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

}